package com.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFile {

	public static void main(String[] args) throws IOException {

		File f1 = new File("D:\\WorkSpace2\\Basic_Java_Problem_2025\\File\\File1.txt");
		FileReader fr = new FileReader("D:\\WorkSpace2\\Basic_Java_Problem_2025\\File\\File1.txt");
		// char[] ch = new char[(int)f1.length()];
		/*
		 * fr.read(ch); System.out.println(ch);
		 */

		/*
		 * int i=fr.read(); while(i!=-1) {
		 * 
		 * System.out.print((char)i); i=fr.read();
		 * 
		 * }
		 */// using FileReader we can only read data Char by char not line by Line

		// Use Buffer Reader to read Line by Line

		
		  BufferedReader bf = new BufferedReader(fr);
		  
		  String line = bf.readLine();
		  
		  while (line != null) {
		  
		  System.out.println(line); line = bf.readLine(); }
		 

		//File f2 = new File("D:\\WorkSpace2\\Basic_Java_Problem_2025\\File\\writeFile.txt");

		/*
		 * FileWriter wr = new FileWriter(f2);
		 * 
		 * BufferedWriter bw = new BufferedWriter(wr);
		 * 
		 * bw.write(100);// d bw.newLine(); bw.write(101);// e bw.write((char) 70);
		 * bw.flush(); bw.close(); PrintWriter pw = new
		 * PrintWriter("D:\\WorkSpace2\\Basic_Java_Problem_2025\\File\\writeFile.txt");
		 * 
		 * pw.print(100); pw.flush(); pw.close();
		 */
		
		/*
		 * FileInputStream fs = new FileInputStream(f2);
		 * 
		 * System.out.println((char)fs.read());
		 */
	    		
	}
}
