import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int cnt = 0;
        int[] alpha = new int[26];
        
        for(int i = 0; i < n; i++) {
            String st = sc.next();
            
            for(int j = 0; j < st.length(); j++) {
                if(alpha[st.charAt(j) - 'a'] == -1) {
                    alpha[st.charAt(j) - 'a'] = 1;
                } else if(alpha[st.charAt(j) - 'a'] != 1) {
                    if(j == st.length() - 1) {
                        alpha[st.charAt(j) - 'a'] = -1;
                    } else if(st.charAt(j) - 'a' != st.charAt(j + 1) - 'a') {
                        alpha[st.charAt(j) - 'a'] = -1;
                    }
                }
            }
            
            for(int j = 0; j < 26; j++) {
                if(alpha[j] == 1) {
                    cnt--;
                    break;
                }
            }
            
            for(int j = 0; j <26; j++) {
                alpha[j] = 0;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}