package ControlStatements;

public class ReachableBlock {
    public static void main(String[] args) {

    }

    // condition 1 ---> return something
    // default ---> return the default


    // condition1 ---> return something
    // else ---> return another ---> this is treated as the default block
    // default ---> this default block will not be reachable because there is an else block before it

    // condition1 ---> return something
    // condition2 ---> return something another
    // .....
    // else ----> return the default result ----> it is working as the default block if no upper condition is working
    // default ----> this default will not be reachable because else is handling that situation


    // condition1 --->
    // condition2 ---->
    // ...
    // default ----> as there is no else, if none of the condition holds, then default block will handle this

    public static int testMethod(int a, int b){

        if(a > b){ // condition 1
            return a;
        }
//        else{
//            return b;
//        }
        else if(a < b){
            return b;
        }

        return 16; // default block
    }
}
