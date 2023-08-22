package co.yedam.generic;

public class Mainexe {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("Hello"); // 문자열 매개값이 옴
		String result = box.get(); // 형변환 해줘야됨
		
		Box<Integer> ibox = new Box<Integer>();
		ibox.set(10); // box 라는 클래스 10 (Integer)
		Integer iresult = ibox.get(); // integer 인데 String 바꿀려고 함
	}
}
