import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("In this app I solve some code challenges");
    }

    public static void FizzBuzz() {
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

    public static void IsPalindrome() {
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

    public static void IsAnagram() {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        if (str1.length() != str2.length()) {
            System.out.println(str1 + "and " + str2 + " are not the same length.");
        }
        String lowerstr1 = str1.toLowerCase();
        String lowerstr2 = str2.toLowerCase();
        char[] a1 = lowerstr1.toCharArray();
        char[] a2 = lowerstr2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if (Arrays.equals(a1, a2)) {
            System.out.println(str2 + " is an anagram of " + str1);
        } else {
            System.out.println(str2 + " is not an anagram of " + str1);
        }
        scanner.close();
    }

    public static void RomanToInt() {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toUpperCase();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        str = str.replace("IV", "IIII");
        str = str.replace("IX", "VIIII");
        str = str.replace("XL", "XXXX");
        str = str.replace("XC", "LXXXX");
        str = str.replace("CD", "CCCC");
        str = str.replace("CM", "DCCCC");
        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            number += (map.get(str.charAt(i)));
        }
        System.out.println("Its int value is: " + number);
        scanner.close();
    }

    public static void ReverseBits() {
        int rev = 0;
        Scanner scanner = new Scanner(System.in);
        int nr = Integer.parseInt(scanner.nextLine());
        while (nr > 0) {
            rev <<= 1;
            if ((int) (nr & 1) == 1) {
                rev ^= 1;
            }
            nr >>= 1;
        }
        System.out.println("Number after reversing bits is: " + rev);
        scanner.close();
    }

    public static void PlusOne() {
        Scanner scanner = new Scanner(System.in);
        int digit1 = Integer.parseInt(scanner.nextLine());
        int digit2 = Integer.parseInt(scanner.nextLine());
        int digit3 = Integer.parseInt(scanner.nextLine());
        int digit4 = Integer.parseInt(scanner.nextLine());
        int [] digits = {digit1, digit2, digit3, digit4};   
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; 
                System.out.println(Arrays.toString(digits));
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        System.out.println(Arrays.toString(newNumber));
        scanner.close();
    }
}
