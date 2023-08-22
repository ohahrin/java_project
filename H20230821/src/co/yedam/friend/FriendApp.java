package co.yedam.friend;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class FriendApp {
	// 추가, 수정, 삭제, 목록 :
	List<Friend> friends = new ArrayList<Friend>();
	Scanner scanner = new Scanner(System.in);

	public void start() {
		boolean run = true;
		while (run) {
			System.out.println("1.추가 2.수정 3.삭제 4.목록");
			System.out.print("선택>> ");
			int menu = scanner.nextInt();
			if (menu == 1) {
				add();
			} else if (menu == 2) {
				edit();
			} else if (menu == 3) {
				del();
			} else if (menu == 4) {
				list();
			} else {
				
			}
			
		}
	}

	private void add() {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
		System.out.println("이름을 입력하세요");
		String name = scanner.nextLine();
		System.out.println("전화번호를 입력하세요");
		String phone = scanner.nextLine();
		System.out.println("생일을 입력하세요");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date newdate = sdf.parse(strTime);
		Date birth = scanner.nextLine();
	}

	private void edit() {

	}

	private void del() {

	}

	private void list() {

	}
}
