// [온라인 퀴즈 - 반복문 기초 테스트2] 의 2중 for문 문제 발췌

public class ch01_220901_01_forLoop01 {
    public static void main(String[] args) {
        int sum = 0;                        // int형 sum 변수를 선언하고 정수 0을 대입
        for (int i = 0; i < 3; i++) {       
            for (int j = 0; j < 3; j++) {
                sum = sum + 1;
            }
            System.out.println(sum);
        }
    }
}

/****** 라인 6 ~ 11 까지의 코드 설명 ******
1. 초기식 int i = 0; 으로 지역변수 i를 0으로 초기화시킴.
2. i < 3; 을 판단하여(현재 i값은 0) 하위 for문을 실행함.
    2-1. 하위 for문 속 초기식 int j = 0; 으로 지역변수 j를 0으로 초기화함.
    2-2. j < 3; 을 판단하여(현재 j값은 0) 반복될 코드( sum = sum + 1; )를 실행함.
    2-3. 반복될 코드가 끝났으므로 증감식인 j++을 실행하여 j를 1로 만듦.
    2-4. 다시 j < 3; 을 판단함.
    2-5. 위와 같이 “판단 - 코드 실행 – 증감” 의 루틴을 j < 3이 거짓이 될 때 까지 반복함.
    2-6. j < 3; 이 거짓이라면 하위 for문을 빠져나옴.
3. System.out.println(sum); 문장을 실행.
4. 상위 증감식인 i++을 실행하여 i를 1로 만듦
5. 다시 i < 3; 을 판단함.
6. 위와 같이 “판단 - 하위 for문 실행- 증감”의 루틴을 i < 3이 거짓이 될 때 까지 반복함.
7. 상위 조건판단식인 i < 3; 를 판단하여 거짓이라면 상위 for문을 빠져나와 전체 코드를 종료함.
********************************************/