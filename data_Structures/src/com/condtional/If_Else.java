package com.condtional;

import java.util.Scanner;

public class If_Else {
	
	      void input() {
	    	  Scanner sc = new Scanner(System.in);
	    	  System.out.println("put the number");
	    	 int num= sc.nextInt();
	    	
	    	 for(int i=0;i<=num;i++) {
	    		 if(i==5) {
	    			 continue;
	    		 } else if (i==2) {
	    			 i*=2;
	    		 } else {
	    			 System.out.println(i);
	    		 }
	    	 }
	      }
	
	
	/*
	 * int salary = 85000;
	 * 
	 * void bonus() {
	 * 
	 * if (salary >100000) { salary+=15000; System.out.println(salary); } else if
	 * (salary <=85000) { System.out.println("no need to increase or decreae"); }
	 * else { salary= salary-100000; System.out.println(salary); } }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		/*
		 * If_Else es = new If_Else();
		 */
		If_Else e = new If_Else();
		e.input();
		
	}

}
