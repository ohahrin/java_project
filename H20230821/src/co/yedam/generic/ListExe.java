package co.yedam.generic;

import java.util.ArrayList;
import java.util.List;

public class ListExe {
	public static void main(String[] args) {
		// 1. 출력하기
		
		// List<String> = String 타입으로 담겠다
		List<String> list = new ArrayList<String>();
		// String 만 쓸수 있음
		list.add("Hello");
		list.add(new String("World"));
		list.add("Good");
		
		
		// 2. 수정하기
		String result = list.get(0); // ary[0] , get 써서 인덱스 넣기
		// System.out.println(result); 
		
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.set(1, "result");
		System.out.println("===수정후===");
		// 선택된 인덱스 값만 삭제
		list.remove(1);
		// 모두 삭제
		list.clear();
		
		for(String str : list) {
			System.out.println(str);
		}
		
	}
}
