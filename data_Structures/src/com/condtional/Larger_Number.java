package com.condtional;

import java.util.Scanner;

public class Larger_Number {

	
	/*
	 * void larger(int a, int b, int c) { 
	 * int max =a; 
	 * if (b>max) { 
	 * max =b;
	 *  } if
	 * (c>max) { max = c; 
	 * } 
	 * System.out.println(max); }
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Larger_Number l = new Larger_Number();
		 * 
		 * 
		 * l.larger(40, 90, 60);
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("put  number");
		int a = sc.nextInt();
		int b  = sc.nextInt();
		int c = sc.nextInt();
		
		int max  = a;
		if(b>max) {
			max=b;
		} if (c>max) {
			max =c;
		}
		System.out.println(max);
			}

}
