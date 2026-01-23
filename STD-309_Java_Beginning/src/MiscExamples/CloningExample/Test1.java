package MiscExamples.CloningExample;

public class Test1 {

    public static Test2 clone(Test2 t){
        Test2 newT = new Test2();
        newT.s = t.s;
        return  newT;
    }

    public static void main(String[] args) {

        Test2 t2 = new Test2();
        t2.s = "ABCDEF";

        System.out.println(t2);

        t2.tempMethod(12, t2);


    }
}