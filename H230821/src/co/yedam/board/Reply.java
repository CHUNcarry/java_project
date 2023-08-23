package co.yedam.board;

import java.io.Serializable;

public class Reply implements Serializable {

	private int replyNo;
	private int brdNo;
	private String replyContent;
	private String replyWriter;

	public int getReplyNo() {
		return replyNo;
	}

	public void setReplyNo(int replyNo) {
		this.replyNo = replyNo;
	}

	public int getBrdNo() {
		return brdNo;
	}

	public void setBrdNo(int brdNo) {
		this.brdNo = brdNo;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public String getReplyWriter() {
		return replyWriter;
	}

	public void setReplyWriter(String replyWriter) {
		this.replyWriter = replyWriter;
	}

	public String showReply() {
		String list = "[" + getBrdNo() + "]" + "		작성자 : " + getReplyWriter() + getReplyContent();
		return list;
	}

}
