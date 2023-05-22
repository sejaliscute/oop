import java.util.Scanner;

public class ques11b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean flag = false;
        if(n==1){
            System.out.println("1 is neither prime nor composite number");
        }
        else{
            for(int i =2;i<= n/2; i++){
                if(n % i == 0){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println(n + " is a prime number");
            }
            else{
                System.out.println(n + " is not prime number");
            }
        }



    }
}

