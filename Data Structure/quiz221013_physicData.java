import java.util.*;

public class quiz221013_physicData {
    static class nameOrderComparator implements Comparator<PhyscData> {
        public int compare(PhyscData d1, PhyscData d2) {
            return ((d1.name.equals(d2.name)) ? 0 :
                    (d1.name.compareTo(d2.name) > 0) ? 1 : -1);
            // PhyscData 형식의 객체 2개를 입력받아 객체 속 name 유니코드 값 차이를 비교.
            // equals()를 통해 같은 문자가 발견되면 0을 반환.
            // d1과 d2의 name을 compareTo()으로 비교하여 반환값이 양수. 즉, d2.name의 유니코드 값이
            // 작다면 1을 반환하고, 그렇지 않으면(d2.name의 유니코드 값이 크면) -1을 반환.
            
            // 참고로 저기서 사용한 문법은 if-else 문법의 간소화로,
            // if (조건) {참일때 실행} else {거짓일때 실행}     의 문법을
            // (조건) ? 참일때 반환값 : 거짓일때 반환값;        으로 치환한 것과 같음
            

            // if (d1.name.equals(d2.name)) {
            //     System.out.println("비교: 0");
            //     System.out.println(d1.name.compareTo(d2.name));
            //     return 0;                
            // } else if (d1.name.compareTo(d2.name) > 0) {
            //     System.out.println("비교: 1");
            //     System.out.println(d1.name.compareTo(d2.name));
            //     return 1;
            // } else {
            //     System.out.println("비교: -1");
            //     System.out.println(d1.name.compareTo(d2.name));
            //     return -1;
            // }

            // if (d1.name.compareTo(d2.name) > 0) {
            //     System.out.println("비교: -1");
            //     return -1;                
            // } else if (d1.name.compareTo(d2.name) < 0) {
            //     System.out.println("비교: 1");
            //     return 1;
            // } else {
            //     System.out.println("비교: 0");
            //     return 0;
            // }
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
            return name + " " + height + " " + vision;
        }
        // 3개의 요소를 합쳐 문자열 형태로 반환
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        PhyscData[] x = {
            new PhyscData("강신성", 173, 0.7),
            new PhyscData("고건호", 162, 0.3),
            new PhyscData("박준홍", 171, 1.5),
            new PhyscData("유다연", 175, 2.0),          
            new PhyscData("조현주", 168, 0.4),
            new PhyscData("진솔미", 174, 1.2),
            new PhyscData("하영수", 169, 0.8)

            // 신체 데이터를 x배열에 차례대로 저장
            // 이 때 생성된 객체를 변수에 저장하는 것이 아니라 배열에 저장하므로 new 앞에
            // PhysicData pd1 =    를 따로 작성하지 않음.
            // 또한 이진탐색으로 키를 찾기 위해 미리 name의 유니코드 값이 오름차순 정렬된 상태로 저장함 
        };
        System.out.println("이름이 어떤 사람을 찾고 있나요?: ");
        String name = stdIn.next();

        nameOrderComparator name_order = new nameOrderComparator();
        int idx = Arrays.binarySearch( x, new PhyscData(name, 0, 0.0), name_order );
          
        if (idx < 0)
            System.out.println("그 값의 요소가 없습니다.");
        else {
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
            System.out.println("찾은 데이터: " + x[idx]);
        }
        stdIn.close();
    }
}