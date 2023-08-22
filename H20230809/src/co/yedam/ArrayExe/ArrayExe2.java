package co.yedam.ArrayExe;

import java.util.Arrays;

public class ArrayExe2 {
	public static void main(String[] args) {
		int[] ary = new int[5];
		
		//1 ~ 100 임의값
		ary[0] = (int) (Math.random()*100 +1); //더블
		System.out.println(Arrays.toString(ary));
		
		//5개 합, 평균
		for(int i=0; i<5; i++) {
			ary[i] = (int) (Math.random()*100 +1);
		}
		System.out.println(Arrays.toString(ary));
		
		//avg = 223.0/5.0 = 44.6
		int int1 = 0;
		
		for(int i=0; i<5; i++) {
			int1 += ary[i];
		}
		double avg = int1/5.0;
		System.out.println(int1 + "," + avg);
		
		int num1, num2, num3; //변수 선언
		num1 = 56; //값 입력
		num2 = 72;
		num3 = 67;
		
		//큰값:
		int max = 0;
		
		if(num1<num2) {
			max = num1;
		}else {
			max = num3;
		}			
			if(num1 > num3) {
				max = num2;
			}else {
				max = num3;
			}
			System.out.println(max);
			
			max = 0;
			int[] intAry = { num1, num2, num3 };
			
			for(int i=0; i< intAry.length; i++) {
				if(max < intAry[i]) {
					max = intAry[i];
				}
			}
			System.out.println(max);
	}
}