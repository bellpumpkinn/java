package ch04.ex04;
//H02Calculator ����ó��
import java.util.Scanner;

public class C05Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0; 
		int b = 0;
		String aStr = ""; //a�� ���ڰ� �ƴ� �����Է������� ����ó���Ϸ��� ��.
		String bStr = ""; //b�� ���ڰ� �ƴ� �����Է������� ����ó���Ϸ��� ��.
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
					a = Integer.parseInt(aStr); //����� ��Ʈ�������� �������°� ��.
				} else System.out.println("ERROR] 10�̸��� �ڿ����� �Է��ϼ���.");
			} while(!isGood);
			
			do {
				isGood = false;
				System.out.print("op: ");
				op = scan.nextLine();
				if(op.length() == 1 && 
					(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))) {
					isGood = true;
				} else System.out.println("ERROR] +, - , * , / ���� �ϳ��� �Է��ϼ���.");
			} while(!isGood);
			
			do {
				isGood = false;
				System.out.print("b: ");
				bStr = scan.nextLine();
				if((bStr.length() == 1 || bStr.length() == 2) && '0' < bStr.charAt(0) && bStr.charAt(0) <= '9') {
					isGood = true;
					b = Integer.parseInt(bStr); //����� ��Ʈ�������� �������°� ��.
				} else System.out.println("ERROR] 10�̸��� �ڿ����� �Է��ϼ���.");
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
				System.out.print("����ұ��(y/n)? ");
				isRepeat = scan.nextLine();
				if(isRepeat.length() == 1 &&
						(isRepeat.equalsIgnoreCase("y") || (isRepeat.equalsIgnoreCase("n")))){
					isGood = true;
				} else System.out.println("ERROR] y Ȥ�� n�� �Է��ϼ���.");
			} while(!isGood);	
		} while(isRepeat.equalsIgnoreCase("y"));
		
		System.out.println("��.");
	}
}//equalsIgnoreCase : ��/�ҹ��� ������ �����ش�.
