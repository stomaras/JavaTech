import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegexTestHarness {

    public static void main(String[] args) {
	// write your code here
        // The application loops repeatedly, prompting the user for a regular expression and input string. Using this test harness is optional.
        // But you may find it convenient for exploring the test cases discussed in the following pages.
        Console console = System.console();
        if(console == null){
            System.err.println("No console.");
            System.exit(1);
        }
        while (true){
            Pattern pattern = Pattern.compile(console.readLine("%nEnter your regex: "));
            Matcher matcher = pattern.matcher(console.readLine("Enter input string to search: "));

            boolean found = false;
            while (matcher.find()){
                console.format("I found the text" +
                                " \"%s\" starting at " +
                                "index %d and ending at index %d.%n",
                        matcher.group(),
                        matcher.start(),
                        matcher.end());
                found = true;
            }
            if (!found){
                console.format("No match found.%n");
            }
        }
    }
}
