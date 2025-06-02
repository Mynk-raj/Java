public class swap {
    public static void main(String[] args) {
        int a = -10;
        int b = 20;

        System.out.println("value of a : " + a);
        System.out.println("value of b : " + b);

        a = a + b; // a = 30
        b = a - b; // a = 30 b = 10 a = 20
        a = a - b;

        System.out.println("value of update a : " + a);
        System.out.println("value of updated b : " + b);

    }
}
