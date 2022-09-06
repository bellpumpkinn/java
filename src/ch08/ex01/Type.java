package ch08.ex01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)  //�ҽ������� ��Ƴ��ڴٸ� ����.
@Target(ElementType.TYPE)
public @interface Type {
	String name();
	int value(); //�Ӽ���
}


//�ϳ��� ���Ͽ��ٰ� 2���̻��� ������̼��� �����

@Retention(RetentionPolicy.CLASS)  //retention:�ҽ�
@Target(ElementType.FIELD)
@interface Field{  //������ �ʵ�� ��������� ���Ǿ�
	int value(); //�⺻ �Ӽ���
} 


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.CONSTRUCTOR)
@interface Constructor{
	int value() default 0; //�⺻ �Ӽ���: value
	//������ �⺻���� �����ϸ� value������ �������ϸ� 0�����ٴ¶�.
}


@Target(ElementType.METHOD)
@interface Method{

} 


@Target(ElementType.PARAMETER)
@interface Param{

} 


@Target(ElementType.LOCAL_VARIABLE)
@Annotation
@interface Local{

} 


@Target(ElementType.ANNOTATION_TYPE)
@interface Annotation{

} 


@Target({ElementType.TYPE, ElementType.FIELD})
@interface Universal{

} 

//8����ʹ� ������ �ƴ϶� �׳� ���°�
//���ظ��� ��Ծ������� ���°�, �ͼ������°�


