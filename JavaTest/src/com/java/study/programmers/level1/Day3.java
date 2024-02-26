package com.java.study.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Day3 {

	Scanner sc = new Scanner(System.in);
	
	
	public void method01() {
		
		
//		음양 더하기
//		제출 내역
//		문제 설명
//		어떤 정수들이 있습니다. 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다.
//		실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		absolutes의 길이는 1 이상 1,000 이하입니다.
//		absolutes의 모든 수는 각각 1 이상 1,000 이하입니다.
//		signs의 길이는 absolutes의 길이와 같습니다.
//		signs[i] 가 참이면 absolutes[i] 의 실제 정수가 양수임을, 그렇지 않으면 음수임을 의미합니다.
//		입출력 예
//		absolutes	signs	result
//		[4,7,12]	[true,false,true]	9
//		[1,2,3]	[false,false,true]	0
//		입출력 예 설명
//		입출력 예 #1
//
//		signs가 [true,false,true] 이므로, 실제 수들의 값은 각각 4, -7, 12입니다.
//		따라서 세 수의 합인 9를 return 해야 합니다.
//		입출력 예 #2
//
//		signs가 [false,false,true] 이므로, 실제 수들의 값은 각각 -1, -2, 3입니다.
//		따라서 세 수의 합인 0을 return 해야 합니다.
		int[] absolutes = {4,7,12};
		boolean[] signs = {true,false,true};
		 int sum = 0;
	        for (int i = 0; i < absolutes.length; i++) {
	            sum += signs[i] ? absolutes[i] : -absolutes[i];
	        }
	        
	        System.out.println(sum);
		
	}
	
	public void method02() {
//		
//		콜라츠 추측
//		제출 내역
//		문제 설명
//		1937년 Collatz란 사람에 의해 제기된 이 추측은, 주어진 수가 1이 될 때까지 다음 작업을 반복하면, 모든 수를 1로 만들 수 있다는 추측입니다. 작업은 다음과 같습니다.
//
//		1-1. 입력된 수가 짝수라면 2로 나눕니다. 
//		1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다. 
//		2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다. 
//		예를 들어, 주어진 수가 6이라면 6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1 이 되어 총 8번 만에 1이 됩니다. 
//		위 작업을 몇 번이나 반복해야 하는지 반환하는 함수, solution을 완성해 주세요. 단, 주어진 수가 1인 경우에는 0을, 작업을 500번 반복할 때까지 1이 되지 않는다면 –1을 반환해 주세요.
//
//		제한 사항
//		입력된 수, num은 1 이상 8,000,000 미만인 정수입니다.
//		입출력 예
//		n	result
//		6	8
//		16	4
//		626331	-1
//		입출력 예 설명
//		입출력 예 #1
//		문제의 설명과 같습니다.
//
//		입출력 예 #2
//		16 → 8 → 4 → 2 → 1 이 되어 총 4번 만에 1이 됩니다.
//
//		입출력 예 #3
//		626331은 500번을 시도해도 1이 되지 못하므로 -1을 리턴해야 합니다.
		System.out.println("num을 입력해주세요 ");
		int num = sc.nextInt();
	    long n = (long) num; 
        int answer = 0;
        for (int i = 0; i < 500; i++) {
            if (n == 1) { 
                System.out.println(answer);
            }
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            answer++; 
        }
        System.out.println(n == 1 ? answer : -1);
	}
	
	
	public void method03() {
		
//		서울에서 김서방 찾기
//		제출 내역
//		문제 설명
//		String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요.
//		seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
//
//		제한 사항
//		seoul은 길이 1 이상, 1000 이하인 배열입니다.
//		seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
//		"Kim"은 반드시 seoul 안에 포함되어 있습니다.
//		입출력 예
//		seoul	return
//		["Jane", "Kim"]	"김서방은 1에 있다"

		String[] seoul = {"Jane", "Kim"};
		   String answer = "";
	        for(int i =0; i<seoul.length;i++){
	            if(seoul[i].equals("Kim")){//문자열 비교는 == 이 아닌 equlas 쓰기 . heap영역과 String pool 영역의 차이
	                answer="김서방은 "+i+"에 있다";
	                break;
	        } 
	    }
	        System.out.println(answer);
	}
	
	
	public void method04() {
		
//		없는 숫자 더하기
//		제출 내역
//		문제 설명
//		0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. 
//		numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		1 ≤ numbers의 길이 ≤ 9
//		0 ≤ numbers의 모든 원소 ≤ 9
//		numbers의 모든 원소는 서로 다릅니다.
//		입출력 예
//		numbers	result
//		[1,2,3,4,6,7,8,0]	14
//		[5,8,4,0,6,7,9]	6
//		입출력 예 설명
//		입출력 예 #1
//
//		5, 9가 numbers에 없으므로, 5 + 9 = 14를 return 해야 합니다.
//		입출력 예 #2
//
//		1, 2, 3이 numbers에 없으므로, 1 + 2 + 3 = 6을 return 해야 합니다.
		int [] numbers = {1,2,3,4,6,7,8,0};// 가정
		
		
		
		 int sum = 45; //0~9합
	        for (int number : numbers) {
	            sum -= number;
	        }
	        System.out.println(sum);
		
	}
	
	public void method05() {
		
//		나누어 떨어지는 숫자 배열
//		제출 내역
//		문제 설명
//		array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
//		divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
//
//		제한사항
//		arr은 자연수를 담은 배열입니다.
//		정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
//		divisor는 자연수입니다.
//		array는 길이 1 이상인 배열입니다.
//		입출력 예
//		arr	divisor	return
//		[5, 9, 7, 10]	5	[5, 10]
//		[2, 36, 1, 3]	1	[1, 2, 3, 36]
//		[3,2,6]	10	[-1]
//		입출력 예 설명
//		입출력 예#1
//		arr의 원소 중 5로 나누어 떨어지는 원소는 5와 10입니다. 따라서 [5, 10]을 리턴합니다.
//
//		입출력 예#2
//		arr의 모든 원소는 1으로 나누어 떨어집니다. 원소를 오름차순으로 정렬해 [1, 2, 3, 36]을 리턴합니다.
//
//		입출력 예#3
//		3, 2, 6은 10으로 나누어 떨어지지 않습니다. 나누어 떨어지는 원소가 없으므로 [-1]을 리턴합니다.
		
		int[] arr= {5, 9, 7, 10,15,11,12,13,20,25,26,30};
		
		int divisor=5;
		  ArrayList<Integer> list = new ArrayList<>();
	        for(int i=0; i<arr.length;i++){
	         if(arr[i]%divisor==0){
	             list.add(arr[i]);
	         }    
	         } 
	        
	        if(list.isEmpty()){
	             list.add(-1);        
	        }
	    Collections.sort(list);//올림차순
	        int[] answer = new int[list.size()];
	        for(int i=0;i<answer.length;i++){
	            answer[i]=list.get(i);
	        }
	        System.out.println(Arrays.toString(answer));
	}
	public void method06() {
		
		/*
		 * 핸드폰 번호 가리기 제출 내역 문제 설명 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
		 * 전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는
		 * 함수, solution을 완성해주세요.
		 * 
		 * 제한 조건 phone_number는 길이 4 이상, 20이하인 문자열입니다. 입출력 예 phone_number return
		 * "01033334444" "*******4444" "027778888" "*****8888"
		 */
		System.out.println("핸드폰번호를 입력해주세요.");
		String phone_number=sc.nextLine();
		
	    String answer = "";
        String sub1= phone_number.substring(phone_number.length()-4);
        String str1="*".repeat(phone_number.length()-4);
        answer = str1+sub1;
		
        
        System.out.println(answer);
	}
	
	public void method07() {
		
//		제일 작은 수 제거하기
//		제출 내역
//		문제 설명
//		정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
//		단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
//
//		제한 조건
//		arr은 길이 1 이상인 배열입니다.
//		인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
//		입출력 예
//		arr	return
//		[4,3,2,1]	[4,3,2]
//		[10]	[-1]
//		
	
		int[] arr={4,3,2,1};
		
	     if (arr.length == 1) 
	    	 System.out.println(Arrays.toString(new int[] {-1})); // 길이가 1일 때 처리

	        int min = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) {
	                min = arr[i]; // 최솟값 찾기
	            }
	        }

	        int[] answer = new int[arr.length - 1]; // 최솟값을 제외한 배열의 길이
	        int index = 0;
	        for (int num : arr) {
	            if (num != min) {
	                answer[index++] = num; // 최솟값을 제외하고 배열 채우기
	            }
	        }
	        System.out.println(Arrays.toString(answer));
	}
	
	
}
