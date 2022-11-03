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
            }
        }

        public int enque(int x) {   // 배열의 rear 번째에 값 x를 삽입(인큐)
            if (num >= capacity)    // 이 때, 배열의 크기가 현재 데이터의 개수보다 커진다면, 삽입하지 않음. 
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

        public int deque() {        // 배열의 rear 번째에 있는 값을 제거(디큐)
            int x = 0;
            if (num <= 0)           // 이 때, 배열 속 데이터가 하나도 없다면, 제거하지 않음.
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

        public int size() {         // 현재 배열의 크기를 반환
            return num;
        }

        public boolean isEmpty() {  // 배열의 비어있는 여부를 불린값으로 반환
            return num <= 0;
        }

        public boolean isFull() {   // 배열의 꽉 찬 여부를 불린값으로 반환
            return num >= capacity;
        }
        public String getQueueStat() {  // 배열의 현재 상태를 문자열로 반환
            return "( front = " + front + ", rear = " + rear + ", num = " + num + ")";
        }
    }
    
    public static void main(String[] args) {
        int loopLimit = 100;            // 무한 반복을 막기 위해 반복 횟수와
        int loopCount = 1;              // 반복할 때마다의 count 값을 설정

        IntArrayQueue ringArr = new IntArrayQueue(20);

        while (true) {
            while(ringArr.isFull() == false) {                  // 배열이 꽉 찰때까지 1~100 사이의 난수 인큐 작업 반복
                if (loopCount > loopLimit) {                    // 만약 반복횟수를 넘어가면 반복문 종료
                    break;
                }
                System.out.print("[" + loopCount + "] ");
                ringArr.enque((int) (Math.random() * 100));
                System.out.println(ringArr.getQueueStat());
                if (ringArr.size() == 20) {                     // 배열이 꽉 찼다면 "full 발생" 출력
                    System.out.println("full 발생");
                }
                loopCount++;
            }
            while(ringArr.isEmpty() == false) {                 // 배열이 빌 때 까지 디큐 작업 반복
                if (loopCount > loopLimit) {                    // 만약 반복 횟수를 넘어가면 반복문 종료
                    break;
                }
                System.out.print("[" + loopCount + "] ");
                ringArr.deque();
                System.out.println(ringArr.getQueueStat());
                if (ringArr.size() == 0) {                      // 배열이 비었다면 "empty 발생" 출력
                    System.out.println("empty 발생");
                }
                loopCount++;
            }
        }  
    }
}