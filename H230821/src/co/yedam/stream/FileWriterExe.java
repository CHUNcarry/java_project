package co.yedam.stream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterExe {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("c:/temp/name.txt");
			Scanner sc = new Scanner(System.in);
			System.out.println("Start");

			while (true) {
				String line = sc.nextLine();
				if (line.equals("quit")) {
					break;
				}
				fw.write(line);
			}
			fw.flush();
			fw.close();
			sc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("END");
	}
}
