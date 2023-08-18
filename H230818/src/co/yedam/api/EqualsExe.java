package co.yedam.api;

import java.util.Objects;

class Member {
	private String name;
	private int no;

	public Member(int i, String string) {
		// TODO Auto-generated constructor stub

		this.name = name;
		this.no = no;
	}

	public class EqualsExe {

		private int no;
		private Object name;

		public void main(String[] args) {
			String str1 = new String("hong");
			String str2 = new String("hwang");

			// System.out.println(str1.equals(str2));

			Member mem1 = new Member(101, "hong");
			Member mem2 = new Member(101, "hong");

			System.out.println(mem1.equals(mem2));
		}

		
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + Objects.hash(name, no);
			return result;
		}



		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			EqualsExe other = (EqualsExe) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			return Objects.equals(name, other.name) && no == other.no;
		}



		private Member getEnclosingInstance() {
			return Member.this;
		}

	}
}