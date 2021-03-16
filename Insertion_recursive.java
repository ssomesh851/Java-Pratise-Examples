
public class Insertion_recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {78,1,0,25,45};
		Insertion(a, a.length);
		
		
	}

	public static void Insertion(int[] a, int n) {


		//base case
		if(n<=1) {
			return;

         //Sort the first n-1 elements
		}	
	      Insertion(a,n-1);
			
			
		//Insert last element at its correct position
		// in sorted array
		
		int last = a[n-1];
		int j = n-2;
		
		// Move elements of [0...i-1], that are greater than key, to one position ahead of their current position
		
		while(j>=0 &&a[j]> last) {
			a[j+1] = a[j];
			j--;
		}
         a[j+1] = last;
		
		}


	}


