import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long x = (long)(a * b);
        long y = (long)(c * d);
        System.out.printf("Difference = %d",(x-y));
    }
}
