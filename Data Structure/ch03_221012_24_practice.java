import java.util.Random;
import java.util.Scanner;

// 단톡방 고건호씨가 올려둔 첫번째 사진 - 연습문제1

public class ch03_221012_24_practice {
    public static int searchIdx1(int[] a, int n, int key, int[] idx){
        int i = 0;
        int cnt = 0;
        
        while (true) {
            if(i == n) {
                break;
            }
            if (a[i] == key) {
                idx[cnt] = i;
                cnt++;
                continue;
            }
            i++;
        }
        return cnt;
    }

    // 교수님 방식
    // public static int searchIdx(int[] a, int n, int key, int[] idx) {
    //     int cnt = 0;
    // }

    public static void main(String[] args) {
        int num = 100;
        int[] array = new int[num + 1];
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            array[i] = random.nextInt(101);
            System.out.print("a [" + i + "] = " + array[i]);
            if ((i + 1) % 10 == 0) {
                System.out.println();
            } else {
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] idx = new int[num];

        Scanner sc = new Scanner(System.in);
        System.out.println("검색값 : ");
        int keyNum = sc.nextInt();

        int resultCnt = searchIdx1(array, 10, keyNum, idx);
        System.out.println("검색 개수는 " + resultCnt + "개입니다.");

        if(resultCnt == 0) {
            System.out.println("해당 요소는 존재하지 않습니다.");
        } else {
            for(int i = 0; i < resultCnt; i++) {
                System.out.println("그 값은 x[" + );
            }
        }
        sc.close();
    }
}
