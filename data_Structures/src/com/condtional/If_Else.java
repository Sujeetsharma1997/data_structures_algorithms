package com.condtional;

public class If_Else {
	
	int  salary  = 85000;
	
	void bonus() {
		
		if (salary >100000) {
			salary+=15000;
			System.out.println(salary);
		}
		else {
			salary= salary-100000;
			System.out.println(salary);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		If_Else es = new If_Else();
		es.bonus();
		
	}

}
