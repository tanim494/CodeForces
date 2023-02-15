import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = x + y;
        long product = (long) x * (long) y;
        int difference = x - y;
        System.out.printf("%d + %d = %d\n", x, y, sum);
        System.out.printf("%d * %d = %d\n", x, y, product);
        System.out.printf("%d - %d = %d\n", x, y, difference);    
        }
}
