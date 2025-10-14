package ObjectRefereenceExamples;

public class Example4 {

    public static void main(String[] args) {
        int a = 5;
        String b = "NO";
        ExampleClass c = new ExampleClass("Karen");
        mystery(a,b,c);
        System.out.println(a + " " + b + " " + c.sendName());
    }

    public static void mystery(int d, String e, ExampleClass f){
        d = 7;
        e = "Yes";
        f.changeName("Becky");
    }
}
