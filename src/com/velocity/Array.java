package com.velocity;

public class Array {

	public static void main (String args []) {
		
		int arr[]={10,8,5,77,43,2};
		
		
		int maxNum = arr[0];
		for(int i =0; i < arr.length; i++) {
			
			if(arr[i] > maxNum) {
				
				maxNum = arr[i];
				System.out.println("Maximum number is :" + maxNum);
			} 
		}
		
		
	}
	
}
