package com.javaex.practice;

public class Ex04 {
	
	//아래의 출력결과를 예상하여 작성하세요.(코드를 작성해서 예상과 맞는지 확인해 보세요.)

	public static void main(String[] args) {
		
		for(int i=1; i<5; i++) {
			System.out.println(i);
		} // i 초기값 1, 1 ~ 4까지 줄바꿈 출력 
		/*
		1
		2
		3
		4
		*/
		
		
		System.out.println("================");
		
		for(int i =10; i>0; i=i-2) {
			System.out.println(i);
		} // i 초기값 10, 10 ~ 2까지 10, 8, 6, 4, 2 줄바꿈 출력
		/*
		 10
		 8
		 6
		 4
		 2
		 */

	}

}
