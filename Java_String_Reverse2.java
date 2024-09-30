
import java.io.*;
import java.util.*;

public class Java_String_Reverse2 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char ch;
        String newS ="";
        for (int i = 0; i < A.length(); i++) {
            ch = A.charAt(i);
            newS = ch+newS;
        }
        if (A.equals(newS)){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }

    }
}



