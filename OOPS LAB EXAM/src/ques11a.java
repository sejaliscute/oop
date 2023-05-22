import java.util.Scanner;

public class ques11a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose table is to be printed:");
        int n = sc.nextInt();

        ques11a obj = new ques11a();
        obj.Table(n);

    }
    public void Table(int n){
        int m =10;
        for(int i=1;i<=m;i++){
            System.out.println(n+" x "+i+ " = "+ n*i);
        }
    }
}
