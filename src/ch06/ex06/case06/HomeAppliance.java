package ch06.ex06.case06;

import ch06.ex06.case03.Appliance;
import ch06.ex06.case05.Electronic;

public interface HomeAppliance extends Appliance, Electronic {

}

/*
<인터페이스끼리의 상속>
부모가 일반클래스면 1개를 extends뒤에 붙일수가 있고
부모가 인터페이스면 n개를 extends뒤에 붙일수가 있다.

인터페이스 extends 인터페이스 형태를 만든이유
=> 코드중복을 줄이기 위해서
*/