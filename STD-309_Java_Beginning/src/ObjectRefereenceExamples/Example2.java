package ObjectRefereenceExamples;

public class Example2 {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = s1;

        System.out.println("s1 --> "+ s1);
        System.out.println("s2 ---> "+ s2);

        s1 = "PQRS";

        System.out.println("s1 --> "+ s1);
        System.out.println("s2 ---> "+ s2);

    }
}
