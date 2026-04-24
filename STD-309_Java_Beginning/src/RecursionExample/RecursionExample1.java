package RecursionExample;

public class RecursionExample1 {

    /*

    ..........
    * recurFunction(8)
    * recurFunction(9)
    * recurFunction(10)
    * */

    // Tail Recursion
    public static void recurFunction1(int count){

        if(count == 0)
            return;

        System.out.println(count + " -> : Inside Recursion Function");
        // when one function calls itself again and again, we call it recursion
        recurFunction1(--count);
    }

    /**
     *
     * recurFunction2(0)
     * recurFunction2(1)
     * ....
     * recurFunction2(8)
     * recurFunction2(9)
     * recurFunction2(10)
     */

    // Head Recursion
    public static void recurFunction2(int count){

        if(count == 0)
            return;

        recurFunction2(--count);
        // when one function calls itself again and again, we call it recursion
        System.out.println(count + " -> : Inside Recursion Function");

    }

    public static void main(String[] args) {
        recurFunction1(10);
    }
}
