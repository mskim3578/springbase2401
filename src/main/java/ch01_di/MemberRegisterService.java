package ch01_di;

import java.util.Date;

public class MemberRegisterService {
	MemberDao   memberDao;
	
	public MemberRegisterService(MemberDao   memberDao) {
		System.out.println(memberDao+"   생성자 DI");
		this.memberDao=memberDao;
	}
	
	public void regist(RegisterRequest req) {
		Member member = memberDao.selectByEmail(req.getEmail());
		if(member != null) { //등록된 이메일
			throw new AlreadyExistingMemberException("email 중복 " + req.getEmail());
		}
		Member newMember = new Member(req.getEmail(),req.getPassword(),req.getName(),
				new Date());
		memberDao.insert(newMember);	}
	
	
}
