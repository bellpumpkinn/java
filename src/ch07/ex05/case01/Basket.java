package ch07.ex05.case01;
//<E> �� ���ʸ�.   <>�� ���̾Ƹ���� �Ѵ�.
public class Basket<E> {   //�ƹ��ų� ���� �� �ִ� �ٱ���.
	private E e;
	
	public E get() {
		return this.e;
	}
	
	public void set(E e) {
		this.e = e;
	}
}

//Generic type.
//����ؼ� ����
/*
���׸��� �����ʴ� ��ü�� Ÿ���� �� ��� ������ ������ �߻��ϰ� ��
*/