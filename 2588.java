import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int result = b;
        for(int i = 0; i < 3; i++) {
            System.out.println(a*(result % 10));
            result /= 10;
        }
        System.out.println(a*b);
    }
}