package ch05.home.ex05.case8;

public class Player {
	private String name; //플레이어의 이름

	public Ball pass(Ball ball) {  //패스했을때 공이 튀어나가야하니까 Ball ball
		return ball; //받은공을 그대로 사용하니까 new ball이 아닌 ball을 씀 
	}
	
	public Ball shoot(Ball ball) { //공 찼을때 공이 튀어 나가야하니까 Ball ball
		return ball;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
//객체는 데이터이기 떄문에 파라미터, 리턴타입으로 쓸수있다.