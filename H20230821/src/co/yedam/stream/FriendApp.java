package co.yedam.stream;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.yedam.friend.Friend;

public class FriendApp {
	Scanner scn = new Scanner(System.in);
	List<Friend> friends = new ArrayList<>();
	
	
	public void start() {
		System.out.println("1. 등록 2.목록 3. 종료");
		System.out.print("선택>> ");
		int menu = scn.nextInt(); //엔터
		scn.nextLine();
		
		
		
	}
	
}
