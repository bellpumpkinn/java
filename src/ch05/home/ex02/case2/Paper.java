package ch05.home.ex02.case2;

public class Paper {
	private String msg;
	private String writerName; //name을 하면 paper의 name이니까 writer name을 써야함.
	//writer는 객체, writerName이 속성
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String getWriterName() {
		return writerName;
	}
	
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}

}
