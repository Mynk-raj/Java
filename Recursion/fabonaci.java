public class fabonaci {

    public static int fabo(int num) {

        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 0; i < num; i++) {

            c += a + b;
            a = b;
            b = c;

        }

        return c;

    }

    public static void main(String[] args) {
        int num = 5;
        fabo(num);
        System.out.println(fabo(num));
    }
}
