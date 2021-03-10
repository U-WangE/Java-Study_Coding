import java.util.*;

public class Main {
    public static void main(String[] args) {
        String arr = new Scanner(System.in).next();
        int cnt = 0;
        
        for(int i = 0; i < arr.length(); i++) {
            if(i != 0 && arr.charAt(i) == '=') {
                if(arr.charAt(i-1) == 'c' || arr.charAt(i-1) == 's') {
                    cnt--;
                } else if(arr.charAt(i-1) == 'z') {
                    if(arr.charAt(i-2) == 'd') {
                        cnt--;
                    }
                    cnt--;
                }
            } else if(i != 0 && arr.charAt(i) == '-') {
                if(arr.charAt(i-1) == 'c' || arr.charAt(i-1) == 'd') {
                    cnt--;
                }
            } else if(i != 0 && arr.charAt(i) == 'j') {
                if(arr.charAt(i-1) == 'l' || arr.charAt(i-1) == 'n') {
                    cnt--;
                }
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}