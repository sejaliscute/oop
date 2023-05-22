import java.util.ArrayList;

public class ques1a {
    public static void main(String[] args) {
         int [] arr = new int []{10,20,10,30,20,50,30};
        int[] uniqueArray = removeDuplicates(arr);

        System.out.print("Array with repeated elements: ");
        printArray(arr);

        System.out.print("Array without repeated elements: ");
        printArray(uniqueArray);
    }

    public static int[] removeDuplicates(int[] array) {

        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (int num : array) {
            if (!uniqueList.contains(num)) {
                 uniqueList.add(num);
            }
        }
        int[] uniqueArray = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            uniqueArray[i] = uniqueList.get(i);
        }

        return uniqueArray;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
