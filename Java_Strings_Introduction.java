
import java.io.*;
import java.util.*;

public class Java_Strings_Introduction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int lenA= A.length();
        int lenB = B.length();
        System.out.println(lenA+lenB);

        // for 2 ;
        char nA,nB;
        nA = A.charAt(0);
        nB = B.charAt(0);

        if (nA>nB) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // for 3
        char NewA = A.toUpperCase().charAt(0);
        char NewB = B.toUpperCase().charAt(0);
        System.out.print(A.replace(A.charAt(0),NewA));
        System.out.print(" "+B.replace(B.charAt(0), NewB));

    }
}



