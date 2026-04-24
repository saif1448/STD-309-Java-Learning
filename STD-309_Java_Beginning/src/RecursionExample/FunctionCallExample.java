package RecursionExample;

public class FunctionCallExample {

    public static void funcD(){
        System.out.println("In D");
    }

    public static void funcC(){
        System.out.println("In C");
        funcD();
    }

    public static void funcB(){
        System.out.println("In B");
        funcC();
    }

    public static void funcA(){
        System.out.println("In A");
        funcB();
    }

    /*
    * funcD()
    * funcC()
    * funcB()
    * funcA()
    * */

    public static void main(
            String[] args) {
        funcA();
    }
}
