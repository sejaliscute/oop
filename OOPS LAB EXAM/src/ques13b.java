import java.io.*;
public class ques13b {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("myfile.txt");
        BufferedReader bf =new BufferedReader(fr);
        int wordcount = 0;
        String line;
        while((line=bf.readLine())!=null){
            String[] word = line.split(" ");
            for (String w:
                    word) {
                wordcount++;

            }

        }
        bf.close();
        System.out.println("no of words in file are : "+wordcount);
    }
}
