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
        scanner.close();
        String reverseStr = "";
        for (int i = (str.length() - 1); i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        } else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }

    public static void IsAnagram() {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        scanner.close();
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
    }

    public static void ValidParentheses() {
        Stack<Character> s = new Stack<Character>();
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        scanner.close();
        for (char st : inputStr.toCharArray()) {
            if (st == '(' || st == '{' || st == '[') {
                s.push(st);
            } else {
                if (s.empty()) {
                    System.out.println(inputStr + " contains invalid parentheses.");
                    return;
                } else {
                    char top = (Character) s.peek();
                    if (st == ')' && top == '(' ||
                            st == '}' && top == '{' ||
                            st == ']' && top == '[') {
                        s.pop();
                    } else {
                        System.out.println(inputStr + " contains invalid parentheses.");
                        return;
                    }
                }
            }
        }
        if (s.empty()) {
            System.out.println(inputStr + " contains valid parentheses.");
        } else {
            System.out.println(inputStr +
                    " contains invalid parentheses.");
        }
    }

    public static void RomanToInt() {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toUpperCase();
        scanner.close();
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
    }

    public static void ReverseBits() {
        int rev = 0;
        Scanner scanner = new Scanner(System.in);
        int nr = Integer.parseInt(scanner.nextLine());
        scanner.close();
        while (nr > 0) {
            rev <<= 1;
            if ((int) (nr & 1) == 1) {
                rev ^= 1;
            }
            nr >>= 1;
        }
        System.out.println("Number after reversing bits is: " + rev);
    }

    public static void MissingNumber() {
        Scanner scanner = new Scanner(System.in);
        int element1 = Integer.parseInt(scanner.nextLine());
        int element2 = Integer.parseInt(scanner.nextLine());
        int element3 = Integer.parseInt(scanner.nextLine());
        int element4 = Integer.parseInt(scanner.nextLine());
        int element5 = Integer.parseInt(scanner.nextLine());
        int[] arr = { element1, element2, element3, element4, element5 };
        scanner.close();
        int nr = arr.length + 1;
        int sum = nr * (nr + 1) / 2;
        int restSum = 0;
        for (int i = 0; i < arr.length; i++) {
            restSum += arr[i];
        }
        int missingNr = sum - restSum;
        System.out.println("The missing number from the array is: " + missingNr);
    }

    public static void PlusOne() {
        Scanner scanner = new Scanner(System.in);
        int digit1 = Integer.parseInt(scanner.nextLine());
        int digit2 = Integer.parseInt(scanner.nextLine());
        int digit3 = Integer.parseInt(scanner.nextLine());
        int digit4 = Integer.parseInt(scanner.nextLine());
        scanner.close();
        int[] digits = { digit1, digit2, digit3, digit4 };
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                System.out.println("New array is: " + Arrays.toString(digits));
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        System.out.println("New array is: " + Arrays.toString(newNumber));
    }

    public static void FibonacciSequence() {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        scanner.close();
        int nr1 = 0; 
        int nr2 = 1;
        System.out.println(nr1);
        System.out.println(nr2);
        for (int i = 2; i < count; i++)
        {
            int nr3 = nr1 + nr2;
            System.out.println(nr3);
            nr1 = nr2;
            nr2 = nr3;
        }
    }

    public static void PascalTriangle() {
        Scanner scanner = new Scanner(System.in);
        int nr = Integer.parseInt(scanner.nextLine());
        scanner.close();
        for (int line = 1; line <= nr; line++) {
            for (int j = 0; j <= nr - line; j++) {
                System.out.print("" + " ");
            }
            int cons = 1;
            for (int i = 1; i <= line; i++) {
                System.out.print(cons + " ");
                cons = cons * (line - i) / i;
            }
            System.out.println();
        }
    }
}
