package vd.java.ao;

public class SimpleMathOpe {
	
	public double sum(double n1, double n2) {
		return n1+n2;
	}
	
	public double sub(double n1, double n2) {
		return n1-n2;
	}
	
	public double mult(double n1, double n2) {
		return n1*n2;
	}
	
	public double div(double n1, double n2)  {
		
		if(n2 == 0) {
			throw new ArithmeticException("Impossible to divide by zero!");
		}
		
		return n1/n2;
		
	}

}
