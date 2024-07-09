package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	/*
	 * 아래와 같이 은행 프로그램을 작성하세요 "1.예금" 선택후 금액을 입력하면 예금액이 합산됩니다. "2.출금" 선택후 금액을 입력하면
	 * 예금액이 차감됩니다. "3.잔고" 선택시 현재 잔고가 출력됩니다. "4.종료" 선택시 종료됩니다. "1,2,3,4 이외의 숫자" 다시
	 * 입력해주세요 메시지 출력됩니다.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int amount = 0;
		int asset = 0;
		
		while(true) {
			
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			num = sc.nextInt();
			
			if(num==4) {
				System.out.println("프로그램이 종료됩니다.");
				break;
				
			}else if(num==1) {
				System.out.print("입금액> ");
				amount = sc.nextInt();
				asset += amount;
				
			}else if(num==2) {
				System.out.print("출금액> ");
				amount = sc.nextInt();
				asset -= amount;
				
			}else if(num==3) {
				System.out.println("잔고> " + asset);
				
			}else {
				System.out.println("다시입력해주세요");
			}
			
		}
		sc.close();
	}
}

		
		


