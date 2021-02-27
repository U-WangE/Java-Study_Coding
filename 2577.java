import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int avg = sc.nextInt() * sc.nextInt() * sc.nextInt();
        int[] arr = {0,0,0,0,0,0,0,0,0,0};
        
        if(avg == 0)
            arr[0] = 1;
        else {
            while(avg != 0) {
                arr[avg % 10]++;
                avg /= 10;
            }
        }
        for(int i = 0; i < 10; i++)
            System.out.println(arr[i]);
    }
}