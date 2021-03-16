 class UseADuck{
	int size;
	
	public UseADuck() {
		System.out.println("Quack");
	}
	
	public void setSize(int newSize) {
		size = newSize;
	}
}


public class Duck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
UseADuck d = new UseADuck();
d.setSize(42);	
	}

}
