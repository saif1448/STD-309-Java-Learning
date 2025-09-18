package StaticExamples;

public class StaticVarMainExample1 {
    public static void main(String[] args) {
        System.out.println(StaticVariableClass1.dummyVariable);

        StaticVariableClass1 c1 = new StaticVariableClass1();
        StaticVariableClass1 c2 = new StaticVariableClass1();

        c1.printDummyVariable("c1");
        c1.changeDummyVariableValue(45);
        c1.printDummyVariable("c1");


        c2.printDummyVariable("c2");
        c2.changeDummyVariableValue(60);


        c1.printDummyVariable("c1");


    }
}
