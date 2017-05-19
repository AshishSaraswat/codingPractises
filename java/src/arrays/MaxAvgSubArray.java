package arrays;

public class MaxAvgSubArray {

	int[] arr = { 1, 12, -5, -6, 50, 3 };

	public static void main(String[] args) {
		MaxAvgSubArray array = new MaxAvgSubArray();
		array.findMaxAvgSubArr();

	}

	private void findMaxAvgSubArr() {
		int len = arr.length;int k=4;
		int[] sumArr = new int[len];
		sumArr[0]=arr[0];
		for(int i=1;i<len;i++){
			sumArr[i]=sumArr[i-1]+arr[i];
		}
		int maxSum=Integer.MIN_VALUE;
		int i=k;int curSum = 0;int maxIndex=0;
		while(i<len){
			curSum = sumArr[i]-sumArr[i-k];
			if(curSum>maxSum){
				maxSum=curSum;
				maxIndex=i;
			}
			i++;
		}
		System.out.println("Index is " + (maxIndex-k+1));

		
	}

}
