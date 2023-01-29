// 
// Time complexity: O(N) as we are traversing the array.
// Auxiliary Space: O(1) as we have not used any extra space
package abc;

import java.util.Scanner;

public class a {
	public static void main(String[] args) {
		int temp=0, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int [] arr = new int[n];
		for( i=0; i<arr.length; i++) {
			System.out.println("enter array element");
			arr[i] = sc.nextInt();
			
		}
		// reverse array element
		i=0;
		j = arr.length-1;
		while(i<j) {
			temp= arr[i];
			arr[i]= arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		for( i=0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
			
	}

}
