package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_WriteTextFile {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Testing\\temp.txt");
		f.createNewFile();
		
		//Write into text file
		FileWriter fw = new FileWriter("C:\\Testing\\temp.txt");
		BufferedWriter w = new BufferedWriter(fw);
		
		w.write("This is the 1st line");
		w.newLine();
		w.write("This is the 2nd line");
		w.newLine();
		w.write("This is the 3rd line");
		w.newLine();
		w.write("This is the 4th line");
		w.newLine();
		w.write("This is the 5th line");
		w.newLine();
		w.write("This is the 6th line");
		w.flush();
		
		//Read from the text file
		FileReader fr = new FileReader("C:\\Testing\\temp.txt");
		BufferedReader rd = new BufferedReader(fr);
		
		/*System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());*/
		String i;
		int n=0;
		while((i= rd.readLine())!=null) {
			System.out.println(i);
			n++;
		}
		
		System.out.println("number of lines:" +n);
	}
}
