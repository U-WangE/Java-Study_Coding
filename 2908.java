import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        char answer = 0;

        for(int i = 2; i >= 0; i--) {
            if(a.charAt(i) > b.charAt(i)) {
                answer = 'a';
                break;
            } else if(a.charAt(i) < b.charAt(i)) {
                answer = 'b';
                break;
            }
        }
        
        if(answer == 'a')
            for(int i = 2; i >= 0; i--)
                System.out.print(a.charAt(i));
        else if(answer == 'b')
            for(int i = 2; i >= 0; i--)
                System.out.print(b.charAt(i));
    }
}