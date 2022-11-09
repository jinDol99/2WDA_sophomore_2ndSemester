class SelectionSort {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
        //System.out.println("작은 값:" + idx2);
    }

    static void selectionSort(int[] a, int n) {
        for(int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (a[j] < a[min]) {
                    System.out.println("min = a[" + j + "]");
                    min = j;
                }
            }
            printArray(a);
            swap(a, i, min);
            
        }
    }

    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i]);
        System.out.println("\n--------\n");
    }

    static void print(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "]=" + a[i] + "  ");
        }
        System.out.println();
    }
}
public class ch06_221109_23_selectionSort {
    public static void main(String[] args) {
        System.out.println("단순 선택 정렬");
        int nx = 7;
        int[] x = { 6, 4, 8, 3, 1, 9, 7 };

        SelectionSort.print(x, nx);
        SelectionSort.selectionSort(x, nx);
        System.out.println("오름차순으로 정렬했습니다.");
        SelectionSort.print(x, nx);
    }
}
