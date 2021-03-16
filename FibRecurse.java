import java.util.Scanner;

public class FibRecurse {
	public static void main(String[] args) {

		// Implementation
		fibRecursiveloop(getUserIn());

	}

	// gets user input fib series generation
	public static int[] getUserIn() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number \n" + "in your Fibonacci Series: ");
		int fs = sc.nextInt();
		System.out.println("Warning: choose wisely ");
		System.out.println("How deep do you want \n" + "the Fibonacci Series: \n");
		int ls = sc.nextInt();
		sc.close();

		// returns an array of 2 integers
		return new int[] { fs, ls };
	}

	// recursive function to generate next fib number
	public static int fib(int ordinal) {
		if (ordinal < 2) {
			return ordinal;
		} else {
			return fib(ordinal - 1) + fib(ordinal - 2);
		}
		// alternatively, the above could be written:
		// return (ordinal<2)?ordinal:fib(ordinal - 1) + fib(ordinal - 2);
	}

	// runs a loop to generate fib series
	public static void fibRecursiveloop(int[] arr) {
		int fs = arr[0];
		int ls = arr[1];
		for (fs = 0; fs <= ls; fs++) {
			int result = fib(fs);
			System.out.println(fs + ":\t" + result);
		}
	}

}