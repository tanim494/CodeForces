import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int le = a.length();
        int up = 0, lo = 0;
        for(int i = 0; i < le; i++) {
            char b = a.charAt(i);
            if (Character.isUpperCase(b)) {
                up++;
            } else {
                lo++;
            }
        }
        if (up > lo) {
            System.out.println(a.toUpperCase());
        } else {
            System.out.println(a.toLowerCase());
        }
    }
}
