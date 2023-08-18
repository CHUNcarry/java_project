package co.yedam.Self;

import java.util.Scanner;

/*후보값 
 * 
 * 950405 1234567
 * 9504052234567
 * 0105063456789
 * 0105064456789
 * 0105061456789
 * 0105062456789
 * 950405-2234567
 * 950405-1234567
 * 
 * String file = " C:/Dev/temp/flower.jpg
 * System.Out.println(String Utils.getFileName(file)) 
 * StringUtils.checkGender(ssn)
 * 클래스명 String Utils{
 * 주민번호 구분해서 남 여 오류 케이스 판단}
 * String getFileName(String)
 * 전체 경로에서 파일명만 추출
 * return filePath.substring()*/
public class number {

	public static void main(String[] args) {
		String examnum = "010325 - 2154842";
		Scanner sc = new Scanner(System.in);

		List[] person = new List[10];
		boolean run = true;
		while (run) {
			System.out.println("1.등록 | 2.조회 | 3.조회 | 4.삭제 || 9.종료");
			System.out.println("선택");

			int menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1:
				System.out.println("이름");
				String name = sc.nextLine();
				// System.out.println("이름 확인 " + name);
				System.out.println("주민번호 입력 13자리");
				String input = sc.nextLine();// 99 99 99 - 99 99 999 13자리
				// System.out.println("입력번호 확인" + input);
				String year = input.substring(0, 2);
				String month = input.substring(2, 4);
				String day = input.substring(4, 6);
				String gender = input.substring(7, 8);
				String ucode = input.substring(8);
				// System.out.println(year+ month + day +"-"+ gender+ucode );

				for (int i = 0; i < 100; i++) {
					if (person[i] != null) {
						person[i] = new List(name, year, month, day, gender, ucode);
					}
					break;
				}
				break;

			case 2:
				for (int i = 0; i < person.length; i++) {
					if (person[i] != null) {
						System.out.println(person[i].show());
					} else {
						System.out.println("");
					}
				}
				break;
			case 3:
				String searchName = sc.nextLine();
				int searchGender = 0;
				boolean resultG = false;
				for (int i = 0; i < person.length; i++) {
					if (person[i] != null && person[i].getName().equals(searchName)) {
						searchGender = perseInt(person[i].getGender());
					}
					if (searchGender % 2 == 0) {
						resultG = false; 
					}
					if(resultG) {
						System.out.println("male");
					}else {
						System.out.println("female");
					}
					
				}
				break;
			default:

			}
		}
//		char gen = examnum.charAt(7);
//		switch (gen) {	
	}

	private static int perseInt(String nextLine) {
		// TODO Auto-generated method stub
		return 0;
	}

}
