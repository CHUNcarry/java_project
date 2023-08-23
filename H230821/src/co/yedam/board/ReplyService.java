package co.yedam.board;

import java.util.List;

public interface ReplyService {
	
	
	public boolean addReply(Reply rp);
	
	
	
	public boolean deleteReply(int del);

	List<Reply> ReplyList();
	
	

}
