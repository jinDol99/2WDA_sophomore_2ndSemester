import java.util.Scanner;

public class ch01_220915_28_loopTriangle {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("직각이등변삼각형의 높이: ");
        // int height = sc.nextInt();

        // for (int i = 0; i < height; i++){
        //     System.out.print(i + "   ");
        //     for (int j = 0; j < i + 1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        


        /******** 교수님 방식 *************/
        
        // System.out.println("--------------------");

        // n을 입력받아 n줄의 직각삼각형을 출력
        // n을 입력받음
        // int n;
        // Scanner input = new Scanner(System.in);
        // System.out.println("n을 입력하세요: ");
        // n = input.nextInt();

        // // 직각삼각형을 출력
        // int i, j;
        // for (i = 0; i < n; i++) {
        //     System.out.printf("%3d ", i);
        //     for (j = 0; j < i+1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        


        /*********** 이번에는 역직각삼각형을 한번 더 출력 **********/

        // System.out.println("-------------------------\n높이: ");
        // int height2 = sc.nextInt();

        // for (int i = 0; i < height2; i++){
        //     System.out.print(i + "   ");
        //     for (int j = 0; j < i + 1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for (int i = 0; i < height2; i++){
        //     System.out.print(i + "   ");
        //     for (int j = 0; j < i; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        /*********** 교수님 방식 **************/

        // System.out.println("--------------------");

        // // n을 입력받아 n줄의 직각삼각형을 출력
        // // n을 입력받음
        // int n;
        // Scanner input = new Scanner(System.in);
        // System.out.println("n을 입력하세요: ");
        // n = input.nextInt();

        // // 직각삼각형을 출력
        // int i, j;
        // for (i = 0; i < n; i++) {
        //     System.out.printf("%3d ", i);
        //     for (j = 0; j < i+1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for (i = 0; i < n; i++) {
        //     System.out.printf("%3d ", i);
        //     for (j = 0; j < n-i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        /********** 2개씩 늘리기 *************/

        // System.out.println("--------------------");

        // int n;
        // Scanner input = new Scanner(System.in);
        // System.out.println("n을 입력하세요: ");
        // n = input.nextInt();

        // int i, j;
        // for (i = 0; i < n; i++) {
        //     System.out.printf("%3d ", i);
        //     for (j = 0; j < 2*i+1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for (i = 0; i < n; i++) {
        //     System.out.printf("%3d ", i);
        //     for (j = 0; j < n-i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        /************* 위 삼각형이 상하반전된 삼각형 ****************/

        // System.out.println("--------------------");

        // int n;
        // Scanner input = new Scanner(System.in);
        // System.out.println("n을 입력하세요: ");
        // n = input.nextInt();

        // int i, j;
        // for (i = 0; i < n; i++) {
        //     System.out.printf("%3d ", i);
        //     for (j = 0; j < 2*i+1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // System.out.println();
        // for (i = 0; i < n; i++) {
        //     System.out.printf("%3d ", i);
        //     for (j = 0; j < 2*(n-i)-1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        /***** 정삼각형 만들기 *********/

        System.out.println("--------------------");

        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("n을 입력하세요: ");
        n = input.nextInt();
        
        int i, j;
        for (i = 0; i < n; i++) {
            System.out.printf("%3d ", i);
            for (j = 0; j < n+i; j++) {
                if ()
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
