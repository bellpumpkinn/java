package ch08.ex01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)  //소스까지만 살아남겠다를 말함.
@Target(ElementType.TYPE)
public @interface Type {
	String name();
	int value(); //속성명
}


//하나의 파일에다가 2개이상의 어노테이션을 만들기

@Retention(RetentionPolicy.CLASS)  //retention:소스
@Target(ElementType.FIELD)
@interface Field{  //여기의 필드는 멤버변수와 동의어
	int value(); //기본 속성명
} 


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.CONSTRUCTOR)
@interface Constructor{
	int value() default 0; //기본 속성명: value
	//유저가 기본값을 지정하면 value값쓰고 지정안하면 0을쓴다는뜻.
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

//8장부터는 개념이 아니라 그냥 쓰는거
//이해말고 어떻게쓰는지만 보는거, 익숙해지는거


