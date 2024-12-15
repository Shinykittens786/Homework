import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileLineByLineUsingScanner {
	static void dumpFileContents(String filePath) {
	File ReadFile = new File(filePath);
        String absolutePath = ReadFile.getAbsolutePath();
        Scanner scan = null;
        try {
        scan = new Scanner(ReadFile);
           while(scan.hasNextLine()){
               System.out.println(scan.nextLine());
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
	}
    

	public static void main(String[] args) {
		dumpFileContents("C:\\Users\\User\\Documents\\githubrepository\\Homework\\Homework\\plswork.txt");
	}
}