import MethodExamples.Method1Example;


public class Test1 {

    private String name;
    private String artist;
    private double songLength;


    public Test1(String name, String artist, double songLength) {
        this.name = name;
        this.artist = artist;
        this.songLength = songLength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getSongLength() {
        return songLength;
    }

    public void setSongLength(double songLength) {
        this.songLength = songLength;
    }

    public String toString(){

        return getName() + " and the length is: " + getSongLength();

    }

//    public static void main(String[] args) {
//        Test1 t1 = new Test1("Rickroll", "avad", 123.34);
//
//        System.out.println(t1.artist + " " + t1.getName());
//    }
    public static void main(String[] args) {
    Test1 rickroll = new Test1("Rickroll1", "avad", 123.34);

    System.out.println(rickroll);
    }

}