package ch05.ex05.case10;

public class Main {
	public static void main(String[] args) {
		Pajamas pajamas = new Pajamas();
		Man man = new Man();
		
		man.sleep(pajamas);
		
		man.strip();
		man.wash();
		man.wear(pajamas);
		man.lie();   //이 4개를 man.sleep(pajamas); 하나로 끝내니까 중복을 최소화한다.
		
		man.sleep(pajamas);
		man.sleep(pajamas);
		
	}
}

