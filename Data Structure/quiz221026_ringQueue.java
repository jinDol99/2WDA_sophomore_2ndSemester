import java.util.*;

public class quiz221026_ringQueue {
    static class IntArrayQueue {
        private int[] que;      // 큐의 본체
        private int capacity;   // 큐의 용량
        private int num;        // 현재 데이터 개수
        private int front;      // 맨 처음 요소 커서
        private int rear;       // 맨 끝 요소 커서. 즉, 새로운 요소가 들어갈 인덱스 값
        
        //  --- 생성자 --- //
        public IntArrayQueue(int maxlen) {
            num = front = rear = 0;
            capacity = maxlen;
            try {
                que = new int[capacity];
            } catch (OutOfMemoryError e) {              // 생성이 불가능한 에러를 발견할 경우
                capacity = 0;                           // 큐의 용량을 0으로 설정하여 저장공간을 사용 불가능하게 만듦.
            } finally {
                System.out.println("배열의 개수가 " + capacity + "개인 큐 선언 완료");
            }
        }

        public int enque(int x) {
            if (num >= capacity)
                System.out.println("현재 배열이 꽉 찼습니다.");
            else {
                que[rear++] = x;
                num++;
                if(rear == capacity)
                    rear = 0;
            }
            System.out.print(x + " 인큐 ");
            return x;
        }

        public int deque() {
            int x = 0;
            if (num <= 0)
                System.out.println("현재 배열이 비어있습니다.");
            else {
                x = que[front++];
                num--;
            if (front == capacity)
                front = 0;
            }
            System.out.print(x + " 디큐 ");
            return x;
        }

        public int peek() {
            if (num <= 0)
                System.out.println("현재 배열이 비어있습니다.");
            return que[num - 1];
        }

        public int indexOf(int x) {
            for (int i = 0; i < num; i++)
                if (que[i] ==x)
                    return i;
            return -1;
        }

        public void clear() {
            num = 0;
        }

        public int capacity() {
            return capacity;
        }

        public int size() {
            return num;
        }

        public boolean isEmpty() {
            return num <= 0;
        }

        public boolean isFull() {
            return num >= capacity;
        }
        public String getQueueStat() {
            return "( front = " + front + ", rear = " + rear + ", num = " + num + ")";
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("인큐와 디큐를 반복할 횟수: ");
        int loopLimit = sc.nextInt();
        int loopCount = 1;

        IntArrayQueue ringArr = new IntArrayQueue(20);
        sc.close();

        while (true) {
            while(ringArr.isFull() == false) {
                if (loopCount > loopLimit) {
                    break;
                }
                System.out.print("[" + loopCount + "] ");
                ringArr.enque((int) (Math.random() * 100));
                System.out.println(ringArr.getQueueStat());
                if (ringArr.size() == 20) {
                    System.out.println("full 발생");
                }
                loopCount++;
            }
            while(ringArr.isEmpty() == false) {
                if (loopCount > loopLimit) {
                    break;
                }
                System.out.print("[" + loopCount + "] ");
                ringArr.deque();
                System.out.println(ringArr.getQueueStat());
                if (ringArr.size() == 0) {
                    System.out.println("empty 발생");
                }
                loopCount++;
            }
        }  
    }
}