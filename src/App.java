import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hi, " + "in this app I solve some code challenges");
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

    public static void PalindromeString() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        System.out.println(str + " is "
                + (isPalindrome(str.toLowerCase()) ? "" : "not ")
                + "a Palindrome String.");
    }

    private static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void AlmostPalindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:" + " ");
        String word = scanner.nextLine();
        if (isAlmostPalindrome(word)) {
            System.out.println("The word is almost a palindrome" + ".");
        } else {
            System.out.println("The word is not almost a palindrome" + ".");
        }
        scanner.close();
    }

    private static boolean isAlmostPalindrome(String word) {
        int length = word.length();
        int changesNeeded = 0;
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                changesNeeded++;
                if (changesNeeded > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void IsAnagram() {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine().toLowerCase();
        String str2 = scanner.nextLine().toLowerCase();
        scanner.close();
        if (str1.length() != str2.length()) {
            System.out.println(str1 + " and " + str2 + " are not the same length.");
            return;
        }
        int[] count = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']--;
            count[str2.charAt(i) - 'a']++;
        }
        boolean isAnagram = true;
        for (int freq : count) {
            if (freq != 0) {
                isAnagram = false;
                break;
            }
        }
        System.out.println(str2 + " is " + (isAnagram ? "" : "not ") + "an anagram of " + str1);
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
            System.out.println(inputStr + " contains invalid parentheses.");
        }
    }

    public static int RomanToInt(String s) {
        int result = 0;
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        for (int i = 0; i < symbols.length; i++) {
            while (s.startsWith(symbols[i])) {
                result += values[i];
                s = s.substring(symbols[i].length());
            }
        }
        return result;
    }

    public static void ReverseBits() {
        int rev = 0;
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();
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
        System.out.print("Enter the size of the array:" + " ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:" + " ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
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
        System.out.print("Enter the size of the array:" + " ");
        int nr = scanner.nextInt();
        int[] digits = new int[nr];
        System.out.println("Enter the elements of the array:" + " ");
        for (int i = 0; i < nr; i++) {
            digits[i] = scanner.nextInt();
        }
        scanner.close();
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
        System.out.println("Enter the number of elements you want displayed:" + " ");
        int count = scanner.nextInt();
        scanner.close();
        fibonacciSequence(count);
    }

    private static void fibonacciSequence(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input must be a positive non-zero value.");
        }

        long[] fibonacci = new long[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        StringBuilder sequence = new StringBuilder();
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            sequence.append(fibonacci[i]).append(" ");
        }

        System.out.println(sequence.toString());
    }

    public static void PascalTriangle() {
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();
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

    public static void BinarySearch() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array:" + " ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:" + " ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the key:" + " ");
        int key = scanner.nextInt();
        scanner.close();
        int index = binarySearch(arr, key);
        if (index != -1) {
            System.out.println("Key found at index " + index);
        } else {
            System.out.println("Key" + key + "not found in the array");
        }
    }

    private static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void HanoiTower() {
        int disknr = readHanoi("Enter the number of disks: ");
        solveHanoiTower(disknr, "A", "B", "C");
    }

    private static int readHanoi(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        int result = scanner.nextInt();
        scanner.close();
        return result;
    }

    private static void solveHanoiTower(int disknr, String start, String mid, String end) {
        if (disknr == 1) {
            System.out.println("Move disk 1 from " + start + " to " + end);
        }
        solveHanoiTower(disknr - 1, start, end, mid);
        System.out.println("Move disk " + disknr + " from " + start + " to " + end);
        solveHanoiTower(disknr - 1, mid, start, end);
    }

    public static void GasStation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the gas array:" + " ");
        int m = scanner.nextInt();
        int[] gas = new int[m];
        System.out.println("Enter the elements of the array:" + " ");
        for (int i = 0; i < m; i++) {
            gas[i] = scanner.nextInt();
        }
        System.out.print("Enter the size of the cost array:" + " ");
        int n = scanner.nextInt();
        int[] cost = new int[n];
        System.out.println("Enter the elements of the array:" + " ");
        for (int i = 0; i < n; i++) {
            cost[i] = scanner.nextInt();
        }
        scanner.close();
        int start = completeCircuit(gas, cost);
        if (start != -1) {
            System.out.println("Starting here: " + start + " we did the circuit");
        } else {
            System.out.println("We couldn't make it" + " ");
        }
    }

    private static int completeCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int start = 0;
        int totalGas = 0;
        int totalCost = 0;
        int tank = 0;
        for (int i = 0; i < n; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            tank += gas[i] - cost[i];
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }
        if (totalGas < totalCost) {
            return -1;
        }
        return start;
    }
}