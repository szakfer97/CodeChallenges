import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("In this app I solve some code challenges");
        FizzBuzz();
        IsPalindrome();
    }

    private static void FizzBuzz() {
        for (int i = 0; i <= 100; i++) {
            String output = "";
            if (i % 3 == 0) {
                output += "Fizz";
            }
            if (i % 5 == 0) {
                output += "Buzz";
            }
            if (output == "") {
                output = Integer.toString(i);
            }
            System.out.println(output);
        }
    }

    private static void IsPalindrome() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner. nextLine();
        String reverseStr = "";
        int strLength = str.length();
        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        } else {
            System.out.println(str + " is not a Palindrome String.");
        }
        scanner.close();
    }
}
