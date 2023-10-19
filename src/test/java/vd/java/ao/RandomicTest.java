package vd.java.ao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;

@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class RandomicTest {
	
	OrderTest builder = new OrderTest();
	
	@BeforeEach
	void beforeEach() {
		System.out.println(builder);
	}
	
	@Test
	void testA() {
		System.out.println("Teste A");
	}
	
	@Test
	void testB() {
		System.out.println("Teste B");
	}
	
}

