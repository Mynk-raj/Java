// package Quality code;

public class numSwaping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // First method : using addition or substraction
        a = a + b; // a = 30;
        b = a - b; // b = 10;
        a = a - b; // a = 20;

        System.out.println("a : " + a);
        System.out.println("b : " + b);

        System.out.println();
        
        // Second method : using xor operator ^
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}
