import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer t;
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++) {
            t = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(t.nextToken());
            int b = Integer.parseInt(t.nextToken());
            int sum = a + b;
            
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}