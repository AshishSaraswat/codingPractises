package arrays;

public class FindfactNum {
	long num = 5040;

	public static void main(String[] args) {
		new FindfactNum().calNum();

	}

	private void calNum() {
		int div = 2;
		int check=1;
		int maxEven = 1;
		do {
			num = num / div;
			maxEven += 1;
		} while (num % div == 0);
		if ((maxEven) % 2 != 0)
			maxEven = maxEven + 1;
		int temp = 0;
		if (num % (maxEven + 1) == 0)
			temp = maxEven + 1;
		else
			temp = maxEven;
		System.out.println(temp);

	}

}
