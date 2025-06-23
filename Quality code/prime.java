// package Most Optimal code;

public class prime {

    public static void checkPrime(int num){
        // Eleminating all negative and unvalid prime number such as 0,1 
        if(num <= 1){
            System.out.println(num + " is a not valid Prime number.");
            return;
        }
        // Eleminating only one even prime number
        if(num == 2){
            System.out.println(num + " is a valid Prime number.");
            return;
        }

        // Now eleminating all positive even prime number (expect 2)
        if(num % 2 == 0){
             System.out.println(num + " is a not valid Prime number.");
             return;
        }

        // Now checking non even number are prime or not 
        for(int i = 3; i<=Math.sqrt(num); i += 2){
            if(num % i == 0){
                 System.out.println(num + " is a not valid Prime number.");
                 return;
            }
        }

        // this statement for valid prime number 
        System.out.println(num + " is a valid Prime number.");

    }

    public static void main(String[] args) {
        int num = 331;
        checkPrime(num);

     
    }
}


// # Fun fact : 🔍 What happens with-       int num = 011;       in Java?
// In Java (and many other C-based languages), when you prefix a number with 0, it's treated as an octal (base-8) number, not decimal (base-10).