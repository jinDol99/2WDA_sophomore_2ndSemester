public class ch01_220921_starPrint {
    public static void main(String[] args) {
        // int starHeight = 3;
        // int k = (starHeight - 1);

        // for (int i = 0; i < starHeight; i++){
        //     for (int j = 0; j < (starHeight*2)-1; j++){
        //         if(j <= k) {
        //             System.out.print(".");
        //         } else {
        //             System.out.print("*");
        //         }
        //         k--;  
        //     }
        //     System.out.println();
        // }

        // System.out.println("----- 교수님 방법 ------");

        // System.out.println("정삼각형\n");
        // for (int i = 0; i < n; i++) {
        //     System.out.printf("%3d ", i);
        //     for(j=0; j<(n-1))
        // }


        //System.out.println("----- 마름모 만들기 -----");
        // ...

        System.out.println("-----교수님 방법 -----");
        int n=5;
        int i;
        int j;

        for(i=0; i<n; i++) {
            System.out.printf("%3d ", i);
            for(j=0; j < (n-i); j++) {
                System.out.print(" ");
            }
            for(j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for(i=0; i<n-1; i++) {
            System.out.printf("%3d ", i+n);
            for(j=0; j < i+1; j++) {
                System.out.print(" ");
            }
            for(j = 0; j < 2*n-3-(2*i); j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // System.out.println("-----2개의 연속 마름모 만들기-----");
        
        // System.out.println("----- 교수님 방법 -----");
        


    }
}


