import java.util.*;

public class Main {
    public static void main(String[] args) {
        String ar = new Scanner(System.in).next();
        int[] alpha = {2, 5, 8, 11, 14, 18, 21, 25};
        int time = 0, cnt;
        
        for(int i = 0; i < ar.length(); i++) {
            cnt = 2;
            for(int j = 0; j < alpha.length; j++) {
        	if(ar.charAt(i) == '0') {
        	    time += 11;
        	    break;
        	}
        	else if(ar.charAt(i) == '1') {
        	    time += 2;
        	    break;
        	}
        	else if(ar.charAt(i) - 'A' <= alpha[j]) {
        	    time += cnt + 1;
        	    break;
        	}
        	cnt++;
            }
        }
        
        System.out.println(time);
    }
}