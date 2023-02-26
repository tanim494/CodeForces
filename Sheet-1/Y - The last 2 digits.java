import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int lastTwoDigits = ((a % 100) * (b % 100) % 100 * (c % 100) % 100 * (d % 100)) % 100;
        System.out.printf("%02d",lastTwoDigits);
    }
}
