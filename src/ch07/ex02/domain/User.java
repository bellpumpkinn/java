package ch07.ex02.domain;

public class User {
	private String name;
	
	public User(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}

//�������� �׳� ������
//Dao I/o Service�� ���� �Ѵ�.


//���߼����� �������
//persistence layer               Dao
//service layer                   Service
//presentation layer              I/o

//������� ���°Ŵ� �ݴ��
