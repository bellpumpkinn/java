package ch08.ex02.case004;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public enum Job {
	EXIT, LIST, ADD, FIX, DEL; //����޼��带 �߰��Ϸ��� ������ �����ݷ�(;) ������.
	
	public static Job toJob(int ordinal) {
		return values()[ordinal]; //4�� �ԷµǸ� �迭�� 4�� ���ϵǴ°�. ���ڸ� ������ �ٲٴ� �迭�޼ҵ� ���.
	}
	
	public static Job toJob2(int ordinal) {
		/*Stream<Job> stream = Arrays.stream(values()); //�迭�� ��Ʈ������ ��ȯ��Ų��
		stream = stream.filter(job -> job.ordinal() == ordinal);
		Optional<Job> job = stream.findFirst(); // ù�������� ���Ͻ�����.
		return job.orElse(null);
		*/
		
	//chaining
		return Arrays.stream(values())
			.filter(job -> job.ordinal() == ordinal)
			.findFirst()
			.orElse(null);
	}
}