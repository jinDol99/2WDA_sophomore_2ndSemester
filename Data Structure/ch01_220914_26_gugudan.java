public class ch01_220914_26_gugudan {
    public static void main(String[] args) {
        System.out.println("------------구구단 곱셈표-------------");

        for (int k = 0; k < 9; k = k + 3) {
            for (int i = 0; i < 9; i++) {
                for (int j=0; j <3; j++){
                    System.out.print((j+2+k) + " * " + (i+1) + " = " + ((j+2+k) * (i+1)) + "\t");
                }
            System.out.println();
            }
        System.out.println("\n");
        }



        // System.out.println("\n---------------이렇게도 할 수 있다------------\n");

        // for (int i=0; i<9; i++) {
        //     for (int j=0; j<8; j++) {
        //         System.out.printf("\t%2d * %3d = %3d", (j+2), (i+1), ((j+2) * (i+1)));
        //     }
        //     System.out.println();
        // }

    }
}
