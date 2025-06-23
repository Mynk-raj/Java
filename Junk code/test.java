import java.util.Scanner;

public class test {
   
    //Fabonaci seies using recurison
    public static void fabo(){
        int a = 1 ;
        int b = 1 ;
    }

    //Sum of nth term using recurion
    public static int sum(int num){
        if(num == 1){
            return 1;
        }
        // int result = 0; 
        // result += num + sum(num-1);

       return num + sum(num-1); 
    }

    //Factorial of a number using recursion 
    public static int fact(int num){
        if(num == 1){
            return num;
        }
        return num * fact(num -1);
    }
   
    //Printing n number using recursion
    public static void num(int num){
        if(num == 0){
            return;
        }

        System.out.println(num);
        num(num-1);

    }

    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter a number : ");
        // int num = sc.nextInt();
        int num = 5;

        System.out.println("Factorial of " + num + " is : " + fact(num));
        System.out.println("Sum of " + num + "th term is : " + sum(num));

     



    }
}
