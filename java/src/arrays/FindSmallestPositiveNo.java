package arrays;

public class FindSmallestPositiveNo {

	int[] arr = { 2, 3, -7, 6, 8, -10, 15 };
	int[] arr2 = { 4, 4, 100, 5000, 4, 4, 4, 4, 100, 100 };

	public static void main(String[] args) {
		FindSmallestPositiveNo fndObj = new FindSmallestPositiveNo();
		fndObj.findSmallestPositiveNo();
		fndObj.findXorElement();
		int a = fndObj.gcd(7, 2);
		System.out.println("GCD is : " + a);
		fndObj.findOddElements();

	}

	private void findOddElements() {
		int n = arr2.length;
		int z = 0;
		for (int i = 0; i < n; i++) {
			z = z ^ arr2[i];
		}
		int getBit = z & ~(z - 1);
		int first = 0;
		int second = 0;
		for (int i = 0; i < n; i++) {
			if ((arr2[i] & getBit) > 0) {
				first = first ^ arr2[i];
			} else
				second = second ^ arr2[i];

		}
		System.out.println("first element is : " + first);
		System.out.println("second element is : " + second);
	}

	public void findXorElement() {
		int i = 2;
		int a = 5;
		int b = i ^ a;
		int c = b & ~(b - 1);
		// System.out.println("Two's complement of "+(b-1) +" is :" + ~(b - 1));
		// System.out.println("check "+c);
		// System.out.println(~4);
		// System.out.println(b);
		int x = 0;
		// System.out.println(x);
		if ((i ^ c) > 0)
			x = x ^ i;

		else
			x = x ^ a;
		System.out.println("Value for x : " + x);

	}

	int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	private void findSmallestPositiveNo() {
		int n = arr.length;
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] <= 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		int shift = n - j;
		for (int i = j; i < n; i++) {
			int a = Math.abs(arr[i]);
			if (Math.abs(a - 1) < shift && arr[j + Math.abs(a - 1)] > 0) {
				arr[(j + Math.abs(a - 1))] = -arr[(j + Math.abs(a - 1))];
			}
		}
		for (int i = j; i < n; i++) {
			if (arr[i] > 0) {
				System.out.println("Value is " + (i + 1 - j));
				break;
			}
		}
	}

}
