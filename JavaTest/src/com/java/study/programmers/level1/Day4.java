package com.java.study.programmers.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Day4 {

	Scanner sc = new Scanner(System.in);

	public void method01() {

//		수박수박수박수박수박수?
//				제출 내역
//				문제 설명
//				길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 
//				예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
//
//				제한 조건
//				n은 길이 10,000이하인 자연수입니다.
//				입출력 예
//				n	return
//				3	"수박수"
//				4	"수박수박"

		System.out.println("숫자를 입력해주세요. : ");
		int n = sc.nextInt();
		String answer = "";

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				answer += "수";
			} else {
				answer += "박";
			}
		}

		System.out.println(answer);
	}

	public void method02() {

//가운데 글자 가져오기
//제출 내역
//문제 설명
//단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
//
//재한사항
//s는 길이가 1 이상, 100이하인 스트링입니다.
//입출력 예
//s	return
//"abcde"	"c"
//"qwer"	"we"

		System.out.println("문자열을 입력해주세요 : ");
		String s = sc.nextLine();
		String answer = "";
		int len = s.length();

		// 문자열 길이가 홀수인 경우
		if (len % 2 != 0) {
			answer = s.substring(len / 2, len / 2 + 1);
		} else {
			// 문자열 길이가 짝수인 경우
			answer = s.substring(len / 2 - 1, len / 2 + 1);
		}

		System.out.println(answer);

	}

	public void method03() {
//		약수의 개수와 덧셈
//		제출 내역
//		문제 설명
//		두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		1 ≤ left ≤ right ≤ 1,000
//		입출력 예
//		left	right	result
//		13	17	43
//		24	27	52
//		입출력 예 설명
//		입출력 예 #1
//
//		다음 표는 13부터 17까지의 수들의 약수를 모두 나타낸 것입니다.
//		수	약수	약수의 개수
//		13	1, 13	2
//		14	1, 2, 7, 14	4
//		15	1, 3, 5, 15	4
//		16	1, 2, 4, 8, 16	5
//		17	1, 17	2
//		따라서, 13 + 14 + 15 - 16 + 17 = 43을 return 해야 합니다.
//		입출력 예 #2
//
//		다음 표는 24부터 27까지의 수들의 약수를 모두 나타낸 것입니다.
//		수	약수	약수의 개수
//		24	1, 2, 3, 4, 6, 8, 12, 24	8
//		25	1, 5, 25	3
//		26	1, 2, 13, 26	4
//		27	1, 3, 9, 27	4
//		따라서, 24 - 25 + 26 + 27 = 52를 return 해야 합니다.

		System.out.println("left정수를 입력하세요 : ");

		int left = sc.nextInt();

		System.out.println("right정수를 입력하세요 : ");
		int right = sc.nextInt();

		int answer = 0;

		for (int i = left; i <= right; i++) {

			if (Math.sqrt(i) == (int) Math.sqrt(i)) {
				answer -= i;
			} else {
				answer += i;
			}
		}

		System.out.println(answer);

	}

	public void method04() {

//		문자열 내림차순으로 배치하기
//		제출 내역
//		문제 설명
//		문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
//		s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
//
//		제한 사항
//		str은 길이 1 이상인 문자열입니다.
//		입출력 예
//		s	return
//		"Zbcdefg"	"gfedcbZ

		System.out.println("문자열을 입력하세요 : ");
		String s = sc.nextLine();

		// 문자열을 문자 배열로 변환
		Character[] chars = new Character[s.length()];
		for (int i = 0; i < s.length(); i++) {
			chars[i] = s.charAt(i);
		}

		// 배열을 내림차순으로 정렬
		Arrays.sort(chars, Collections.reverseOrder());

		// 정렬된 배열을 문자열로 결합
		StringBuilder sb = new StringBuilder(chars.length);
		for (Character c : chars) {
			sb.append(c);
		}

		System.out.println(sb);

	}

	public void method05() {
//		부족한 금액 계산하기
//		제출 내역
//		문제 설명
//		새로 생긴 놀이기구는 인기가 매우 많아 줄이 끊이질 않습니다. 이 놀이기구의 원래 이용료는 price원 인데, 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기로 하였습니다.
//		즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상됩니다.
//		놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return 하도록 solution 함수를 완성하세요.
//		단, 금액이 부족하지 않으면 0을 return 하세요.
//
//		제한사항
//		놀이기구의 이용료 price : 1 ≤ price ≤ 2,500, price는 자연수
//		처음 가지고 있던 금액 money : 1 ≤ money ≤ 1,000,000,000, money는 자연수
//		놀이기구의 이용 횟수 count : 1 ≤ count ≤ 2,500, count는 자연수
//		입출력 예
//		price	money	count	result
//		3	20	4	10
//		입출력 예 설명
//		입출력 예 #1
//		이용금액이 3인 놀이기구를 4번 타고 싶은 고객이 현재 가진 금액이 20이라면, 총 필요한 놀이기구의 이용 금액은 30 (= 3+6+9+12) 이 되어 10만큼 부족하므로 10을 return 합니다.
//
//		참고 사항
//		미션 언어는 Java, JavaScript, Python3, C++ 만 해당 됩니다.
//		같은 코드를 제출한 사람이 여럿이라면 코드를 가장 먼저 제출한 분께 상품을 드립니다.
//		좋아요 수가 동일할 경우 코드를 가장 먼저 제출한 분께 상품을 드립니다.

		System.out.println("이용금액을 정해주세요 : ");
		int price = sc.nextInt();

		System.out.println("가지고 있는 돈을 정해주세요 : ");
		int money = sc.nextInt();

		System.out.println("몇번 이용할지 정해주세요 : ");
		int count = sc.nextInt();

		long totalCost = (long) price * count * (1 + count) / 2;
		long shortfall = totalCost - money;

		System.out.println(shortfall > 0 ? shortfall : 0);

	}

	public void method06() {
//		문자열 다루기 기본
//		제출 내역
//		문제 설명
//		문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
//
//		제한 사항
//		s는 길이 1 이상, 길이 8 이하인 문자열입니다.
//		s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.
//		입출력 예
//		s	return
//		"a234"	false
//		"1234"	true	

		System.out.println("문자열을 정해주세요 : ");
		String s = sc.nextLine();

		boolean result = true;

		// 문자열 길이가 4 또는 6인지 확인
		if (s.length() == 4 || s.length() == 6) {
			// 문자열의 모든 문자가 숫자인지 확인
			for (int i = 0; i < s.length(); i++) {
				if (!Character.isDigit(s.charAt(i))) {//문자열확인 메소드이다.
					result = false; // 숫자가 아닌 문자가 있으면 false 반환
				}
			}
			result = true; // 모든 조건을 만족하면 true 반환
		} else {
			result = false; // 길이 조건을 만족하지 않으면 false 반환
		}
		
		System.out.println(result);
	}

}
