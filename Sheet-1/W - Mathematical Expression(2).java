import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String [] digi = x.split(" ");
        int a = Integer.parseInt(digi[0]);
        int b = Integer.parseInt(digi[2]);
        char c = digi[1].charAt(0);
        int d = Integer.parseInt(digi[4]);
        switch (c) {
            case '+' :
                System.out.println((a + b == d) ? "Yes" : a + b);
                break;
            case '-' :
                System.out.println((a - b == d) ? "Yes" : a - b);
                break;
            case '*' :
                System.out.println((a * b == d) ? "Yes" : a * b);
                break;
            case '/' :
                System.out.println((a / b == d) ? "Yes" : a / b);
                break;
        }
    }
}
