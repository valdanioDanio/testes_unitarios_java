package vd.java.ao;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@Order(2)
class OrderTest {
	
	public SimpleMathOpe math;
	
	@Test
	@Order(2)
	void testA() {
		System.out.println("Teste A");
	}
	
	@Test
	@Order(1)
	void testB() {
		System.out.println("Teste B");
	}
	
}
