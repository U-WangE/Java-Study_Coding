import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] m = new int[n];
        int[][] score = new int[n][1001];
        double[] per = new double[n];
        
        for(int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
            int avg = 0;
            for(int j = 0; j < m[i]; j++) {
                score[i][j] = sc.nextInt();
                avg += score[i][j];
            }
            avg /= m[i];
            for(int j = 0; j < m[i]; j++)
                if (avg < score[i][j])
                    per[i] += 1;
            per[i] = per[i] / m[i] * 100;
        }
        
        for(int i = 0; i < n; i++)
            System.out.format("%.3f%%\n", per[i]);
    }
}