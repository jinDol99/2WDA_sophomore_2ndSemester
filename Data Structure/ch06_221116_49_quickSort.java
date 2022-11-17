class QuickSort {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx1] = t;
    }

    static void quickSort(int[] a, int left, int right) {
        int pl = left;
        int pr = right;
        int x = a[(pl + pr) / 2];

        do {
            while(a[pl] < x)    // 피벗(x)보다 작은값이 발견될 때 까지 pl을 오른쪽으로 이동
            pl++;

            while(a[pr] > x)    // 피벗(x)보다 큰 값이 발견될 때 까지 pr을 왼쪽으로 이동
            pr--;

            if(pl <= pr)        // pl과 pr이 이동하게 되다가 서로 겹치게 된다면 
                swap(a, pl++, pr--);
        } while (pl <= pr);

        if (left < pr)
            quickSort(a, left, pr);
        if (pl < right)
            quickSort(a, pl, right);
    }

    static void print(int[]a, int n) {
        for (int i = 0; i < )
    }
}

public class ch06_221116_49_quickSort {
    
}
