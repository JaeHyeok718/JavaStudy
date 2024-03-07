package com.java.study.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
				if (!Character.isDigit(s.charAt(i))) {// 문자열확인 메소드이다.
					result = false; // 숫자가 아닌 문자가 있으면 false 반환
				}
			}
			result = true; // 모든 조건을 만족하면 true 반환
		} else {
			result = false; // 길이 조건을 만족하지 않으면 false 반환
		}

		System.out.println(result);
	}

	public void method07() {

//		행렬의 덧셈
//		제출 내역
//		문제 설명
//		행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다. 2개의 행렬 arr1과 arr2를 입력받아,
		// 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
//
//		제한 조건
//		행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
//		입출력 예
//		arr1	arr2	return
//		[[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
//		[[1],[2]]	[[3],[4]]	[[4],[6]]

		int[][] arr1 = { { 1, 2 }, { 2, 3 } };
		int[][] arr2 = { { 3, 4 }, { 5, 6 } };

		int rows = arr1.length;
		int cols = arr1[0].length;

		int[][] answer = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

		System.out.println(Arrays.toString(answer));
	}

	public void method08() {

//		직사각형 별찍기
//		제출 내역
//		문제 설명
//		이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
//		별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
//
//		제한 조건
//		n과 m은 각각 1000 이하인 자연수입니다.
//		예시
//		입력
//
//		5 3
//		출력
//
//		*****
//		*****
//		*****

		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {

			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();// 다음 줄로
		}
	}

	public void method09() {
//		최대공약수와 최소공배수
//		제출 내역
//		문제 설명
//		두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 
//		배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
//
//		제한 사항
//		두 수는 1이상 1000000이하의 자연수입니다.
//		입출력 예
//		n	m	return
//		3	12	[3, 12]
//		2	5	[1, 10]
//		입출력 예 설명
//		입출력 예 #1
//		위의 설명과 같습니다.
//
//		입출력 예 #2
//		자연수 2와 5의 최대공약수는 1, 최소공배수는 10이므로 [1, 10]을 리턴해야 합니다.	
		System.out.println("자연수 1을 입력해주세요 : ");
		int n = sc.nextInt();

		System.out.println("자연수 2를 입력해주세요 : ");
		int m = sc.nextInt();

		// 초기 최대공약수를 1로 설정
		int gcd = 1;
		// 더 작은 수를 찾아 최대공약수 계산을 위한 범위 설정
		int smaller = Math.min(n, m);
		for (int i = 1; i <= smaller; i++) {
			// 두 수 모두를 나눌 수 있는 수를 찾으면 그 수가 최대공약수
			if (n % i == 0 && m % i == 0) {
				gcd = i;
			}
		}
		// 최소공배수 계산: 두 수의 곱 / 최대공약수
		int lcm = (n * m) / gcd;
		// 결과 배열 생성 및 반환
		int[] answer = { gcd, lcm };
		System.out.println(Arrays.toString(answer));
	}

	public void method10() {

//		같은 숫자는 싫어
//		제출 내역
//		문제 설명
//		배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
//		이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,
//
//		arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
//		arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
//		배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
//
//		제한사항
//		배열 arr의 크기 : 1,000,000 이하의 자연수
//		배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
//		입출력 예
//		arr	answer
//		[1,1,3,3,0,1,1]	[1,3,0,1]
//		[4,4,4,3,3]	[4,3]
//		입출력 예 설명
//		입출력 예 #1,2
//		문제의 예시와 같습니다.
		
		int [] arr = {1,1,3,3,0,1,1};
	      List<Integer> list = new ArrayList<>();
	        // 비교할 이전 요소가 없기 때문에 첫 번째 요소를 리스트에 추가
	        list.add(arr[0]);
	        // 배열의 두 번째 요소부터 시작
	        for (int i = 1; i < arr.length; i++) {
	            // 현재 요소가 마지막으로 추가된 요소와 다른지 확인
	            if (arr[i] != arr[i - 1]) {
	                list.add(arr[i]);
	            }
	        }
	        // 리스트를 배열로 변환
	        int[] answer = new int[list.size()];
	        for (int i = 0; i < list.size(); i++) {
	            answer[i] = list.get(i);
	        }
	        
		System.out.println(Arrays.toString(answer));
		
	}
}
