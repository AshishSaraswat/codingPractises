package week1;

import java.util.Scanner;

public class MergeSort {

	int[] arr =new int[100000];
	// { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43 };
	// int[] tempArr = new int[arr.length];
	long count = 0;
	
	public static void main(String[] args) {
		new MergeSort().callMerge();
	}

	private void callMerge() {
		int len = arr.length;
		Scanner in = new Scanner(System.in);
		for(int i=0;i<len;i++){
			arr[i]=in.nextInt();
		}
		displayArr(len);
		count = mergeSort(0, len - 1);
		System.out.println();
		displayArr(len);
		//System.out.println();
		System.out.println("Inversions are :" + count);

	}

	private void displayArr(int len) {
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + "  ");
		}

	}

	private long mergeSort(int i, int j) {
		if (i >= j)
			return 0;
		long sum = 0;
		int par = (i + j) / 2;
		sum= mergeSort(i, par);
		//System.out.println("after 1st "+ sum);
		sum += mergeSort(par + 1, j);
		//System.out.println("after 2nd "+ sum);
		sum += mergePartition(i, par+1, j);
		//System.out.println("after 3rd "+ sum);
		//System.out.println(sum);
		return sum;
	}

	private long mergePartition(int i, int par, int j) {
		int start = i;
		int mid = par;
		int sec = par;
		int k = j - i + 1;
		long sum = 0;
		int[] tempArr = new int[k];
		int str = 0;
		while (start <= mid-1 && sec <= j) {
			if (arr[start] <= arr[sec]) {
				tempArr[str] = arr[start];
				start++;
			} else {
				tempArr[str] = arr[sec];
				sum +=mid-start;
				sec++;

			}
			str++;
		}
		if (start <= mid-1) {
			//System.out.println("mid is " + mid + " start is " + start);
			//sum+=mid-start;
			while (start <= mid-1) {
				tempArr[str] = arr[start];
				str++;
				start++;
				//sum++;
			}

		}
		if (sec <= j) {
			while (sec <= j) {
				tempArr[str] = arr[sec];
				str++;
				sec++;
			}
		}
		for (int a = 0; a < k; a++) {
			arr[i + a] = tempArr[a];
		}
		return sum;
	}

}
