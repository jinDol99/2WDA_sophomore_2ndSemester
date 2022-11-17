/* class InsertionSort {
    static int searchInsertSection(int[] arr, int n) {
        int x = 0;

        for (int i = (arr.length - 1); i >= 0; i--) {
            if(arr[i] < n) {
                continue;
            } else {
                x = i;
                break;
            }
        }
        return x;
    }
}

// 1,2,3,5,6 | 4
public class ch06_221110_27_insertionSort {
    public static void main(String[] args) {
        InsertionSort IS = new InsertionSort();

        int[] myArr = {1, 3, 4, 5, 6};
        int num1 = 2;
        System.out.println(IS.searchInsertSection(myArr, num1));
    }
}
*/
class InsertionSort {
    static void insertionSort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            int j;
            int tmp = a[i];
            for (j = i; j > 0 && a[j-1] > tmp; j--)
                a[j] = a[j - 1];
            a[j] = tmp;
        }
    }
    static void print(int[] a, int n) {
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a[i] + " ");
        }
        System.out.print("] ");
    }
}
public class ch06_221110_27_insertionSort {
    public static void main(String[] args) {
        System.out.println("단순 삽입 정렬");
        int nx = 7;
        int[] x = { 6, 4, 1, 7, 3, 9, 8 };

        InsertionSort.print(x, nx);

        InsertionSort.insertionSort(x, nx);
        System.out.println("오름차순 정렬하였습니다.");
        InsertionSort.print(x, nx);
    }
}