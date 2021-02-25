import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        String s = new Scanner(System.in).next();
        
        int[] alp = new int[26];
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                alp[s.charAt(i) - 'a']++;
            else
                alp[s.charAt(i) - 'A']++;
        }
        
        int max = 0;
        int index = 0;
        boolean tf = false;
        
        for(int i = 0; i < 26; i++) {
            if(alp[i] > max) {
                max = alp[i];
                index = i;
                tf = false;
            } else if(alp[i] == max)
                tf = true;
        }
        
        if(tf)
            System.out.println("?");
        else
            System.out.format("%c", index +'A');
    }
}