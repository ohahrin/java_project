package co.yedam.ArrayExe;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		Student[] students = new Student[10];
		Scanner scn = new Scanner(System.in); //시스템 키보드
		boolean run = true;//반복문
		int idx = 0;
		
		//1.등록 2.조회 3.목록
		while (run) {
			System.out.println("1.등록 2.조회 3.목록 4.키큰학생 5.종료");
			System.out.print("선택>> ");
			
			int menu = Integer.parseInt(scn.nextLine());
			
			switch(menu) {
			case 1: Student s1 = new Student();
					System.out.println("이름");
					s1.name = scn.nextLine();
					System.out.print("점수");
					s1.score = Integer.parseInt(scn.nextLine());
					students[idx] = s1;
					idx++;
					break;
					
			case 2: //사용자가 이름을 입력하면 해당학생의 점수를 출력	
					System.out.println("이름을 입력하세요");
					String name = scn.nextLine(); //enter인식
					
					// 사용자가 입력한 이름의 위치를 찾기 위한 반복문
					for(int i=0; i<students.length; i++) {
						// 점수 
						if(students[i] != null && name.equals(students[i].name)) {
							System.out.printf("%s 의 점수는 %d",students[i].name,students[i].score);
						}
					}
					
			case 3: //이름,점수
				name = scn.nextLine();
				for(int i=0; i<students.length; i++) {
					if(students[i] != null && students[i].name.equals(name)) {
						System.out.println("%s의 점수: %d\n" + students[i].name);
					}
				}
				break;
			case 4: //키큰학생
				String[] name1 = {"최길동", "홍길동", "박길동", "홍길동"};
				int[] height = { 150, 160, 170, 180 };
				
				for(int i=0; i<4; i++) {
					
				}
			case 5: System.out.println("종료합니다");
			run = false;
			}
		}
		System.out.println("end");
	}
}