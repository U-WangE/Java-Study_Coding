import java.util.*;

public class Main {
    public static int bee(int n, int x, int cnt) {
	if(n > x) {
	    x = x + 6 * cnt;
	    cnt = bee(n, x, ++cnt);
	}
	return cnt;
    }
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        
        System.out.println(bee(n, 1, 1));
    }
}