package operation;

public class Operation {

	public static void main(String[] args) {
		
	}
	
	private static float add(float a, float b) {
		return a + b;
	}

	private static float sub(float a, float b) {
		return a - b;
	}
	
	private static float mul(float a, float b) {
		return a * b;
	}
	
	private static float div(float a, float b) {
		if (b == 0) {
			System.out.println("Can't divide by zero.");
			return 0;
		}
		return a / b;
	}
}
