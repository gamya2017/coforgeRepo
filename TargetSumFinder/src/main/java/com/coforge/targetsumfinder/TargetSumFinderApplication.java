package com.coforge.targetsumfinder;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TargetSumFinderApplication {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, -1, -2, 5, 6, -6 ,7};
		int targetSum = 5;

		findPair(a, targetSum);

	}

	public static void findPair(int[] a, int targetSum) {

		for (int i = 0; i < a.length; i++) 

			for (int j = i + 1; j < a.length; j++) 

				if (a[i] + a[j] == targetSum) {

					
					System.out.println("The pair is :(" + a[i] + "+" + a[j] + "=" + targetSum +")");
				}
		
		    //System.out.println("Pair not found");
		}
}
