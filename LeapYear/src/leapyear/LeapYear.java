package leapyear;

public class LeapYear {

	public static void main(String[] args) {
		int n = 2000;
		if (n % 4 == 0) {
			System.out.println(n + " is a leap year!");
		}
		else {
			System.out.println(n + " is not a leap year!");
		}
	}
}
