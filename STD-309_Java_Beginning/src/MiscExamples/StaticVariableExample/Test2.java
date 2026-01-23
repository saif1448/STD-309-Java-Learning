package MiscExamples.StaticVariableExample;

public class Test2 {

    private static int v1 = 0; // it is a class variable
    private int v2 = 0;

    public Test2(){
        v1 += 1;
        v2 += 1;
    }

    public String toString(){
        return  "\n----------------"+ "V1: " + v1 + "\n" + "V2: " + v2 + "\n----------------";
    }

}
