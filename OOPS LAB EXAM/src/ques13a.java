import java.util.Scanner;

public class ques13a {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of matrix");
            int size = sc.nextInt();
            System.out.println("Enter elements");
            int [][] arr = new int[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {

                    arr[i][j]=sc.nextInt();

                }

            }
            //given matrix
            System.out.println("User matrix");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(arr[i][j]+" ");

                }
                System.out.println("");

            }
            System.out.println("Transpose of given matrix");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    // arr[i][j]= arr[j][i];
                    System.out.print(arr[j][i]+" ");
                }
                System.out.println("");
            }
        }
    }


