package com.revature;

import java.util.Arrays;
import java.util.Scanner;

public class MagicIndex {

	// Array used for testing to avoid input of all elements
//	public static int[] arr = { 0, 5, 2, 7 };
	
	//Method to return number of magic numbers
	public static int magicIndex(int[] A) {
		int magicNum = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] == i) {
				magicNum++;
			}
		}
		return magicNum;
	}
	
	
	//Method to retrieve all subarrays & count number of subarrays
	public static int powerSet(int[] A) {
		int subs = 0;

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if (i < j) {
					System.out.println(Arrays.toString(Arrays.copyOfRange(A, i, j)));
					subs++;
				}
			}
		}
		System.out.println();
		return subs;
	}
	
	
	public static int recursiveMultiply(int x, int y) {
		int total = 0;
		
		for (int i = 0; i < x; i++) {
			total += y;
		}
		return total;
	}
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//Getting size on integer array
		System.out.print("Please enter the size of your array: ");
		int size = scan.nextInt();
		System.out.println();
		
		//Defining integer array of length 'size'
		int[] arr = new int[size];

		//Getting user input to fill array
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("The number of magic numbers in the array is " + magicIndex(arr));
		System.out.println();
		System.out.println("The number of subarrays in the array is " + powerSet(arr));
		System.out.println();

		System.out.println("Please enter two numbers to multiply:");
		int a = scan.nextInt();
		int b = scan.nextInt();

		System.out.println(a + " multiplied by " + b + " is " + recursiveMultiply(a, b));
	}
}
