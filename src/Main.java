import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String text = "Regular Expressions or Regex is an API for defining String patterns that can be used for searching, manipulating and editing a text. It is widely used to define a constraint on strings such as a password. Regular Expressions are provided under java.util.regex package.";
        Pattern pattern = Pattern.compile("\\bst.{12}s");//\b(st)(.{3,5})(s)

        Matcher matcher = pattern.matcher(text);// где ищем

        while (matcher.find()) {
            System.out.println(matcher.group());
//найти  abba adca abea
        }


//        String text = "Hello123World456";
//
//        // Compile the pattern
//        Pattern pattern = Pattern.compile("\\d+");//Правило поиска
//
//        // Use matcher to find all occurrences of digits in the text
//        Matcher matcher = pattern.matcher(text);
//
//        while (matcher.find()) {
//            System.out.println("Digit: " + matcher.group());
//
//        }
    }
}