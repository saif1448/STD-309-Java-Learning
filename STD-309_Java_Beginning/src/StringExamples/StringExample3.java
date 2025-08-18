package StringExamples;

public class StringExample3 {
    public static void main(String[] args) {
        String s = "\u2002Hello\u2002";
        System.out.println(s.trim());  //it is not gonna remove the white space
        System.out.println(s.strip()); // it is gonna remove the white space
    }
}
