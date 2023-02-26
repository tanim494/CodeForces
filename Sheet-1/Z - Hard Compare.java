import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        if (b * Math.log(a) > d * Math.log(c)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
