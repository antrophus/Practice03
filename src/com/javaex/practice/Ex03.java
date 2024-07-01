package com.javaex.practice;

public class Ex03 {
	
	// 아래의 출력결과를 예상하여 작성하세요.(코드를 작성해서 예상과 맞는지 확인해 보세요.)

	public static void main(String[] args) {
		
		int x, y;
		for(x=0 ; x<4 ; x++) {
			for(y=2 ; y>=0; y--) {
				System.out.print("*"); // y 초기 값 2, 1회 실행 후 1, 2회 실행 후 0 '등호 표기가 있기에 한번더 실행' 3회 실행 후 (-1)-> 반복문 빠져나옴 : ***(세번 찍음)
			}
			System.out.println("");// x 초기 값 0, 1회 반복 후 1, 2회 반복 후 2, 3회 실행 후 3, 4회 실행 후 (4) - > 반복문 빠져나옴 **(두번찍음)을 네번 println(줄바꿈후 출력)
			
		}

	}

}
