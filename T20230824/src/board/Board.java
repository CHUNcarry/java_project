package board;

import java.io.Serializable;
import java.util.Date;

public class Board implements Serializable {
	private int conNo;
	private String title;
	private String content;
	private String writer;
	private Date writeDate;

	public Board(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;

	}

	public Board() {
	}

	public int getConNo() {
		return conNo;
	}

	public void setConNo(int conNo) {
		this.conNo = conNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writerDate) {
		this.writeDate = writerDate;
	}

	
	public String rst () { 
		String rst = "["+ conNo+"]" + "     " + title + "\n" //
				+ content+"\n" 
				+ "["+ writer + "]" + "     " + writeDate;
		return rst;
	}
	
	
	public String listInfo() {
		String lst =  "["+ conNo+"]" + title + "  ||  " + writer + writeDate;
		return lst;
	}
}
