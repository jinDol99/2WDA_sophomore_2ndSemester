// [1장 - 12슬라이드] 1부터 n까지 정수의 합을 구하는 알고리즘. (단, while 사용)

import java.util.*;

public class ch01_220831_1toN_withWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        while (n > 0) {
            result = result + n;
            n--; 
        }

        System.out.println(result);
        sc.close();

        ////// ▼▼▼ 모범답안 ▼▼▼ //////

        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n값: ");
        n = stdIn.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
        stdIn.close();
    }
}
