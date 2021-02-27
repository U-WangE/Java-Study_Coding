import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] dif = new int[42];
        int cnt = 0;
        
        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            
            if(dif[arr[i]%42] == 0) {
                dif[arr[i]%42]++;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}