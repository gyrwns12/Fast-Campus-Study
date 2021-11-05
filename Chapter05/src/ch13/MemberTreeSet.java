package ch13;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(new Member());
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		Iterator<Member> ir = treeSet.iterator(); // iterator 사용
		
		while(ir.hasNext()) {
			Member member = ir.next();
			
			int tempId = member.getMemberId();
			
			if (tempId == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 안ㅅ습니다.");
		return false;
	}
	
	public void showAllMember() {
		for (Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
