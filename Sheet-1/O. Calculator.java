import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        if (x.contains("+")) {
            String str [] = x.split("\\+");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            System.out.println(a + b);
        }
        if (x.contains("-")) {
            String str [] = x.split("\\-");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            System.out.println(a - b);
        }
        if (x.contains("*")) {
            String str [] = x.split("\\*");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            System.out.println(a * b);
        }
        if (x.contains("/")) {
            String str [] = x.split("/");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            System.out.println(a / b);
        }
    }
}
