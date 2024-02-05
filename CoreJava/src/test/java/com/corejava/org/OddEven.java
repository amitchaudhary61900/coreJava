package com.corejava.org;

import java.util.Scanner;

public class OddEven {
	
	
	public void check(int num) {
		
		if (num% 2==0) {
			System.out.println("The number is even: " + num );
		}
		System.out.println("The number is odd: " + num );
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int input= sc.nextInt();
		
		OddEven obj= new OddEven();
		obj.check(input);
		
		
		
	}

}
