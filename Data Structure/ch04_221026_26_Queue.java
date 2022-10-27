class IntArrayQueue {
    private int[] que;      // 큐의 본체
    private int capacity;   // 큐의 용량
    private int num;        // 현재 데이터 개수

    //  --- 생성자 --- //
    public IntArrayQueue(int maxlen) {
        num = 0;
        capacity = maxlen;
        try {
            que = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }
}

public class ch04_221026_26_Queue {
    public static void main(String[] args) {
        
    }
}
