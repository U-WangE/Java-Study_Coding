public class Main {
    static int[] arr = new int[10001];
    
    public static void d(int n) {
        int sum = n;
        
        while(n != 0) {
            sum += n%10;
            n /= 10;
        }
        if(sum <= 10000) {
            arr[sum]++;
            d(sum);
        } else
            return;
    }
    
    public static void main(String[] args) {
        for(int i = 1; i <= 10000; i++)
            d(i);
        for(int i = 1; i <= 10000; i++)
            if(arr[i] == 0)
                System.out.println(i);
    }
}