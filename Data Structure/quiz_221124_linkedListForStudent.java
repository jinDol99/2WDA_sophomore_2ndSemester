class Student {
    int hakbun;
    String name;
    String mobile;
    
    public Student(int hakbun, String name, String mobile) {
        this.hakbun = hakbun;
        this.name = name;
        this.mobile = mobile;
    }

    public void printStudent() {
        System.out.println(hakbun + "\t" + name + "\t" + mobile);
    }
}

class Node<E> {
    Student data;
    Node<E> next;

    public Node(Student data, Node<E> next) {
        // 생성자
        this.data = data;
        this.next = next;
    }
}

class LinkedList<E> {
    Node<E> head;       // 머리 포인터(머리 노드에 대한 참조)
    Node<E> current;    // 선택 포인터(선택 노드에 대한 참조)

    public LinkedList() {
        head = current = null;
    }

    // head에 노드를 삽입하는 메서드
    public void addFirst(int hakbun, String name, String mobile) {
        Student st = new Student(hakbun, name, mobile);

        // 데이터를 활용해 노드 객체를 생성
        Node<E> ptr = new Node<E>(st, null);
        
        // // 노드 객체의 다음 노드 객체의 위치를 현재 head 값으로 설정
        ptr.next = head;

        // // 새로운 노드를 head로 설정
        head = ptr;

    }

    // 전체 노드를 표시
    public void dump() {
        current = head;
        while( current != null ) {
            current.data.printStudent();
            current = current.next;
        }
    }

    // 노드 검색하는 메서드
    // public E search(E obj, Comparator<? super E> c) {
    //     current = head;
    //     while (current != null) {
    //         if (c.compare(obj, current.data) == 0) {
    //             return current.data;
    //         }
    //         current = current.next;
    //     }
    //     return null;
    // }
    
    // 마지막 위치에 노드를 추가하는 메서드
    // public void addLast(E obj) {
    //     if(head == null) {
    //         addFirst(obj);
    //     } else {
    //         Node<E> ptr = head;
    //         while (ptr.next != null)
    //             ptr = ptr.next;
    //         ptr.next = current = new Node<E>(obj, null);
    //     }
    // }

    // 첫번째 노드를 삭제하는 메서드
    // public void removeFirst() {
    //     if (head != null)
    //         head = current = head.next;
    // }
}

// class StringCompareator implements Comparator<String> {
//     public int compare(String o1, String o2) {
//         int result = o1.compareTo(o2);
//         return result;
//     }
// }

public class quiz_221124_linkedListForStudent {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList();

        linkedList.addFirst(1, "홍길동", "010-1234-5678");
        linkedList.dump();
    }
}
