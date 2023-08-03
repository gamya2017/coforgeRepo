package com.coforge.longestCommonPrefix;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LongestCommonPrefixApplication {

	public String longestCommonPrefix(String[] arr) {

		int n = arr.length;

		String result = arr[0];

		for (int i = 0; i < n; i++) {

			while (arr[i].indexOf(result) != 0) {

				result = result.substring(0, result.length() - 1);

				if (result.isEmpty()) {

					return "Not found common prefix given a string ";
				}

			}
		}
		return result;

	}

	public static void main(String[] args) {

		LongestCommonPrefixApplication lcps = new LongestCommonPrefixApplication();

		String[] input = { "amazon", "ghjk", "uytr", "bvcx", "qwer" };

		System.out.println(" The longest Common Prefix is : " + lcps.longestCommonPrefix(input));

	}

}
