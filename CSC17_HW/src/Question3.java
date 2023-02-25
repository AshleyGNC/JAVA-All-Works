import java.io.*;
import java.util.Scanner;

public class Question3 {
	private int count;
	private int letterCount;
	
	public static void main(String[] args) throws IOException{
		Question3 myObject = new Question3();
		myObject.FileContent(myObject.getFile());
		System.out.println("The file has " + myObject.countLines("Input") + " lines.");
		System.out.println("The file has " + myObject.countLetters("Input") + " English letters."); 
	}
	
	//Method to get the file form the user
	private String getFile(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter file:  ");
		String filename = in.nextLine();
		in.close();
		return filename;
	}

	//Method to print file line by line
	private void FileContent(String filename) throws IOException{
		File file = new File(filename); 
		FileReader fr = new FileReader(file); 
		BufferedReader br = new BufferedReader(fr); 
		
		System.out.println();
		String line;
		while((line=br.readLine())!=null){		     //reading the file line by line
			count++;                                 //counting every line
			System.out.println(line);
			for(int i=0; i<line.length(); i++) {     //check if each character in the line is an English letter
				if(Character.isLetter(line.charAt(i))) {
					letterCount++;
				}
			}
		}
		System.out.println();
		fr.close(); 
	}
	
	//Method returns line count
	private int countLines(String filename) {
		return count;
	}
	
	//Method returns letter count
	private int countLetters(String filename) {
		return letterCount;
	}

}
