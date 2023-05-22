import java.util.Scanner;


    public class MyCalculator{
       public long power(int n, int p) throws Exception{
           if(n<0 || p<0){
              throw new Exception("n or p should not be negative");
           }
           else if(n==0 || p==0){
               throw new Exception("n or p should not be zero");
           }
           else{
               long result = 1;
               for (int i = 0; i < p; i++) {
                   result *= n;
               }
               return result;
           }

       }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number and its power");
            int n = sc.nextInt();
            int p = sc.nextInt();

            MyCalculator obj = new MyCalculator();
            try {
                System.out.println("The answer is : " + obj.power(n, p));
            }
            catch(Exception e){
                System.out.println("Exception occured: "+ e.getMessage());
            }
        }
    }



