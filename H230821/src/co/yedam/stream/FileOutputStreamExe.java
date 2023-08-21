package co.yedam.stream;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExe {
public static void main(String[] args) {
	try {
		FileOutputStream fos = new FileOutputStream("C:/Temp/out.data");
		fos.write(100);
		fos.write(110);
		fos.write(120);
		
		fos.flush();//버퍼의 캐시값 사용
		fos.close();//리소스 환원
		FileInputStream fis = new FileInputStream("C:/Temp/out.data");
		
		
		while(true) {
			int val = fis.read();
			if(val == -1) {
				break;
			}
			System.out.println(val);
		}
		fis.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("END");
//	switch (key) {
//	case value:
//		
//		break;
//
//	default:
//		break;
	}
}

