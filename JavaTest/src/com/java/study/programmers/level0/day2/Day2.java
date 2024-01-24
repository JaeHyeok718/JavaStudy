package com.java.study.programmers.level0.day2;

import java.util.Scanner;

public class Day2 {
	Scanner sc = new Scanner(System.in);

		public void method1(){
//			문자열 섞기
//			문제 설명
//			길이가 같은 두 문자열 str1과 str2가 주어집니다.
//
//			두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.
//
//			제한사항
//			1 ≤ str1의 길이 = str2의 길이 ≤ 10
//			str1과 str2는 알파벳 소문자로 이루어진 문자열입니다.
//			입출력 예
//			str1	str2	result
//			"aaaaa"	"bbbbb"	"ababababab"
			
		String str1 = sc.next();
		String str2 = sc.next();
		String answer = "";
	    for(int i = 0; i<str1.length(); i++){
	            
	                answer += str1.charAt(i);
	                answer += str2.charAt(i);
	     }
	          System.out.println(answer);
	}

		public void method2() {
			
//			문자 리스트를 문자열로 변환하기
//			문제 설명
//			문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
//
//			제한사항
//			1 ≤ arr의 길이 ≤ 200
//			arr의 원소는 전부 알파벳 소문자로 이루어진 길이가 1인 문자열입니다.
//			입출력 예
//			arr	result
//			["a","b","c"]	"abc"
			String arr[] = {"a","b","c"};
			String answer ="";
			for(int i = 0 ; i<arr.length;i++) {
				answer += arr[i];
			}

		}
		public void method3() {
			
//			문자열 곱하기
//			문제 설명
//			문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.
//
//			제한사항
//			1 ≤ my_string의 길이 ≤ 100
//			my_string은 영소문자로만 이루어져 있습니다.
//			1 ≤ k ≤ 100
//			입출력 예
//			my_string	k	result
//			"string"	3	"stringstringstring"
//			"love"	10	"lovelovelovelovelovelovelovelovelovelove"
//			입출력 예 설명
//			입출력 예 #1
//
//			예제 1번의 my_string은 "string"이고 이를 3번 반복한 문자열은 "stringstringstring"이므로 이를 return 합니다.
//			입출력 예 #2
//
//			예제 2번의 my_string은 "love"이고 이를 10번 반복한 문자열은 "lovelovelovelovelovelovelovelovelovelove"이므로 이를 return 합니다.
			
			String str1 = sc.next();
			int k = sc.nextInt();
			String answer = "";
			for(int i = 0; i<k; i++) {
				
			answer += str1;
				
			}
		//System.out.println(answer);
		// 한줄 처리  repeat을 활용하자
	//	System.out.println(str1.repeat(k));
		//repeat() 메소드는 해당하는 문자열을 원하는 횟수만큼 반복하는 클래스이다.
			
		}
		
		public void method4() {
//			문제 설명
//			연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
//
//			12 ⊕ 3 = 123
//			3 ⊕ 12 = 312
//			양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
//
//			단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
//
//			제한사항
//			1 ≤ a, b < 10,000
//			입출력 예
//			a	b	result
//			9	91	991
//			89	8	898
//			입출력 예 설명
//			입출력 예 #1
//
//			a ⊕ b = 991 이고, b ⊕ a = 919 입니다. 둘 중 더 큰 값은 991 이므로 991을 return 합니다.
//			입출력 예 #2
//
//			a ⊕ b = 898 이고, b ⊕ a = 889 입니다. 둘 중 더 큰 값은 898 이므로 898을 return 합니다.
		int a = sc.nextInt();
		int b = sc.nextInt();
		
	      String a1 = String.valueOf(a);// 받은 정수 a를 문자열화 시키기
	       String b1 = String.valueOf(b);// 받은 정수 b를 문자열화 시키기
	        
	        String ab = a1+b1;
	        String ba = b1+a1;
	        
	        int result1= Integer.parseInt(ab); // 대소비교를 위해 다시 int로 바꾸기
	        int result2 = Integer.parseInt(ba);// 대소비교를 위해 다시 int로 바꾸기
	             
	        int answer = Math.max(result1,result2);
			
			System.out.println(answer);
		}
		
		public void method5() {
//			
//			두 수의 연산값 비교하기
//			문제 설명
//			연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
//
//			12 ⊕ 3 = 123
//			3 ⊕ 12 = 312
//			양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
//
//			단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
//
//			제한사항
//			1 ≤ a, b < 10,000
//			입출력 예
//			a	b	result
//			2	91	364
//			91	2	912
//			입출력 예 설명
//			입출력 예 #1
//
//			a ⊕ b = 291 이고, 2 * a * b = 364 입니다. 둘 중 더 큰 값은 364 이므로 364를 return 합니다.
//			입출력 예 #2
//
//			a ⊕ b = 912 이고, 2 * a * b = 364 입니다. 둘 중 더 큰 값은 912 이므로 912를 return 합니다.

			
			int a = sc.nextInt();
			int b= sc.nextInt();
			
				String a1 = String.valueOf(a);
		        String b1 = String.valueOf(b);
		        
		        String ab = a1+b1;
		        
		        int plusAB = Integer.parseInt(ab);
		        int timesAB = 2*a*b;      
		        
		        
		        int answer = Math.max(plusAB,timesAB);
			System.out.println(answer);
			
			
		}
		
		public void method6() {
//			n의 배수
//			문제 설명
//			정수 num과 n이 매개 변수로 주어질 때, num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.
//
//			제한사항
//			2 ≤ num ≤ 100
//			2 ≤ n ≤ 9
//			입출력 예
//			num	n	result
//			98	2	1
//			34	3	0
//			입출력 예 설명
//			입출력 예 #1
//
//			98은 2의 배수이므로 1을 return합니다.
//			입출력 예 #2
//
//			32는 3의 배수가 아니므로 0을 return합니다.
			
			
			
			
		}
		
		public void method7() {
			
//			n의 배수
//			문제 설명
//			정수 num과 n이 매개 변수로 주어질 때, num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.
//
//			제한사항
//			2 ≤ num ≤ 100
//			2 ≤ n ≤ 9
//			입출력 예
//			num	n	result
//			98	2	1
//			34	3	0
//			입출력 예 설명
//			입출력 예 #1
//
//			98은 2의 배수이므로 1을 return합니다.
//			입출력 예 #2
//
//			32는 3의 배수가 아니므로 0을 return합니다.
			
			int num = sc.nextInt();
			int n = sc.nextInt();
			
			int answer = num%n==0 ? 1:0;
			
			System.out.println(answer);
			
			
		}
		
		public void method8() {
			
//			공배수
//			문제 설명
//			정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.
//
//			제한사항
//			10 ≤ number ≤ 100
//			2 ≤ n, m < 10
//			입출력 예
//			number	n	m	result
//			60	2	3	1
//			55	10	5	0
//			입출력 예 설명
//			입출력 예 #1
//
//			60은 2의 배수이면서 3의 배수이기 때문에 1을 return합니다.
//			입출력 예 #2
//
//			55는 5의 배수이지만 10의 배수가 아니기 때문에 0을 return합니다.
			
			int number = sc.nextInt();
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int answer = number%n==0 ? 1:0;
	        if(answer==1){
	            answer = number%m==0 ? 1:0;
	        }
	        
	        System.out.println(answer); // && 을 사용을 했으면 한줄처리가 가능했었다 참고하자
		}
		
		public void method9() {
			
//			홀짝에 따라 다른 값 반환하기
//			문제 설명
//			양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 
//					n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
//
//			제한사항
//			1 ≤ n ≤ 100
//			입출력 예
//			n	result
//			7	16
//			10	220
//			입출력 예 설명
//			입출력 예 #1
//
//			예제 1번의 n은 7로 홀수입니다. 7 이하의 모든 양의 홀수는 1, 3, 5, 7이고 이들의 합인 1 + 3 + 5 + 7 = 16을 return 합니다.
//			입출력 예 #2
//
//			예제 2번의 n은 10으로 짝수입니다. 10 이하의 모든 양의 짝수는 2, 4, 6, 8, 10이고 
//			이들의 제곱의 합인 22 + 42 + 62 + 82 + 102 = 4 + 16 + 36 + 64 + 100 = 220을 return 합니다.
			
			int n = sc.nextInt();
			int answer = 0 ;
			
			   if(n%2==0){
		            for(int i =1; i<n+1; i++){
		              if(i%2==0){
		                  answer += i*i;
		              } 
		            }
		        }else{
		            for(int i = 1; i<n+1; i++){
		                if(i%2==1){
		                    answer += i;
		                 }
		        }
		    }
			   
			   System.out.println(answer);

		}
		
		public void method10() {
			
//			조건 문자열
//			문제 설명
//			문자열에 따라 다음과 같이 두 수의 크기를 비교하려고 합니다.
//
//			두 수가 n과 m이라면
//			">", "=" : n >= m
//			"<", "=" : n <= m
//			">", "!" : n > m
//			"<", "!" : n < m
//			두 문자열 ineq와 eq가 주어집니다. ineq는 "<"와 ">"중 하나고, eq는 "="와 "!"중 하나입니다.
//			그리고 두 정수 n과 m이 주어질 때, n과 m이 ineq와 eq의 조건에 맞으면 1을 아니면 0을 return하도록 solution 함수를 완성해주세요.
//
//			제한 사항
//			1 ≤ n, m ≤ 100
//			입출력 예
//			ineq	eq	n	m	result
//			"<"	"="	20	50	1
//			">"	"!"	41	78	0
//			입출력 예 설명
//			입출력 예 #1
//
//			20 <= 50은 참이기 때문에 1을 return합니다.
//			입출력 예 #2
//
//			41 > 78은 거짓이기 때문에 0을 return합니다.
			String ineq= sc.nextLine(); // ">","<" 만 입력가능
			String eq = sc.nextLine();// "!", "=" 만 입력가능
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			 int answer = 0;
		        
		        if(ineq.equals(">")){
		            if(eq.equals("=")){
		                 answer= n>=m ? 1:0;
		            }else{
		                 answer = n>m ? 1:0;
		            }
		        }
		        
		        if(ineq.equals("<")){
		            if(eq.equals("=")){
		                 answer = n<=m ? 1 :0;
		            }else{
		                 answer = n<m ? 1:0;
		            }
		        }
		        System.out.println(answer);
			
			
			
		}
		
		public void method11() {
			
//			flag에 따라 다른 값 반환하기
//			문제 설명
//			두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때, flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.
//
//			제한사항
//			-1,000 ≤ a, b ≤ 1,000
//			입출력 예
//			a	b	flag	result
//			-4	7	true	3
//			-4	7	false	-11
//			입출력 예
//			입출력 예 #1
//
//			예제 1번에서 flag가 true이므로 a + b = (-4) + 7 = 3을 return 합니다.
//			입출력 예 #2
//
//			예제 2번에서 flag가 false이므로 a - b = (-4) - 7 = -11을 return 합니다.
			
			boolean flag = sc.nextBoolean();
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			 int answer;
		        
		        if(flag){
		            answer = a+b;
		            
		        }else{
		            answer= a-b;
		            
		        }
		        System.out.println(answer);
			
		}
		
		
		
}
