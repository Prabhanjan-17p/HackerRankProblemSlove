import java.util.*;
import java.io.*;

class Java_Loops_II{
    public static void check(int a , int b, int n){
        int mathpow = (int) Math.pow(2,0);
        int ssNum = a+mathpow*b;
        int MainNum= ssNum;

        for (int i = 0; i < n; i++) {
            System.out.print(MainNum);
            System.out.print(" ");
            int j = i+1;
            int powNum = (int) Math.pow(2,j);
            int MulPow = powNum*b;
            MainNum = MainNum+MulPow;
        }
        System.out.println();
    }
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();


        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            check(a,b,n);
        }

        in.close();
    }
}

