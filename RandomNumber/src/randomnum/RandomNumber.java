package randomnum;

import java.util.*;

public class RandomNumber {

	public static void main(String[] args) {
		int counter;
		Random rnum = new Random();
		for (counter=0; counter< 7; counter++) {
			System.out.println("New random number generated: "+ rnum.nextInt(100));
		}
	}
}
