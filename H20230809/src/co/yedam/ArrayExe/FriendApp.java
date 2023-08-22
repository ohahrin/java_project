package co.yedam.ArrayExe;

import java.util.Scanner;

public class FriendApp {
	public static void main(String[] args) {
		// 추가, 수정, 삭제, 조회, 목록
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		Friend[] friends = new Friend[10];
		
		//초기값.
		for(int i=0; i<friends.length; i++) {
			Friend f = new Friend();
			f.name = "test" + i;
			f.phone = "010-1234-4567" + i;
			f.gender = i % 2 == 0 ? gender.MEN : Gender.WOMEN;
			
			friends[i] = f;
			
		}
		
		while (run) {
			System.out.println("1.추가 2.수정 3.삭제 4.조회 5.목록 6.종료");
			System.out.print("선택>> ");
			
			int menu = Integer.parseInt(scn.nextLine());
			
			switch (menu) {
			case 1:
				System.out.println("이름>> ");
				String name = scn.nextLine();
				System.out.println("연락처>> ");
				String phone = scn.nextLine();
				System.out.println("성별(1:남자,2:여자>> ");
				Gender gender;
				int choice = Integer.parseInt(scn.nextLine());
				if(choice == 1) {
					gender = co.yedam.ArrayExe.gender.MEN;
				}else {
					gender = gender.WOMEN;
				}
				Friend fnd = new Friend();
				fnd.name=name;
				fnd.phone=phone;
				fnd.gender=gender;
				
				for(int i=0; i<friends.length; i++) {
					if(friends[i] == null) {
						friends[i] = fnd;
						break;
					}
				}
				System.out.println("OK");
				break;
				
			case 2:
				System.out.print("이름>> ");
				name = scn.nextLine();
				System.out.print("연락처>> ");
				phone = scn.nextLine();
				for(int i=0; i<friends.length; i++) {
					if(friends[i] != null) {
						
					}
				}
				break;
			case 3:
				System.out.print("이름>> ");
				name = scn.nextLine();
				for (int i=0; i<friends.length; i++) {
					if(friends[i] != null
							&& friends[i].name.equals(name)) {
						friends[i] = null;
						break;
					}
				}
			case 4:
				System.out.print("이름>> ");
				name = scn.nextLine();
				for (int i=0; i<friends.length; i++) {
					if(friends[i] != null
							&& friends[i].name.equals(name)) {
						System.out.printf("이름:%s, 연락처:%s, 성별:%s\n", 
								friends[i].name,friends[i].phone, //
								friends[i].gender == Gender.MEN ? "남":"여");
						break;
					}
				}
			case 5:
				for (int i=0; i<friends.length; i++) {
					if(friends[i] != null
							&& friends[i].name.equals(name)) {
						friends[i] = null;
						break;
			case 6:
				System.out.println("종료합니다.");
				run = false;
			default:
				System.out.println("메뉴를 다시 선택하세요");
					}
				}
			}
		}