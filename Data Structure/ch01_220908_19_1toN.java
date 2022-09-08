import java.util.Scanner;

public class ch01_220908_19_1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다");
        
        do {
            System.out.print("n값: ");
            n = sc.nextInt();
        } while (n <= 0);

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i;
            if (i == n) {
                System.out.print(i + " = ");
            } else if (i == 0) {
                continue;
            } else {
                System.out.print(i + " + ");
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
