import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern_Syntax_Checker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        boolean st = false;
        while(testCases>0){
            String pattern = in.nextLine();
            //Write your code
            if (pattern != null && !pattern.equals("")){
                try {
                Pattern pattern1 = Pattern.compile(pattern);
                    System.out.println("valid");
            } catch (Exception e){;
                    System.out.println("invalid");
            }
            }
//            try {
//                Pattern pattern1 = Pattern.compile(pattern);
//            } catch (Exception e){
//                st = true;
//            }
//            if (st == false){
//                System.out.println("Valid");
//            } else {
//                System.out.println("Invalid");
//                st = false;
//            }
        }

    }
}
