package day11;

public class ThrowDemo {

	void validate(int income) {
		try {	
	     	if(income > 5) {
			throw new ArithmeticException("Not Eligible");
	     	}else
		{
			System.out.println("Eligible");
		}
		}catch (Exception e) {
			System.out.println("Sorry!");
		}	
	}
	public static void main(String[] args) {
		ThrowDemo td = new ThrowDemo();
		td.validate(10);
		System.out.println("Welcome");
	}

}
