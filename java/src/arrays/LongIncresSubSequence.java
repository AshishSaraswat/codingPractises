package arrays;

public class LongIncresSubSequence {

	int arr[] = { 23, 10, 22, 5, 33, 8, 9, 21, 50, 41, 60, 80, 99, 22, 23, 24, 25, 26, 27 };

	public static void main(String[] args) {
		LongIncresSubSequence sequence = new LongIncresSubSequence();
		sequence.findLongestSequence();

	}

	private void findLongestSequence() {
		int len = arr.length;
		System.out.println(len);
		int tempArr[] = new int[len];
		int indexArr[] = new int[len];
		for (int i = 0; i < len; i++) {
			tempArr[i] = 1;
			indexArr[i]=i;
		}
		for (int i = 1; i < len; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i]) {
					if (tempArr[j] + 1 > tempArr[i]) {
						tempArr[i] = tempArr[j] + 1;
						indexArr[i] = j;
					}
				}
			}
		}
		int maxIndex = 0;
		// int max = tempArr[0];
		for (int i = 1; i < len; i++) {
			if (tempArr[maxIndex] < tempArr[i]) {
				maxIndex = i;
			}
		}
		int length = 0;
		int start = maxIndex;
		int end = maxIndex;
		do {
			end = start;
			System.out.print(arr[end] + " ");
			start = indexArr[end];
			length++;
		} while (end != start);
		System.out.println("length of sequence is : " + length);
	}

}
