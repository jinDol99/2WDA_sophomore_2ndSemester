import java.util.Scanner;

public class ch01_220908_01_SumFor2 {
// ch01...SumFor2 이름의 클래스를 정의
    public static void main(String[] args) {
    // public: 접근지정자. 파일의 어느 곳에서나 접근이 가능하도록 지정
    // static: 입력 타입. 이 클래스의 모든 객체는 이 변수를 공유할 수 있는 "정적" 메소드를 의미, 이는 메소드나 변수에도 지정할 수 있음.
    //      static 키워드가 정의된 메소드는 객체 생성 없이 호출할 수 있음. 예) Math.random();
    // void: 반환(출력) 타입. 반환값이 없다는 의미
    // main: 메인 메소드. 자바에서 가장 맨 처음 실행되는 메소드
    // String[]: 자료형으로 String 객체를 여러 개를 저장할 수 있는 배열을 사용한다는 의미
    // args: args 라는 단순 이름으로, arguments의 약자
        Scanner stdIn = new Scanner(System.in);
        // stdIn 이름의 새로운 스캐너 객체를 생성

        int n;

        System.out.println("1부터 n까지의 합을 구합니다");
        // System 클래스 속 out 객체의 println 메소드를 실행

        do {
            System.out.print("n값: ");
            n = stdIn.nextInt();
        } while (n <= 0);

        int sum = 0;

        for (int i = 1; i <= n; i++)
            sum += i;

        System.out.println("1부터 " + n + "까지의 합은 "  +  sum  + "입니다.");
        stdIn.close();
    }
}
