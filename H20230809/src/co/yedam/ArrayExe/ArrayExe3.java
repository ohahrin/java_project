package co.yedam.ArrayExe;

public class ArrayExe3 {
	public static void main(String[] args) {
		
		Student[] students = new Student[3];
		
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.score = 85;
		s1.height = 178.9;
		s1.gender = gender.WOMAN;
		Student s2 = new Student();
		s2.name = "김길동";
		s2.score = 80;
		s2.height = 169.9;
		s2.gender = gender.MEN;
		Student s3 = new Student();
		s3.name = "박길동";
		s3.score = 90;
		s3.height = 188.9;
		s3.gender = gender.MEN;
		
		
		students[0]= s1;
		students[1]= s2;
		students[2]= s3;
		
		int max = 0;
		String name1 = "";
		//students[0].name + students[0].score;
		for(int i=0; i< students.length; i++) {
			if(max < students[i].score) {
				max = students[i].score;
				name1 = students[i].name;
			}
		}System.out.printf("최고점: %d, 이름: %s", max, name1);
		
		String[] names = {"홍길동","김길동","박길동","최길동"};
		int[] scores = {85, 88, 92, 75}; //index 0 1 2 3
		
		// String: name
		int name = 0;
		
		for(int i=1; i<4; i++) {
			name += scores[i];
		}
		System.out.println("총합" + name);
		
		max = 0;
		name1 = "";
		
		for(int i=0; i<=3; i++) {
			if(max<scores[i]) {
				max = scores[i];
				name1 = names[i];
			}
		}
		System.out.println(max + name1);
	}
}
