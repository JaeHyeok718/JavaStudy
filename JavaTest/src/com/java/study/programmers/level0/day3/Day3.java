package com.java.study.programmers.level0.day3;

import java.util.ArrayList;
import java.util.Arrays;

public class Day3 {
	
	 public String solution(String code) {
		
//		코드 처리하기
//		문제 설명
//		문자열 code가 주어집니다.
//		code를 앞에서부터 읽으면서 만약 문자가 "1"이면 mode를 바꿉니다. mode에 따라 code를 읽어가면서 문자열 ret을 만들어냅니다.
//
//		mode는 0과 1이 있으며, idx를 0 부터 code의 길이 - 1 까지 1씩 키워나가면서 code[idx]의 값에 따라 다음과 같이 행동합니다.
//
//		mode가 0일 때
//		code[idx]가 "1"이 아니면 idx가 짝수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다.
//		code[idx]가 "1"이면 mode를 0에서 1로 바꿉니다.
//		mode가 1일 때
//		code[idx]가 "1"이 아니면 idx가 홀수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다.
//		code[idx]가 "1"이면 mode를 1에서 0으로 바꿉니다.
//		문자열 code를 통해 만들어진 문자열 ret를 return 하는 solution 함수를 완성해 주세요.
//
//		단, 시작할 때 mode는 0이며, return 하려는 ret가 만약 빈 문자열이라면 대신 "EMPTY"를 return 합니다.
//
//		제한사항
//		1 ≤ code의 길이 ≤ 100,000
//		code는 알파벳 소문자 또는 "1"로 이루어진 문자열입니다.
//		입출력 예
//		code	result
//		"abc1abc1abc"	"acbac"
//		입출력 예 설명
//		입출력 예 #1
//
//		code의 각 인덱스 i에 따라 다음과 같이 mode와 ret가 변합니다.
//		i	code[i]	mode	ret
//		0	"a"	0	"a"
//		1	"b"	0	"a"
//		2	"c"	0	"ac"
//		3	"1"	1	"ac"
//		4	"a"	1	"ac"
//		5	"b"	1	"acb"
//		6	"c"	1	"acb"
//		7	"1"	0	"acb"
//		8	"a"	0	"acba"
//		9	"b"	0	"acba"
//		10	"c"	0	"acbac"
//		따라서 "acbac"를 return 합니다.
//
//		※ 2023년 05월 18일 지문이 수정되었습니다.
		
		
		        StringBuilder ret = new StringBuilder();
		        int mode = 0; // 초기 모드는 0

		        for (int idx = 0; idx < code.length(); idx++) {
		            char currentChar = code.charAt(idx);

		            if (currentChar == '1') {
		                // mode 전환
		                mode = 1 - mode;
		            } else {
		                // 현재 모드와 idx에 따라 ret에 문자 추가
		                if ((mode == 0 && idx % 2 == 0) || (mode == 1 && idx % 2 == 1)) {
		                    ret.append(currentChar);
		                }
		            }
		        }

		        // ret가 비어있으면 "EMPTY" 반환, 아니면 ret.toString() 반환
		        return ret.length() == 0 ? "EMPTY" : ret.toString();
		    }
		
	
	public void method02() {
//		두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다.
//		첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때, 
//		이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.
//
//				제한사항
//				1 ≤ a ≤ 100
//				1 ≤ d ≤ 100
//				1 ≤ included의 길이 ≤ 100
//				included에는 true가 적어도 하나 존재합니다.
//				입출력 예
//				a	d	included	result
//				3	4	[true, false, false, true, true]	37
//				7	1	[false, false, false, true, false, false, false]	10
//				입출력 예 설명
//				입출력 예 #1
//
//				예제 1번은 a와 d가 각각 3, 4이고 included의 길이가 5입니다. 이를 표로 나타내면 다음과 같습니다.
//
//				1항	2항	3항	4항	5항
//				등차수열	3	7	11	15	19
//				included	true	false	false	true	true
//				따라서 true에 해당하는 1항, 4항, 5항을 더한 3 + 15 + 19 = 37을 return 합니다.
//
//				입출력 예 #2
//
//				예제 2번은 a와 d가 각각 7, 1이고 included의 길이가 7입니다. 이를 표로 나타내면 다음과 같습니다.
//
//				1항	2항	3항	4항	5항	6항	7항
//				등차수열	7	8	9	10	11	12	13
//				included	false	false	false	true	false	false	false
//				따라서 4항만 true이므로 10을 return 합니다.
		int a = 3;
		int d = 4;
		boolean included[] = {true,false,false,true,true};
		int answer=0;
		int[] aPlusb = new int[included.length];
		
		for(int i=0; i<included.length; i++) {
			aPlusb[i] = a+i*d;//3 7 11 15 19 23 27 
			if(included[i]) {
			 answer += aPlusb[i];
			}
		
		}
		
		System.out.println(answer);
		
	}
	
	
	public void method03() {
		
//		주사위 게임 2
//		문제 설명
//		1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다. 세 주사위를 굴렸을 때 나온 숫자를 각각 a, b, c라고 했을 때 얻는 점수는 다음과 같습니다.
//
//		세 숫자가 모두 다르다면 a + b + c 점을 얻습니다.
//		세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 (a + b + c) × (a2 + b2 + c2 )점을 얻습니다.
//		세 숫자가 모두 같다면 (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 + c3 )점을 얻습니다.
//		세 정수 a, b, c가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
//
//		제한사항
//		a, b, c는 1이상 6이하의 정수입니다.
//		입출력 예
//		a	b	c	result
//		2	6	1	9
//		5	3	3	473
//		4	4	4	110592
//	
//		입출력 예 설명
//		
//		입출력 예 #1
//		예제 1번에서 세 주사위 숫자가 모두 다르므로 2 + 6 + 1 = 9점을 얻습니다. 따라서 9를 return 합니다.
//	
//		입출력 예 #2
//		예제 2번에서 두 주사위 숫자만 같으므로 (5 + 3 + 3) × (52 + 32 + 32 ) = 11 × 43 = 473점을 얻습니다. 따라서 473을 return 합니다.
//		
//		입출력 예 #3
//		예제 3번에서 세 주사위 숫자가 모두 같으므로 (4 + 4 + 4) × (42 + 42 + 42 ) × (43 + 43 + 43 ) = 12 × 48 × 192 = 110,592점을 얻습니다. 따라서 110592를 return 합니다.

		 int answer = 0;
	        int a =2;
	        int b =3;
	        int c=4;
	        if(a==b && b==c){
	           answer =  (a + b + c) * ((a*a)+(b*b)+(c*c)) * ((a*a*a)+(b*b*b)+(c*c*c));
	            
	        }
	        else if(a!=b && a!=c && b!=c){
	            answer = a+b+c;
	        }
	           
	        else{
	            answer =  (a+b+c)*((a*a)+(b*b)+(c*c));
	            
	        }
		
	       System.out.println(answer);
	}
	
	public void method04() {
//		원소들의 곱과 합
//		문제 설명
//		정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		2 ≤ num_list의 길이 ≤ 10
//		1 ≤ num_list의 원소 ≤ 9
//		입출력 예
//		num_list	result
//		[3, 4, 5, 2, 1]	1
//		[5, 7, 8, 3]	0
//		입출력 예 설명
//		입출력 예 #1
//
//		모든 원소의 곱은 120, 합의 제곱은 225이므로 1을 return합니다.
//		입출력 예 #2
//
//		모든 원소의 곱은 840, 합의 제곱은 529이므로 0을 return합니다.
		
		int[] num_list= {3,4,2,5,1};
		
        int answer = 0;
        int result1 = 1;
        int result2 = 0;
        int result3 = 0;
        for(int i =0; i<num_list.length; i++){
            result1 *= num_list[i];
        }
        
        for(int j=0; j<num_list.length;j++){
            result2 += num_list[j];
        }
        result3 = result2*result2;
		
        answer = result1>result3?0:1;
        
		System.out.println(answer);
	}
	public void method05() {
		
		
		int[] num_list = {1,2,3,4,5};
		 
		  String even ="";
		  String odd="";
		        
		        for(int i = 0 ; i<num_list.length; i++){
		            if(num_list[i]%2==0){//짝수
		                even+= String.valueOf(num_list[i]);             
		            }else{//홀수
		                odd+= String.valueOf(num_list[i]);
		            }
		  
		        int answer = Integer.parseInt(even)+Integer.parseInt(odd);
		        
		        System.out.println(answer);
		        }
		
	}
    public void method06() {
    	
    	int[] num_list = {5,2,1,7,5};
    	
        int nLength = num_list.length;
        int lastM = num_list[nLength-2];
        int last = num_list[nLength-1];
        int lastNum = 0;
        if(last > lastM){
            lastNum = last - lastM;
        }else{
            lastNum = last * 2;
        }

        int[] answer = new int[nLength + 1]; 
        for(int i=0; i<nLength; i++){
            answer[i] = num_list[i];
        }
    
        answer[nLength] = lastNum; 
         
        System.out.println(Arrays.toString(answer));
        
    }
   
    
    public void method07() {
//    	수 조작하기 1
//    	문제 설명
//    	정수 n과 문자열 control이 주어집니다. control은 "w", "a", "s", "d"의 4개의 문자로 이루어져 있으며, control의 앞에서부터 순서대로 문자에 따라 n의 값을 바꿉니다.
//
//    	"w" : n이 1 커집니다.
//    	"s" : n이 1 작아집니다.
//    	"d" : n이 10 커집니다.
//    	"a" : n이 10 작아집니다.
//    	위 규칙에 따라 n을 바꿨을 때 가장 마지막에 나오는 n의 값을 return 하는 solution 함수를 완성해 주세요.
//
//    	제한사항
//    	-100,000 ≤ n ≤ 100,000
//    	1 ≤ control의 길이 ≤ 100,000
//    	control은 알파벳 소문자 "w", "a", "s", "d"로 이루어진 문자열입니다.
//    	입출력 예
//    	n	control	result
//    	0	"wsdawsdassw"	-1
//    	입출력 예 설명
//    	입출력 예 #1
//
//    	수 n은 control에 따라 다음과 같은 순서로 변하게 됩니다.
//    	0 → 1 → 0 → 10 → 0 → 1 → 0 → 10 → 0 → -1 → -2 → -1
//    	따라서 -1을 return 합니다.
    	String control ="wsdawsdassw";
    	int n= 0;
        for(int i=0; i<control.length(); i++){
            char ch = control.charAt(i);
        
            if(ch=='w'){
                n += 1;
            } 
            if(ch=='s'){
                n -= 1;
            }
            if(ch=='d'){
                n += 10;
            }
            if(ch=='a'){
                n -= 10;
            }
     }
    	System.out.println(n);
    	
    }
	
    public void method08() {
    	int[] numLog= {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
    	   String answer = "";
           for(int i=1;i<numLog.length;i++){
               switch(numLog[i]-numLog[i-1]){
                   case 1 : answer+="w";
                           break;
                   case -1 : answer+="s";
                           break;
                   case 10 : answer+="d";
                           break;
                   case -10 : answer+="a";
                           break;                    
               }        
           }
    	System.out.println(answer);
    }
    
    public void method09() {
    	
//    	수열과 구간 쿼리 3
//    	문제 설명
//    	정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴입니다.
//
//    	각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다.
//
//    	위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
//
//    	제한사항
//    	1 ≤ arr의 길이 ≤ 1,000
//    	0 ≤ arr의 원소 ≤ 1,000,000
//    	1 ≤ queries의 길이 ≤ 1,000
//    	0 ≤ i < j < arr의 길이
//    	입출력 예
//    	arr	queries	result
//    	[0, 1, 2, 3, 4]	[[0, 3],[1, 2],[1, 4]]	[3, 4, 1, 0, 2]
//    	입출력 예 설명
//    	입출력 예 #1
//
//    	각 쿼리에 따라 arr가 다음과 같이 변합니다.
//    	arr
//    	[0, 1, 2, 3, 4]
//    	[3, 1, 2, 0, 4]
//    	[3, 2, 1, 0, 4]
//    	[3, 4, 1, 0, 2]
//    	따라서 [3, 4, 1, 0, 2]를 return 합니다.
    	
    	int[] arr = {0,1,2,3,4};
    	int[][] queries= {{0,3},{1,2},{1,4}};

    	for(int i=0;i<queries.length;i++) {
    		for(int j=0; j<queries[i].length;j++) {
    			int[] query = new int[2];
    			query[j]=queries[i][j];// query[0]=0; query[1]=3;
    			
    		}
    		
    		
    		
    		
    	}
    	
    	
    	
    }
    
	
}
