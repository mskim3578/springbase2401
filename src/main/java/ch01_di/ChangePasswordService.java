package ch01_di;

public class ChangePasswordService {
	MemberDao  memberDao;
	public ChangePasswordService(MemberDao  memberDao) {
		this.memberDao=memberDao;
	}
	public void changePassword(String email, String oldPw, String newPw) {
		Member member = memberDao.selectByEmail(email);
		if(member == null) 
			throw new MemberNotFoundException();
		member.changePassword(oldPw, newPw);
		dao.update(member);
	}
}
