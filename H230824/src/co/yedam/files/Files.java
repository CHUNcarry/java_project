package co.yedam.files;

import java.io.File;
import java.io.IOException;

public class Files {

	public static void main(String[] args) {
		String[] names = { "hong", "choi", "park", "kim" };

		File path = new File("D:/etx");//

		System.out.println(path.exists());
		if (!path.exists()) {
			path.mkdir();
		}

		for (int i = 0; i < names.length; i++) {
			File nm = new File("D:/etx/" + names[i] + ".dat");

			try {
				nm.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (int i = 0; i < names.length; i++) {
			File nm = new File("D:/etx/" + names[i]);
			nm.mkdir();
		}
	}
}
