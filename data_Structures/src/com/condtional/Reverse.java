package com.condtional;

public class Reverse {

	public static void main(String[] args) {

		
		int n =48;
		int res =0;
		while(n>0) {
			int rem= n%10;
			n = n/10;
			res = res*10+rem;
		}
		System.out.println(res+" ");
		
	}

}
