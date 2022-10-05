// 우선 클래스 선언 전 이 부분부터 만들어보자.

public class ch02_221005_41_classTest {
    public static void main(String[] args) {
        PhyscData[] x = {
        // 이 부분을 처리하기 위해서는 새로운 클래스를 만들면 해결됨.
            new PhyscData("강민하", 162, 0.3),
            new PhyscData("김찬우", 173, 0.7),
            new PhyscData("박준서", 175, 2.0),
            new PhyscData("유서범", 171, 1.5),
            new PhyscData("이수연", 168, 0.4),
            new PhyscData("장경오", 174, 1.2),
            new PhyscData("황지안", 169, 0.8),
            new PhyscData("박진석", 170, 0.7),
            // 이 부분을 처리하기 위해서는 새로운 생성자를 만들면 해결됨.
        };
        // 인스턴스를 배열 형태로 생성

        // 신체 데이터 출력
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%-6s%3d%5.2f\n", x[i].name, x[i].height, x[i].vision);
        }
        System.out.printf("\n평균키: %5.1fcm\n",avgHeight(x));
    }

    private static double avgHeight(PhyscData[] dat) {
        double sum = 0;
        for (int i = 0; i < dat.length; i++) {
            sum += dat[i].height;
        }
        return (sum/dat.length);
    }
}
