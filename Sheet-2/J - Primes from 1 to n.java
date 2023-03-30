import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 2; i <= x; i++) {
            if (isPrime(i) != -1) {
                System.out.print(isPrime(i) +" ");
            }
        }
    }
    
    public static int isPrime(int x) {
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return -1;
            }
        }
        return x;
    }
}
