package StaticExamples;

public class StaticExampleMain {
    public static void main(String[] args) {


        String captialString1 = StaticMethodClass.capitalizeString("this is an input string");

        System.out.println(captialString1);

        System.out.println(StaticMethodClass.capitalizeString("this is another string"));

        System.out.println(StaticMethodClass.getFactorial(5));
        System.out.println(StaticMethodClass.getFactorial(7));

    }
}
