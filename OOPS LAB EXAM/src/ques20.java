class VideoTape{
    String title;
    int length;
    boolean available;

    public void show(String title, int length, boolean available){
         this.title=title;
         this.length=length;
         this.available=available;

        System.out.println("Title: "+title);
        System.out.println("Length: "+length);
        System.out.println("Available: "+available);
    }
}
class Movie extends VideoTape{
    float dr;
    public void show(float dr) {
        this.dr=dr;
        System.out.println("Director rating: "+ dr);
    }

    @Override
    public void show(String title, int length, boolean available) {
        super.show(title, length, available);
    }
}

class MusicVideo extends VideoTape{
    String ac;
    public void show(String ac) {
        this.ac=ac;
        System.out.println("Artist Category: "+ac);
    }

    @Override
    public void show(String title, int length, boolean available) {
        super.show(title, length, available);
    }
}
public class ques20 {
    public static void main(String[] args) {
        Movie mv= new Movie();
        MusicVideo mve = new MusicVideo();
        mv.show(4.5f);
        mve.show("pop");
        mv.show("xyz",20,true);

    }
}
