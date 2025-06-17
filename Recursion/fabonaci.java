public class fabonaci {

    public static void fabo(int a , int b) {
      
        int c = a+b;
        System.out.println(c);
        if(c == 21){
            return;
        }
        fabo(b, c);

    }


    public static int fact(int num){
        if(num == 1){
            return num;
        }
        int sum = num * fact(num-1); 
        return sum;
    }

    public static int reverse(int data){
        if(data == 0){
            return data;
        }
  
        int sum =  0; 
        sum = sum +  data % 10;
    
        reverse(data/10);
        // val = val * 10 + val;
      

        return sum;
    }
    public static void main(String[] args) {
        int num = 10;
        int a = 1;
        int b = 0;
    //   fabo(a,b);
      System.out.println(fact(num));

        int data = 1234;
        reverse(data);
        System.out.print(reverse(data));

    }
}
