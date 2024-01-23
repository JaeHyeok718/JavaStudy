package com.java.study.programmers.day1;

import java.util.Scanner;

public class Day1 {
	/*
	 * 문제 설명 정수 a와 b가 주어집니다. 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.
	 * 
	 * 제한사항 -100,000 ≤ a, b ≤ 100,000 입출력 예 입력 #1
	 * 
	 * 4 5 출력 #1
	 * 
	 * a = 4 b = 5
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}
// 	   문제 설명
// 	   문자열 str과 정수 n이 주어집니다.
// 	   str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.
// 	   제한사항
// 	   1 ≤ str의 길이 ≤ 10
// 	   1 ≤ n ≤ 5
// 	   입출력 예
// 	   입력 #1
// 	   string 5
// 	   출력 #1
// 	   stringstringstringstringstring

	public static void main2(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		String result = "";
		for (int i = 0; i < n; i++) {
			result += str;
		}
		System.out.print(result);
	}

	/*
	 * 문제 설명 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를
	 * 작성해 보세요.
	 * 
	 * 제한사항 1 ≤ str의 길이 ≤ 20 str은 알파벳으로 이루어진 문자열입니다. 입출력 예 입력 #1
	 * 
	 * aBcDeFg 출력 #1
	 * 
	 * AbCdEfG
	 */

	public static void main3(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String result = "";
		char b;

		for (int i = 0; i < a.length(); i++) {
			b = a.charAt(i);
			if (Character.isUpperCase(b)) {
				result += Character.toLowerCase(b);
			} else {
				result += Character.toUpperCase(b);
			}
		}

		System.out.println(result);
	}

//	       두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.
//
//	       a + b = c
//	       제한사항
//	       1 ≤ a, b ≤ 100
//	       입출력 예
//	       입력 #1
//
//	       4 5
//	       출력 #1
//
//	       4 + 5 = 9
	public static void main4(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a + " + " + b + " = " + (a + b));
	}

//	       문제 설명
//	       두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.
//	       입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를 작성해 보세요.
//	       제한사항
//	       1 ≤ str1, str2의 길이 ≤ 10
//	       입출력 예
//	       입력 #1
//	       apple pen
//	       출력 #1
//	       applepen
//	       입력 #2
//	       Hello World!
//	       출력 #2
//	       HelloWorld!
	public static void main5(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String result = a + b;
		System.out.println(result);
	}

//	       문제 설명
//	       문자열 str이 주어집니다.
//	       문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
//
//	       제한사항
//	       1 ≤ str의 길이 ≤ 10
//
//	       입출력 예
//	       입력 #1
//
//	       abcde
//	       출력 #1
//
//	       a
//	       b
//	       c
//	       d
//	       e
	public static void main6(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char b;
		for (int i = 0; i < a.length(); i++) {
			b = a.charAt(i);
			System.out.println(b);
		}

	}

//	       홀짝 구분하기
//	       문제 설명
//	       자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.
//
//	       제한사항
//	       1 ≤ n ≤ 1,000
//	       입출력 예
//	       입력 #1
//
//	       100
//	       출력 #1
//
//	       100 is even
//	       입력 #2
//
//	       1
//	       출력 #2
//
//	       1 is odd
	public static void main7(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println(n + " is even");

		} else {

			System.out.println(n + " is odd");
		}

	}

//	문자열 겹쳐쓰기
//	문제 설명
//	문자열 my_string, overwrite_string과 정수 s가 주어집니다. 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 문자열 overwrite_string으로 
//	바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
//
//	제한사항
//	my_string와 overwrite_string은 숫자와 알파벳으로 이루어져 있습니다.
//	1 ≤ overwrite_string의 길이 ≤ my_string의 길이 ≤ 1,000
//	0 ≤ s ≤ my_string의 길이 - overwrite_string의 길이
//	입출력 예
//	my_string	overwrite_string	s	result
//	"He11oWor1d"	"lloWorl"	2	"HelloWorld"
//	"Program29b8UYP"	"merS123"	7	"ProgrammerS123"
//	입출력 예 설명
//	입출력 예 #1
//
//	예제 1번의 my_string에서 인덱스 2부터 overwrite_string의 길이만큼에 해당하는 부분은 "11oWor1"이고 이를 "lloWorl"로 바꾼 "HelloWorld"를 return 합니다.
//	입출력 예 #2
//
//	예제 2번의 my_string에서 인덱스 7부터 overwrite_string의 길이만큼에 해당하는 부분은 "29b8UYP"이고 이를 "merS123"로 바꾼 "ProgrammerS123"를 return 합니다.
//	
	  public String solution(String my_string, String overwrite_string, int s) {
	        String answer = "";
	        String a = my_string.substring(0,s);
	        String b = my_string.substring(s+overwrite_string.length());
	        answer = a+overwrite_string+b;
	        
	        return answer;
	  }
	
}
