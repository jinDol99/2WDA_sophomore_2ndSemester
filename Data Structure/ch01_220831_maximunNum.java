// [1장 - 3슬라이드] 세 값의 최댓값 구하기

import java.util.*;

public class ch01_220831_maximunNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int mid = sc.nextInt();
        int min = sc.nextInt();
        int temp;

        if (max < mid) {
            temp = mid;
            mid = max;
            max = temp;
        }

        if (mid < min) {
            temp = min;
            min = mid;
            mid = temp;
        }

        if (max < min) {
            temp = min;
            min = max;
            max = temp;
        }

        System.out.println("최대값: " + max);
        sc.close();

        /////////// ▼▼▼ 모범답안 ▼▼▼ ////////////////// 코드 하나하나의 뜻을 araboza.
        
        Scanner stdIn = new Scanner(System.in);     // Scanner stdIn - stdIn이라는 이름의 변수를 만들고, 해당 변수의 타입을 Scanner 타입으로 지정함
                                                    // = new Scanner - Scanner 형태의 객체를 생성(new)하여 이를 stdIn 변수에 선언(=)함 
                                                    // 여기서 stdln의 의미는 STanDard INput의 약자로, "표준 입력"의 의미를 갖고 있음.
                                                    // (System.in) - java.lang에 있는 System 클래스 속, 입력된 스트림을 읽는 기능을 가진 in을 내포함.

        System.out.println("\nA의 값: ");
        max = stdIn.nextInt();                      // 정수형 변수 max에 stdIn 객체 속 nextInt() 메소드를 실행하는 의미
                                                    // nextInt()는 키보드로부터 입력받은 다음 토큰을 정수 형식으로 인식하여 스캔하는 메소드임.

        System.out.println("B의 값: ");
        mid = stdIn.nextInt();

        System.out.println("C의 값: ");
        min = stdIn.nextInt();

        if (max < mid)
            max = mid;
        
        if (max < min)
            max = min;

        System.out.println("최대값: " + max);
        stdIn.close();
    }
}