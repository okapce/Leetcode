package com.example.demo.easy;

public class ImplementStr {
	public int strStr(String haystack, String needle) {
		int lengthStr = haystack.length();
		char[] charArrayHaystack = new char[lengthStr];
		
		for (int i = 0; i < charArrayHaystack.length; i++) {
			charArrayHaystack[i] = haystack.charAt(i);
			
		}
		
		lengthStr = needle.length();
		if(lengthStr==0) {
			return 0;
		}
		char[] charArrayNeedle = new char[lengthStr];
		
		for (int i = 0; i < charArrayNeedle.length; i++) {
			charArrayNeedle[i] = needle.charAt(i);
			
		}
		
		for (int i = 0; i < charArrayHaystack.length; i++) {
			if(charArrayNeedle[0]==charArrayHaystack[i]) {
				for (int j = 1; j < charArrayNeedle.length; j++) {
					if(charArrayNeedle[j]==charArrayHaystack[i+1]) {
						return i;
						
					}
					
				}
			}
			
			
		}
		return -1;
	}
}
