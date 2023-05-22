import java.util.*;
public class PhoneBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of entries");
        int entries = sc.nextInt();
        Map<String,String> mp = new HashMap<>();
        mp.put("Sejal","98867098");
        mp.put("Badak","45678909");
        for (int i = 0; i < entries; i++) {
            System.out.println("Enter name : ");
            String name = sc.nextLine();
            System.out.println("Enter number : ");
            String Phonenumber = sc.nextLine();
            mp.put(name,Phonenumber);

        }
        while (sc.hasNext()) {
            String query = sc.nextLine();
            String phoneNumber = mp.get(query);

            if (phoneNumber != null) {
                System.out.println(query + " " + phoneNumber);
            } else {
                System.out.println("Not found");
            }
        }

        sc.close();
    }
}
