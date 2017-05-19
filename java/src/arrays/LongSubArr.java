package arrays;

public class LongSubArr {

	int[] a = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };

	public static void main(String[] args) {
		new LongSubArr().longSubArrIter();

	}
	// 10, 22, 9, 33, 21, 50, 41, 60

	public void longSubArrIter() {
		int length = a.length;
		int tempArr[] = new int[length];
		int indexArr[] = new int[length];
		for (int i = 0; i < length; i++) {
			tempArr[i] = 1;
			indexArr[i] = i;
		}
		// int j = 0;
		// int i = 1;
		for (int i = 1; i < length; i++) {
			// while (j < i)
			for (int j = 0; j < i; j++) {
				if (a[j] < a[i]) {
					if (tempArr[j] + 1 > tempArr[i]) {
						tempArr[i] = tempArr[j] + 1;
						// Math.max(tempArr[j] + 1, tempArr[i]);
						indexArr[i] = j;
					}
					// j++;
				}
				// j++;
			}
			// j = 0;
			// i++;
		}
		int maxIndex = 0;
		for (int a = 0; a < length; a++) {
			if (tempArr[maxIndex] < tempArr[a]) {
				maxIndex = a;
			}
		}
		int temp = maxIndex;
		int key = maxIndex;
		do {
			temp = key;
			System.out.print(a[temp] + " ");
			// System.out.print(" ");
			key = indexArr[temp];
		} while (key != temp);

	}

}
