package lesson1;

public class ChisloKvadratov {

	public static void main(String[] args) {
		int low = 1;
		int high = 1;
		while (high < 100) {
			System.out.println(high);
			high = low * low;
			low = low + 1;
		}

	}

}
