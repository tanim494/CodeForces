import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = 0;
        int a, b;
        a = x % 10;
        b = y % 10;
        sum = a + b;
        System.out.println(sum);
    }
}
