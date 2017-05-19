package arrays;

public class LongestMaxSubArray {
	int arr[] =  {-2, -3, 0, -2, -40};
	// { 6, -3, -10, 0, 2 };

	public static void main(String[] args) {
		new LongestMaxSubArray().findMaxProd();

	}

	public void findMaxProd() {
		int len = arr.length;
		int tempProd = 1;
		int maxProd = tempProd;
		for (int i = 0; i < len; i++) {
			if (arr[i] == 0) {
				tempProd = 1;
			} else {
				tempProd = tempProd * arr[i];
				if (tempProd > maxProd) {
					maxProd = tempProd;
				}
			}
		}
		System.out.println(maxProd);
	}

}
