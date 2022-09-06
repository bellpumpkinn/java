package ch04.home.ex04;

import java.util.Scanner;

public class H02Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;  
		int b = 0;	
		char op = 0;	
		int result = 0;	
		char isRepeat = 0; //토글나오는건 앞에 is붙이는게 좋다.
		
		do {
			System.out.print("a: ");
			a = scan.nextInt(); scan.nextLine(); //숫자뒤에 문자가 오면 다시넣음
			System.out.print("op: ");
			op = scan.nextLine().charAt(0);
			System.out.print("b: ");
			b = scan.nextInt(); scan.nextLine();//다시 문자 입력부분이있어서 또사용
			
			switch(op) {
			case '+': result = a + b; break;
			case '-': result = a - b; break;
			case '*': result = a * b; break;
			case '/': result = a / b;
			}
			
			System.out.printf("%d %c %d = %d\n", a, op, b, result);
			System.out.print("계속하시겠습니까(y/n)?");
			isRepeat = scan.nextLine().charAt(0);
			
		} while(isRepeat == 'y');
		
		System.out.println("끝");
	}
}
/*
 과제] 계산기를 만들어라.
 연산자는 +,-, *, / 이다.
 / 는 몫만을 얻는다.
 --
 a: 2
 op: +
 b: 3
 2 + 3 = 5
 계속하시겠습니까(y/n)? y
 
 a: 2
 op: +
 b: 3
 2 + 3 = 5
 계속하시겠습니까(y/n)? n
 끝.
 */

/* 내가 쓴 코드
Scanner scan = new Scanner(System.in);
int a = 0;
int b = 0;
int result = 0;
String op = "";
String stop = "";
boolean x = false;

do {
System.out.print("a: ");
a = scan.nextInt(); scan.nextLine();

System.out.print("op: ");
op = scan.nextLine();

System.out.print("b: ");
b = scan.nextInt();

if(op.equals("+")) result = a + b;
else if(op.equals("-")) result = a - b;
else if(op.equals("*")) result = a * b;
else if(op.equals("/")) result = a / b;

System.out.printf("%d %s %d = %d\n",a, op, b, result);
System.out.print("계속하시겠습니까(y/n)? ");
stop = scan.nextLine(); scan.nextLine();

switch(stop) {
case "y": x = true;
case "n": x = false;
}

}while(!x);
*/