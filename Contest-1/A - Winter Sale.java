import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float dis =sc.nextFloat();
        float price =sc.nextFloat();
        float mainPrice = price / (1 - dis / 100);

        System.out.println(mainPrice);
   }
}
