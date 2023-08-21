package co.yedam.friend;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScanExe {
	public static void main(String[] args) {
		File file = new File("src/co/yedam/friend/friends.txt");
		Scanner sc = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<Friend> friends = new ArrayList<>();
		while (true) {
			String line = null;
			try {
				line = sc.nextLine();
			} catch (Exception e) {
				break;
			}
			String[] data = line.split(" ");
			try {
				Friend newFriend = new Friend(data[0], data[1], sdf.parse(data[2]));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(line);
//			if (line.equals("")) {
//				break;
//			}
			//
		}

		for (Friend fnd : friends) {
			System.out.println(fnd.toString());
		}
		System.out.println("END OF LINE");

	}

}
