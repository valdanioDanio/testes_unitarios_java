package vd.java.ao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

class DemoRepeatTest {
	
	public SimpleMathOpe math;
	
	@BeforeEach
	void BeforeEach() { 
		math = new SimpleMathOpe();
		System.out.println("Running @BeforeEach");
	}

	@RepeatedTest(5)
	@DisplayName("Test divisao por zero")
	void testDiv(RepetitionInfo repetitionInfor, TestInfo testInfo) {
		System.out.println("Repeticao corrente: "+repetitionInfor.getCurrentRepetition()+" - Total "+repetitionInfor.getTotalRepetitions());				
	    System.out.println("Running "+ testInfo.getTestMethod().get().getName());
	}
	
}
