package operation;

public class GetHighest {

	public static void main(String[] args) {
		int[] numbers = {78, 6, -250, 2, 12, 9};
		System.out.println(getHighest(numbers));
	}
	
	/// Get the highest numbers in order and return the sum of the first 2.
	private static int getHighest(int[] numbers) {
		int temp = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = numbers.length - 2; j >= 0; j--) {
				if (numbers[j+1] > numbers[j]) {
					temp = numbers[j+1];
					numbers[j+1] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		
		return numbers[0] + numbers[1];
	}
}
