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
	public void method03(){
		
//		배열 만들기 2
//		제출 내역
//		문제 설명
//		정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로
//		저장한 배열을 return 하는 solution 함수를 완성해 주세요.
//
//		만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
//
//		제한사항
//		1 ≤ l ≤ r ≤ 1,000,000
//		입출력 예
//		l	r	result
//		5	555	[5, 50, 55, 500, 505, 550, 555]
//		10	20	[-1]
//		입출력 예 설명
//		입출력 예 #1
//
//		5 이상 555 이하의 0과 5로만 이루어진 정수는 작은 수부터
//		5, 50, 55, 500, 505, 550, 555가 있습니다. 따라서 [5, 50, 55, 500, 505, 550, 555]를 return 합니다.
//		입출력 예 #2
//
//		10 이상 20 이하이면서 0과 5로만 이루어진 정수는 없습니다. 따라서 [-1]을 return 합니다.

		int l = 5;
		int r = 555;
		//5 50 55 500 505 550 555 
		ArrayList<Integer> resultList = new ArrayList<>();
		for(int i=l; i<=r; i++) {
			if(flag(i)) {
				resultList.add(i);
			}
		}
		if(resultList.isEmpty()) {
			resultList.add(-1);
		}
	   int[] answer = new int[resultList.size()];	
		for(int i=0;i<answer.length;i++) {
			answer[i]=resultList.get(i);
			
		}
	   System.out.println(Arrays.toString(answer));
		
	}

	private boolean flag(int i) {
		
		String value = String.valueOf(i);
		
		for(char c : value.toCharArray()) {
			if(c != '5' && c!='0') {
				return false;
			}
		}
			return true;
	}
	
	public void method04() {
		
//		카운트 업
//		제출 내역
//		문제 설명
//		정수 start_num와 end_num가 주어질 때, start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		0 ≤ start_num ≤ end_num ≤ 50
//		입출력 예
//		start_num	end_num	result
//		3	10	[3, 4, 5, 6, 7, 8, 9, 10]
//		입출력 예 설명
//		입출력 예 #1
//
//		3부터 10까지의 숫자들을 담은 리스트 [3, 4, 5, 6, 7, 8, 9, 10]를 return합니다.
		int start_num= 3;
		int end_num=10;
		
		   ArrayList<Integer> result = new ArrayList<>();
	        
	        for(int i= start_num; i<=end_num;i++){
	            result.add(i);
	        }
	        int[] answer = new int[result.size()];
	        
	        for(int i=0; i<answer.length;i++){
	            answer[i]=result.get(i);
	        }
	        System.out.println(Arrays.toString(answer));
	}

	
	public void method05() {
		
		
		
		
	}
	
	
	
	
	
	
}
