package com.condtional;

import java.util.Scanner;

public class Febnachi_Num {

	public static void main(String[] args) {
	
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("inter the number");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int count =2;
		
		
		while(count<=n) {
		int temp = b;
		b = b+a;
		a = temp;
		count++;
			
		}
		System.out.println(b);

	}

}
