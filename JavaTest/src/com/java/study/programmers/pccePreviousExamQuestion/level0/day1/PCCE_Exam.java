package com.java.study.programmers.pccePreviousExamQuestion.level0.day1;

import java.util.Arrays;
import java.util.Scanner;

public class PCCE_Exam {
    Scanner sc = new Scanner(System.in);


		public void method01() {	
//			주어진 초기 코드는 변수에 데이터를 저장하고 출력하는 코드입니다. 아래와 같이 출력되도록 빈칸을 채워 코드를 완성해 주세요.
//				출력 예시
//				Spring is beginning
//				13
//				310
				
//				빈칸 채우기 문제 안내
//				빈칸 채우기는 이미 완성된 코드 중 빈칸에 알맞은 코드를 입력하는 문제 타입입니다.
//				빈칸을 제외한 기본 코드는 수정할 수 없습니다.
//				빈칸을 채우지 않을 경우, 실행 결과에 에러 메시지가 표시됩니다.
			String msg = "Spring is beginning";
	        int val1 = 3;
	        String val2 = "3";

	        System.out.println(msg);
	        System.out.println(val1 + 10);
	        System.out.println(val2 + "10");
	    }

		public void method02() {
			//https://school.programmers.co.kr/learn/courses/30/lessons/250132
//			직각삼각형이 주어졌을 때 빗변의 제곱은 다른 두 변을 각각 제곱한 것의 합과 같습니다.
//			직각삼각형의 한 변의 길이를 나타내는 정수 a와 빗변의 길이를 나타내는 정수 c가 주어질 때, 다른 한 변의 길이의 제곱, b_square 을 출력하도록 한 줄을 수정해 코드를 완성해 주세요.
//
//			제한사항
//			1 ≤ a < c ≤ 100
//			입출력 예
//			입력 #1
//
//			3
//			5
//			출력 #1
//
//			16
//			입력 #2
//
//			9
//			10
//			출력 #2
//
//			19
//			입출력 예 설명
//			입출력 예 #1
//
//			a2 = 9, c2 = 25 이므로 16을 출력합니다.
//			입출력 예 #2
//
//			a2 = 81, c2 = 100 이므로 19를 출력합니다.
	        int a = sc.nextInt();
	        int c = sc.nextInt();

	        int b_square = (c*c) - (a*a);

	        System.out.println(b_square);
			
			
		}
		public void method03() {
			
			//https://school.programmers.co.kr/learn/courses/30/lessons/250131
			
//			나이를 세는 방법은 여러 가지가 있습니다. 그중 한국식 나이는 태어난 순간 1살이 되며 해가 바뀔 때마다 1살씩 더 먹게 됩니다.
//			연 나이는 태어난 순간 0살이며 해가 바뀔 때마다 1살씩 더 먹게 됩니다. 
//
//			출생 연도를 나타내는 정수 year와 구하려는 나이의 종류를 나타내는 문자열 age_type이 주어질 때 2030년에 몇 살인지 출력하도록 빈칸을 채워 코드를 완성해 주세요.
//			age_type이 "Korea"라면 한국식 나이를, "Year"라면 연 나이를 출력합니다.
//
//			제한사항
//			1950 ≤ year ≤ 2030
//			age_type은 "Korea" 또는 "Year"만 주어집니다.
			
//			입출력 예
			
//			입력 #1
//			2000
//			Korea
			
//			출력 #1
//			31
			
//			입력 #2
//			1999
//			Year
			
//			출력 #2
//			31
			
//			입출력 예 #1
//			2030년에 2000년생의 한국식 나이는 2030 - 2000 + 1 = 31살입니다.
			
//			입출력 예 #2
//			2030년에 1999년생의 연 나이는 2030 - 1999 = 31살입니다.
			int year = sc.nextInt();
	        String age_type = sc.next();
	        int answer = 0;

	        if (age_type.equals("Korea")) {
	            answer = (2030-year)+1;
	        }
	        else if (age_type.equals("Year")) {   
	        	answer = 2030-year;
	        }
	        System.out.println(answer);
			
		}
		
		public void method04() {
			//https://school.programmers.co.kr/learn/courses/30/lessons/250130
			
//			문제 설명
//			진우는 돈을 모으기 위해 저축을 하려고 합니다. 목표로 하는 금액은 100만 원이며, 
//			첫 달에 일정 금액을 넣은 뒤 70만 원까지는 매월 조금씩 저축하다가 70만 원 이후부터는 월 저축량을 늘려 빠르게 목표 금액을 달성하고자 합니다.
//
//			첫 달에 저축하는 금액을 나타내는 정수 start, 
//			두 번째 달 부터 70만 원 이상 모일 때까지 매월 저축하는 금액을 나타내는 정수 before, 
//			100만 원 이상 모일 때 까지 매월 저축하는 금액을 나타내는 정수 after가 주어질 때,
//			100만 원 이상을 모을 때까지 걸리는 개월 수를 출력하도록 빈칸을 채워 코드를 완성해 주세요.
//
//			제한사항
//			0 ≤ start ≤ 99
//			1 ≤ before ≤ after ≤ 25

//			입출력 예
//			입력 #1
//			28
//			6
//			8
			
//			출력 #1
//			12
			
//			입력 #2
//			75
//			8
//			25
			
//			출력 #2
//			2
			
//			입출력 예 설명
//			입출력 예 #1
//			매월 저축된 금액은 아래 표와 같습니다. 따라서 12를 출력합니다.
//			1	2	3	4	5	6	7	8	9	10	11	12
//			28	34	40	46	52	58	64	70	78	86	94	102
			
//			입출력 예 #2
//			첫 달 저축된 금액이 70이 넘으므로 두 번째 달부터 바로 after= 25 만큼 저축합니다. 따라서 2를 출력합니다.
//			1	2
//			75	100
				int start = sc.nextInt();
		        int before = sc.nextInt();
		        int after = sc.nextInt();

		        int money = start;
		        int month = 1;
		        while (money < 70) {
		            money += before;
		            month++;
		        }
		        while (money< 100) {
		            money += after;
		            month++;
		        }

		        System.out.println(month);
				}
		
		public void method05() {
			//https://school.programmers.co.kr/learn/courses/30/lessons/250129
//			[PCCE 기출문제] 5번 / 산책
//			문제 설명
//			여름이는 강아지를 산책시키려고 합니다. 여름이는 2차원 좌표평면에서 동/서/남/북 방향으로 1m 단위로 이동하면서 강아지를 산책시킵니다. 
//			산책루트가 담긴 문자열 route가 주어질 때, 도착점의 위치를 return하도록 빈칸을 채워 solution함수를 완성해 주세요.
//
//			route는 "N", "S", "E", "W"로 이루어져 있습니다.
//			"N"은 북쪽으로 1만큼 움직입니다.
//			"S"는 남쪽으로 1만큼 움직입니다.
//			북쪽으로 -1만큼 움직인 것과 같습니다.
//			"E"는 동쪽으로 1만큼 움직입니다.
//			"W"는 서쪽으로 1만큼 움직입니다.
//			동쪽으로 -1만큼 움직인 것과 같습니다.
//			출발점으로부터 [동쪽으로 떨어진 거리, 북쪽으로 떨어진 거리]형태로 강아지의 최종 위치를 구해서 return해야 합니다.
//			출발점을 기준으로 서쪽, 남쪽에 있는 경우는 동쪽, 북쪽으로 음수만큼 떨어진 것으로 표현합니다.
//			출발점으로부터 동쪽으로 2, 북쪽으로 3만큼 떨어졌다면 [2, 3]을 return 합니다.
//			출발점으로부터 서쪽으로 1, 남쪽으로 4만큼 떨어졌다면 [-1, -4]를 return 합니다.
//			제한사항
//			1 ≤ route의 길이 ≤ 20
//			route는 "N", "S", "E", "W"로만 이루어져 있습니다.
//			입출력 예
//			route	result
//			"NSSNEWWN"	[-1, 1]
//			"EESEEWNWSNWWNS"	[0, 0]
//			입출력 예 설명
//			입출력 예 #1
//
//			"NSSNEWWN" 순서대로 움직이면 서쪽으로 1, 북쪽으로 1만큼 떨어진 곳에 도착하게 되므로 [-1, 1]을 return합니다.
//			입출력 예 #2
//
//			"EESEEWNWSNWWNS" 순서대로 움직이면 출발지와 같은 곳으로 돌아오므로 [0, 0]을 return합니다.
			System.out.println("가고싶은 방향을 써내주세요(N,S,E,W 만 입력가능) : ");
			String route = sc.next();
			    int east = 0;
		        int north = 0;
		        int[] answer = new int [2];
		        for(int i=0; i<route.length(); i++){
		            switch(route.charAt(i)){
		                case 'N':
		                    north++;
		                    break;
		               
		                case 'S':
		                	north--;
		                    break;
		                
		                case 'E':
		                	east++;
		                    break;
		                
		                case 'W':		                    
		                	east--;
		                    break;
		            }
		        }
		        answer[0] = east;
		        answer[1] = north;
			
			System.out.println(Arrays.toString(answer));
		}
		public void method06() {
			//https://school.programmers.co.kr/learn/courses/30/lessons/250128
//			[PCCE 기출문제] 6번 / 가채점
//			문제 설명
//			A반 학생들은 시험이 끝난 뒤 성적이 나오기 전 자기 시험지를 가채점해 보았습니다. 
//			이후에 선생님이 실제 성적을 불러 줄 때 가채점한 점수와 실제 성적이 다른 학생들이 있어 선생님께 문의를 하려고 합니다.
//
//			성적을 문의하려는 학생들의 번호가 담긴 정수 리스트 numbers와 
//			가채점한 점수가 성적을 문의하려는 학생 순서대로 담긴 정수 리스트 our_score, 
//			실제 성적이 번호 순서대로 담긴 정수 리스트 score_list가 주어집니다. 
//			주어진 solution 함수는 가채점한 점수가 실제 성적과 동일하다면 "Same"을, 다르다면 "Different"를 순서대로 리스트에 담아 return하는 함수입니다.
//	
//			제한사항
//			1 ≤ numbers의 길이 = our_score의 길이 ≤ 10
//			1 ≤ numbers의 원소 ≤ 31
//			0 ≤ our_score의 원소 ≤ 100
//			our_score[i]는 numbers[i]번 학생이 가채점한 점수입니다.
//			numbers는 중복된 원소를 가지지 않습니다.
//			2 ≤ score_list의 길이 ≤ 31
//			0 ≤ score_list의 원소 ≤ 100
//			score_list에는 실제 성적이 [1번 학생 성적, 2번 학생 성적, 3번 학생 성적 …] 순서로 들어있습니다.
//			입출력 예
//			numbers	our_score	score_list	result
//			[1]	[100]	[100, 80, 90, 84, 20]	["Same"]
//			[3, 4]	[85, 93]	[85, 92, 38, 93, 48, 85, 92, 56]	["Different", "Same"]
//			입출력 예 설명
//			입출력 예 #1
//
//			1번 학생이 가채점한 성적은 100점으로 실제 성적과 같기 때문에 "Same"을 담아 return합니다.
//			입출력 예 #2
//
//			3번 학생이 가채점한 성적은 85점으로 실제 성적 38점과 다르기 때문에 "Different"를, 4번 학생이 채점한 성적은 93점으로 실제 성적과 같기 때문에 "Same"을 담아 return합니다.
			int[] numbers = {3,4};
			int[] our_score= {85,93};
			int[] score_list = {85,92,38,93,48,85,92,56};
			 int num_student = numbers.length;
		        String[] answer = new String[num_student];

		        for (int i = 0; i < num_student; i++) {
		            if (our_score[i] == score_list[numbers[i]-1]) {
		                answer[i] = "Same";
		            }
		            else {
		                answer[i] = "Different";
		            }
		        }
			
			System.out.println(Arrays.toString(answer));
		}
		
		public void method07() {
//			[PCCE 기출문제] 7번 / 가습기
//			문제 설명
//			상우가 사용하는 가습기에는 "auto", "target", "minimum"의 세 가지 모드가 있습니다. 가습기의 가습량은 0~5단계로 구분되며 각 모드 별 동작 방식은 다음과 같습니다.
//
//			"auto" 모드
//
//			습도가 0 이상 10 미만인 경우 : 5단계
//			습도가 10 이상 20 미만인 경우 : 4단계
//			습도가 20 이상 30 미만인 경우 : 3단계
//			습도가 30 이상 40 미만인 경우 : 2단계
//			습도가 40 이상 50 미만인 경우 : 1단계
//			습도가 50 이상인 경우 : 0단계
			
//			"target" 모드
//
//			습도가 설정값 미만일 경우 : 3단계
//			습도가 설정값 이상일 경우 : 1단계
			
//			"minimum"모드
//
//			습도가 설정값 미만일 경우 : 1단계
//			습도가 설정값 이상일 경우 : 0단계
//			상우가 설정한 가습기의 모드를 나타낸 문자열 mode_type,
//			현재 공기 중 습도를 나타낸 정수 humidity, 
//			설정값을 나타낸 정수 val_set이 주어질 때 현재 가습기가 몇 단계로 작동 중인지 return하도록 빈칸을 채워 solution 함수를 완성해 주세요.
//
//			
//			제한사항
//			mode_type은 "auto", "target", "minimum" 세 가지 중 하나의 값을 갖습니다.
//			0 ≤ humidity, val_set ≤ 100
//			입출력 예
//			mode_type	humidity	val_set  	result
//			"auto"		23			  45	      3
//			"target"	41			  40	      1
//			"minimum"	10			  34	      1
			
//			입출력 예 설명
//			입출력 예 #1
//
//			"auto"모드이므로 습도에 따라 가습량이 조절됩니다. 현재 습도가 20 이상 30 미만이므로 3을 return합니다.
//			입출력 예 #2
//
//			"target"모드이고, 설정값보다 습도가 높으므로 1을 return합니다.
//			입출력 예 #3
//
//			"minimum"모드이고, 설정값보다 습도가 낮으므로 1을 return합니다.
			//String mode_type, int humidity, int val_set
			System.out.println("모드 타입을 선택하세요(auto,target,minimum) : ");
			String mode_type = sc.next();
			System.out.println("가습기 작동 적정 습도를 입력해주세요 : ");
			int humidity = sc.nextInt();
			System.out.println("현재 습도를 입력해주세요 : ");
			int val_set = sc.nextInt();
			 int answer = 0;
			 String result="";
		        if(mode_type.equals("auto")){
		            answer = func2(humidity);
		            if(answer==0) {
		            	result="auto 모드이고, 현재 습도가 50이상이므로 0을 return합니다";
		            }else if(answer==1) {
		            	result="auto 모드이고, 현재습도가 50미만 40이상이므로 1을 return합니다";
		            }else if(answer==2) {
		            	result="auto 모드이고, 현재습도가 40미만 30이상이므로 2을 return합니다";
		            }else if(answer==3) {
		            	result="auto 모드이고, 현재습도가 30미만 20이상이므로 3을 return합니다";
		            }else if(answer==4) {
		            	result="auto 모드이고, 현재습도가 20미만 10이상이므로 4을 return합니다";
		            }else {
		            	result="auto 모드이고, 현재습도가 10미만이므로 5을 return합니다";
		            }
		        }
		        
		        else if(mode_type.equals("target")){
		            answer = func1(humidity,val_set);
		            if(answer==3) {
		            	result="target 모드이고, 설정값보다 습도가 낮으므로 3을 return합니다";
		            }else {
		            	result="target 모드이고, 설정값보다 습도가 높으므로 1을 return합니다";
		            }
		        }
		        
		        else if(mode_type.equals("minimum")){
		            answer = func3(humidity,val_set);
		            if(answer==1) {
		            	result="minimum 모드이고, 설정값보다 습도가 낮으므로 1을 return합니다";
		            }else {
		            	result="minimum 모드이고, 설정값보다 습도가 높으므로 0을 return합니다";
		            }
		        }
		        System.out.println(result);
		    }
		
		public int func1(int humidity, int val_set){//미니멈 모드
	        if(humidity < val_set)
	            return 3;
	        return 1;
	    }
		
	    public int func2(int humidity){//오토모드
	        if(humidity >= 50)
	            return 0;
	        else if (humidity >= 40)
	            return 1;
	        else if (humidity >= 30)
	            return 2;
	        else if (humidity >= 20)
	            return 3;
	        else if (humidity >= 10)
	            return 4;
	        else   
	        	return 5;
	    }

	    public int func3(int humidity, int val_set){//타켓모드
	        if(humidity < val_set)
	            return 1;
	        return 0;
	    }
		
	    
		public void method08() {
//			선빈이는 게임을 즐기던 중 가지고 있는 물건이 너무 많아 창고 정리를 하기로 했습니다.
//			선빈이가 보유한 게임 속 창고는 여러 칸으로 나누어져 있고 각 칸에는 물건들이 담겨있습니다.
//			창고를 정리할 방법을 고민하던 선빈이는 같은 물건이 여러 칸에 나누어 들어있는 것을 발견하고 우선 같은 물건끼리 최대한 겹쳐쌓는 방식으로 창고를 정리하기로 했습니다. 
//			선빈이의 창고에 들어있는 물건의 이름과 개수는 리스트 형태로 주어지며, 한 칸에 겹쳐질 수 있는 물건의 개수에는 제한이 없다고 가정합니다.
//
//			예를 들어 창고의 각 칸에 담겨있는 물건의 이름이storage = ["pencil", "pencil", "pencil", "book"], 
//			각 물건의 개수가 num = [2, 4, 3, 1]이라면 연필과 책을 한 칸에 각각 겹쳐 쌓아 간단하게 clean_storage = ["pencil", "book"], clean_num = [9, 1]로 만들 수 있습니다.
//
//			주어진 solution 함수는 정리되기 전 창고의 물건 이름이 담긴 문자열 리스트 storage와 각 물건의 개수가 담긴 정수 리스트 num이 주어질 때,
//			정리된 창고에서 개수가 가장 많은 물건의 이름을 return 하는 함수입니다. solution 함수가 올바르게 작동하도록 한 줄을 수정해 주세요.
//
//			제한사항
//			1 ≤ storage의 길이 = num의 길이 ≤ 30
//			storage[i]는 영어 대소문자로 이루어져 있습니다.
//			물건은 대소문자를 구분합니다. 즉, "Book"과 "book"은 서로 다른 물건입니다.
//			1 ≤ storage[i]의 길이 ≤ 30
//			1 ≤ num[i] ≤ 20
//			num[i]에는 storage[i]에 해당하는 물건의 개수가 담겨있습니다.
//			가장 개수가 많은 물건이 두 가지 이상인 경우는 없습니다.
//			한 칸에는 한 종류의 물건만 들어갈 수 있습니다.
//			입출력 예
//			storage	num	result
//			["pencil", "pencil", "pencil", "book"]	[2, 4, 3, 1]	"pencil"
//			["doll", "doll", "doll", "doll"]	[1, 1, 1, 1]	"doll"
//			["apple", "steel", "leaf", "apple", "leaf"]	[5, 3, 5, 3, 7]	"leaf"
//			["mirror", "net", "mirror", "net", "bottle"]	[4, 1, 4, 1, 5]	"mirror"
//			입출력 예 설명
//			입출력 예 #1
//
//			본문에 설명된 대로 창고를 정리하면 clean_storage = ["pencil", "book"], clean_num = [9, 1]이 됩니다. 따라서 가장 개수가 많은 물건인 "pencil"을 return합니다.
//			입출력 예 #2
//
//			창고를 정리하면 clean_storage = ["doll"], clean_num = [4]가 됩니다. 따라서 가장 개수가 많은 물건인 "doll"을 return합니다.
//			doll.jpg
//
//			입출력 예 #3
//
//			창고를 정리하면 clean_storage = ["apple", "steel", "leaf"], clean_num = [8, 3, 12]가 됩니다. 따라서 가장 개수가 많은 물건인 "leaf"를 return합니다.
//			apple steel leaf.jpg
//
//			입출력 예 #4
//
//			창고를 정리하면 clean_storage = ["mirror", "net", "bottle"], clean_num = [8, 2, 5]가 됩니다. 따라서 가장 개수가 많은 물건인 "mirror"를 return합니다.

			String[] storage = {"pencil","pencil","pencil","book"};
			int[] num= {2,4,3,1};
			
			   int num_item = 0;
		        String[] clean_storage = new String[storage.length];
		        int[] clean_num = new int[num.length];
		        
		        for(int i=0; i<storage.length; i++){
		            int clean_idx = -1;
		            for(int j=0; j<num_item; j++){
		                if(storage[i].equals(clean_storage[j])){
		                    clean_idx = j;
		                    break;
		                }
		            }
		            if(clean_idx == -1){
		                clean_storage[num_item] = storage[i];
		                clean_num[num_item] = num[i];
		                num_item += 1;
		            }
		            else{
		                clean_num[clean_idx] += num[i];
		            }
		        }
		        
		        // 아래 코드에는 틀린 부분이 없습니다.
		        
		        int num_max = -1;
		        String answer = "";
		        for(int i=0; i<num_item; i++){
		            if(clean_num[i] > num_max){
		                num_max = clean_num[i];
		                answer = clean_storage[i];
		            }
		        }
			System.out.println(answer);
			
			
			
			
		}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
			
}
		

		


	
	
	
	

