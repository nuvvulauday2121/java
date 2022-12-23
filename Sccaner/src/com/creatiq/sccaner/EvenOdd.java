package com.creatiq.sccaner;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
		int n,sum=0;
		System.out.println("enter range");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		if(n%2==0) {
		for(int i =0;i<=n;i++) {
				sum=sum+i;
			}
		System.out.println("sum of even numbers :"+sum);
		}
		
		else {
			for (int i=1;i<=n;i++) {
				sum=sum+i;
			}
			System.out.println("sum of odd numbers :"+sum);
		}
	}

}
