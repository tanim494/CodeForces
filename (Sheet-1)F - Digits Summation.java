import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        int sum = 0;
        int a, b;
        a = x % 10;
        b = y % 10;
        sum = a + b;
        System.out.println(sum);
    }
}
