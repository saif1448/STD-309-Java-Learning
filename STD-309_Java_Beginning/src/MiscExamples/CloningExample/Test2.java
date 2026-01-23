package MiscExamples.CloningExample;

public class Test2 {

    public String s;
    public int number;

//    public String toString(){
//        return "Value: " + s;
//    }

    public Test2 clone(){
        Test2 t = new Test2();
        t.s = this.s;
        return t;
    }


    public Test2 clone(Test2 t){
        Test2 newT = new Test2();
        newT.s = t.s;
        return newT;
    }

    public static void tempMethod(int number, Test2 t2){
        t2.number = number;
    }

}
