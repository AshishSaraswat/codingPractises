package arrays;

public class FindCommonElem {
	int ar1[] = { 1, 5, 10, 20, 40, 80 };
	int ar2[] = { 6, 7, 20, 80, 100 };
	int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };

	public static void main(String[] args) {
		new FindCommonElem().findCommonElem();

	}

	private void findCommonElem() {
		int len1 = ar1.length;
		int len2 = ar2.length;
		int len3 = ar3.length;
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < len1 && j < len2 && k < len3) {
			if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
				System.out.print(ar1[i] + " ");
				i++;
				j++;
				k++;
			} else if (ar1[i] < ar2[j])
				i++;
			else if (ar2[j] < ar3[k])
				j++;
			else
				k++;
		}

	}

}
