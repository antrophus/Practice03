package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	
	/*아래와 설명에 맞는 프로그램을 작성하세요
	  숫자를 1개 입력 받아 입력한 숫자까지 누적합계를 구하는 프로그램을 작성하세요.
	  예를 들어 100을 입력받는다면 아래와 같이 계산됩니다.
	  1 + 2 + 3 + 4 + 5 + ... + 99 + 100
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		
		int num = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i<=num; i++) {
			
			sum = sum + i;
			
		}
		System.out.println("합계: " + sum);
sc.close();

	}

}
