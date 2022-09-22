import java.util.Random;
import java.util.Scanner;

public class ch02_220922_random {
    // public static void maxOf(int[] arr) {
        // int max = arr[0];
        // for (int i = 0; i < arr.length; i++){
        //     if (arr[i] > max)
        //         max= arr[i];
        // }
        // System.out.println(max);
        // // return max;
        // // for (int i = 0; i < arr.length; i++) {
        // //     System.out.println("arr의 " + i + "번째 값: " + arr[i]);
        // // }
        // // System.out.println("최대값: " + max);
    // }
    public static void main(String[] args) {
        /*
        
        int[] randArr = new int[5];
        for (int i = 0; i < randArr.length; i++){
            randArr[i] = (int)(Math.random()*10);
            System.out.println(randArr[i]);
        }

        // ------- 교수님 방식 -------

        int[] a = new int[5];
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt();
        }
        
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + ", ");
        }
        // maxOf(rand);
        // System.out.println("\n최대값은 " + maxOf(rand));
        
        // -------------------------------

        reverse(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println("\na.toString() : " + a.toString());

        */

        // -------- 23슬라이드 - p.68 연습문제 ---------
        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 크기: ");
        int ArrSize = sc.nextInt();
        int[] testArr1 = new int[ArrSize];

        do {
            System.out.println("값 입력:");
            testArr1[ArrSize] = sc.nextInt();
            ArrSize--;
        } while (ArrSize == 0);

        System.out.println(testArr1.toString());
        sc.close();

    
    }
    // 배열의 원소 순서를 역순으로 만드는 메소드
    private static void reverse(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            swap(arr, i, arr.length-i-1);
        }
    }

    // 배열에서 지정한 두 원소의 값을 교환하는 메소드
    private static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
