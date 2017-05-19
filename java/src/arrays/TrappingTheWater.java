package arrays;

public class TrappingTheWater {
	int arr[] = { 3, 0, 0, 2, 0, 4 };
	

	public static void main(String[] args) {
		TrappingTheWater theWater = new TrappingTheWater();
		theWater.trapTheWater();

	}

	private void trapTheWater() {
		int len = arr.length;
		int[] left = new int[len];
		int[] right = new int[len];
		left[0] = arr[0];
		right[len - 1] = arr[len - 1];
		for (int i = 1; i < len; i++) {
			left[i] = Math.max(left[i - 1], arr[i]);
		}
		for (int i = len - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], arr[i]);
		}
		int totalWater = 0;
		for (int i = 0; i < len; i++) {
			totalWater += Math.min(left[i], right[i]) - arr[i];
		}
		System.out.println("Total water trapped is : " + totalWater);
	}

}
