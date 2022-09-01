public class ch01_220901_01_forLoop01 {
    public static void main(String[] args) {
        int sum = 0;                        // int형 sum 변수를 선언하고 정수 0을 대입
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + 1;
            }
            System.out.println(sum);
        }
    }
}
