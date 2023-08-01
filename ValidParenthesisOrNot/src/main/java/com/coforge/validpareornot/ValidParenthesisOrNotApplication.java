package com.coforge.validpareornot;


import java.util.Stack;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValidParenthesisOrNotApplication {

	public static void main(String[] args) {
		
		System.out.println(isValid("[{(})[]" .toCharArray()));
	}
	
	public static boolean isValid(char[] charArray) {
		Stack<Character> container = new Stack<Character>();
		
		for(char c : charArray) {
			
			if(c == ' ') {
				continue;
			}
			
			if(c == '(' || c == '{' || c =='[') {
				container.push(c);
			}else if (c == ')' && container.peek() == '(' || 
					   (c == '}' && container.peek() == '}' )||
					  ( c == ']' && container.peek() == ']') ){
				container.pop();
				
			}else {
				return false;
			}
		} return container.isEmpty();		
	} 

}
