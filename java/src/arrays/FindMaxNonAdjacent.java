package arrays;

import java.util.ArrayList;
import java.util.List;

public class FindMaxNonAdjacent {

	int[] arr = { 10, 22, 9, 33, 21, 50, 41, 60, 80 }; 
		//{ 5, 5, 10, 40, 50, -35 };
	int sum = 15;

	public static void main(String args[]) {
		FindMaxNonAdjacent fndObj = new FindMaxNonAdjacent();
		// fndObj.findMaxDiff();
		//fndObj.findSubArr();
		//fndObj.findMaxEle();
		fndObj.findMaxLis();
	}

	private void findMaxLis() {
		int countArr[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			countArr[i] = 0;
		}
		MaxSubBST maxSub = new MaxSubBST();
		MaxSubNode root= maxSub.add(null, arr[0], countArr[0], 0);
		for (int i = 1; i < arr.length; i++) {
			
			maxSub.add(root, arr[i], countArr[i], i);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(countArr[i]);
		}

	}

	private void findMaxEle() {
		int size = arr.length;
		int maxSum = 0;
		int incl = arr[0];
		int excl = 0;
		if (size == 1) {
			maxSum = arr[0];
		}
		;
		for (int i = 1; i < size; i++) {
			int temp = incl;
			incl = Math.max(excl + arr[i], incl);
			excl = temp;
		}
		maxSum = incl;
		System.out.println("sum is : " + maxSum);

	}

	public void findMaxDiff() {
		int maxDiff = arr[1] - arr[0];
		int min = arr[0];
		for (int i = 2; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
			int diff = arr[i] - min;
			if (diff > maxDiff) {
				maxDiff = diff;
				// min = arr[i]; { 5, 5, 10, 40, 50, -35 };;
			}
		}
		System.out.println(maxDiff);
	}

	public void findSubArr() {
		int size = arr.length;
		int start = 0;
		int curr_Sum = arr[0];
		for (int i = 1; i < size; i++) {
			while (curr_Sum > sum && start < i - 1) {
				curr_Sum -= arr[start];
				start++;
			}
			if (curr_Sum == sum) {
				System.out.println("start : " + start + " end : " + (i - 1));
				break;
			}
			if (i < size) {
				curr_Sum += arr[i];
			}
		}
	}

}

class MaxSubNode {
	int data;
	int index;
	MaxSubNode left;
	MaxSubNode right;
	List<Integer> indexList;
	int height;

	public MaxSubNode(int data, int index) {
		super();
		this.data = data;
		this.index = index;
		this.height = 1;
		this.left = null;
		this.right = null;
		this.indexList = new ArrayList<Integer>();
	}

}

class MaxSubBST {
	MaxSubNode root;

	public MaxSubNode add(MaxSubNode node, int data, int count, int index) {
		if (node == null) {
			node = new MaxSubNode(data, index);
		}
		else if (data > node.data) {
			node.right = add(node.right, data, count, index);
			count += getHeight(node.right) + 1;
			node.indexList.add(index);
		}
		else if (data < node.data) {
			node.left = add(node.left, data, count, index);
		}
		node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
		return node;
	}

	public int getHeight(MaxSubNode node) {
		return (node == null) ? -1 : node.height;
	}
}
