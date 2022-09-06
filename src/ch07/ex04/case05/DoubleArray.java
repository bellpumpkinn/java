package ch07.ex04.case05;
//���߹迭
public class DoubleArray {
	public static void main(String[] args) {
		int[][] scores= {
			{90, 90, 90},
			{20, 20, 20},
			{30, 30, 30},
			{40, 40, 40},
			{50, 50, 50}
		}; //ǥ�� �ڹٷ� ��Ÿ���� ���߹迭�� ��Ÿ��
		
		System.out.println("��ȣ   ����  ����   ����  �հ�  ���");   //����ϴ°Ŵ� db���� �־�θ� �ȵȴ�.
		System.out.println("----------------------------");   //���������� ����⶧��.
		
		for(int i = 0; i < scores.length; i++){ //length�� ���� 5, i���� record�� ��ġ.
			int sum = 0;
			
			System.out.print(" " + (i + 1) + " ");
			for(int j = 0; j < scores[0].length; j++) {   //scores[0].length �� 3����Ÿ����.
				sum += scores[i][j];
				System.out.printf("%5d", scores[i][j]);
			}
			System.out.printf("%5d %4d\n", sum, sum / scores[0].length);
			
		}
	}
}
//�迭�ȿ� ���Ұ� �迭�ΰ� ���߹迭

/*
table����
���������� record
���������� column
�������ϳ��ϳ��� ��ϵ� �ϳ��� ĭ field (���� �ϳ��� �������ִ�.)
�ʵ���� ���ι������� ���ս�Ű�� record, ���ι������� ���ս�Ű�� column
�θ��ڵ忡�� ���ڵ� �ϳ��ϳ��� ����Ű�°� Ŀ����� �Ѵ�.
�ڽĲ����� �ٱ��ʵ带 Ŀ���� ����Ű��
*/


/*
 90 80 70        90�� scores[0][0], 80�� scores[0][1]
*/ 