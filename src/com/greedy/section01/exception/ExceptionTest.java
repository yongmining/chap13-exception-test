package com.greedy.section01.exception;

public class ExceptionTest {
	
	public void chechEnoughMoney(int price, int money) throws Exception {
		
		System.out.println("가지고 계신 돈은 " + money + "원 이며, 상품 가격은 " + price + "원 입니다.");
	
		if(money >= price) {
			System.out.println("상품을 구입하기 위한 금액이 충분합니다.");
		} else {
			throw new Exception();
		}
		
		System.out.println("즐거운 쇼핑하세요~");
		
	}
}
