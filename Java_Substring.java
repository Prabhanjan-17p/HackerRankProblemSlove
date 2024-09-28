
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Java_Substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        int SizeArry = S.length();
        String[] arr;
        arr = new String[SizeArry];
        for (int i = 0; i < SizeArry; i++) {
            arr[i] = String.valueOf(S.charAt(i));
        }
        for (int i = start; i < end; i++) {
            System.out.print(arr[i]);
        }
    }
}
