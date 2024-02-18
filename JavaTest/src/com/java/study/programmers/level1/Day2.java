package com.java.study.programmers.level1;

import java.util.Arrays;
import java.util.Scanner;

public class Day2 {
	Scanner sc = new Scanner(System.in);
	
	public void method01() {
		
//		문자열 내 p와 y의 개수
//		제출 내역
//		문제 설명
//		대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 
//		다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
//
//		예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
//
//		제한사항
//		문자열 s의 길이 : 50 이하의 자연수
//		문자열 s는 알파벳으로만 이루어져 있습니다.
//		입출력 예
//		s	answer
//		"pPoooyY"	true
//		"Pyy"	false
//		입출력 예 설명
//		입출력 예 #1
//		'p'의 개수 2개, 'y'의 개수 2개로 같으므로 true를 return 합니다.
//
//		입출력 예 #2
//		'p'의 개수 1개, 'y'의 개수 2개로 다르므로 false를 return 합니다.
//		
		System.out.println("문자열을 입력하세요 : ");
		String s= sc.nextLine();
		
		
		 boolean answer = true;
	        int pCount=0;
	        int yCount=0;
	        for(int i = 0 ;  i<s.length();i++){
	            char c= s.charAt(i);
	            if(c=='p'||c=='P'){
	                pCount++;
	            }else if(c=='y'||c=='Y'){
	                yCount++;
	            }
	        }
	        if(pCount!=yCount){
	            answer=false;
	        }
		
	        System.out.println(answer);
		
	}
	
	public void method02() {
		
//		정수 제곱근 판별
//		제출 내역
//		문제 설명
//		임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
//		n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
//
//		제한 사항
//		n은 1이상, 50000000000000 이하인 양의 정수입니다.
//		입출력 예
//		n	return
//		121	144
//		3	-1
//		입출력 예 설명
//		입출력 예#1
//		121은 양의 정수 11의 제곱이므로, (11+1)를 제곱한 144를 리턴합니다.
//
//		입출력 예#2
//		3은 양의 정수의 제곱이 아니므로, -1을 리턴합니다.

		System.out.println("숫자를 입력하세요 : ");
		long n = sc.nextLong();
		long answer=0;
		
		long sqrt = (long) Math.sqrt(n);// 제곱근
	        
	      if(n==sqrt*sqrt){
	          answer =(long) Math.pow(sqrt+1,2);//제곱 
	      }else{
	          answer=-1;
	      }
	      System.out.println(answer);
	}
	
	public void method03() {
		
		
//		정수 내림차순으로 배치하기
//		제출 내역
//		문제 설명
//		함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
//
//		제한 조건
//		n은 1이상 8000000000 이하인 자연수입니다.
//		입출력 예
//		n	return
//		118372	873211
		System.out.println("숫자를 입력하세요 : ");
		long n = sc.nextLong();
		
		   long answer = 0;
	        
	        String result = String.valueOf(n);
	        
	        char[] cArr = result.toCharArray();
	        
	       Arrays.sort(cArr);
	        
	     String a = new StringBuilder(new String(cArr)).reverse().toString();
	        
	        answer= Long.parseLong(a);
	        
	        
	        System.out.println(answer);
	}
	
	public void method04() {
		
//		올바른 괄호
//		제출 내역
//		문제 설명
//		괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어
//
//		"()()" 또는 "(())()" 는 올바른 괄호입니다.
//		")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
//		'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.
//
//		제한사항
//		문자열 s의 길이 : 100,000 이하의 자연수
//		문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.
//		입출력 예
//		s	answer
//		"()()"	true
//		"(())()"	true
//		")()("	false
//		"(()("	false
//		입출력 예 설명
//		입출력 예 #1,2,3,4
//		문제의 예시와 같습니다.
		
		System.out.println("(,) 으로만 이루어진 문자열을 입력 : ");
 		String s = sc.nextLine();
		
		 boolean answer = true;
	        int count = 0;
	        
	        for(int i=0;i<s.length();i++){
	            char c = s.charAt(i);
	            if(c=='('){
	                count++;
	            }else{
	                count--;
	            }
	            if(count<0){
	                answer = false;
	            } 
	        }
	        if(count==0){
	             answer = true;
	        }else{
	            answer = false;
	        }
		
	        
	        System.out.println(answer);
		
	}
	
	public void method05() {
		
//		하샤드 수
//		제출 내역
//		문제 설명
//		양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 
//		예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
//
//		제한 조건
//		x는 1 이상, 10000 이하인 정수입니다.
//		입출력 예
//		x	return
//		10	true
//		12	true
//		11	false
//		13	false
//		입출력 예 설명
//		입출력 예 #1
//		10의 모든 자릿수의 합은 1입니다. 10은 1로 나누어 떨어지므로 10은 하샤드 수입니다.
//
//		입출력 예 #2
//		12의 모든 자릿수의 합은 3입니다. 12는 3으로 나누어 떨어지므로 12는 하샤드 수입니다.
//
//		입출력 예 #3
//		11의 모든 자릿수의 합은 2입니다. 11은 2로 나누어 떨어지지 않으므로 11는 하샤드 수가 아닙니다.
//
//		입출력 예 #4
//		13의 모든 자릿수의 합은 4입니다. 13은 4로 나누어 떨어지지 않으므로 13은 하샤드 수가 아닙니다.

		
		System.out.println("x의 값을 정해주세요 숫자로 : ");
		int x = sc.nextInt();
		 boolean answer = true;
	        int num=0;
	        String n = String.valueOf(x);
	        for(int i=0; i<n.length();i++){
	        num+= Character.getNumericValue(n.charAt(i));

	        }
	        if(x%num==0){
	            System.out.println(answer);
	        }else{
	            answer = false;
	            System.out.println(answer);
	        }
		
	}
	
	
	
	
}
