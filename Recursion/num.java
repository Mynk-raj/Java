// package Recursion;

public class num {

    // Recursion for printing number
    public static void print(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        print(num - 1);
    }

    // Recursion for factorial of a number
    public static int fact(int num) {

        if (num == 0 || num == 1)
            return 1;

        return num * fact(num - 1);

    }

    // Recursion for sum of n number
    public static int sum(int num) {
        if (num == 0) {
            return 0;
        }

        return num + sum(num - 1);
    }

    public static void fabo(int a, int b, int limit) {
        if (a > limit)
            return;

        System.out.print(a + " ");
        fabo(b, a + b, limit);
    }

    public static void main(String[] args) {
        int num = 15;
        print(num);
        System.out.println();
        fact(num);
        // System.out.println(fact(num));

        System.out.println("sum of nth number is : " + sum(num));

        fabo(1, 1, num);
    }

}
