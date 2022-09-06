package ch06.ex03.case03;

public class Duck /*extends Object*/ {
	@Override
	public String toString() {
		return "오리";
	}
}

//toString()은 자동으로 상속받은 상태
//public class Duck [extends Object] 대괄호 안이 생략된 상태.
//extends Object는 생략된 상태로 무조건 있음.