import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String[] str = x.split(" ", 0);
        char f = str[1].charAt(0);
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[2]);
        if (f == '>') {
            if (a > b) {
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        }
        if (f == '<') {
            if (a < b) {
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        }
        if (f == '=') {
            if (a == b) {
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        }
    }
}
