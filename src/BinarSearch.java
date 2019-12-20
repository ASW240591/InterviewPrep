
public class BinarSearch {

	public String search(int arr[], int l, int r, int toFind) {
		
		
		return "Not found ";
	}
	
	public int partion(int arr[], int l , int r) {
		int pivot = arr[r];
		int i = (l - 1);
		for(int  j = l ; j < r ; j++) {
			if(arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[r];
		arr[r] = temp;
		
		return i+1;
	}
	
	public void sort(int arr[],int l , int r) {
		if(r > l) {
			int pi = partion(arr,l,r);
			sort(arr,l,pi);
			sort(arr,pi+1,r);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {4,2,9,7,6,1};
		BinarSearch search = new BinarSearch();
		search.sort(arr, 0, arr.length-1);
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
