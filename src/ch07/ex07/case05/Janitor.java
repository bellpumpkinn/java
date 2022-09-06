package ch07.ex07.case05;

@FunctionalInterface
public interface Janitor<T> {
	void clean(T t);
}

//서술어에 관심이 있을때 스태틱메서드 혹은 람다를 쓴다.
//청소부에 관심있으면 인터페이스, 청소 하는거에 관심이 있으면 람다.



