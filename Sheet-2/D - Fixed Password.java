import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int pass = sc.nextInt();
        while (pass != 1999) {
            System.out.println("Wrong");
            pass = sc.nextInt();
            if (pass == 1999){
                System.out.println("Correct");
                return;
            }
        }
   }
}
