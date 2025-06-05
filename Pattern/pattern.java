// package Pattern;
public class pattern {
    public static void main(String[] args) {
        // this for prymid
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // this for right angle triangle
        for (int i = 0; i <= 5; i++) {

            for (int x = i; x <= 5; x++) {
                System.out.print("   ");
            }

            for (int y = 0; y < i; y++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
        System.out.println();

        // Holo square
        for (int i = 0; i <= 5; i++) {
            for (int x = 0; x <= 5; x++) {
                if (i == 0 || x == 0 || i == 5 || x == 5) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        // Diamond Pattern

        for (int i = 0; i < 5; i++) {
            for (int x = i; x < 5; x++) {
                System.out.print("  ");
            }

            for (int y = 0; y <= i; y++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        // System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int x = 0; x <= i; x++) {
                System.out.print("  ");
            }
            for (int y = i; y < 5; y++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}