package MiscExamples.StaticVariableExample;

public class Test1 {

    public static void main(String[] args) {
        // static variable will be treated as global variable of that class
        // every object will share the static variable
        // if one object change the static variable, another object will also see the change as well
        Test2 t1 = new Test2();
        Test2 t2 = new Test2();
        Test2 t3 = new Test2();

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }



}