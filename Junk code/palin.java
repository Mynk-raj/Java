import java.util.*;

public class palin {

    public static boolean fun(String name1, String name2) {
        return name1.equals(name2) ? true : false;
    }

    public static void main(String[] args) {
        // Palindrome number
        int a = 1;
        int b = 2;
        int c;

        System.out.print(a + " " + b + " ");
        for (int i = 0; i < 10; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a number : ");
        int num = sc.nextInt();

        // factorial of a number
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of a number is : " + fact);

        // Sum of nth term
        int nth = 0;
        for (int i = 0; i <= num; i++) {
            nth += i;
        }
        System.out.println("\n Sum of nth term : " + nth);

        // string comparison
        String name1 = "mayank";
        String name2 = "mayank";
        if (name1.equals(name2)) {
            System.out.println("equal !");
        } else {
            System.out.println("not equal !");
        }

        // string reversal
        for (int i = name1.length() - 1; i >= 0; i--) {
            System.out.print(name1.charAt(i));
        }
        System.out.println(fun(name1, name2));

        // second largest
        int arr[] = { 4, 2, 5, 1, 3 };
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 2]);

        // binary search

        int start = 0;
        int end = arr.length - 1;
        int find = 5;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == find) {
                System.out.println("Index is = " + mid);
                break;
            } else if (arr[mid] < find) {
                start = mid + 1;
            } else if (arr[mid] > find) {
                end = mid - 1;
            }

        }


        //fabonci series 

        int x,y,z;

        x=1;
        y=2;

        for(int i = 0; i<10; i++){
            z = x+y;
            System.out.println(z);
            x=y;
            y=z;
        }

        // palindrome num

        int number = 12345;
        int rev = 0;

        while (number != 0) {
            int digit = number % 10;
            rev = rev*10 + digit;
            number = number/10;      
        }
        System.out.println(rev);

    }
}
