import java.util.Scanner;

abstract class Marks{
    abstract void getPercentage();
}

class A extends Marks{
    int a1,a2,a3;
     A(int a1,int a2,int a3){
        this.a1=a1;
        this.a2=a2;
        this.a3=a3;
    }
   public void getPercentage(){
       int sum= a1+a2+a3;
       float percent = (sum*100)/300;
       System.out.print("The percentage of A is ");
       System.out.print(percent);
   }
}

class B extends Marks{
    int b1,b2,b3,b4;
    B(int b1,int b2,int b3, int b4){
        this.b1=b1;
        this.b2=b2;
        this.b3=b3;
        this.b4=b4;
    }
    public void getPercentage(){
        int sum = b1+b2+b3+b4;
        float percent = (sum*100)/400;
        System.out.print("The percentage of B is ");
        System.out.print(percent);
    }
}
public class ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of A");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        System.out.println("enter marks of B");
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();
        int b4 = sc.nextInt();

        A a = new A(a1,a2,a3);
        B b = new B(b1,b2,b3,b4);

        a.getPercentage();
        System.out.println();
        b.getPercentage();
    }
}
