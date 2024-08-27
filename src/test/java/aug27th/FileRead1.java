package aug27th;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileRead1 {

	public static void main(String[] args) throws IOException {
		
		
		
		BufferedReader br=new BufferedReader(new FileReader("D:\\010LiveTech\\jars\\abc.txt"));
		
		String s=null;
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
		}
		
		System.out.println("end of program..");
		

	}

}
