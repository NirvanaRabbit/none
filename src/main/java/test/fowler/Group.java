package test.fowler;

import java.util.HashSet;
import java.util.Set;

public class Group {
	private String name;
	
	private Set<GroupMember> groupMembers;

	public Group(String name) {
		super();
		this.name = name;
	}
	

	protected Group() {
		this.groupMembers=new HashSet<GroupMember>(0);
	}
	


}
