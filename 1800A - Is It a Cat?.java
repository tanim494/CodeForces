import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int wLen = sc.nextInt();
            sc.nextLine(); // read the newline character
            String word = sc.nextLine().toLowerCase();
            StringBuilder temp = new StringBuilder();
            temp.append(word.charAt(0));
            for (int j = 1; j < wLen; j++) {
                if (word.charAt(j) != word.charAt(j - 1)) {
                    temp.append(word.charAt(j));
                }
            }
            if (temp.toString().equals("meow")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
