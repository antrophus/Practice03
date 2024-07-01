package com.javaex.practice;

public class Ex09 {
	
	//다음과 같이 출력하세요
	/*
	 1    2    3    4    5    6    7    8    9    10
	 2    3    4    5    6    7    8    9    10   11
	 3    4    5    6    7    8    9    10   11   12  
	 4    5    6    7    8    9    10   11   12   13
	 5    6    7    8    9    10   11   12   13   14
	 6    7    8    9    10   11   12   13   14   15
	 7    8    9    10   11   12   13   14   15   16
	 8    9    10   11   12   13   14   15   16   17
	 9    10   11   12   13   14   15   16   17   18
	 10   11   12   13   14   15   16   17   18   19
	 */

	public static void main(String[] args) {
		
		int i;
		int j;
		
		for( i = 0; i<10; i++) {
			for( j = 1; j<=10; j++) {
				System.out.print(j + i + "\t");
				
			}
			System.out.println();
		}

	}

}
