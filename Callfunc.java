 class Callfunc {
	 
	 public static void main(String[] args) {
		 
		 go();
		 
	 }
	
	static void go() {
		Callfunc t = new Callfunc();
		t.takeTwo(12,34);
	}
	
	void takeTwo(int x, int y) {
		int z = x+y;
		System.out.println("Total is "+ z);
	}
 }
 
