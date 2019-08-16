package test;

public enum GroupMemberType {
	GROUP {
		public boolean isGroup() {
			return true;
		}
	},
	USER {
		public boolean isUser() {
			return true;
		}
	};

	public boolean isGroup() {
		return false;
	}

	public boolean isUser() {
		return false;
	}
}
