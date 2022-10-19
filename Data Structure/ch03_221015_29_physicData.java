import java.util.*;

public class ch03_221015_29_physicData {
    static class HeightOrderComparator implements Comparator<PhyscData> {
        public int compare(PhyscData d1, PhyscData d2) {
            return (d1.height > d2.height) ? 1 :
                (d1.height < d2.height) ? -1 : 0;
            // PhyscData 형식의 객체 2개를 입력받아 객체 속 height 값을 비교.
            // d1이 크다면 1을, d2가 크다면 -1을, 아니면 0을 반환.
            
            // 참고로 저기서 사용한 문법은 if-else 문법의 간소화로,
            // if (조건) {참일때 실행} else {거짓일때 실행}     의 문법을
            // (조건) ? 참일때 반환값 : 거짓일때 반환값;        으로 치환한 것과 같음
        }
    }
    
    static class PhyscData {    // 신체 정보를 저장하는 클래스
        private String name;    // 이름, 키, 시력을 각각 String, int, double 형식으로 속성 지정
        int height;
        double vision;
    
        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
        // 생성자
    
        public String toString() {
            return name + "" + height + "" + vision;
        }
        // 3개의 요소를 합쳐 문자열 형태로 반환
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        PhyscData[] x = {
            new PhyscData("강민하", 162, 0.3),
            new PhyscData("이수현", 168, 0.4),
            new PhyscData("황지안", 169, 0.8),
            new PhyscData("유서범", 171, 1.5),
            new PhyscData("김찬우", 173, 0.7),
            new PhyscData("장경오", 174, 1.2),
            new PhyscData("박준서", 175, 2.0)
            // 신체 데이터를 x배열에 차례대로 저장
            // 이 때 생성된 객체를 변수에 저장하는 것이 아니라 배열에 저장하므로 new 앞에
            // PhysicData pd1 =    를 따로 작성하지 않음.
            // 또한 이진탐색으로 키를 찾기 위해 미리 height 값이 오름차순 정렬된 상태로 저장함 
        };
        System.out.println("키가 몇 cm인 사람을 찾고 있나요?: ");
        int height = stdIn.nextInt();
        
        HeightOrderComparator height_order = new HeightOrderComparator();
        int idx = Arrays.binarySearch(
            x,
            new PhyscData("", height, 0.0),
            height_order
        );
        
        if (idx < 0)
            System.out.println("그 값의 요소가 없습니다.");
        else {
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
            System.out.println("찾은 데이터: " + x[idx]);
        }
        stdIn.close();
    }
}
