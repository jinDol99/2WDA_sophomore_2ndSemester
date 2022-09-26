import javax.swing.ImageIcon;

public class ch02_220921_arrayMaxnum {
    public static void main(String[] args) {
        
        
        int[] arr = {22, 57, 11, 91, 32};

        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max)
                max= arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr의 " + i + "번째 값: " + arr[i]);
        }

        System.out.println("최대값: " + max);
    }
}
