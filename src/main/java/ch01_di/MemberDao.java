package ch01_di;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {
	private static long nextId = 0;
	private Map<String,Member> map = new HashMap<String,Member>();
}