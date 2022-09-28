public class ch02_220928_28_primeNum {
    private static void primeNum01() {
        int n, i, j;
        int count = 0;
        boolean isPrime;

        for (i = 0; i < 999; i++) {
            n = i + 2;
            isPrime = true;
            for (j = 0; j < (n-2); j++) {
                count++;
                if(n % (j+2) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                System.out.print(n + ", ");
            }
        }
        System.out.println("\n나눗셈 횟수: " + count);
    }


    private static void method03() {
        int n, i, j;
        int count = 0;
        boolean isPrime;
        int[] prime = new int [500];    // 소수를 저장할 배열
    int ptr = 0;                        // 저장된 소수의 개수

        prime[ptr++] = 2;

        for (i = 3; i < 1000; i += 2) {
            isPrime = true;
            for(j = 0; j < ptr; j++) {
                count++;
                if (i % prime[j] == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                prime[ptr++] = i;
            }
        }
        for (i = 0; i < ptr; i++) {
            System.out.print(prime[i] + ", ");
        }
        System.out.println("\n나눗셈 횟수: " + count);
    }
    public static void main(String[] args) {
        primeNum01();
    }
}
