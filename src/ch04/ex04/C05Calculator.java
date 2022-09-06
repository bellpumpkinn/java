package ch04.ex04;
//H02Calculator 예외처리
import java.util.Scanner;

public class C05Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0; 
		int b = 0;
		String aStr = ""; //a에 숫자가 아닌 문자입력했을때 예외처리하려고 씀.
		String bStr = ""; //b에 숫자가 아닌 문자입력했을때 예외처리하려고 씀.
		String op = "";
		boolean isGood = false;
		int result = 0;
		String isRepeat = "";
		
		do {
			do {
				System.out.print("a: ");
				aStr = scan.nextLine();
				if(aStr.length() == 1 &&'0' < aStr.charAt(0) && aStr.charAt(0) <= '9') {
					isGood = true;
					a = Integer.parseInt(aStr); //모양은 스트링이지만 숫자형태가 됨.
				} else System.out.println("ERROR] 10미만의 자연수를 입력하세요.");
			} while(!isGood);
			
			do {
				isGood = false;
				System.out.print("op: ");
				op = scan.nextLine();
				if(op.length() == 1 && 
					(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))) {
					isGood = true;
				} else System.out.println("ERROR] +, - , * , / 중의 하나를 입력하세요.");
			} while(!isGood);
			
			do {
				isGood = false;
				System.out.print("b: ");
				bStr = scan.nextLine();
				if((bStr.length() == 1 || bStr.length() == 2) && '0' < bStr.charAt(0) && bStr.charAt(0) <= '9') {
					isGood = true;
					b = Integer.parseInt(bStr); //모양은 스트링이지만 숫자형태가 됨.
				} else System.out.println("ERROR] 10미만의 자연수를 입력하세요.");
			} while(!isGood);
			
			switch(op) {
			case "+": result = a + b; break;
			case "-": result = a - b; break;
			case "*": result = a * b; break;
			case "/": result = a / b; 
			}
			
			System.out.printf("%d %s %d = %s\n", a, op, b, result);
			
			do {
				isGood = false;
				System.out.print("계속할까요(y/n)? ");
				isRepeat = scan.nextLine();
				if(isRepeat.length() == 1 &&
						(isRepeat.equalsIgnoreCase("y") || (isRepeat.equalsIgnoreCase("n")))){
					isGood = true;
				} else System.out.println("ERROR] y 혹은 n을 입력하세요.");
			} while(!isGood);	
		} while(isRepeat.equalsIgnoreCase("y"));
		
		System.out.println("끝.");
	}
}//equalsIgnoreCase : 대/소문자 구분을 없애준다.
