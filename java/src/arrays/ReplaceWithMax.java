package arrays;

public class ReplaceWithMax {

	int[] arr = { 16, 17, 4, 3, 5, 2 };

	public static void main(String[] args) {
		new ReplaceWithMax().replaceWithMax();

	}

	public void replaceWithMax() {
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.print(arr[len - 1]);
		System.out.println();
		int currentMax = arr[len - 1];
		arr[len - 1] = -1;
		for (int i = len - 2; i >= 0; i--) {
			int temp = arr[i];
			arr[i] = currentMax;
			if (temp > currentMax) {
				currentMax = temp;
			}
		}
		for (int i = 0; i < len - 1; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.print(arr[len - 1]);
		System.out.println();
	}
}
