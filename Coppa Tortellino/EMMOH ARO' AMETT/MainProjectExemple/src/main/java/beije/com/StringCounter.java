/*package beije.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StringCounter {

		public StringCounter() {
		// TODO Auto-generated constructor stub
	}

		public void stringsCounter(File f) throws IOException {// method to print

			int count = 0;

			InputStream is = null;// declaration object
			try {
				is = new FileInputStream(f);// instance object if the file exsit
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			BufferedReader buf = new BufferedReader(new InputStreamReader(is));
			String line = null;
			try {
				line = buf.readLine();// read the line
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			StringBuilder sb = new StringBuilder();// new String
			while (line != null) {
				sb.append(line).append(" ");// save the line of the file into the Strign
				try {
					line = buf.readLine();// read next line
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			String fileAsString = sb.toString();//convert StringBuilder to String
			String fileAsString2 = fileAsString.toLowerCase();//put all characters minuscule
			String[] introduction = fileAsString2.split(" ");//split the String
			count = introduction.length;//the count is the same of the length  of the array
			Arrays.sort(introduction);//rearrange it alabetically
			System.out.println("\n Il File di testo ha " + count + " parole;\n Che in ordine alfabetico sono:");//print the number of the word
			System.out.println(Arrays.toString(introduction));//print the Array

		}

	}


*/