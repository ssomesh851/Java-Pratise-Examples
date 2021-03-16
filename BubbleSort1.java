
public class BubbleSort1 {
	
	static int temp = 0;
	public static void Bubble(int[] a) {
		for(int i =0; i <a.length; i++) {
			for(int j =1; j<a.length-i; j++) {
				if(a[j-1]< a[j]) {
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a = {5,4,8,9,12,1,0};
		
		Bubble(a);
		
		for(int i =0 ; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
