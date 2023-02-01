package com.greedy.section04.override;

import java.io.FileNotFoundException;

public class SubClass extends SuperClass {
	
	
	/* 예외를 던지는 구문 없이 오버라이딩 할 수 있다. */
//	@Override
//	public void method() {}
	
	/* 같은 예외를 던져주는 구문으로 오버라이딩 해야한다. */
//	@Override
//	public void method() throws IOException {}

	/* 부모의 예외처리 클래스보다 상위 예외로는 후손클래스에서 오버라이딩 할 수 없다. */
//	@Override
//	public void method() throws Exception {}

	/* 하지만 부모의 예외 클래스보다 더 하위에 있는 예외(더 구체적은 상황)인 경우 오버라이딩 할 수 있다. */
	@Override
	public void method() throws FileNotFoundException {}
	

}
