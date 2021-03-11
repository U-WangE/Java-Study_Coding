/*(0,0) (1,0) (0,1) (0,2) (1,1) (2,0) (3,0) (2,1) (1,2) (0,3) (0,4)
만약 한쪽이 여이 되면 x+1
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        
        int n = 1;
        while(n*(n+1)/2 < x) {
            n++;
        }
        
        int cnt = x - (n-1)*n/2;
        
        if(n%2 == 0){
            System.out.format("%d/%d", cnt, n - cnt + 1);
        } else {
            System.out.format("%d/%d", n - cnt + 1, cnt);
        }
    }
}