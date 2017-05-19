package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GetMaxNum implements Comparable<Integer> {

	Integer[] arr = { 54, 546, 548, 60 };

	public static void main(String[] args) {
		GetMaxNum getMax = new GetMaxNum();
		getMax.sortArray();

	}

	private void sortArray() {
		// List<Integer> list = Arrays.asList(arr);
		Arrays.sort(arr, new CheckClass());
		for (Integer i : arr) {
			System.out.print(i);
		}

	}

	@Override
	public int compareTo(Integer str) {
		String firSec = this.toString() + (str.toString());
		String secFir = str.toString() + (this.toString());
		if (firSec.compareTo(secFir) > 0) {
			return -1;
		} else {
			return 1;
		}
	}

}

class CheckClass implements Comparator<Integer> {

	@Override
	public int compare(Integer str, Integer str1) {
		String firSec = this.toString() + (str.toString());
		String secFir = str.toString() + (this.toString());
		if (firSec.compareTo(secFir) > 0) {
			return -1;
		} else {
			return 1;
		}
	}

}

class CheckClass2 implements Comparable<String> {

	@Override
	public int compareTo(String str) {
		String firSec = this.toString().concat(str);
		String secFir = str.concat(this.toString());
		return firSec.compareTo(secFir);
	}

}
