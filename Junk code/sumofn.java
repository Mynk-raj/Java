public class sumofn {

    public static void main(String[] args) {
        int num = 10;
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        String name = "This is great Mayank";
        String empty = "";

        int data = 0;

        do {

            empty = empty + name.charAt(data);
            for (int i = 0; i < 25; i++) {
                System.out.println(empty);
            }
            data++;
        } while (empty == name);
    }
}