package com.javaex.practice;

public class Ex06 {

	// 1에서 100까지의 수에서 5의 배수 이면서 7의 배수인 수를 출력하세요

	public static void main(String[] args) {
		
		
		int i;
		 
		
		for (i=1; i<=100; i++) {
			
			if(i%5==0 && i%7==0) {
				System.out.println(i);
			}
			
				
			
		}
		

	}

}
