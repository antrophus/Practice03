package com.javaex.practice;

import java.util.Scanner;

public class Test { // 정수 다섯개를 입력 받아 가장 큰 수를 출력하세요. 10번 문제 참고용

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("숫자를 입력하세요");
//
//		int max = 0;
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.print("숫자: ");
//			int num = sc.nextInt();
//
//			if (num > max) {
//				max = num;
//			}
//
//		}
//		
//		System.out.println("최대값은 " + max + " 입니다.");
//
//		sc.close();
//	}

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("숫자를 입력하세요: ");
	        int num = sc.nextInt();

	        for (int i = num; i > 0; i--) {
	            for (int j = 0; j < i; j++) {
	                System.out.print(i);
	            }
	            System.out.println();
	        }

	        sc.close();
	    }
	}

