package ch05.ex09.case1;

public class Init {
	private static int s; 
	private int i;
	
	static {
		Init.s = 1;
		// this.i = 1;// -> 오류이유: this변수는 메서드안에서쓴다. 
		// this변수가 없어서 error처리 한것이다.
		System.out.println("static{}");
	}
	//인스턴수초기화블럭 앞에는 이름이 붙지않는다.
	{
		Init.s = 1;
		this.i = 1;
		System.out.println("{}"); //개체가 생성된 직후에 실행됨.
	} 
	
	public Init() {
		Init.s = 1;
		this.i = 1;
		System.out.println("Init()");
	} //콜되야 생성
	
	public Init(int i) {
		Init.s = i;
		this.i = i;
		System.out.println("Init(int)");
		
	}
	
}
