package Array;
import java.util.*;

public class threeDarray {
    public static void main(String[] args) {
        int arr[][][] = new int[2][2][2]; // 3d array

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
                System.out.println("Matrix " + i + ":");
            for (int j = i; j < arr.length; j++) {
                for (int z = i; z < arr.length; z++) {
                    System.out.print(" ");
                    arr[i][j][z] = sc.nextInt();

                }
                System.out.println();
            }
            System.out.println();
        }

        // pirnting
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int x = i; x < arr.length; x++) {
                    System.out.print(arr[i][j][x] + " ");
                }
                System.out.println();
            }
           System.out.println("--------------");
        }


        sc.close();

    }
}
