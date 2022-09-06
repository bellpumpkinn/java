package ch04.home.ex02;
//입력 - 처리 - 출력 순으로 코딩
import java.util.Scanner;

public class H03Kawibawibo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int playerChoice = 0;
		int appChoice = 0;
		String result = "";
		String choice = "";
		
		System.out.print("1.가위, 2.바위, 3.보\n> ");
		playerChoice = scan.nextInt();
		appChoice = (int)(Math.random() * 3) + 1;
		//가위라는 문자를 인코딩하면 1
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
			case 1: choice = "가위"; break;
			case 2: choice = "바위"; break;
			case 3: choice = "보";
			}
			System.out.println("You: " + choice);
			
			switch(appChoice) {
			case 1: choice = "가위"; break;
			case 2: choice = "바위"; break;
			case 3: choice = "보";
			}
			System.out.println("Me: " + choice + "\n");
		}else {
			result = "ERROR] 1, 2, 3 중의 하나를 입력하세요.";	
		}
		//예외처리 3가지 방법 : 업무를 바꾼다. 에러메시지를 출력, 반복한다.
		System.out.println(result);
	}
}
/*
과제] 앱과 가위바위보를 하라.
게임 결과를 알려준다.
결과는
You win.
You lose.
Fair(무승부)
중의 하나이다.
--

1.가위, 2.바위, 3.보
> 1
You: 가위
Me: 보

You win.
*/

/*
Scanner scan = new Scanner(System.in);
int me = 0;
int com = (int)(Math.random() * 3) + 1;
String user = "";
String rival = "";
String result = "";

System.out.print("1.가위, 2.바위, 3.보\n>");
me = scan.nextInt();

if(me == com) result = "Fair";
else if((me == 1 && com == 2) || (me == 2 && com == 3) || (me == 3 && com == 1)) 
	result = "You lose";
else if((me == 1 && com == 3) || (me == 2 && com == 1) || (me == 3 && com == 2)) 
	result = "You win";

if(0 < me && me < 4) {
	if(me == 1) user = "가위";
	else if(me == 2) user = "바위";
	else if(me == 3) user = "보";
}
else user = "다시 내세요.";

if(0 < me && me < 4) {
	if(com == 1) rival = "가위";
	else if(com == 2) rival = "바위";
	else if(com == 3) rival = "보";
}
else rival = "You의 값 오류입니다.";

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

System.out.print("1.가위, 2.바위, 3.보\n>");
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
	if(me == 1) user = "가위";
	else if(me == 2) user = "바위";
	else if(me == 3) user = "보";
}
else user = "다시 입력하세요.";

if(0 < me && me < 4) {
	if(com == 1) rival = "가위";
	else if(com == 2) rival = "바위";
	else if(com == 3) rival = "보";
}
else rival = "You의 값을 다시 입력하세요.";

System.out.printf("You: %s\nMe: %s\n", user, rival);

System.out.print("\n" + result);
*/