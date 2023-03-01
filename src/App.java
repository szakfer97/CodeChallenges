import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("In this app I solve some code challenges");
        FizzBuzz();
        IsPalindrome();
        IsAnagram();
        RomanToInt();
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
        String str = scanner.nextLine();
        String reverseStr = "";
        for (int i = (str.length() - 1); i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        } else {
            System.out.println(str + " is not a Palindrome String.");
        }
        scanner.close();
    }

    private static void IsAnagram() {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine().toLowerCase();
        String str2 = scanner.nextLine().toLowerCase();
        if (str1.length() != str2.length()) {
            System.out.println("Make sure strings are same length.");
        }
        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if (Arrays.equals(a1,a2)) {
            System.out.println("It's an anagram.");
        } else {
            System.out.println("Not anagram.");
        }
        scanner.close();
    }

    public static void RomanToInt() {  
        Map<Character, Integer> map=new HashMap<Character, Integer>();  
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toUpperCase();
        map.put('I',1);  
        map.put('V',5);  
        map.put('X',10);  
        map.put('L',50);  
        map.put('C',100);  
        map.put('D',500);  
        map.put('M',1000);    
        str = str.replace("IV","IIII");  
        str = str.replace("IX","VIIII");  
        str = str.replace("XL","XXXX");  
        str = str.replace("XC","LXXXX");  
        str = str.replace("CD","CCCC");  
        str = str.replace("CM","DCCCC");  
        int number = 0;  
        for (int i = 0; i < str.length(); i++)  
        {  
            number = number + (map.get(str.charAt(i)));  
        }  
        System.out.println("Its int value is: " + number);
        scanner.close();
    }  
}
