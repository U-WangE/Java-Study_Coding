import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        int max = -1000001, min = 1000001;
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println(min + " " + max);
    }
}