class BubbleSort {
    boolean isSwapped;
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] a, int n) {
        for (int i = 0; i < n-1; i++)
            for (int j = n-1; j > i; j--)
                if (a[j-1] > a[j])
                    swap(a, j-1, j);
    }

    static void print(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "]=" + a[i] + "  ");
        }
        System.out.println();
    }
}

public class ch06_221109_10_bubbleSort {
    public static void main(String[] args) {
        System.out.println("버블 정렬(버전 1)");
        int nx = 8;
        int[] x = {7,6,4,3,7,1,9,8};

        BubbleSort.print(x, nx);

        BubbleSort.bubbleSort(x, nx);
        System.out.println("오름차순으로 정렬했습니다.");
        BubbleSort.print(x, nx);       
    }
    
}
