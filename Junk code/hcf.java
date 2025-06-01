public class hcf {
    public static void main(String[] args) {
        int a = 16;
        int b = 18;

        while (b % a != 0) {

            int temp = a % b;
            a = b;
            b = temp;
        }

        System.out.println(a);
    }
}