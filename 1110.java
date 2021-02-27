import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int sn = n, cnt = 0;
        
        do{
            int a, b;
            cnt++;
            if(sn < 10) {
                a = 0;
                b = sn;
            } else {
                a = sn/10;
                b = sn%10;
            }
            sn = b * 10 + (a + b) % 10;
        }while(sn != n);
        
        System.out.println(cnt);
    }
}