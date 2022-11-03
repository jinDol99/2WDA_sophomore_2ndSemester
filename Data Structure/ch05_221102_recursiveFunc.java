class Recur {
    void recur(int n) {
        if (n > 0) {
            recur(n-1);
            System.out.println(n);
            recur(n-2);
        }
    }
}

public class ch05_221102_recursiveFunc {
    public static void main(String[] args) {
        Recur myRecur = new Recur();
        
        int x = 4;
        
        myRecur.recur(x);
    }
}
