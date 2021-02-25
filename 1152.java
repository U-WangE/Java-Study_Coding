import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        int cnt = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ')
                cnt++;
        }
        if(s.charAt(0) == ' ') {
            if(s.charAt(s.length() - 1) == ' ')
                cnt--;
        } else {
            if(s.charAt(s.length() - 1) != ' ')
                cnt++;
        }
        
        if(cnt == 0 && s.length() != 0)
            cnt++;
        
        if(s.length() == 1 && s.charAt(0) == ' ')
            cnt = 0;
        System.out.println(cnt);
    }
}