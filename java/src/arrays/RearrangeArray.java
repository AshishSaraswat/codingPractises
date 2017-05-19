package arrays;

class RearrangeArray {

	static int arr[] = { 1, 3, 0, 2 };
	static int len = arr.length;

	static void rearrange() {

		for (int i = 0; i < len; i++) {

			arr[arr[i] % len] = arr[arr[i] % len] + len * i;
		}

	}

	static void printArray() {
		for (int i = 0; i < len; i++) {

			System.out.print(" " + arr[i] / len);
		}
		System.out.println();
	}

	public static void main(String arg[]) {

		System.out.println("Given array is");
		for (int i = 0; i < len; i++) {

			System.out.print(" " + arr[i]);
		}
		System.out.println();
		rearrange();
		System.out.println("Modifed array is");
		printArray();

	}

}