// package Recursion;

public class num {

    // Recursion for printing number 
    public static void print(int num){
        if(num == 0){
            return;
        }
        System.out.println(num);
        print(num-1);
    }

    // Recursion for factorial of a number 
    public static int fact(int num){
        
    

        return fact(num -1);

    }

    public static void main(String[] args) {
        int num = 10;
        print(num); 
        fact(num);
    }
}
