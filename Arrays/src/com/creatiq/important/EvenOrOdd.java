package com.creatiq.important;

public class EvenOrOdd {
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7};
		
		System.out.println("even numbers");
		
		for(int i = 0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		
		System.out.println("odd numbers");
		
		for(int i =0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
			
	}

}
