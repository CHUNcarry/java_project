package co.yedam.board;

import java.io.Serializable;
import java.util.Date;

public class Board implements Serializable {
	private int brdNo;
	private String brdTitle;
	private String brdContend;;
	private String brdWriter;
	private Date writeDate;
	private Date updateDate;

	public int getBrdNo() {
		return brdNo;
	}

	public void setBrdNo(int brdNo) {
		this.brdNo = brdNo;
	}

	public String getBrdTitle() {
		return brdTitle;
	}

	public void setBrdTitle(String brdTitle) {
		this.brdTitle = brdTitle;
	}

	public String getBrdContend() {
		return brdContend;
	}

	public void setBrdContend(String brdContend) {
		this.brdContend = brdContend;
	}

	public String getBrdWriter() {
		return brdWriter;
	}

	public void setBrdWriter(String brdWriter) {
		this.brdWriter = brdWriter;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Board(int brdNo, String brdTitle, String brdContend, String brdWriter, Date writeDate, Date updateDate) {
		super();
		this.brdNo = brdNo;
		this.brdTitle = brdTitle;
		this.brdContend = brdContend;
		this.brdWriter = brdWriter;
		this.writeDate = writeDate;
		this.updateDate = updateDate;

	}

	public Board(String title, String content, String writer) {
		// TODO Auto-generated constructor stub

		super();
		this.brdContend = content;
		this.brdWriter = writer;
		this.brdTitle = title;

	}

	public Board() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Board [brdNo=" + brdNo + ", brdTitle=" + brdTitle + ", brdContend=" + brdContend + ", brdWriter="
				+ brdWriter + ", writeDate=" + writeDate + ", updateDate=" + updateDate + "]";
	}

	public String listInfo() {
		String galist = "[" + getBrdNo() + "]" + "NAME : " + getBrdTitle() + "		작성자 : " + getBrdWriter()
				+ "    		" + getWriteDate();

		return galist;

	}

	public String showInfo(int i) {
		String conshow = "[" + brdNo + "]" + "   " + brdWriter + "\n" + brdContend + "\n" + updateDate;
		return conshow;

	}

}
