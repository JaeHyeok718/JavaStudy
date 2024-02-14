package com.java.study.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Day1 {

	Scanner sc = new Scanner(System.in);
	
	public void method01() {
//	x만큼 간격이 있는 n개의 숫자
//	제출 내역
//	문제 설명
//	함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 
//	다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
//
//	제한 조건
//	x는 -10000000 이상, 10000000 이하인 정수입니다.
//	n은 1000 이하인 자연수입니다.
//	입출력 예
//	x	n	answer
//	2	5	[2,4,6,8,10]
//	4	3	[4,8,12]
//	-4	2	[-4, -8]
	 System.out.println("시작 할 수를 입력해주세요 : ");
	 long x = sc.nextLong();
	 System.out.println("몇번을 더할까요?");
	 long n = sc.nextLong();
	 
	 long[] arr = new long[(int) n];
	 
	 for(int i=1; i<arr.length;i++) {
		 arr[i-1]=x*i;
	 }
	 
	 System.out.println(Arrays.toString(arr));
		
	}
	
	
	public void method02() {
	
//		문자열을 정수로 바꾸기
//		제출 내역
//		문제 설명
//		문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
//
//		제한 조건
//		s의 길이는 1 이상 5이하입니다.
//		s의 맨앞에는 부호(+, -)가 올 수 있습니다.
//		s는 부호와 숫자로만 이루어져있습니다.
//		s는 "0"으로 시작하지 않습니다.
//		입출력 예
//		예를들어 str이 "1234"이면 1234를 반환하고, "-1234"이면 -1234를 반환하면 됩니다.
//		str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.
	
		System.out.println("숫자를 적어주세요");
		String str = sc.nextLine();
		
		int result= Integer.parseInt(str);
		
		System.out.println(result);
	}
	public void method03() {
		
//		나머지가 1이 되는 수 찾기
//		제출 내역
//		문제 설명
//		자연수 n이 매개변수로 주어집니다. n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
//				답이 항상 존재함은 증명될 수 있습니다.
//
//		제한사항
//		3 ≤ n ≤ 1,000,000
//		입출력 예
//		n	result
//		10	3
//		12	11
//		입출력 예 설명
//		입출력 예 #1
//
//		10을 3으로 나눈 나머지가 1이고, 3보다 작은 자연수 중에서 문제의 조건을 만족하는 수가 없으므로, 3을 return 해야 합니다.
//		입출력 예 #2
//
//		12를 11로 나눈 나머지가 1이고, 11보다 작은 자연수 중에서 문제의 조건을 만족하는 수가 없으므로, 11을 return 해야 합니다.
	
		System.out.println("n : ");
		int n= sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
        for(int x=2; x<n;x++){
            if(n%x==1){
               list.add(x);
            }
        }
        Collections.sort(list);
        
        int answer =list.get(0);
		
        System.out.println(answer);
	}
	
	public void method04() {
		
//		약수의 합
//		제출 내역
//		문제 설명
//		정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
//
//		제한 사항
//		n은 0 이상 3000이하인 정수입니다.
//		입출력 예
//		n	return
//		12	28
//		5	6
//		입출력 예 설명
//		입출력 예 #1
//		12의 약수는 1, 2, 3, 4, 6, 12입니다. 이를 모두 더하면 28입니다.
//
//		입출력 예 #2
//		5의 약수는 1, 5입니다. 이를 모두 더하면 6입니다.
		
		System.out.println("n : ");
		int n =sc.nextInt();
		 int answer = 0;
	        for(int i=1; i<=n;i++){
	        
	        	if(n%i==0){
	               answer+=i;
	            }            
	        }
	        System.out.println(answer);
	}
	public void method05() {
//		평균 구하기
//		제출 내역
//		문제 설명
//		정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
//
//		제한사항
//		arr은 길이 1 이상, 100 이하인 배열입니다.
//		arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
//		입출력 예
//		arr	return
//		[1,2,3,4]	2.5
//		[5,5]	5

		int[] arr= {1,2,3,4,7,8,9,10,12,46,78,456,213,4578};
	
		 double answer = 0;
	        int a=0;
	        for(int i=0; i<arr.length;i++){
	            a+=arr[i];
	        }
	        answer= (double)a/arr.length;
	        
	        System.out.println("평균 : "+ answer);
	}
	
	public void method06() {
		
//		짝수와 홀수
//		제출 내역
//		문제 설명
//		정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
//
//		제한 조건
//		num은 int 범위의 정수입니다.
//		0은 짝수입니다.
//		입출력 예
//		num	return
//		3	"Odd"
//		4	"Even"

		System.out.println("숫자 num : ");
		int num = sc.nextInt();
		
		System.out.println((num%2==0) ? "Even" : "Odd");
		
	}
	public void method07() {
		
//		자연수 뒤집어 배열로 만들기
//		제출 내역
//		문제 설명
//		자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
//
//		제한 조건
//		n은 10,000,000,000이하인 자연수입니다.
//		입출력 예
//		n	return
//		12345	[5,4,3,2,1]

		long n = 1567823219;
		
	    String a = String.valueOf(n);

        String reversed = new StringBuilder(a).reverse().toString();
        
        int[] answer = new int[reversed.length()];
        

        for (int i = 0; i < reversed.length(); i++) {

            answer[i] = Character.getNumericValue(reversed.charAt(i));// 문자열을 정수로 바꾸는 메소드이다. 잘기억해두자
        }
        System.out.println(Arrays.toString(answer));
	}
	
	
	
}
