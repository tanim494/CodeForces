import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int year = 0, month = 0, day = 0;
        if(x / 365 > 0) {
            year = x / 365;
            x -= year * 365;
        }
        if(x / 30 > 0) {
            month = x / 30;
            x -= month * 30;
        }
        day = x;
        System.out.printf("%d years\n%d months\n%d days", year, month, day);
    }
}
