package ch08.ex02.case004;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public enum Job {
	EXIT, LIST, ADD, FIX, DEL; //멤버메서드를 추가하려면 끝에다 세미콜론(;) 찍어야함.
	
	public static Job toJob(int ordinal) {
		return values()[ordinal]; //4가 입력되면 배열의 4가 리턴되는거. 숫자를 잡으로 바꾸는 배열메소드 사용.
	}
	
	public static Job toJob2(int ordinal) {
		/*Stream<Job> stream = Arrays.stream(values()); //배열을 스트림으로 변환시킨거
		stream = stream.filter(job -> job.ordinal() == ordinal);
		Optional<Job> job = stream.findFirst(); // 첫번쨰값을 리턴시켜줌.
		return job.orElse(null);
		*/
		
	//chaining
		return Arrays.stream(values())
			.filter(job -> job.ordinal() == ordinal)
			.findFirst()
			.orElse(null);
	}
}