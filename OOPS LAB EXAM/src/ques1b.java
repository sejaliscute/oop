import java.util.ArrayList;
import java.util.HashSet;

public class ques1b{
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        int[] commonElements = findCommonElements(array1, array2);

        System.out.print("Array 1: ");
        printArray(array1);

        System.out.print("Array 2: ");
        printArray(array2);

        System.out.print("Common Elements: ");
        printArray(commonElements);
    }

    public static int[] findCommonElements(int[] array1, int[] array2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> commonList = new ArrayList<>();

        for (int num : array1) {
            set.add(num);
        }

        for (int num : array2) {
            if (set.contains(num)) {
                commonList.add(num);
            }
        }

        int[] commonArray = new int[commonList.size()];
        for (int i = 0; i < commonList.size(); i++) {
            commonArray[i] = commonList.get(i);
        }

        return commonArray;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
