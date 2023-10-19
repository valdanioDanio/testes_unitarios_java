package vd.java.ao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Operacoes Matematicas")
class SimpleMathOpeTest {
	
	public SimpleMathOpe math;
	
	@BeforeAll
	static void setup() { 
		System.out.println("Running @BeforeAll");
	}
	
	@BeforeEach
	void BeforeEach() { 
		math = new SimpleMathOpe();
		System.out.println("Running @BeforeEach");
	}
	
	@AfterEach
	void AfterEach() { 
		math = new SimpleMathOpe();
		System.out.println("Running @BeforeEach");
	}
	
	@AfterAll
	static void cleanUp() {
		System.out.println("Running @AfterAll");
	}

	@Test
	@DisplayName("Test soma 12+12=24")
	void test() {		
		double result = math.sum(12, 12);
		double expected = 24;
		Assertions.assertEquals(expected, result, "Nao foi obitido o resultado esperado soma.");
		// Assertions.assertEquals(14, result, ()-> "Nao foi obitido o resultado
		// sperado, 14.");
	}
	
	@Test
	@DisplayName("Test subtracao 12-8=4")
	//@Disabled("TODO we need still work on it!")
	void testSub() {
		double result = math.sub(12, 8);
		double expected = 4;
		Assertions.assertEquals(expected, result, "Nao foi obitido o resultado esperado sub.");
		// Assertions.assertEquals(14, result, ()-> "Nao foi obitido o resultado
		// sperado, 14.");
	}
	
	@Test
	@DisplayName("Test divisao 12/0=Error")
	void testDiv() {
		
		var expectedMessage = "Impossible to divide by zero!";
		
		ArithmeticException	exeption = assertThrows(ArithmeticException.class, ()->{
			math.div(12, 2);
		}, ()-> "The operation should return an exception!");
		
		assertEquals(expectedMessage, exeption.getMessage(), () -> "the returned message is not equals");
		
	}

// test[System Under Test]_[Condition or State Change]_[Expected Result]
	@DisplayName("Display Name")
	@Test
	void testABCD_when_XYZ_Should() {
		// Given / Arrange
		// When / Act
		// Then / Assert
	}

}
