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
	Update : 1:43 PM
*/

public class run {
	
	// Create arraylist to handle formats
	static ArrayList fileformats = new ArrayList<String>()  {{
		 add(".jpg");
		 add(".jpg");
		 add(".jpg");
		 add(".png");
		 add(".gif");
		 add(".gif");
		}};	
	static ArrayList magicnumber = new ArrayList<String>()  {{
		 add("ÿØÿÛ");
		 add("ÿØÿà");
		 add("ÿØÿá");
		 add("‰PNG");
		 add("GIF87a");
		 add("GIF89a");
		}};
	// Method to check if the first line of the line analyzed contains signatures a.k.a magic numbers	
	public static String checkMagicNumber(String buff){
		String result = "";
		for (int cpt0 = 0; cpt0<magicnumber.size();cpt0++)
			if(buff.contains(magicnumber.get(cpt0).toString())){
				result = ("After analysis: the file is a " + fileformats.get(cpt0).toString());
			}
		return result;
	}
	// main 
	public static void main(String[] args){
		
		String base_format="";
		String end_format="";
		String src= "";
		String analysis="";
		int dotindex = 0;
		String firstfileline="";
		//Creating scanner to get the path
		Scanner in = new Scanner(System.in);
		System.out.println("File Checking Program;");
		System.out.println("Provide the absolute path to the file:");
		src = in.nextLine();
		dotindex= src.indexOf(".");
		base_format =  src.substring(dotindex, src.length());
		// getting format
		System.out.println("At first: The file is a " + base_format);
		// check if format is handled
		if(fileformats.contains(base_format)==false){
			System.out.println("This kind of format is not handled by this software");
		}
		else{
			try {
				// Read the first line of the file
				InputStream input = new FileInputStream(new File(src));
				InputStreamReader lecture=new InputStreamReader(input);
				BufferedReader buff=new BufferedReader(lecture);		
				firstfileline=buff.readLine();
				// Return the result of thecheckMagicNumber method
				analysis = checkMagicNumber(firstfileline).toString();
				buff.close(); 		
			} catch (IOException e) {
				System.out.println("This file cannot be found at specified path");
				e.printStackTrace();
			}
		}
		System.out.println(analysis);
		dotindex = analysis.indexOf(".");
		end_format = analysis.substring(dotindex, analysis.length());
		// Check if the extension is finally true
		if(base_format.contentEquals(end_format)){
			System.out.println("Finally the extension is True.");
		}else{
			System.out.println("Finally the extension is False.");
		}
	}
}
