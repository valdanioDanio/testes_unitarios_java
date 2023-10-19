package vd.java.ao;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(MethodOrderer.Random.class)
@TestMethodOrder(MethodOrderer.MethodName.class)
@Order(1)
class TestInstanceTest {
	
	public SimpleMathOpe math;
	
	@Test
	void testA() {
		System.out.println("Teste A");
	}
	
	@Test
	void testB() {
		System.out.println("Teste B");
	}
	
}

