package com.java.study.programmers.level0.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day5 {
		Scanner sc = new Scanner(System.in);
	
	public void method01() {
//		콜라츠 수열 만들기
//		제출 내역
//		문제 설명
//		모든 자연수 x에 대해서 현재 값이 x이면 x가 짝수일 때는 2로 나누고, x가 홀수일 때는 3 * x + 1로 바꾸는 계산을 계속해서 반복하면 언젠가는 반드시 x가 1이 되는지 묻는 문제를 콜라츠 문제라고 부릅니다.
//
//		그리고 위 과정에서 거쳐간 모든 수를 기록한 수열을 콜라츠 수열이라고 부릅니다.
//
//		계산 결과 1,000 보다 작거나 같은 수에 대해서는 전부 언젠가 1에 도달한다는 것이 알려져 있습니다.
//
//		임의의 1,000 보다 작거나 같은 양의 정수 n이 주어질 때 초기값이 n인 콜라츠 수열을 return 하는 solution 함수를 완성해 주세요.
//
//		제한사항
//		1 ≤ n ≤ 1,000
//		입출력 예
//		n	result
//		10	[10, 5, 16, 8, 4, 2, 1]
//		입출력 예 설명
//		입출력 예 #1
//
//		순서대로 연산한 결과를 표로 만들면 다음과 같습니다.
//		연산 횟수	x	홀짝 여부
//		0	10	짝수
//		1	5	홀수
//		2	16	짝수
//		3	8	짝수
//		4	4	짝수
//		5	2	짝수
//		6	1	홀수
//		따라서 [10, 5, 16, 8, 4, 2, 1]을 return 합니다.
			int n=10;
		
	     ArrayList<Integer> result = new ArrayList<>();
	        result.add(n);
	        while(true){
	        	if(n==1) {
	        		break;
	        	}
	            if(n%2==0){

	            n = n/2;
	            result.add(n);

	            }else{
	            
	            	n= 3*n+1;
	            	result.add(n);
	            }
	         }
	        
	        int[] answer = new int[result.size()];
	        for(int i=0;i<answer.length;i++){
	            answer[i]=result.get(i);
	        }
		System.out.println(Arrays.toString(answer));
		
	}
	public void method02() {
		int[] arr = {1,4,2,5,3};
		
		ArrayList<Integer> stkList = new ArrayList<>();
	     for (int i = 0; i < arr.length;) {
	         if (stkList.isEmpty()) {
	             stkList.add(arr[i]);
	             i++;
	         } else if (arr[i] > stkList.get(stkList.size() - 1)) {
	             stkList.add(arr[i]);
	             i++;
	         } else if (arr[i] <= stkList.get(stkList.size() - 1)) {
	             stkList.remove(stkList.size() - 1);
	         }
	     }
	     int[] stk = new int[stkList.size()];
	     for (int j = 0; j < stk.length; j++) {
	         stk[j] = stkList.get(j);
	     
        }
			
			System.out.println(Arrays.toString(stk));
			
		
	}
	
	public void method03() {
		
//		간단한 논리 연산
//		제출 내역
//		문제 설명
//		boolean 변수 x1, x2, x3, x4가 매개변수로 주어질 때, 다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.
//
//		(x1 ∨ x2) ∧ (x3 ∨ x4)
//		입출력 예
//		x1	x2	x3	x4	result
//		false	true	true	true	true
//		true	false	false	false	false
//		입출력 예 설명
//		입출력 예 #1
//
//		예제 1번의 x1, x2, x3, x4로 식을 계산하면 다음과 같습니다.
//
//		(x1 ∨ x2) ∧ (x3 ∨ x4) ≡ (F ∨ T) ∧ (T ∨ T) ≡ T ∧ T ≡ T
//
//		따라서 true를 return 합니다.
//
//		입출력 예 #2
//
//		예제 2번의 x1, x2, x3, x4로 식을 계산하면 다음과 같습니다.
//
//		(x1 ∨ x2) ∧ (x3 ∨ x4) ≡ (T ∨ F) ∧ (F ∨ F) ≡ T ∧ F ≡ F
//
//		따라서 false를 return 합니다.
//
//		∨과 ∧의 진리표는 다음과 같습니다.
//
//		x	y	x ∨ y	x ∧ y
//		T	T	T	T
//		T	F	T	F
//		F	T	T	F
//		F	F	F	F
		boolean x1 = true;
		boolean x2= false;
		boolean x3=false;
		boolean x4=false;
		
	        boolean answer = (x1||x2)&&(x3||x4);
	  
		
	        System.out.println(answer);
	        
	}
	
	public void method04() {
		
//		주사위 게임 3
//		제출 내역
//		문제 설명
//		1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
//
//		네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
//		세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
//		주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
//		어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
//		네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
//		네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
//
//		제한사항
//		a, b, c, d는 1 이상 6 이하의 정수입니다.
//		입출력 예
//		a	b	c	d	result
//		2	2	2	2	2222
//		4	1	4	4	1681
//		6	3	3	6	27
//		2	5	2	6	30
//		6	4	2	5	2
//		입출력 예 설명
//		입출력 예 #1
//
//		예제 1번에서 네 주사위 숫자가 모두 2로 같으므로 1111 × 2 = 2222점을 얻습니다. 따라서 2222를 return 합니다.
//		입출력 예 #2
//
//		예제 2번에서 세 주사위에서 나온 숫자가 4로 같고 나머지 다른 주사위에서 나온 숫자가 1이므로 (10 × 4 + 1)2 = 412 = 1681점을 얻습니다. 따라서 1681을 return 합니다.
//		입출력 예 #3
//
//		예제 3번에서 a, d는 6으로, b, c는 3으로 각각 같으므로 (6 + 3) × |6 - 3| = 9 × 3 = 27점을 얻습니다. 따라서 27을 return 합니다.
//		입출력 예 #4
//
//		예제 4번에서 두 주사위에서 2가 나오고 나머지 다른 두 주사위에서 각각 5, 6이 나왔으므로 5 × 6 = 30점을 얻습니다. 따라서 30을 return 합니다.
//		입출력 예 #5
//
//		예제 5번에서 네 주사위 숫자가 모두 다르고 나온 숫자 중 가장 작은 숫자가 2이므로 2점을 얻습니다. 따라서 2를 return 합니다.
		System.out.println("첫 주사위의 숫자 :");
		int a= sc.nextInt();
		System.out.println("2 주사위의 숫자 :");
		int b=sc.nextInt();
		System.out.println("3 주사위의 숫자 : ");
		int c = sc.nextInt();
		System.out.println("4 주사위의 숫자 : ");
		int d=sc.nextInt();
		 int answer = 0;
	        
	        if (a == b && b == c && c == d) { // 다 같을 때
	            answer = 1111 * a;
	        } else if (a == b && b == c) { // abc 3개만 같을 때
	            answer = (int) Math.pow((10 * a + d), 2);
	        } else if (a == b && b == d) { // abd 3개만 같을 때
	            answer = (int) Math.pow((10 * a + c), 2);
	        } else if (a == c && c == d) { // acd 3개만 같을 때
	            answer = (int) Math.pow((10 * a + b), 2);
	        } else if (b == c && c == d) { // bcd 3개만 같을 때
	            answer = (int) Math.pow((10 * b + a), 2);
	        } else if (a == b && c == d) { // ab와 cd가 같을 때
	            answer = (a + c) * Math.abs(a - c);
	        } else if (a == c && b == d) { // ac와 bd가 같을 때
	            answer = (a + b) * Math.abs(a - b);
	        } else if (a == d && b == c) { // ad와 bc가 같을 때
	            answer = (a + b) * Math.abs(a - b);
	        } else if (a == b && b != d && c != d) { // a와 b가 같고, c와 d가 다를 때
	            answer = d * c;
	        } else if (a == c && b != d && b != d) { // a와 c가 같고, b와 d가 다를 때
	            answer = b * d;
	        } else if (a == d && b != c && b != c) { // a와 d가 같고, b와 c가 다를 때
	            answer = b * c;
	        } else if (b == c && a != d && a != d) { // b와 c가 같고, a와 d가 다를 때
	            answer = a * d;
	        } else if (b == d && a != c && a != c) { // b와 d가 같고, a와 c가 다를 때
	            answer = a * c;
	        } else if (c == d && a != b && a != b) { // c와 d가 같고, a와 b가 다를 때
	            answer = a * b;
	        } else if (a != b && b != c && c != d && a != c && b != d && a != d) { // 모든 숫자가 다를 때
	            answer = Math.min(Math.min(Math.min(a, b), c), d);
	        }
	
	        	System.out.println("정답 : "+answer);
	}
	public void method05() {
		
//		글자 이어 붙여 문자열 만들기
//		제출 내역
//		문제 설명
//		문자열 my_string과 정수 배열 index_list가 매개변수로 주어집니다. 
//		my_string의 index_list의 원소들에 해당하는 인덱스의 글자들을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
//
//		제한사항
//		1 ≤ my_string의 길이 ≤ 1,000
//		my_string의 원소는 영소문자로 이루어져 있습니다.
//		1 ≤ index_list의 길이 ≤ 1,000
//		0 ≤ index_list의 원소 < my_string의 길이
//		입출력 예
//		my_string	index_list	result
//		"cvsgiorszzzmrpaqpe"	[16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7]	"programmers"
//		"zpiaz"	[1, 2, 0, 0, 3]	"pizza"
//		입출력 예 설명
//		입출력 예 #1
//
//		예제 1번의 my_string에서 인덱스 3, 5, 6, 11, 12, 14, 16, 17에 해당하는 글자는 각각 g, o, r, m, r, a, p, e이므로
//		my_string에서 index_list에 들어있는 원소에 해당하는 인덱스의 글자들은 각각 순서대로 p, r, o, g, r, a, m, m, e, r, s입니다. 따라서 "programmers"를 return 합니다.
//		입출력 예 #2
//
//		예제 2번의 my_string에서 인덱스 0, 1, 2, 3에 해당하는 글자는 각각 z, p, i, a이므로
//		my_string에서 index_list에 들어있는 원소에 해당하는 인덱스의 글자들은 각각 순서대로 p, i, z, z, a입니다. 따라서 "pizza"를 return 합니다.
		
		String my_string = "cvsgiorszzzmrpaqpe";
		int[] index_list= {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
		//해당 문제를 초기화 해놓는 작업은 프로그래머스에서 테스트를 하는 답안입니다.
		//Scanner로 사용하려고 했으나 문제푸는데에 집중을 하고있어 테스트 답안을 사용을 하고있습니다.
		 String answer = "";
	        for (int i=0; i<index_list.length;i++){
	        	int index = index_list[i];
	            answer+=my_string.charAt(index);
	        }
	        
	        System.out.println(answer);
		
	}
	
	public void method06() {
		
//		9로 나눈 나머지
//		제출 내역
//		문제 설명
	
//		음이 아닌 정수를 9로 나눈 나머지는 그 정수의 각 자리 숫자의 합을 9로 나눈 나머지와 같은 것이 알려져 있습니다.
//		이 사실을 이용하여 음이 아닌 정수가 문자열 number로 주어질 때, 이 정수를 9로 나눈 나머지를 return 하는 solution 함수를 작성해주세요.
//
//		제한사항
//		1 ≤ number의 길이 ≤ 100,000
//		number의 원소는 숫자로만 이루어져 있습니다.
//		number는 정수 0이 아니라면 숫자 '0'으로 시작하지 않습니다.
//		입출력 예
//		number	result
//		"123"	6
//		"78720646226947352489"	2
//		입출력 예 설명
//		입출력 예 #1
//
//		예제 1번의 number는 123으로 각 자리 숫자의 합은 6입니다. 6을 9로 나눈 나머지는 6이고, 실제로 123 = 9 × 13 + 6입니다. 따라서 6을 return 합니다.
//		입출력 예 #2
//
//		예제 2번의 number는 78720646226947352489으로 각자리 숫자의 합은 101입니다. 
//		101을 9로 나눈 나머지는 2이고, 실제로 78720646226947352489 = 9 × 8746738469660816943 + 2입니다. 따라서 2를 return 합니다.
		
		String number="78720646226947352489";
        long sum = 0;
        for (int i = 0; i < number.length(); i++) {
            // 각 문자를 숫자로 변환하여 합산
            sum += Character.getNumericValue(number.charAt(i));
        }
		System.out.println(sum % 9);
	}
	
	public void method07() {
	String my_string="rermgorpsam";
	int[][] queries = {{2,3},{0,7},{5,9},{6,10}};
	
	 for(int i=0;i<queries.length;i++){//23
         int first=queries[i][0];
         int last=queries[i][1];
          String pre=my_string.substring(0,first);
          
          String change=my_string.substring(first,last+1); 
          String reversed = new StringBuilder(change).reverse().toString();
         
          String lastS=my_string.substring(last+1);
          
          my_string= pre+reversed+lastS;
	 }
	 System.out.println(my_string);
	}
	
	
}
