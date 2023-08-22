package co.yedam.friend;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScanExe {
	public static void main(String[] args) {
		File file = new File("src/co/yedam/friend/friends.txt");
		Scanner scn = null;
		try {
			scn = new Scanner(file);
			String line = scn.nextLine();
			System.out.println(line);
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
//		while(scn.hasNext()) {
//			String line = scn.next();
//			System.out.println(line);
//		}
		While(true){
			String line = scn.nextLine();
			if(line.equals("")) {
				break;
			}
			
			String[] data = line.split(" "); // 홍길동 010-1111-1111
		}
		System.out.println("end of line");
	}

	private static void While(boolean b) {
		
		
	}

	
}
