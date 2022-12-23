package com.creatiq.sccaner;

import java.util.Scanner;

public class EvenOdd2 {
	
//		int n,evenSum =0,oddSum=0;
//		
//		Scanner sc = new Scanner(System.in);
//	//	sc.nextInt();
//		//System.out.println("enter any number :");
//		 n=20;
//		
//		for(int i =0;i<=n;i++) {
//			
//			if(i%2==0) {
//			
//			evenSum=evenSum+i;
//			
//		}else{
//			oddSum=oddSum+i;
//			
//		}
//			System.out.println("even:"+n);
//			System.out.println("odd :"+n);
//		}	
		 static int fun(int n)  
		    {  
		        int i, sum = 0;  
		        for (i = 2; i <= n; i+=2) {  
		            sum += i;  
		        }  
		        return sum;   
		    }  
		    public static void main(String argc[])  
		    {  
		        System.out.println("Enter any number: ");  
		        Scanner sc = new Scanner(System.in);  
		        int n = sc.nextInt();  
		        System.out.println("Sum of all even numbers from 1 to " + n + " is: " + fun(n));  
		    }  
		  
	}


