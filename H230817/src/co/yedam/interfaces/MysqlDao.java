package co.yedam.interfaces;

public class MysqlDao implements Dao{

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("Mysql 입력기능");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Mysql 수정기능");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Mysql 삭제기능");
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("Mysql 조회기능");
	}

}
