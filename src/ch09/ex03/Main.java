package ch09.ex03;

public class Main {
	public static void main(String[] args) {
		Counter counter = new Counter();
		new Player(counter).start();
		new Player(counter).start();
		new Player(counter).start();
	}
}


/*
공유의 위험.
계속 0 이나와야하는데 -1 1 2 3 4이런식으로 나오니까 오염됐다.

이거 제거하는방법 => 줄서기(큐(queue)를 사용)
큐(Queue)는 가장 처음에 넣은 데이터를 가장 먼저 꺼내는 FIFO(First-In First-Out) 방식을 따르는 자료 구조

락(lock)걸고 다싸면 락풀고 화장실들어가면 락걸고 다싸면 락풀고

counter는 화장실1칸.
화장실 문역할은 메서드. 메서드를 락거는거.
누군가가 메서드를 호출하면 락을 걸어버려라 하는 키워드 = synchronized
변기에 해당하는게 val.
*/