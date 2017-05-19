package week1;

public class Karastuba {

	public static void main(String[] args) {
		new Karastuba().callKaras();

	}

	private void callKaras() {
		int num1 = 12345;
		int num2 = 6789;
		int product = karas(num1, num2);
		System.out.println("Product is :" + product);

	}

	private int karas(int num1, int num2) {
		if (num1 < 10 || num2 < 10)
			return num1 * num2;
		int len1 = getLen(num1);
		int len2 = getLen(num2);
		int max = Math.max(len1, len2);
		if (max < 2)
			return num1 * num2;
		max = max / 2 + max % 2;

		int fac = findPow(max);
		// (int) Math.pow(10, max);
		int a = num1 / fac;
		int b = num1 - a * fac;
		int c = num2 / fac;
		int d = num2 - c * fac;
		//System.out.println("A is " + a + " B is: " + b + " c is : " + c + " d is : " + d);
		int p1 = karas(a, c);
		int p2 = karas((a + b), (c + d));
		int p3 = karas(b, d);
		//System.out.println(p1 * Math.pow(10, 2 * max));
		return (int) (p3 + (p2 - p1 - p3) * fac + p1 * findPow(2 * max));
	}

	private int getLen(int a) {
		if (a == 0)
			return 0;
		else {
			int len = 0;
			while (a != 0) {
				a = a / 10;
				len++;
			}
			return len;
		}
	}

	public int findPow(int n) {
		int num = 1;
		for (int i = 0; i < n; i++) {
			num *= 10;
		}
		//System.out.println(" Power is :" + num);
		return num;
	}

}
