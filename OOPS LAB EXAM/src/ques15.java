import java.util.ArrayList;
import java.util.Iterator;

public class ques15 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println("Using simple for loop");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i)+" ");

        }
        System.out.println("");
        System.out.println("Using advanced for loop");
        for (Integer i:
                list1) {
            System.out.print(i+" ");

        }
        System.out.println("");
        System.out.println("Using iterator");
        Iterator<Integer> it = list1.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+ " ");
        }
    }
}