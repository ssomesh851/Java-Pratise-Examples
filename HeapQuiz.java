
public class HeapQuiz {
	
	int id = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0;
		
		HeapQuiz[] hq = new HeapQuiz[5];
		
		while(x<3) {
			hq[x] = new HeapQuiz();
			hq[x].id =x;
			x = x+1;
			//System.out.println(x);
		}
  
		
		  hq[3] = hq[1];
		  hq[4] = hq[1];
		  hq[3] = null;
		  hq[4] = hq[0];
		  hq[0] = hq[3];
		  hq[3] = hq[2];
		  hq[2] = hq[0];
		  
		  for(int i = 0; i < hq.length; i++) {
			 System.out.println(hq[i]);
		  }
		  
		  
		  
		  
		  
	}

}
