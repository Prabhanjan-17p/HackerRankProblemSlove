
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tag_Content_Extractor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        // Regular expression to capture valid tag content
        String regex = "<(.+?)>([^<>]+)</\\1>";
        Pattern pattern = Pattern.compile(regex);

        while (n-- > 0) {
            String line = in.nextLine();
            Matcher matcher = pattern.matcher(line);
            boolean found = false;

            // Find all matches for valid tag content
            while (matcher.find()) {
                System.out.println(matcher.group(2));
                found = true;
            }

            // If no valid content found, print "None"
            if (!found) {
                System.out.println("None");
            }
        }
        in.close();
    }
}
