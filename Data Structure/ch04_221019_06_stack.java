import java.util.Scanner;

class IntStack {
    private int[] stk;
    private int capacity;
    private int ptr;
    // 각각 스택용 배열, 스택의 크기 변수, 스택 포인터 변수를 선언

    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {
            System.out.println("스택이 비어있어 예외가 발생했어요!");
        }
    }
    // 실행 시 예외: 스택이 비어있을 때 발생

    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {
            System.out.println("스택이 꽉 차 예외가 발생했어요!");
        }
    }
    // 실행 시 예외: 스택이 가득 찼을 때

    public IntStack(int maxlen) {
        ptr = 0;
        capacity = maxlen;
        try {
            stk = new int[capacity];    // 스택 본체용 배열 생성
        } catch (OutOfMemoryError e) {  // 생설할 수 없을 때
            capacity = 0;
        }
    }
    // 생성자(constructor)

    public int push(int x) throws OverflowIntStackException {
        if (ptr >= capacity)
            throw new OverflowIntStackException();
        return stk[ptr++] = x;
    }
    // 스택에 x를 푸시

    public int pop() throws EmptyIntStackException {
        if (ptr <= 0)
            throw new EmptyIntStackException();
        return stk[--ptr];
    }
    // 스택에 데이터를 POP

    public int peek() throws EmptyIntStackException {
        if (ptr <= 0)
            throw new EmptyIntStackException();
        return stk[ptr - 1];
    }
    // 스택에서 데이터를 PEEK(맨 위 데이터를 단순 들여다 봄)

    public void clear() {
        ptr = 0;
    }
    // 스택을 비움

    public int indexOf(int x) {
        for (int i = ptr - 1; i >= 0; i--)
            if (stk[i] == x)
                return i;
        return -1;
    }   
    // 스택에서 x를 찾아 인덱스(없으면 -1)를 반환

    public int getCapacity() {
        return capacity;
    }
    // 스택의 크기 반환

    public int size() {
        return ptr;
    }
    // 스택에 쌓여있는 데이터 갯수를 반환

    public boolean isEmpty() {
        return ptr <= 0;
    }
    // 스택이 비어있는가 확인

    public boolean isFull() {
        return ptr >= capacity;
    }
    // 스택이 가득 찼는가 확인

    public void dump() {
        if(ptr <= 0)
            System.out.println("스택이 비어있습니다.");
        else {
            for (int i = 0; i < ptr; i++)
                System.out.println(stk[i] + "");
            System.out.println();
        }
    }
    // 스택의 모든 데이터를 바닥부터 정상 순서대로 출력
}

public class ch04_221019_06_stack {
    public static void main(String[] args) {
        IntStack stack = new IntStack(10);
        // stack.push(5);
        // stack.push(6);
        // stack.push(7);

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        for (;;) {
            Scanner sc = new Scanner(System.in);
            System.out.println("(1) 푸시    (2) 팝    (3) 피크    (4) 덤프    (0) 종료\n선택하세요:");
            int menu = sc.nextInt();
            // 메뉴 입력받기 - 0. 종료 1. 푸시, 2. 팝, 3. 피크, 4. 덤프

            if(menu == 0) break;
            switch(menu) {
            case 1:
                System.out.print("데이터: ");
                int x = sc.nextInt();
                try {
                    stack.push(x);
                } catch (IntStack.OverflowIntStackException e) {
                    System.out.println("스택이 가득 찼습니다.");
                }
                break;
                // vs code에서 특정 블록 surround with 하여 try catch 만드는 팁
                // https://www.youtube.com/watch?v=QmERsxIMDpc

            case 2:
                try {
                    x = stack.pop();
                    System.out.println("팝한 데이터는 " + x + "입니다.");
                } catch (IntStack.EmptyIntStackException e) {
                    System.out.println("스택이 비어있습니다.");
                }
                break;

            case 3:
                try {
                    x = stack.peek();
                    System.out.println("피크한 데이터는 " + x + "입니다.");
                } catch (IntStack.EmptyIntStackException e) {
                    System.out.println("스택이 비어있습니다.");
                }
                break;
            
            // case 4:
            //     stack.dump();
            //     break;
            }
            sc.close();
        }
    }
}