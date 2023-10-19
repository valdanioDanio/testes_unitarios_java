package vd.java.ao;


import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class ArraysCompareTest {

	@Test
	void test() {
		int[] numbers = {25,8,21,32,3};
		int[] expectedNumbers = {3,8,21,25,32};
		
		Arrays.sort(numbers);
		
		assertArrayEquals(expectedNumbers, numbers);
	}
	
	@Test
	@Timeout(1)
	void testSortPerfomance() {
		
		for(int i = 0; i < 2000000; i++) {
			System.out.println("Valor "+i);
		}
		
	}

}
