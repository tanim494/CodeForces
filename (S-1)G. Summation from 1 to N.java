import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = (n+(long)1);
        long b = n*a;
        long sum = b/(long)2;
        System.out.println(sum);
    }
}
