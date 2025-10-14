package ObjectRefereenceExamples;

public class Example1 {

    public static void main(String[] args) {
        ExampleClass e1 = new ExampleClass("ABCD");

        System.out.println(e1);

        ExampleClass e2 = e1; // it is not assigning the value of e1 to e2. rather it is referencing the same object

        // This is copying the value of e1 to e2. not referencing the same object
//        ObjectRefereenceExamples.ExampleClass e2 = new ObjectRefereenceExamples.ExampleClass();
//        e2.copyObject(e1);

        System.out.println("Printing e2:---> " + e2);

        System.out.println("After changing");

        e1.changeName("PQRS");
        System.out.println("e1 ---> " + e1);

        System.out.println("e2 --->" + e2);


    }
}
