import java.util.Scanner;
import java.util.HashSet;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int len = a.length();
        HashSet letters = new HashSet<>();
        for(int i = 0; i < len; i++) {
            letters.add(a.charAt(i));
        }
        if(letters.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
   }
}
