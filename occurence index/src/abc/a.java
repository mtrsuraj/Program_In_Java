// Write a program to find the index of first occurrence and last occurrence of an element in the array in a single iteration.

package abc;

import java.util.Scanner;

public class a{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();	
		int fIndex=-1, lIndex=-1;
		int [] arr = new int[n];
		boolean flag = false;
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter Element");
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter your target");
		int target = sc.nextInt();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==target) {
				if(!flag) {
					fIndex=i;
					lIndex=i;
					flag=true;
				}
				else 
					lIndex=i;
			}
		}
		if(flag==false) {
			System.out.println("Target not match");
		}else System.out.println("First Index"+":"+fIndex+ "\n"+ "Second Index "+":" +lIndex);
	}
}