import java.util.Scanner;
public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String x[] = a.split(" ",0);
        String y[] = b.split(" ",0);
        if(x[1].equalsIgnoreCase(y[1])) {
            System.out.println("ARE Brothers");
        } else {
        System.out.println("NOT");
        }
    }
}
