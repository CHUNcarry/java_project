package co.yedam.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExe {
	public static void main(String[] args) {
		try {
			File file = new File("src/co/yedam/strea/FileCopy.java");
			int val;
			FileReader fr = new FileReader(file);
			char[] buf = new char[100];
			while (true) {
				val = fr.read(buf);
				System.out.println((char) val);
				for(int i =0; i<100; i++) {
					System.out.println(buf[i]);
			}
			
			}
			//fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
