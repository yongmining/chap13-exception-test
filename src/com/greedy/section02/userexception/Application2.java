package com.greedy.section02.userexception;

import com.greedy.section02.userexception.exception.MoneyNegativeException;
import com.greedy.section02.userexception.exception.NegativeException;
import com.greedy.section02.userexception.exception.NotEnoughMoneyException;
import com.greedy.section02.userexception.exception.PriceNegativeException;

public class Application2 {
	public static void main(String[] args) {
		
		/* 다양한 타입의 예외들 multi catch block을 이용해서 처리 */
		ExceptionTest et = new ExceptionTest();
		
		try {
			et.checkEnoughMoney(20000, 30000);
		} catch (PriceNegativeException e) {
			System.out.println("PriceNegativeException 발생!");
			System.out.println(e.getMessage());
		} catch (MoneyNegativeException e) {
			System.out.println("MoneyNegativeException 발생!");
			System.out.println(e.getMessage());
		} catch (NotEnoughMoneyException e) {
			System.out.println("NotEnoughMoneyException 발생!");
			System.out.println(e.getMessage());
		} catch (NegativeException e) {
			System.out.println("NegativeException 발생!");
			System.out.println(e.getMessage());
		} finally {
			/* 예외 발생 여부와 상관 없이 실행할 내용 */
			System.out.println("finally 블럭 내용 동작함...");
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}
}
