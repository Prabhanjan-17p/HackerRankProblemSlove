
import java.io.*;
import java.util.*;

public class Java_String_Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String regex = "[^A-Za-z]+";

        // Check if the string is empty
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        // Split the string on non-alphabetic characters
        String[] tokens = s.split(regex);

        // Output the number of tokens
        System.out.println(tokens.length);

        // Print each token
        for (String token : tokens) {
            System.out.println(token);
        }
        scan.close();
    }
}

