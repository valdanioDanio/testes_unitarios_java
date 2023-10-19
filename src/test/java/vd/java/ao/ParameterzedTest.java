package vd.java.ao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterzedTest {

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

	@ParameterizedTest
	@DisplayName("Test divisao parametrizada")
	//@MethodSource("testDivParameterized")
	@MethodSource()
	void testDiv(int n1, int n2, int n3) {

		assertEquals(n3, math.div(n1,n2), () -> "the returned value is not equals");

	}
	
	@ParameterizedTest
	@DisplayName("Test divisao parametrizada csv")
	@CsvSource({
		"4, 2, 2",
		"8, 4, 2",
		"16, 4, 4"
	})
	void testCsvDiv(int n1, int n2, int n3) {
		
		assertEquals(n3, math.div(n1,n2), () -> "the returned value is not equals");
		
	}
	
	@ParameterizedTest
	@DisplayName("Test divisao parametrizada csv file")
	@CsvFileSource(resources = "/testDiv.csv")
	void testCsvFileDiv(int n1, int n2, int n3) {
		
		assertEquals(n3, math.div(n1,n2), () -> "the returned value is not equals");
		
	}
	
	@ParameterizedTest
	@DisplayName("Test divisao parametrizada value source")
	@ValueSource(strings = {"pao","banana","mandioca"})
	void testValueSource(String nome) {
	  System.out.println(nome);		
	  assertNotNull(nome);
	}

	public static Stream<Arguments> testDiv() {
		return Stream.of(Arguments.of(4, 2, 2), Arguments.of(8, 4, 2), Arguments.of(16, 4, 4));
	}
}
