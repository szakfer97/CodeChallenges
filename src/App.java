public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("In this app I solve some code challenges");
        Fizzbuzz();
    }

    private static void Fizzbuzz() {
        for (int i = 0; i <= 100; i++) {
            String output="";
            if (i % 3 == 0) {
                output += "Fizz";
            }
            if (i % 5 == 0) {
                output += "Buzz";
            }
            if(output == "") {
                output = Integer.toString(i);
            }
            System.out.println(output);
        }
    }
}
