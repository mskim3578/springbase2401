package ch01_di;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {
	private static long nextId = 0;
	private Map<String,Member> map = new HashMap<String,Member>();
	
	public Member selectByEmail(String email) {
		return map.get(email); //Member 객체 리턴
	}
	public void insert(Member member) {
		member.setId(++nextId);
		map.put(member.getEmail(), member);
	}
	
	
	
}
