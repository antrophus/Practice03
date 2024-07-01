package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	
	//다음과 같은 프로그램을 작성하세요
	/*
	 a.입력 받은 숫자가 홀수인 경우에는, 입력 값까지 홀수의 합을 출력합니다.
	  -예) 입력이 7 이면 16을 출력 (1 + 3 + 5 + 7 = 16)
	 b.입력 받은 숫자가 짝수인 경우에는, 입력 값까지 짝수의 합을 출력합니다.
	  -예) 입력이 10이면 30을 출력 (2 + 4 + 6 + 8 + 10 = 30)
	 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		int sum = 0;
		
		if (num % 2 == 0) { //입력값이 짝수일 경우
			for (int i = 2; i<=num; i++) {//0,1은 짝수가 아니므로 제외, 2부터 시작.
				if(i % 2 == 0) {// 짝수, 홀수 번갈아서 출력되므로, 증가하는 변수 i는 짝수인 2의 배수 여야 함. 
					sum = sum + i; // 합산 변수 sum에 2의 배수인 i 값을 반복 할 때마다 하나씩 대입하여 합산한다.
				}
			}
		} else { // 입력 값이 짝수가 아닐 경우 즉, 홀수일 경우
			for(int i = 1; i<=num; i++) {//0은 홀수가 아니므로 제외, 1부터 시작.
				if(i % 2 == 1) {// 짝수, 홀수 번갈아서 출력되므로, i는 홀수인 1로 시작하여 1칸 건너 뛰어야 홀수 값을 출력할 수 있다.
					sum = sum + i; // 합산 변수 sum에 홀수인 i 값이 홀수로 증가할 때마다 하나씩 대입하여 합산한다.
				}
				
			}
		
		}
		System.out.println("결과값: " + sum );
		
		sc.close();
		
	}
	
}
					
			
					
					
				
		
		
		
	


