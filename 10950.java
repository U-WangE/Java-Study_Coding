import java.util.Scanner;

public class Main {
    
    public static int[] array(int t) {
        int[] arr = new int[t];
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        int[] arr = array(t);
        
        for(int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = a + b;
        }
        
        for(int i = 0; i < t; i++) {
            System.out.format("%d\n", arr[i]);
        }
    }
    
}