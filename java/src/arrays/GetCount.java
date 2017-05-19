package arrays;

public class GetCount {

	int arr[] = { 2, 3, 3, 2, 5 };

	public static void main(String[] args) {
		GetCount count = new GetCount();
		// count.getCountNegative();
		// count.displayArr();
		count.getCountModulo();

	}

	private void displayArr() {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			System.out.println((i + 1) + " --> " + -arr[i]);
		}

	}

	private void getCountNegative() {
		int len = arr.length;
		int i = 0;
		while (i < len) {
			if (arr[i] <= 0) {
				i++;
				continue;
			}
			if (arr[i] > 0) {
				int index = arr[i] - 1;
				if (arr[index] > 0) {
					arr[i] = arr[index];
					arr[index] = -1;
				} else {
					arr[index]--;
					arr[i] = 0;
					i++;
				}

			}

		}

	}

	public void getCountModulo() {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			arr[i] = arr[i] - 1;
		}
		for (int i = 0; i < len; i++) {
			arr[arr[i] % len] = arr[arr[i] % len] + len;
		}
		System.out.println();
		for (int i = 0; i < len; i++) {
			System.out.println((i + 1) + " ==> " + arr[i] / len);
		}
	}

}
