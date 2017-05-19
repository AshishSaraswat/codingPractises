package arrays;

public class FindLongestCommonSubsequence {
	String str1 = "ABCDGHLQR";
	String str2 = "AEDPHR";

	public static void main(String[] args) {
		FindLongestCommonSubsequence subsequence = new FindLongestCommonSubsequence();
		subsequence.Lcs();

	}

	private void Lcs() {
		int len1 = 0;
		int len2 = 0;
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		printCharArray(arr1, arr2);
		int maxLen = findLcs(str1, str2, len1, len2);
		System.out.println("longest subsequence size is : " + maxLen);
		findLcs(arr1, arr2);

	}

	private void printCharArray(char[] arr1, char[] arr2) {
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		}
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
		}

	}

	public int findLcs(String str1, String str2, int len1, int len2) {
		if (len1 == str1.length() || len2 == str2.length()) {
			return 0;
		} else if (str1.charAt(len1) == str2.charAt(len2)) {
			// System.out.print(str1.charAt(len1) + " ");
			return 1 + findLcs(str1, str2, len1 + 1, len2 + 1);
		} else
			return Math.max(findLcs(str1, str2, len1 + 1, len2), findLcs(str1, str2, len1, len2 + 1));
	}

	public void findLcs(char[] arr1, char[] arr2) {
		int len1 = arr1.length;
		int len2 = arr2.length;

		int max = 0;
		int[][] tempArr = new int[len1 + 1][len2 + 1];
		for (int i = 1; i < tempArr.length; i++) {
			for (int j = 1; j < tempArr[i].length; j++) {
				if (i == 0 || j == 0)
					tempArr[i][j] = 0;
				else {
					if (arr1[i - 1] == arr2[j - 1]) {
						tempArr[i][j] = 1 + tempArr[i - 1][j - 1];
					} else {
						tempArr[i][j] = Math.max(tempArr[i - 1][j], tempArr[i][j - 1]);
					}
					if (max < tempArr[i][j]) {
						max = tempArr[i][j];
					}
				}
			}
		}
		System.out.println("max subsequence is :" + max);
		char[] arrChar = new char[max];
		// len1--;
		// len2--;
		while (len1 > 0 && len2 > 0) {
			if (arr1[len1 - 1] == arr2[len2 - 1]) {
				System.out.println(arr1[len1 - 1]);
				arrChar[max - 1] = arr1[len1 - 1];
				max--;
				len1--;
				len2--;
			} else if (tempArr[len1 - 1][len2] > tempArr[len1][len2 - 1]) {
				len1--;
			} else
				len2--;
		}
		System.out.print("Subsequence is :");
		for (int i = 0; i < arrChar.length; i++) {
			System.out.print(arrChar[i] + " ");
		}
	}

}
