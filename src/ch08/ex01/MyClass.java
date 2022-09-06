package ch08.ex01;

//@Field 타입의 값은 지켜줘야한다.
@Universal
@Type(name="class", value=1) //괄호안이 간접적으로 사용하는데이터를 메타데이터
public class MyClass {
	@Field(1) @Universal
	private String name;
	
	@Constructor
	public MyClass() {
		
	}
	
	@Method
	public void play(@Param String name, @Param int age) {
		@Local int i = 0;
	}
	
}
