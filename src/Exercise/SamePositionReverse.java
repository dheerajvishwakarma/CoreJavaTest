package Exercise;

public class SamePositionReverse {
	public static void main(String[] args) {

		String name = "Dheeru Vishwakarma";

		String[] name2 = name.split(" ");
		System.out.println("Reverse String");
		String a = name2[0];
		String[] b = a.split("");
		for (int i = a.length() - 1; i >= 0; i--) {
			System.out.print(b[i]);
		}
		System.out.print(" ");
		String a1 = name2[1];
		String[] b1 = a1.split("");
		for (int i = a1.length() - 1; i >= 0; i--) {
			System.out.print(b1[i]);

		}

	}
}
