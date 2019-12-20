

public class ReverseArray {

	public static int[] reverseArray(int ar[]) {
		for (int i = 0 ; i < ar.length/2 ; i++) {
		 int l = ar.length - i-1;
		 int temp;
		 temp = ar[l];
		 ar[l] = ar[i];
		 ar[i] = temp;
		}
		return ar;
	}
	
	public static void main(String []arr) {
		int a[]= new int[4];
		a[0] = 1 ;
		a[1] = 2 ;
		a[2] = 3 ;
		a[3] = 4 ;
		//a[4] = 5 ;
		System.out.println("Before reverse");
		for(int b : a) {
			System.out.println(b);
		}
		a = ReverseArray.reverseArray(a);
		System.out.println("After reverse");
		for(int b : a) {
			System.out.println(b);
		}
	}
}
