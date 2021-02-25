import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        int[] r = new int[t];
        char[][] s = new char[t][];
        String st;
        
        for(int i = 0; i < t; i++) {
            r[i] = sc.nextInt();
            st = sc.next();
            s[i] = new char[st.length()];
            for(int j = 0; j < st.length(); j++)
                s[i][j] = st.charAt(j);
        }
        
        for(int i = 0; i < t; i++) {
            for(int j = 0; j < s[i].length; j++)
                for(int k = 0; k < r[i]; k++)
                    System.out.print(s[i][j]);
            System.out.println("");
        }
    }
}