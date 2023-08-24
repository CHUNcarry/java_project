package co.yedam.mailing;

import java.io.File;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class MainExe {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {

			}

		});

		thread.start();
		boolean run = false;
		
		while(!run) {
			System.out.println("ID");
			String id = sc.nextLine();
			System.out.println("PW");
			String pw = sc.nextLine();
		}
		
		
		while (run) {
			System.out.println("1.추가 2.목록 3.메일 4.종료");
			System.out.println(">>");
			int menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1:

				System.out.println("수신자 이메일");
				String to = sc.nextLine();

				System.out.println("제목 : ");
				String title = sc.nextLine();

				System.out.println("내용");
				StringBuilder sb = new StringBuilder();
				sb.append("<p>비밀번호 초기화 이메일입니다</p>");
				sb.append("</p>12345</p>");

				String content = sc.nextLine();
				sb.append("</p>" + content + "</p>");
				sb.append("</p>end</p>");

				content = sb.toString();

				SendMail sendMail = new SendMail();

				sendMail.sendMail(to, title, content);

				sc.close();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				run = false;
				break;

			default:
				break;
			}

		}

		File file = new File("c:/temp/smaple.wav");
		while (true) {
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(file);
				Clip clip = AudioSystem.getClip();
				clip.open(ais);
				clip.start();
				thread.sleep(clip.getMicrosecondLength() / 1000);
				// Thread
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
