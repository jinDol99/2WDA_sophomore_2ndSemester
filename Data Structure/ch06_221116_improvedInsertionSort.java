class InsertionSort {
    static void insertionSort(int[] a, int n) {
       for (int i = 1; i < n; i++) {
          int k = 0;
          int cnt = 0;
          for (int j = i; j >= 0; j--) {
             if (a[j] > a[i]) {
                k = j;
                cnt++;
             }
             if (a[j] < a[i] && j > 0) {
                k = i;
                if (cnt != 0) {
                   k = j+1;
                }
                break;
             }
          }
          for (int j = i-1; j >= k; j--) {
             swap(a, j , j+1);
          }
          System.out.println("처리 a[" + i + "]=[" + a[k] +"] 삽입될 위치: " + k);
          for (int l = 0; l < n; l++) {
             System.out.printf("%3d", l);
          }
          System.out.println();
          for (int l = 0; l < n; l++) {
             System.out.printf("%3d", a[l]);
          }
          System.out.println();
       }
    }
    
    static void swap(int[] a, int idx1, int idx2) {
       int t = a[idx1];
       a[idx1] = a[idx2];
       a[idx2] = t;
    }
    
    static void print(int[] a, int n) {
       for (int i = 0; i < n; i++) {
          System.out.println("x[" + i + "]=" + a[i]);
       }
    }
 }
 public class ch06_221116_improvedInsertionSort {
    public static void main(String[] args) {
       System.out.println("단순 삽입 정렬");
       int nx = 7;
       int[] x = { 6, 4, 8, 3, 1, 9, 7 };
       
       InsertionSort.print(x, nx);
       InsertionSort.insertionSort(x, nx);
       System.out.println("오름차순으로 정렬했습니다.");
       InsertionSort.print(x, nx);
    }
 }