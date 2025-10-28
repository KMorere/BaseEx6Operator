package operation;

public class Triangle {

	public static void main(String[] args) {
		drawTriangle(6);
	}
	
	/// Draw an empty space or a star increasing in amount each row.
	private static void drawTriangle(int size) {
		for(int i = 0; i < size; i++) {
			drawLoop(size - i, " ");
			drawLoop((i == 0) ? 1 : i+i+1, "*");
			drawLoop(size - i, " ");
			System.out.println();
		}
	}
	
	/// Create a loop and print a character.
	private static void drawLoop(int size, String c) {
		for(int y = 0; y < size; y++) {
			System.out.print(c);
		}
	}
}
