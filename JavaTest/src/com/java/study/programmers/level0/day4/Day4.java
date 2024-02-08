package com.java.study.programmers.level0.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Day4 {

	public void method01() {
		
//		수열과 구간 쿼리 2
//		제출 내역
//		문제 설명
//		정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. 
//		queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
//
//		각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.
//
//		각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.
//		단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.
//
//		제한사항
//		1 ≤ arr의 길이 ≤ 1,000
//		0 ≤ arr의 원소 ≤ 1,000,000
//		1 ≤ queries의 길이 ≤ 1,000
//		0 ≤ s ≤ e < arr의 길이
//		0 ≤ k ≤ 1,000,000
//		입출력 예
//		arr	queries	result
//		[0, 1, 2, 4, 3]	[[0, 4, 2],[0, 3, 2],[0, 2, 2]]	[3, 4, -1]
//		입출력 예 설명
//		입출력 예 #1
//
//		첫 번째 쿼리의 범위에는 0, 1, 2, 4, 3이 있으며 이 중 2보다 크면서 가장 작은 값은 3입니다.
//		두 번째 쿼리의 범위에는 0, 1, 2, 4가 있으며 이 중 2보다 크면서 가장 작은 값은 4입니다.
//		세 번째 쿼리의 범위에는 0, 1, 2가 있으며 여기에는 2보다 큰 값이 없습니다.
//		따라서 [3, 4, -1]을 return 합니다.
		
		int[] arr= {0,1,2,4,3};
		int[][] queries= {{0,4,2},{0,3,2},{0,2,2}};
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int i=0; i<queries.length; i++) {
		    ArrayList<Integer> arr2 = new ArrayList<>();
		    int firstIndex = queries[i][0];
		    int secondIndex = queries[i][1];
		    int thirdIndex = queries[i][2];
		    
		    for(int j=firstIndex; j<=secondIndex; j++) {
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
	
	public void method02() {
//		수열과 구간 쿼리 4
//		제출 내역
//		문제 설명
//		정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
//
//		각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 i가 k의 배수이면 arr[i]에 1을 더합니다.
//
//		위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
//
//		제한사항
//		1 ≤ arr의 길이 ≤ 1,000
//		0 ≤ arr의 원소 ≤ 1,000,000
//		1 ≤ queries의 길이 ≤ 1,000
//		0 ≤ s ≤ e < arr의 길이
//		0 ≤ k ≤ 5
//		입출력 예
//		arr	queries	result
//		[0, 1, 2, 4, 3]	[[0, 4, 1],[0, 3, 2],[0, 3, 3]]	[3, 2, 4, 6, 4]
//		입출력 예 설명
//		입출력 예 #1
//
//		각 쿼리에 따라 arr가 다음과 같이 변합니다.
//		arr
//		[0, 1, 2, 4, 3]
//		[1, 2, 3, 5, 4]
//		[2, 2, 4, 5, 4]
//		[3, 2, 4, 6, 4]
//		따라서 [3, 2, 4, 6, 4]를 return 합니다.
		int [] arr = {0,1,2,4,3};
		int [][] queries = {{0,4,1},{0,3,2},{0,3,3}};
		
	      for(int i = 0 ; i<queries.length;i++) {

	    	  int indexNum= queries[i][1]-queries[i][0];
	    	  int firstIndex= queries[i][0];
	    	  int secondIndex= queries[i][1];
	    	  int thirdIndex= queries[i][2];
	    	  
	    	  for(int j=firstIndex;j<=secondIndex;j++) {
	    		
	    		  if(j%thirdIndex==0) {
	    			  arr[j] +=1;
	    		  }
	    	  }
	      }
		System.out.println(Arrays.toString(arr));
	}
}
