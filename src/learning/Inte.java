package learning;
//sum of all int graterthen 100 and less then 200

public class Inte {
	public static void main(String[] args) {

		int sum = 0;
		for (int i = 100; i <= 200; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
				sum = sum + i;

			}
		}
		System.out.println(sum);
	}

	public static char[] parseInt(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
