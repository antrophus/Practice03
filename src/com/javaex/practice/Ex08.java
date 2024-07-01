package com.javaex.practice;

public class Ex08 {
	
	// 아래와 같이 구구단을 출력하세요

	public static void main(String[] args) {
		
//		for(int i = 1; i<=9; i++) {
//			
//			for(int dan = 2; dan<=9; dan++) {
//				
//				System.out.print(dan + "*" + i + "=" +dan*i );
//				System.out.print("   ");
//				
//			}
//			System.out.println();
			
			// 2단부터 9단까지를 가로로 출력
	        for (int i = 1; i <= 9; i++) {
	            for (int dan = 2; dan <= 9; dan++) {
	                System.out.print(dan + "*" + i + "=" + (dan * i) + "\t");
	            }
	            // 각 줄의 출력을 구분하기 위해 줄 바꿈
	            System.out.println();

	}

}
}