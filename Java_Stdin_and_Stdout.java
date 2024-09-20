import java.util.*;

public class Java_Stdin_and_Stdout  {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Num1=0,Num2=0,Num3=0;
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                Num1 = scan.nextInt();
            } else if (i == 1  ) {
                Num2 = scan.nextInt();
            } else{
                Num3 = scan.nextInt();
            }
        }
        System.out.println(Num1);
        System.out.println(Num2);
        System.out.println(Num3);
        scan.close();

    }
}
