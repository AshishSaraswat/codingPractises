package arrays;

public class ReplaceZeroWithOnes {
	int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1 };
	// { 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1,0, 0, 1, 1, 1, 1,
	// 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
	//0
	//};
	// { 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0 };

	public static void main(String args[]) {

		ReplaceZeroWithOnes ones = new ReplaceZeroWithOnes();
		int pos = ones.getReplaceOneIndex();
		System.out.println("Position of zero to be replaced : " + pos);
	}

	private int getReplaceOneIndex() {
		int len = arr.length;
		int maxIndex = 0;
		int diff = 0;
		int prevPrevZero = -1;
		int prevZero = -1;
		for (int i = 0; i < len; i++) {
			if (arr[i] == 0) {
				// if (prevPrevZero != -1) {
				if (i - prevPrevZero > diff) {
					diff = i - prevPrevZero;
					maxIndex = prevZero;
				}
				// }
				prevPrevZero = prevZero;
				prevZero = i;
			}
		}
		if(len-prevPrevZero>diff){
			diff=len-prevPrevZero;
			maxIndex=prevZero;
		}
		return maxIndex;
	}

}
