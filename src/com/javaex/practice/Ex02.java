package com.javaex.practice;

public class Ex02 {

	/*아래의 출력결과를 예상하여 작성하세요.(코드를 작성해서 예상과 맞는지 확인해 보세요.*/
	
	public static void main(String[] args) {
	
		
		int x, y;
		for (x=0; x<4; x++) {
			for(y=0; y<2; y++) {
				System.out.print("*"); // y 초기값 0, 1회 실행 후 1, 2회 실행 후 (2) ->반복문 빠져나옴. "*"을 2번 print 한다. : **
			}
			System.out.println(""); // x 초기값 0, 1회 실행 후 1, 2회 실행 후 2, 3회 실행 후 3, 4회 실행 후 (4) ->반복문 빠져나옴. 위 연산을 4번 println 한다. :  **
//																																	     **
//																																		 **
//																																		 **
		}/*
		결과 값 :
		**
		**
		**
		**
				
		*/

	}

}
