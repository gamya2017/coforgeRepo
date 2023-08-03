package com.coforge.powernumberrecursion;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PowerOfNumberUsingRecursionApplication {

	static int power(int b , int p) {
		if(p == 0) {
			return 1;
			
		}else {
				return b * power(b , p - 1);
		}
	}
	public static void main(String[] args) {
		
		int b = 0;
		int p = 2;
		
		System.out.println(power(b,p));
		
	}

}
