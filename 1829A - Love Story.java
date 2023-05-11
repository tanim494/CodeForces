import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int mistake = 0;
        for(int i = 0; i < test; i++) {
            mistake = 0;
            String toTest = sc.next();
            if (toTest.charAt(0) != 'c') {
                mistake++;
            }
            if (toTest.charAt(1) != 'o') {
                mistake++;
            }
            if (toTest.charAt(2) != 'd') {
                mistake++;
            }
            if (toTest.charAt(3) != 'e') {
                mistake++;
            }
            if (toTest.charAt(4) != 'f') {
                mistake++;
            }
            if (toTest.charAt(5) != 'o') {
                mistake++;
            }
            if (toTest.charAt(6) != 'r') {
                mistake++;
            }
            if (toTest.charAt(7) != 'c') {
                mistake++;
            }
            if (toTest.charAt(8) != 'e') {
                mistake++;
            }
            if (toTest.charAt(9) != 's') {
                mistake++;
            }
            System.out.println(mistake);
        }
   }
}
