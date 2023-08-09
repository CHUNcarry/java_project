package co.yedam.condition;

public class ForExe {
	public static void main(String[]args) {
	//---------------------------------------------------------	
	/*	int sum = 0;
	
		for(int i = 1; i<=100; i++) {
			
			sum = sum + i;
			System.out.println(sum);
		}
		int result = sum;
		
		System.out.println(result);*/
	
		/*int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
				if(i%3 == 0) {
					sum = sum + i;
					System.out.println(i);
					System.out.println(sum);
					System.out.println("----------------------------");
			}
		}
		
		//----------------------------------------------------
		System.out.println(sum);*/
		/*
		int d1 = 0;
		int d2 = 0;
		while(d1 + d2 != 5) {
			d1 = (int) (Math.random()*5+1);
			d2 = (int) (Math.random()*5+1);
			System.out.println(d1);
			System.out.println(d2);
		}*/
	
		
		//---------------------------------------------------
	/*	int x = 0;
		int y = 0;
		
		
		for (x = 1; x <= 60; x++) {
			for (y = 1; y <= 60; y++) {
					if (x * 4 + y * 5 == 60) {
						System.out.printf("(%d, %d)",x, y);
				}
			}
		}*/
		
		
	//	-----------------------------------------
		
		/*String star = "";
		
		for(int i = 1; i <= 5; i++) {
		
				star += "*";
				System.out.println(star);
		}
			*/
		
		/*
String star = "*";
		
		for(int i = 1; i <= 5; i++) {
			for (int j = 1; j<=5; j++) {
				System.out.println(star);
				}
			}
		*/
		//-----------------------------------------
		// 15  24  33 42 51
		
		
/*String star = "*";
String blank = " ";
		
		for(int i = 1; i <= 5; i++) {
				for(int j = 1; j <= 5; j++) {
					if (i + j >= 6) {
						System.out.print(star);
					}else {
						System.out.print(blank);
					}					
				}
				System.out.println("");
			}	*/
		
		
		/*int randomNum1 = 0;
		int randomNum2 = 0;
		int i = 0;
		int sum = 0;
		while(randomNum1 + randomNum2 != 200) {
			randomNum1 = (int) (Math.random()*50+50);
			randomNum2 = (int) (Math.random()*50+50);
			System.out.println(randomNum1+randomNum2);
			
			i = i++;
		}
		System.out.println(i);*/
		

		
	}

}
