
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_Static_Initializer_Block {

    // Write your code here
    static int B =0;
    static int H = 0;
    static boolean flag;
    static{
        Scanner sc = new Scanner(System.in);
        B= sc.nextInt();
        H= sc.nextInt();
        if (B > 0 && H > 0) {
            flag= true;
        }else{
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class

