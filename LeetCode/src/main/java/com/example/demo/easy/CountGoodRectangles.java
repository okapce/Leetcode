package com.example.demo.easy;

import org.springframework.stereotype.Component;

@Component
public class CountGoodRectangles {
	public int countGoodRectangles(int[][] rectangles) {
        int k = 0;
        int temp = 0;
        int count = 0;
        int len = 0;
        int wid = 0;
		for (int i = 0; i < rectangles.length; i++) {
			len = rectangles[i][0];
			wid = rectangles[i][1];
			
			if(k==0) {
				if(len<wid) {k=len;}
				if(len>wid) {k=wid;}
				count++;
				continue;
			}
			
			if(len<wid) {temp=len;}
			if(len>wid) {temp=wid;}
			if(len==wid) {temp=wid;}
			
			if(k==temp) {
				count++;
				continue;
			}
			
			if(k<temp) {
				k=temp;
				count=1;
				continue;
			}	
		}
		
		return count;
		
    }
}
