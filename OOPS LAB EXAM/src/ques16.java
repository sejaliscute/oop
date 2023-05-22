import java.util.*;
public class ques16{
    public static void main(String[] args) {
        Map<String,Integer> l = new HashMap<>();
        String s ="This this is is done by Saket Saket";
        String[] sp = s.split(" ");
        for (String words:
                sp) {
            if(!l.containsKey(words)){
                l.put(words,1);

            }else {
                l.put(words,l.get(words)+1);
            }

        }
        System.out.println(l);

    }
}
