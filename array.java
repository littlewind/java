package chap01;
import java.util.Scanner;
public class array {

private static Scanner inp;

/*	public static void main(String[] args) {
//		int[] a;
		int[] arr = new int[100];
		int size = 5;
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<size;i++) {
			System.out.printf("a[%d] = ",i);
			arr[i] = scan.nextInt();
		}
		scan.close();
		
		System.out.println("Your array:");
		for(int i=0;i<size;i++) {
			System.out.printf("%d  ",arr[i]);
		}
		
	}*/
	
	public static void main(String[] args) {
		int[][] a = new int[100][100];
			
		inp = new Scanner(System.in);
		
		System.out.println("Enter the 2-d array:");
		for(int i=0;i<3;i++)
			for(int j=0;j<4;j++) {
				System.out.printf("a[%d][%d] = ",i,j);
				a[i][j] = inp.nextInt();
			}
		
		System.out.println("The 2d array:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
//				System.out.print("\t"+a[i][j]);
				System.out.printf("\t %d",a[i][j]);
			}
			System.out.println();
		}
		
		inp.close();
	}

}
