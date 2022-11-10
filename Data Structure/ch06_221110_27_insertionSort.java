class InsertionSort {
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
