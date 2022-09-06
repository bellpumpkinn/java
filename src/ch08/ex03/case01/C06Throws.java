package ch08.ex03.case01;

public class C06Throws {
	/*
	public void first() {
		this.second();
	}*/
	
	public void first() {
		try {
			this.second();
		} catch(Exception e) {}
	}
	
	/*
	public void second() {
		try {			
			this.third();
		}catch(Exception e) {}
	}*/
	
	public void second() throws Exception {		
		this.third();
	}
	
	public void third() {
		int i = 3 / 0;
	}
	
	public static void main(String[] args) {
		new C06Throws().first();
		System.out.println("끝.");
	}
}


//throws를 사용하면 예외가 발생할수있는 부분을 사용하는 문장에서 예외처리를 할수 있다.
//throw는 블럭안, 블럭밖 throws
//throw의 뜻: 익셉션처리를 발생시킬수있다. 경고를 하는거.



