
public class AnimalTestDrive{
	private Animal[] animals = new Animal[5];
	private int nextindex = 0;
	
	
	public void add(Animal a) {
		if(nextIndex < animals.length) {
			animals[nextIndex] = a;
			System.out.println("Animal added at"+ nextIndex);
			nextIndex++;
		}
	}
}

public class MyAnimalList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnimalTestDrive list = new AnimalTestDrive();
		Dog a = new Dog();
		Cat c = new Cat();
		list.add(a);
		list.add(c);
		
		
				

	}

}
