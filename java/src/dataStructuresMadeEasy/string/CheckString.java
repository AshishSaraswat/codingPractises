package string;

import java.util.LinkedList;
import java.util.Queue;

public class CheckString {

	public static void main(String[] args) {
		String s = null;
		try {
			System.out.println(CheckToRecheck.getLen(s));
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("1000 s rs note is like null");
		}
		// catch (CheckEx e) {
		// String s1 = e.getMessage();
		// System.out.println("Lets agree to disagree "
		// +s1 );
		// }
	}

	public void checkQueue() {
		Queue<String> q = new LinkedList<>();
		q.add("");
		while (!q.isEmpty()) {

		}
	}

}
