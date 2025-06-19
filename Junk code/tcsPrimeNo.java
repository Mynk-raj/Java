public class tcsPrimeNo {

    // prime number checker
    public static boolean check(int num) {

        if (num == 0 || num == 1) {
            // System.out.println(num + " is a Prime number.");
            return false;
        } else if (num == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }

        return true;
    }

    // Recursion call
    public static int recursion(int initial, int destiny) {
        if (initial > destiny) {
            System.out.println("Total sum between initial or destiy prime number is : ");
            return 0;
        }

        if (check(initial)) {
            return initial + recursion(initial + 1, destiny);
        } else {
            return recursion(initial + 1, destiny);
        }

        // return 0;
    }

    public static void main(String[] args) {
        // prime(0, 10);
        // int num = 77;

        // System.out.println(check(num));

        // int sum = 0;

        // recursion(0, 10);
        System.out.println(recursion(0, 10));

    }
}
