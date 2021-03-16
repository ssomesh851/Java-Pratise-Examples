
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*
		for(int i=1; i<a.length; i++) {
			int key = a[i];
			int j = i-1;
			
			while((j>-1) && (a[j] > key)) {
				a[j+1] = a[j];
				j--;
			}
			
			a[j+1] = key;
		}

    for(int j = 0; j<a.length; j++) {
    	System.out.print(a[j]+" ");
    }

		
		for(int i = 1; i<a.length; i++) {
			int key = a[i];
			int j = i-1;
			
			while((j>-1) && (a[j] > key)) {
				a[j+1] = a[j];
				j--;
			}
			
			a[j+1] = key;
				
	}
		for(int k=0; k<a.length; k++) {
			System.out.print(a[k]+" ");
		}
		
		
		*/
		
		int[] a = {5,6,7,8,1,2,3};
		
		for(int i =1; i<a.length; i++) {
			int key = a[i];
			int j = i - 1;
			while((j>-1)&&(a[j]>key)) {
				a[j+1] = a[j];
			}
			
			a[j+1] = key;
		}
		
		for(int k=0; k<a.length; k++) {
			System.out.print(a[k]+" ");
		}
		
		
		
		
		

	}
}