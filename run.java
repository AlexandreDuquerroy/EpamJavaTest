import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Scanner;
/* Duquerroy Alexandre 
	Epam Java Test Program
	MagiczneNumerki.md
	Update : 12:25 PM
*/

public class run {
	
	File f = new File("");

	public static void main(String[] args) throws IOException {
		
		String src= "";
		Scanner in = new Scanner(System.in);
		System.out.println("File Checking Program;");
		System.out.println("Provide the absolute path to the file:");
		src = in.nextLine();
		
		try {
			InputStream input = new FileInputStream(new File(src));
			InputStreamReader lecture=new InputStreamReader(input);
			BufferedReader buff=new BufferedReader(lecture);
			String firstfileline="";
			
			firstfileline=buff.readLine();
			System.out.println(firstfileline);
			buff.close(); 		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Check if the extension is true
	}
}
