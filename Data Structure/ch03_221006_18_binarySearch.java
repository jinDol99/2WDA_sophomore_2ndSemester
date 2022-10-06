import java.util.Scanner;

/* 
    100개의 랜덤 정수값(0~100)을 가진 배열 생성 후
    배열을 버블정렬을 통해 오름차순으로 정렬한 후
    숫자 n이 들어있는 배열의 인덱스를 검색. 검색 실패시 "실패" 출력
*/ 

class Search {
    int binarySearch(int[] a, int n, int key) {
        int pl, pr, pc;
        pl = 0;
        pr = n-1;

        do {
            pc = (pl + pr) / 2;
            if (a[pc] == key) {
                return pc;
            } else if (a[pc] < key) {
                pl = pc + 1;
            } else {
                pr = pc -1;
            }
        } while (pl <= pr);

        return -1;
    }
}

class Sort {
    // 버블 정렬 (6장 200페이지 참고)
    void bubbleSort(int[] a, int n) {
        int temp = 0;

        for (int i = 0; i < n-1; i++) {
            for (int j = n-1; j > i; j--) {
                if (a[j-1] > a[j]) {
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
    }
}

public class ch03_221006_18_binarySearch {
    public static void main(String[] args) {
        int[] ranNum = new int[100];
        for (int i = 0; i < 100; i++) {
            ranNum[i] = (int) (Math.random() * 100);
            System.out.print(i + "번째 값: \t" + ranNum[i] + "\n");
        }

        Sort mySort = new Sort();
        mySort.bubbleSort(ranNum, 100);

        for (int i = 0; i < 100; i++) {
            System.out.print(i + "번째 정렬된 값: \t" + ranNum[i] + "\n");
        }
        
        System.out.println("\n-----------");
        Scanner sc = new Scanner(System.in);
        System.out.println("랜덤 값이 들어간 배열에서 찾을 값을 입력하세요:");
        int searchFor = sc.nextInt();

        Search ss = new Search();
        int result = ss.binarySearch(ranNum, 100, searchFor);

        if (result < 0 ) 
            System.out.println("배열에 검색하려는 값이 없습니다.");
        else
            System.out.println(result + "번 인덱스에서 값을 찾았습니다.");
            
        sc.close();
        }
}

