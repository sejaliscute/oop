public class ques3b {
    public static void main(String[] args) {
        String str1 = "madam";
        StringBuffer sb = new StringBuffer(str1);
        sb.reverse();
        String  sb1 = sb.toString();
        if(str1.equalsIgnoreCase(sb1)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Non pallindrome");
        }

    }
}
