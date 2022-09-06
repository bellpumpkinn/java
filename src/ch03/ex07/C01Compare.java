package ch03.ex07;
//비교연산자
public class C01Compare {
	public static void main(String[] args) {
		boolean b = 'A' < 'B'; //true가 출력됨.
		b = '0' == 0; //false   0의 유니코드 48, a의 유니코드 97
		b = 'A' != 65; //false    A는 65이기 때문.
		
		b = 10.0 == 10.0f; //true
		b = 0.1 == 0.1f; //false  0.1f 는 0.100000000004921이기때문, 자리수를 줄이면 해결
		b = (float)0.1 == 0.1f; //true
		
		System.out.println(b);
	}
}
