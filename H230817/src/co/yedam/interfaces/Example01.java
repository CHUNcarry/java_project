package co.yedam.interfaces;

public class Example01 {
	public static void main(String[] args) {
		int[][] intAry = new int[5][5];
		
		//System.out.println(intAry[0][2]);
		int no = 0;
		

		for (int i = 0; i <5; i++) {	
			for(int j = 0; j<5; j++) {
				no++;
				intAry[i][j] = no;
				
				}
			}
		
		for (int i = 4; i >=0; i--) {
			for(int j = 4; j>=0; j--) {
				System.out.printf("%3d",intAry[i][j]);
			}
			System.out.println();
		}
		/*
		 * 
		 * */
		/*int t = 0;
		int [][][] toy =new int[10][10][10];
		for(int x = 0; x<10; x++) {
			for(int y =0; y<10; y++) {
				for(int z = 0; z<10; z++) {
					t++;
					toy[z][y][x] = t;
					System.out.printf("%8d",toy[z][y][x]);
				}
				System.out.println();
			}
			System.out.println();
		}*/
		
		//System.out.println(intAr);
	}

}
