import java.util.*;

public class Main {
    
    public static int arithmetic(int n) {
        int cnt = 99;
        
        if(n == 1000)
            n -= 1;
        for(int i = 100; i <= n; i++) {
            int a = i % 10;
            int b = (i % 100) / 10;
            int c = i / 100;
        
            if(a - b == b - c)
                cnt++;
        }
        return cnt;
    }
    
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        
        if(n < 100)
            System.out.println(n);
        else
            System.out.println(arithmetic(n));
    }
}