package ArrayListExamples;

public class AutoBoxingUnboxingExample {
    public static void main(String[] args) {

        Integer a1 = 65;  // Left side Objective type, Right side primitive type number

        // Number is being auto converted to the Objective type
        // Autoboxing

        Double d1 = 75.3;

        System.out.println(a1);
        System.out.println(d1);

        int a = a1; // objective type being converted to primitive, this is unboxing

        System.out.println(a);




    }
}
