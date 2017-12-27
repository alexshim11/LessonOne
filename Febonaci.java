package lesson1;
public class Febonaci {

	public static void main(String[] args) {
		int x = 1;
		int y = 1;

		while (y < 50) {
			System.out.println(y);
			y = x + y;
			x = y - x;
		}

	}
}