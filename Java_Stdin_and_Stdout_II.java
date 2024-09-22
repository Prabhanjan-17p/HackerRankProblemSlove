import java.util.Scanner;

public class Java_Stdin_and_Stdout_II {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d  = scan.nextDouble();
        scan.nextLine();
        String name3 = scan.nextLine();

        // Write your code here.
        System.out.println("String: "+name3);
        System.out.println("Double: "+d);
        System.out.println("Int: "+ i);
    }
}

