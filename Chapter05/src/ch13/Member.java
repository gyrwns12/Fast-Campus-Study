package ch13;

import java.util.Comparator;

public class Member implements Comparator<Member> {

	private int memberId;
	private String memberName;
	
	public Member() {
		
	}

	public Member(int memberId, String memberName) { // 생성자
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Member) {
			Member member = (Member) obj;

			if (this.memberId == member.memberId) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString() { // toString 메소드 오버로딩
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}

	@Override
	public int compare(Member member1, Member member2) {
		return (member1.memberId - member2.memberId);
	}

//	@Override
//	public int compareTo(Member member) {

//		if (this.memberId > member.memberId) {
//			return 1;
//		} else if (this.memberId < member.memberId) {
//			return -1;
//		} else {
//			return 0;
//		}
		
//		return (this.memberId - member.memberId);
//		return (this.memberId - member.memberId) * -1; 내림차순
//	}
}