package api;

import java.util.HashSet;
import java.util.Set;

public class SetExe {
	public static void main(String[] args) {
		// 여러가지 정보를 담을 수 있는 클래스 : 
		// ArrayList : 인덱스 값에 정보 담음 
		// HastSet : 중복된 값 저장 불가
		
		// Set 이라는 인터페이스를 구현
		Set<String> set = new HashSet<>();
		
		// 인덱스 처럼 값이 없음
		set.add("Hong");
		set.add("Hwang");
		set.add("Kim");
		set.add("Hong");
		
		//반복문
		for(String str : set) {
			System.out.println(str);
		}
		
		Set<Member> memberSet = new HashSet<>();
		memberSet.add(new Member(101, "Hong"));
		memberSet.add(new Member(102, "Hwang"));
		memberSet.add(new Member(103, "Kim"));
		memberSet.add(new Member(101, "Hong"));
		
		// 주소
		for(Member str : memberSet) {
			System.out.println(str);
		}
	}
}
