import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        char[][] arr = new char[n][80];
        int[] score = new int[n];
        
        for(int i = 0; i < n; i++) {
            String s = sc.next();
            for(int j = 0; j < s.length(); j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        
        for(int i = 0; i < n; i++) {
            int cnt = 0;
            int j = 0;
            while(arr[i][j] != '\0') {
                if(arr[i][j] == 'O') {
                    cnt++;
                    score[i] += cnt;
                } else
                    cnt = 0;
                j++;
            }
        }
        for(int i = 0; i < n; i++)
            System.out.format(score[i] + "\n");
    }
}