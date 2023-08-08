package co.yedam.oprater;

import java.util.Scanner;

/*
 * 은행 App.
 */
public class OpratorExe2 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int balance = 0; //10만원 이상 불가, -금액 불가
		boolean run = true;
		
		while(run) {
			
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.print("선택>> ");
			
			int menu = Integer.parseInt(scn.nextLine());
			if(menu == 1) {
				System.out.print("입금액 입력>> ");
				//코드 작성
				int num = Integer.parseInt(scn.nextLine());
				if(balance > 100000) {
					System.out.println("10만원 이상 입금할 수 없습니다");
					
				}
			}else if (menu == 2) {
				System.out.print("출금액 입력>> ");
				//코드 작성
			}else if (menu == 3) {
				System.out.print("잔고액 입력>> ");
				//코드작성
			}else if (menu == 4) {
				//코드 작성
				System.out.print("종료 입력>> ");
				break;
			}
			
		System.out.println("end of prog.")
	}
}
