package ch04.home.ex04;

import java.util.Scanner;

public class H02Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;  
		int b = 0;	
		char op = 0;	
		int result = 0;	
		char isRepeat = 0; //��۳����°� �տ� is���̴°� ����.
		
		do {
			System.out.print("a: ");
			a = scan.nextInt(); scan.nextLine(); //���ڵڿ� ���ڰ� ���� �ٽó���
			System.out.print("op: ");
			op = scan.nextLine().charAt(0);
			System.out.print("b: ");
			b = scan.nextInt(); scan.nextLine();//�ٽ� ���� �Էºκ����־ �ǻ��
			
			switch(op) {
			case '+': result = a + b; break;
			case '-': result = a - b; break;
			case '*': result = a * b; break;
			case '/': result = a / b;
			}
			
			System.out.printf("%d %c %d = %d\n", a, op, b, result);
			System.out.print("����Ͻðڽ��ϱ�(y/n)?");
			isRepeat = scan.nextLine().charAt(0);
			
		} while(isRepeat == 'y');
		
		System.out.println("��");
	}
}
/*
 ����] ���⸦ ������.
 �����ڴ� +,-, *, / �̴�.
 / �� ���� ��´�.
 --
 a: 2
 op: +
 b: 3
 2 + 3 = 5
 ����Ͻðڽ��ϱ�(y/n)? y
 
 a: 2
 op: +
 b: 3
 2 + 3 = 5
 ����Ͻðڽ��ϱ�(y/n)? n
 ��.
 */

/* ���� �� �ڵ�
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
System.out.print("����Ͻðڽ��ϱ�(y/n)? ");
stop = scan.nextLine(); scan.nextLine();

switch(stop) {
case "y": x = true;
case "n": x = false;
}

}while(!x);
*/