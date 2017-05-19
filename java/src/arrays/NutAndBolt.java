package arrays;

public class NutAndBolt {
	char[] arr = { '@', '#', '$', '%', '^', '&', '~', '*', '!' };

	public static void main(String[] args) {
		new NutAndBolt().callNutAndBolt();

	}

	private void callNutAndBolt() {
		int len = arr.length;
		char check = 33;
		System.out.println(check);
		for(int i=0;i<len;i++){
			int a= arr[i];
			System.out.println(arr[i] + " = " + a);
		}
		
	}

}
//! # $ % & * @ ^ ~