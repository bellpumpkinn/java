package ch04.home.ex02;
//�Է� - ó�� - ��� ������ �ڵ�
import java.util.Scanner;

public class H03Kawibawibo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int playerChoice = 0;
		int appChoice = 0;
		String result = "";
		String choice = "";
		
		System.out.print("1.����, 2.����, 3.��\n> ");
		playerChoice = scan.nextInt();
		appChoice = (int)(Math.random() * 3) + 1;
		//������� ���ڸ� ���ڵ��ϸ� 1
		if(1 <= playerChoice && playerChoice <= 3) {
			switch (playerChoice - appChoice) {
			case -2: case 1:
				result = "You win."; break;
			case 2: case -1:
				result = "You lose."; break;
			case 0:
				result = "Fair.";
			}
			//decoding
			switch(playerChoice) {
			case 1: choice = "����"; break;
			case 2: choice = "����"; break;
			case 3: choice = "��";
			}
			System.out.println("You: " + choice);
			
			switch(appChoice) {
			case 1: choice = "����"; break;
			case 2: choice = "����"; break;
			case 3: choice = "��";
			}
			System.out.println("Me: " + choice + "\n");
		}else {
			result = "ERROR] 1, 2, 3 ���� �ϳ��� �Է��ϼ���.";	
		}
		//����ó�� 3���� ��� : ������ �ٲ۴�. �����޽����� ���, �ݺ��Ѵ�.
		System.out.println(result);
	}
}
/*
����] �۰� ������������ �϶�.
���� ����� �˷��ش�.
�����
You win.
You lose.
Fair(���º�)
���� �ϳ��̴�.
--

1.����, 2.����, 3.��
> 1
You: ����
Me: ��

You win.
*/

/*
Scanner scan = new Scanner(System.in);
int me = 0;
int com = (int)(Math.random() * 3) + 1;
String user = "";
String rival = "";
String result = "";

System.out.print("1.����, 2.����, 3.��\n>");
me = scan.nextInt();

if(me == com) result = "Fair";
else if((me == 1 && com == 2) || (me == 2 && com == 3) || (me == 3 && com == 1)) 
	result = "You lose";
else if((me == 1 && com == 3) || (me == 2 && com == 1) || (me == 3 && com == 2)) 
	result = "You win";

if(0 < me && me < 4) {
	if(me == 1) user = "����";
	else if(me == 2) user = "����";
	else if(me == 3) user = "��";
}
else user = "�ٽ� ������.";

if(0 < me && me < 4) {
	if(com == 1) rival = "����";
	else if(com == 2) rival = "����";
	else if(com == 3) rival = "��";
}
else rival = "You�� �� �����Դϴ�.";

System.out.printf("You: %s\nMe: %s\n", user, rival);

System.out.print("\n" + result);
*/
/*
Scanner scan = new Scanner(System.in);
int me = 0;
int com = (int)(Math.random() * 3) + 1;
String user = "";
String rival = "";
String result = "";

System.out.print("1.����, 2.����, 3.��\n>");
me = scan.nextInt();

int num = me - com;

if(0 < me && me < 4) {
	if(num == 0) 
		result = "Fair";
	else if(num == -1 || num == 2) 
		result = "You lose";
	else if(num == -2 || num == 1) 
		result = "You win";
}

if(0 < me && me < 4) {
	if(me == 1) user = "����";
	else if(me == 2) user = "����";
	else if(me == 3) user = "��";
}
else user = "�ٽ� �Է��ϼ���.";

if(0 < me && me < 4) {
	if(com == 1) rival = "����";
	else if(com == 2) rival = "����";
	else if(com == 3) rival = "��";
}
else rival = "You�� ���� �ٽ� �Է��ϼ���.";

System.out.printf("You: %s\nMe: %s\n", user, rival);

System.out.print("\n" + result);
*/