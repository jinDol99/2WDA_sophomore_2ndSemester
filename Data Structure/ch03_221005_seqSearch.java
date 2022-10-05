import java.util.Scanner;

/* 
    100개의 랜덤 정수값(0~100)을 가진 배열 생성 후
    5가 들어있는 배열의 인덱스를 검색. 검색 실패시 "실패" 출력
*/ 

class SeqSearch {
    int seqSearch(int[] a, int n, int key) {
        int i = 0;

        while (true) {
            if(i == n)
                return -1;
            if (a[i] == key)
                return i;
        i++;
        }
    }
}

public class ch03_221005_seqSearch {
    public static void main(String[] args) {
        

        int[] ranNum = new int[100];
        for (int i = 0; i < 100; i++) {
            ranNum[i] = (int) (Math.random() * 100);
            System.out.print(i + "번째 값: \t" + ranNum[i] + "\n");
        }

        System.out.println("\n-----------");
        Scanner sc = new Scanner(System.in);
        System.out.println("랜덤 값이 들어간 배열에서 찾을 값을 입력하세요:");
        int searchFor = sc.nextInt();

        SeqSearch ss = new SeqSearch();
        int result = ss.seqSearch(ranNum, 100, searchFor);

        if (result < 0 ) 
            System.out.println("배열에 검색하려는 값이 없습니다.");
        else
            System.out.println(result + "번 인덱스에서 값을 찾았습니다.");
            
        sc.close();
        }
}
