public class quiz01_220831_loopTest {
    public static void quiz01() {
        int sum = 0;

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 10; j++) {
                sum = sum + 1;
            }
        }
        System.out.println(sum);
        return;
    }

    public static void quiz02() {
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    sum = sum +1;
                }
            }
        }
        System.out.println(sum);
        return;
    }

    public static void quiz03() {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; j < 3; j++) {
                    sum = sum + 1;
                    // System.out.println(sum + " " + i + " " + j + " " + k);
                }
            }
        }
      System.out.println(sum);
      return;
    }
    /*
    for문의 작동원리를 컴파일러 입장에서 순서대로 나열하면,
        1. 초기값을 설정
        2. 조건문을 비교
        3-1. 조건문이 참일 경우
            a. 중괄호 내부의 코드를 실행
            b. 증감식을 실행
            c. 다시 조건문으로 돌아와 참 또는 거짓을 판별
        3-2. 조건문이 거짓일 경우
            a. 증감식을 실행하지 않고 곧바로 반복문을 빠져나옴
        
    여기서 중요한 것은, 3-1. 조건문이 참일 경우 "중괄호 속 반복할 코드를 먼저 실행한 후, 증감식을 계산"하는 것임.
    즉, 중첩 반복문일 경우에도 내부 반복문이 완전히 종료되기 전 까지는 외부 반복문의 증감식은 건들여지지 않는 것이 중요 포인트!
    참고: https://youngowo.tistory.com/5  
     */

    public static void quiz04() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 15; j++) {
                for (int k = 0; i < 10; i++) {
                sum = sum +1;
                // System.out.println(sum + " " + i + " " + j);
                }
            }
        }
        System.out.println(sum);
        return;
    }

    public static void quiz05() {
        int sum = 0;
        for (int i = 0; i < 30; i++) {
            for(int j = 0; i < 10; i++) {
                sum = sum +1;
            }
        }
        System.out.println(sum);
        return;
    }
    
    public static void quiz06() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                sum = sum + i;
                i = i + 1;
            }
        }
        System.out.println(sum);
        return;
    }

    public static void quiz07() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                sum = sum + j;
                i = i + 1;
            }
        }
        System.out.println(sum);
        return;
    }

    public static void quiz08() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                sum = sum + 2;
            }
        }
        System.out.println(sum);
        return;
    }
    // 중첩 반복문 중 특정 조건에 만족하는 값의 패턴을 알아내는 문제의 경우
    // 열을 j, 행을 i로 지정하여 그려보는 것 처럼 시각적인 것이 도움이 됨.

    public static void quiz09() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (i > 3 && j < 3) {
                sum = sum + i;
                }
            }
        }
        System.out.println(sum);
        return;
    }

    public static void quiz10() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (i < 3 || j > 4) {
                sum = sum + 1;
                }
            }
        }
        System.out.println(sum);
        return;
    }

    public static void quiz11() {
        int sum = 0;
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 10; j++) {
                if (j < 3 && j > i) {
                sum = sum + 1;
                }
            }
        }
        System.out.println(sum);
        return;
    }

    public static void quiz12() {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 100; j++) {
                if (j < i) {
                sum = sum +1;
                }
            }
        }
        System.out.println(sum);
        return;
    }

    public static void quiz13() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 30; j++) {
                if (j > i) {
                sum = sum + 1;
                }
            }
        }
        System.out.println(sum);
        return;
    }

    public static void main(String[] args) {
        quiz01();
        quiz02();
        quiz03();
        quiz04();
        quiz05();
        quiz06();
        quiz07();
        quiz08();
        quiz09();
        quiz10();
        quiz11();
        quiz12();
        quiz13();
    }
}