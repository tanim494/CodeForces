import java.util.Scanner;

public class codeforce {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        byte length = sc.nextByte();
        String in = null;

        for(int i = 0; i <= length; i++) {
            in = sc.nextLine();
            int n= in.length();

            if(n> 10) {
                System.out.print(in.charAt(0));
                System.out.print(n -2);
                System.out.println(in.charAt(n-1));
            } else {
                System.out.println(in);

            }
        }
    }
}
