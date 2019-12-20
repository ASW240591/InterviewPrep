import java.util.Arrays;

public class FirstTab {
	
	public static int[] arrayAfterChange(int [] a , int position) {
		int size = a.length;
		int pos = position-1;
		int[] newArray = new int[size];
		newArray[0] = a[pos];
		int j = 0 ;
		int k = 1;
		for(int i = 1; i <= size; i++ ) {
			if(pos == j) {
				j++;
			}else {
				newArray[k] = a[j];
				j++;
				k++;
			}
		}
		return newArray;
	}
	
	public static void main (String args[]) {
		int a[] = {1,2,3,4,5,6};
		System.out.println("Before");
		Arrays.stream(a).forEach(x -> System.out.print(x+" "));
		a = FirstTab.arrayAfterChange(a,3);
		System.out.println();
		System.out.println("After");
		Arrays.stream(a).forEach(x -> System.out.print(x+ " "));
	}

}
