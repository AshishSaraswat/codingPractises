package arrays;

public class GenerateSortedArrays {

	int arr[] = new int[5];
	int arr1[] = new int[5];

	public static void main(String[] args) {
		GenerateSortedArrays arrays = new GenerateSortedArrays();
		arrays.genSortedArrays();

	}

	private void genSortedArrays() {
		genSortedArrays(0, arr.length - 1, 0, arr1.length - 1);

	}

	private void genSortedArrays(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		
	}

}
