package board;

import java.util.List;
import java.util.Scanner;

public class BoardApp {

	Scanner scn = new Scanner(System.in);
	BoardService service = new BoardServiceJdbc();
	UserService uservice = new UserServiceImp1();
	User user = new User();
	
	public void start() {
		
		// id/ pw
		boolean run = true;
//		while(true) {
//			String id = printString("아이디");
//			String pw = printString("비밀번호");
//			
//			user.setUserId(id);
//			user.setUserPw(pw);
//			
//			if(uservice.checkLogin(user)) {
//				break;
//			}
//			System.out.println("로그인 실패...");
//		}

		while (run) {
			System.out.println("1.글등록 2.목록 3.수정 4.삭제 5.상세조회 9.종료");
			System.out.println("선택>> ");

			int menu = scn.nextInt();
			scn.nextLine();

			switch (menu) {
			case 1: // 등록
				register();
					break;

			case 2: // 목록
				boardList();
				break;

			case 3: // 수정
				modify();
				break;

			case 4: // 삭제
				remove();
				break;

			case 5: // 조회하는 번호
				search();
				break;

			case 9:
				service.save();
				System.out.println("종료합니다");
				run = false;
				break;
			}
		}
		System.out.println("end of prog.");
	}// end of start

	private String printString(String msg) {
	System.out.println(msg + ">> ");
	return scn.nextLine();
	}
	
	void register() {
		String title = printString("제목입력");
		String content = printString("내용입력");
		//String writer = printString("작성자입력");
		Board board = new Board(title, content, user.getUserId());
		
		if(service.add(board)) {
			System.out.println("등록성공!!");
		}

	}
	void boardList() {
		int page = 1;
		while(true) {
		List<Board> list = service.list(page); // 1페이지를 보여주겠다.
		System.out.println("글번호     내용      작성자");
		System.out.println("----------------------");
		for(Board b : list) {
			System.out.println(b.listInfo());
		}
		// 4 > 1page , 9 > 2page , 19 > 4page
		int totalCnt = service.getTatal();
		int lastPage = (int) Math.ceil(totalCnt/5.0);
		for(int i=1; i<=lastPage; i++){
			//System.out.printf("%3d",i);
			if(page == i) {
				System.out.print("[" + page + "]");
			}else {
				System.out.print(i);
			}
		}
		System.out.println();
		System.out.println("조회페이지 입력(exit: 9)>> ");
		page = scn.nextInt();
		
		if(page == 9) {
			break;
		}
		}
	}
	
	void modify() {
		String brdNo = printString("번호입력");
		String content = printString("내용입력");
		Board brd = new Board();
		brd.setBrdNo(Integer.parseInt(brdNo));
		brd.setBrdContent(content);
		service.modify(brd);
		if(service.modify(brd)) {
			System.out.println("수정 성공!!");
		}
	}
	
	void remove() {
		String brdNo = printString("번호입력");
		if(service.remove(Integer.parseInt(brdNo))) {
			System.out.println("삭제 성공!!");
		}
	}
	
	void search() {
		String brdNo = printString("번호입력");
		Board result = service.search(Integer.parseInt(brdNo));
		System.out.println(result);
	}
}
