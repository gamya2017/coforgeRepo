package com.coforge.reverscestring;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReverseStringApplication {

	public static void main(String[] args) {
		
		String original ="abcdefg";
		System.out.println("Original String:" + original);
		
		String reversed =inPlaceReseved(original);
		System.out.println("Reversed String:" + reversed );
		
		
	}
	
	public static String inPlaceReseved(final String input) {
		
		final StringBuilder builder = new StringBuilder(input);
	    int length = builder.length();
	    
	    for(int i=0; i< length/2; i++) {
	    	final char current = builder.charAt(i);
	    	final int otherend = length  - i - 1;
	    	builder.setCharAt(i, builder.charAt(otherend));
	    	builder.setCharAt(otherend, current);
	    	
	    }return builder.toString();
	}

}
