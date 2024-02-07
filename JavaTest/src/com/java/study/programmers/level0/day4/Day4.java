package com.java.study.programmers.level0.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Day4 {

	public void method01() {
		
		
		int[] arr= {0,1,2,4,3};
		int[][] queries= {{0,4,2},{0,3,2},{0,2,2}};
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int i=0; i<queries.length; i++) {
		    ArrayList<Integer> arr2 = new ArrayList<>();
		    int firstIndex = queries[i][0];
		    int secondIndex = queries[i][1];
		    int thirdIndex = queries[i][2];
		    
		    for(int j=firstIndex; j<=secondIndex; j++) { // 수정된 범위
		        if(arr[j] > thirdIndex) {
		            arr2.add(arr[j]);
		        }
		    }
		    if(arr2.isEmpty()) {
		        result.add(-1); 
		    } else {
		        int min = Collections.min(arr2); 
		        result.add(min);
		    }
		}
		
		int[] result2 = new int[result.size()];
		for(int k =0; k<result.size();k++) {
			result2[k]=result.get(k);
		}
		
		System.out.println(Arrays.toString(result2));
	}
	
	
	
	
}
