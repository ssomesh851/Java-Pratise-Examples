
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          //System.out.println(iterative(5));
		
		System.out.println(recursiveFactorial(3));
	}
	
	public static int recursiveFactorial(int num1) {
		if(num1 == 0) {
			return 1;
		}
		return num1*recursiveFactorial(num1-1);
	}
	
	public static int iterative(int num) {
		
		if(num == 0) {
			return 1;
			
		}
		
		int factorial = 1;
		
		for(int i=1;i<=num;i++) {
				factorial *= i;
		}
		return factorial;
	}

}
