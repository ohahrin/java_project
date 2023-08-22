package api;

import java.util.Objects;

class Member{
	private int memberId;
	private String memberName;
	public Member(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}
	//toString => 메소드
	@Override
	public String toString() {
		return super.toString();
		//return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return memberId == other.memberId && Objects.equals(memberName, other.memberName);
	}
	
}

public class EqualsExe {
	public static void main(String[] args) {
		String str1 = new String("hong");
		String str2 = new String("hong");
		
		Member mem1 = new Member(101, "hong");
		Member mem2 = new Member(102, "hwang");
		
		System.out.println(mem1.equals(mem2));
		
		System.out.println(str1);
		
		// false
		System.out.println(str1 == str2);
		
		//true
		System.out.println(str1.equals(str2));
	}
}
