import java.io.*;

public class Main {
    
    public static int[] array(int t){
        int[] arr = new int[t];
        return arr;
    }
    
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            int t = Integer.parseInt(br.readLine());
            int[] arr;
            arr = array(t);
            
            for (int i = 0; i < t; i++) {
                String[] ab = br.readLine().split(" ");
                arr[i] = Integer.parseInt(ab[0]) + Integer.parseInt(ab[1]);
            }
            br.close();
            
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
            for(int i = 0; i < t; i++)
                bw.write(arr[i] + "\n");
            bw.flush();
            bw.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}