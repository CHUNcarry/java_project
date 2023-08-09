package co.yedam.array;

public class ArrayExe1 {
	public static void main(String[]args) {
		int[] intAry = null;
		intAry = new int[10];
		intAry = new int[] {12, 25, 67, 23};
		
		int [] intAray2 = {55, 47, 90};
		
		System.out.println(intAry);
		intAry[0] = 22;
		
		int sum = 0;
		sum += intAry[0];
		sum += intAry[1];
		sum += intAry[2];
		sum += intAry[3];
		
		for(int i = 0; i < 4; i++) {
			sum += intAry[i];
		}
	}

}
