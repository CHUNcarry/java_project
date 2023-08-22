package co.yedam.board;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class UserService {
	// user.txt에서 정보를 읽고 유저정보를 list컬렉션에 저장
	// user 클래스 생성

//	list <user>
	List<User> UserList = new ArrayList<>();

	public boolean checkLogin(User user) {
		for (int i = 0; UserList.size(); i++) {
			if (UserList.get(i).getId().equals(user.id) && UserList.get(i).getPw().equals(user.pw)) {
				
				return true;
			}

		}
	}

	void aa() {

		FileReader fr;
		try {
			fr = new FileReader("C:/temp/user.txt");
			BufferedReader br = new BufferedReader(fr);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//while (checkLogin()) {
		//	String str = 

		}
//		try (FileInputStream fis = new FileInputStream("C:/temp/user.txt");
//				ObjectInputStream ois = new ObjectInputStream(fis)) {
//			fis.close();
//			ois.close();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
