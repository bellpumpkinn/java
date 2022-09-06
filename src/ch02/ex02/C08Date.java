package ch02.ex02;

import java.time.LocalDate;

public class C08Date {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		
		date = date.plusDays(1); //하루를 더한다.
		System.out.println(date);

		date = date.minusDays(1); //하루를 뺀다.
		System.out.println(date);
	}
}

