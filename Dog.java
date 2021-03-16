
 class DogTestDrive {
	
	int size;
	String name;
	
	void bark() {
		if(size>60) {
			System.out.println("woof! woof!");
		}else if(size>14){
			System.out.println("yuff! yuff!");
		}else {
			System.out.println("Yip! Yip!");
		}
	}
}
public class Dog{

	public static void main(String[] args) {
		// TODO Auto-generated method stubest
		
		DogTestDrive one = new DogTestDrive();
		one.size = 70;
		DogTestDrive two = new DogTestDrive();
		two.size = 8;
		DogTestDrive three = new DogTestDrive();
		three.size = 35;
		
		one.bark();
		two.bark();
		three.bark();
		
		

	}

}
