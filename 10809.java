import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        char[] c = new char[s.length()];
        int[] arr = new int[26];
        
        for(int i = 0; i < 26; i++)
            arr[i] = -1;
            
        for(int i = 0; i < s.length(); i++)
            if(arr[s.charAt(i) - 'a'] == -1)
            	arr[s.charAt(i) - 'a'] = i;
        
        for(int i = 0; i < 26; i++)
            System.out.print(arr[i] + " ");
    }
}