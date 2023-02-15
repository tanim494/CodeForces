import java.util.Scanner;
public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        if (Character.isUpperCase(x)) {
            System.out.println("ALPHA\nIS CAPITAL");
        } else if(Character.isLowerCase(x)) {
            System.out.println("ALPHA\nIS SMALL");
        } else if(Character.isDigit(x)) {
            System.out.print("IS DIGIT");
        }
        
    }
}
