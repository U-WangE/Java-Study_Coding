import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        int[] arr = new int[t];
        
        for(int i = 0; i < t; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();
            
            if(n <= h) {
                arr[i] = n*100+1;
            } else if(n%h == 0) {
                arr[i] = h*100+n/h;
            } else {
                arr[i] = n%h*100 + n/h + 1;
            }
        }
        for(int i = 0; i < t; i++)
            System.out.println(arr[i]);
    }
}