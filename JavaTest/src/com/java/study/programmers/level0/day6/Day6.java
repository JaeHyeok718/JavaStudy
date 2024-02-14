package com.java.study.programmers.level0.day6;

import java.util.ArrayList;
import java.util.Arrays;

public class Day6 {
	
	public void method01() {		
//		배열 만들기 5
//		제출 내역
//		문제 설명
//		문자열 배열 intStrs와 정수 k, s, l가 주어집니다. intStrs의 원소는 숫자로 이루어져 있습니다.
//
//		배열 intStrs의 각 원소마다 s번 인덱스에서 시작하는 길이 l짜리 부분 문자열을 잘라내 정수로 변환합니다. 
//		이때 변환한 정수값이 k보다 큰 값들을 담은 배열을 return 하는 solution 함수를 완성해 주세요.
//
//		제한사항
//		0 ≤ s < 100
//		1 ≤ l ≤ 8
//		10l - 1 ≤ k < 10l
//		1 ≤ intStrs의 길이 ≤ 10,000
//		s + l ≤ intStrs의 원소의 길이 ≤ 120
//		입출력 예
//		intStrs	k	s	l	result
//		["0123456789","9876543210","9999999999999"]	50000	5	5	[56789, 99999]
//		입출력 예 설명
//		입출력 예 #1
//
//		idx에 따라 잘라낸 문자열과 그에 따른 ret의 변화를 표시하면 다음 표와 같습니다.
//		idx	잘라낸 문자열	ret
//		0	"56789"	[56789]
//		1	"43210"	[56789]
//		2	"99999"	[56789, 99999]
//		따라서 [56789, 99999]를 return 합니다.
		
		String[] intStrs= {"0123456789","9876543210","9999999999999"};
		int k=50000;
		int s =5;
		int l=5;
		
	       ArrayList<Integer> result= new ArrayList<>();
	       
	        for(int i =0; i<intStrs.length;i++){
	            String subStr = intStrs[i].substring(s,l+s); 
	            int compare= Integer.parseInt(subStr);
	            if(compare>k){
	                result.add(compare);    
	            }
	        }
	        int[] answer = new int[result.size()];
	        
	        for(int j=0; j<answer.length;j++){
	        answer[j]=result.get(j);
	        }
	}
	
	
	public void method02() {
//		부분 문자열 이어 붙여 문자열 만들기
//		제출 내역
//		문제 설명
//		길이가 같은 문자열 배열 my_strings와 이차원 정수 배열 parts가 매개변수로 주어집니다.
//		parts[i]는 [s, e] 형태로, my_string[i]의 인덱스 s부터 인덱스 e까지의 부분 문자열을 의미합니다. 
//		각 my_strings의 원소의 parts에 해당하는 부분 문자열을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
//
//		제한사항
//		1 ≤ my_strings의 길이 = parts의 길이 ≤ 100
//		1 ≤ my_strings의 원소의 길이 ≤ 100
//		parts[i]를 [s, e]라 할 때, 다음을 만족합니다.
//		0 ≤ s ≤ e < my_strings[i]의 길이
//		입출력 예
//		my_strings	parts	result
//		["progressive", "hamburger", "hammer", "ahocorasick"]	[[0, 4], [1, 2], [3, 5], [7, 7]]	"programmers"
//		입출력 예 설명
//		입출력 예 #1
//
//		예제 1번의 입력을 보기 좋게 표로 나타내면 다음과 같습니다.
//
//		i	my_strings[i]	parts[i]	부분 문자열
//		0	"progressive"	[0, 4]	"progr"
//		1	"hamburger"	[1, 2]	"am"
//		2	"hammer"	[3, 5]	"mer"
//		3	"ahocorasick"	[7, 7]	"s"
//		각 부분 문자열을 순서대로 이어 붙인 문자열은 "programmers"입니다. 따라서 "programmers"를 return 합니다.
		
	
		String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
		
		int[][] parts= {{0,4},{1,2},{3,5},{7,7}};
	    String answer = "";
        for(int i=0; i<my_strings.length;i++){
            answer+= my_strings[i].substring(parts[i][0],parts[i][1]+1); 
        }

        System.out.println(answer);
        
	}
	public void method03(){
//		문자열의 뒤의 n글자
//		제출 내역
//		문제 설명
//		문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 뒤의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
//
//		제한사항
//		my_string은 숫자와 알파벳으로 이루어져 있습니다.
//		1 ≤ my_string의 길이 ≤ 1,000
//		1 ≤ n ≤ my_string의 길이
//		입출력 예
//		my_string	n	result
//		"ProgrammerS123"	11	"grammerS123"
//		"He110W0r1d"	5	"W0r1d"
//		입출력 예
//		입출력 예 #1
//
//		예제 1번의 my_string에서 뒤의 11글자는 "grammerS123"이므로 이 문자열을 return 합니다.
//		입출력 예 #2
//
//		예제 2번의 my_string에서 뒤의 5글자는 "W0r1d"이므로 이 문자열을 return 합니다.
		
	String my_string="ProgrammerS123";
	int n = 11;
	
	  String answer = my_string.substring(my_string.length()-n,my_string.length());
	System.out.println(answer);	
		
		
	}
	
	public void method04() {
		
//		접미사 배열
//		제출 내역
//		문제 설명
//		어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다. 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
//		문자열 my_string이 매개변수로 주어질 때, my_string의 모든 접미사를 사전순으로 정렬한 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
//
//		제한사항
//		my_string은 알파벳 소문자로만 이루어져 있습니다.
//		1 ≤ my_string의 길이 ≤ 100
//		입출력 예
//		my_string	result
//		"banana"	["a", "ana", "anana", "banana", "na", "nana"]
//		"programmers"	["ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"]
//		입출력 예 설명
//		입출력 예 #1
//
//		예제 1번의 my_string는 "banana"로 모든 접미사는 문제의 설명과 같습니다. 
//		이를 사전순으로 정렬하면 "a", "ana", "anana", "banana", "na", "nana"이므로 ["a", "ana", "anana", "banana", "na", "nana"]를 return 합니다.
//		입출력 예 #2
//
//		예제 2번의 my_string는 "programmers"이고 모든 접미사는 
//		"programmers", "rogrammers", "ogrammers", "grammers", "rammers", "ammers", "mmers", "mers", "ers", "rs", "s"입니다. 
//		이를 사전순으로 정렬한 문자열 배열 ["ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"]를
//		return 합니다.
		
		
		
		String my_string ="programmers";
		   int length = my_string.length();
	        String[] suffixes = new String[length];
	        
	        // 모든 접미사 생성
	        for (int i = 0; i < length; i++) {
	            suffixes[i] = my_string.substring(i, length);
	        }
	        
	        // 사전순으로 접미사 배열 정렬
	        Arrays.sort(suffixes);
	        
	        System.out.println(Arrays.toString(suffixes));
	}
			
	
	public void method05() {
//		접미사인지 확인하기
//		제출 내역
//		문제 설명
//		어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다. 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
//		문자열 my_string과 is_suffix가 주어질 때, is_suffix가 my_string의 접미사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.
//
//		제한사항
//		1 ≤ my_string의 길이 ≤ 100
//		1 ≤ is_suffix의 길이 ≤ 100
//		my_string과 is_suffix는 영소문자로만 이루어져 있습니다.
//		입출력 예
//		my_string	is_suffix	result
//		"banana"	"ana"	1
//		"banana"	"nan"	0
//		"banana"	"wxyz"	0
//		"banana"	"abanana"	0
//		입출력 예 설명
//		입출력 예 #1
//
//		예제 1번에서 is_suffix가 my_string의 접미사이기 때문에 1을 return 합니다.
//		입출력 예 #2
//
//		예제 2번에서 is_suffix가 my_string의 접미사가 아니기 때문에 0을 return 합니다.
//		입출력 예 #3
//
//		예제 3번에서 is_suffix가 my_string의 접미사가 아니기 때문에 0을 return 합니다.
//		입출력 예 #4
//
//		예제 4번에서 is_suffix가 my_string의 접미사가 아니기 때문에 0을 return 합니다.
		
	
		String my_string ="banana";
		String is_suffix="ana";
		
		System.out.println(my_string.endsWith(is_suffix) ? 1 : 0);
		
		
		
	}
	
	
}
