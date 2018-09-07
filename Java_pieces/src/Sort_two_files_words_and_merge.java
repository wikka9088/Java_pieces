import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sort_two_files_words_and_merge {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File file1 = new File("/Users/weijiaPro/wika9088GIT/Java_pieces/text1.txt");
		File file2 = new File("/Users/weijiaPro/wika9088GIT/Java_pieces/text2.txt");
		
		Scanner sc1 = new Scanner(file1);
		Scanner sc2 = new Scanner(file2);
		
		String line1 = sc1.nextLine();
		String line2 = sc2.nextLine();
		
		while(line1 != null || line2 != null) {
			if (line1 == null) {
				System.out.println("from file2 >> " + line2);
				line2 = readLine(sc2);
			} else if (line2 == null) {
				System.out.println("from file1 >> " + line1);
				line1 = readLine(sc1);
			} else if (line1.compareToIgnoreCase(line2) <= 0) {
				System.out.println("from file1 >> " + line1);
				line1 = readLine(sc1);
			} else {
				System.out.println("from file2 >> " + line2);
				line2 = readLine(sc2);
			}
		}
		sc1.close();
	    sc2.close();

	}
	
	public static String readLine(Scanner reader) {
	    if (reader.hasNextLine())
	      return reader.nextLine();
	    else
	      return null;
	  }

}
