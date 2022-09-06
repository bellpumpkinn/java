package ch07.ex04.case05;
//이중배열
public class DoubleArray {
	public static void main(String[] args) {
		int[][] scores= {
			{90, 90, 90},
			{20, 20, 20},
			{30, 30, 30},
			{40, 40, 40},
			{50, 50, 50}
		}; //표를 자바로 나타낼때 이중배열로 나타냄
		
		System.out.println("번호   국어  영어   수학  합계  평균");   //계산하는거는 db값에 넣어두면 안된다.
		System.out.println("----------------------------");   //유지보수가 힘들기때문.
		
		for(int i = 0; i < scores.length; i++){ //length의 값은 5, i값은 record의 위치.
			int sum = 0;
			
			System.out.print(" " + (i + 1) + " ");
			for(int j = 0; j < scores[0].length; j++) {   //scores[0].length 은 3을나타낸다.
				sum += scores[i][j];
				System.out.printf("%5d", scores[i][j]);
			}
			System.out.printf("%5d %4d\n", sum, sum / scores[0].length);
			
		}
	}
}
//배열안에 원소가 배열인게 이중배열

/*
table에서
가로한줄을 record
세로한줄을 column
데이터하나하나가 기록된 하나의 칸 field (값을 하나만 담을수있다.)
필드들을 가로방향으로 집합시키면 record, 세로방향으로 집합시키면 column
부모코드에서 레코드 하나하나를 가르키는걸 커서라고 한다.
자식꺼에서 바깥필드를 커서로 가르키고
*/


/*
 90 80 70        90은 scores[0][0], 80은 scores[0][1]
*/ 