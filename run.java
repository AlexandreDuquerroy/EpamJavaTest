import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;
/* Duquerroy Alexandre 
	Epam Java Test Program
	MagiczneNumerki.md
	Update : 12:35 PM
*/

public class run {
	
	File f = new File("");
	static ArrayList fileformats = new ArrayList<String>()  {{
		 add(".png");
		 add(".png");
		 add(".png");
		}};
		
	static ArrayList magicnumber = new ArrayList<String>()  {{
		 add("ÿØÿÛ");
		 add("ÿØÿà");
		 add("ÿØÿá");
		}};
	public static String checkFormat(String buff){
		String result = "";
		for (int cpt0 = 0; cpt0<fileformats.size();cpt0++)
			if(buff.contains(fileformats.get(cpt0).toString())){
			result = ("The file is a " + magicnumber.get(cpt0).toString());
			}
			else{System.out.println("FAIL");}
		return result;
	}

	public static void main(String[] args) throws IOException {
		
		String base_format="";
		String src= "";
		int dotindex = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("File Checking Program;");
		System.out.println("Provide the absolute path to the file:");
		src = in.nextLine();
		dotindex= src.indexOf(".");
		base_format =  src.substring(dotindex, src.length());
		System.out.println("The file is a " + base_format);
		try {
			InputStream input = new FileInputStream(new File(src));
			InputStreamReader lecture=new InputStreamReader(input);
			BufferedReader buff=new BufferedReader(lecture);
			String firstfileline="";
			
			firstfileline=buff.readLine();
			System.out.println(firstfileline);
			// Check if the extension is true
			checkFormat(firstfileline);
			buff.close(); 		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
