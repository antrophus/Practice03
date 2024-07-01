package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	//숫자를 입력받아 아래와 같이 출력하세요
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요\n숫자: ");
		int num = sc.nextInt();
		int y, x;
		
		for(y = 1 ; y <= num ; y++) {
			for(x = 1 ; x <= y ; x++) {
				System.out.print(y);
				
			}
			System.out.println();
		}
		sc.close();
		

	}

}
