
public class Contact {
	
	static int x = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contact[] ca = new Contact[10];
		
		Contact refc;
		while(x<10) {
			refc = new Contact();
			x = x+1;
			
			System.out.println(refc);
		}
		
		
		while(x < 10) {
			ca[x] = new Contact();
			x = x+1;
		//ystem.out.println(ca[x]);
			
		}

	}

}
