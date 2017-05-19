package arrays;

public class FaboncciNumber {

	int n = 30;

	public static void main(String[] args) {
		FaboncciNumber number = new FaboncciNumber();
		long frst = System.currentTimeMillis();
		long num2 = number.callFab2(number.n+1);
		long scnd = System.currentTimeMillis();
		System.out.println("200th fab num is frm sec " + num2 + " time taken is : " + (frst - scnd));
		long fst = System.currentTimeMillis();
		long num = number.callFab1(number.n);
		long scd = System.currentTimeMillis();
		System.out.println("200th fab num is " + num + " time taken is : " + (scd - fst));

	}

	private long callFab2(int n2) {
		if (n2 == 0)
			return 0;
		int arr[] = new int[n2];
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 2; i < n2; i++)
			arr[i] = arr[i - 1] + arr[i - 2];
		return arr[n2-1];
	}

	private long callFab1(int n2) {
		if (n2 == 0)
			return 0;
		if (n2 == 1)
			return 1;

		return callFab1(n2 - 1) + callFab1(n2 - 2);
	}

}
