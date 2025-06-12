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

        if(num == 0 || num == 1)
             return 1;
        
        return num * fact(num-1);

    }

    public static void main(String[] args) {
        int num = 5;
        print(num);
        System.out.println();
        fact(num);
        System.out.println(fact(num)); 
    }

}
