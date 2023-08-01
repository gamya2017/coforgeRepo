package com.coforge.palindromeOrnot;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StringIsAPalindromeOrNotApplication {

	public static void main(String[] args) {
		String s = "level";
		String rev ="";
		
		for(int i = s.length()-1; i >= 0 ; i--) 
			
			rev = rev+s.charAt(i);
			if(s.equals(rev)) 
				System.out.println("String is palindrome");
				else	
					System.out.println("String is not a palindrome");
				
			
			
		
	}

}
