// package Array;

public class setZero {

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 0, 2, 1 }, { 3, 6, 2 } };

        boolean row[] = new boolean[arr.length];
        boolean col[] = new boolean[arr[0].length];

        // Firstly find zero
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 0) {
                    col[i] = true;
                    row[j] = true;
                }
            }
        }

        // Now set zero
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (col[i] || row[j]) {
                    arr[i][j] = 0;
                }
            }
        }

        // Print
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
