



public class Habbits {
	

	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Habbits[] h = new Habbits[3];
		
		int z = -1;
		
		while(z < 2) {
			z = z+1;
			h[z] = new Habbits();
			h[z].name = "bilbo";
			
			
			if(z==1) {
				h[z].name = "frodo";
				
			}
			
			if(z==2) {
				h[z].name = "sam";
				
			}
			
			
			System.out.print(h[z].name + " is  a");
			
			
		}
		
		

	}

}
