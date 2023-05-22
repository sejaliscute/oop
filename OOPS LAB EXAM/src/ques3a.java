public class ques3a {
    public static void main(String[] args) {
        String str1 = "Bhargav";
        StringBuffer sb =new StringBuffer(str1);
        sb.reverse();
        System.out.println(sb);

//Another method
        String str= "Geeks", nstr="";
        char ch;

        System.out.print("Original word: ");
        System.out.println("Geeks"); //Example word

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
    }
}
