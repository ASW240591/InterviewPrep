import java.util.Scanner;

public class TransposeMatrix {

	static void transpose(int A[][], int B[][]) 
    { 
        int i, j; 
        for (i = 0; i < 4; i++) 
            for (j = 0; j < 3; j++) 
                B[i][j] = A[j][i]; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] a = new int [2][3];
		int [][] b = new int [3][2];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		
		for (int i = 0; i<2; i++) {
			for(int j = 0; j< 3; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Values of matrix");
		System.out.println();
		for (int i = 0; i<2; i++) {
			for(int j = 0; j< 3; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		for (int i = 0; i<3; i++) {
			for(int j = 0; j< 2; j++) {
				b[i][j] = a[j][i];
			}
		}
		
		System.out.println("After transpose");
		System.out.println();
		for (int i = 0; i<3; i++) {
			for(int j = 0; j< 2; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Size of matrix : "+a.length);
	}

}
