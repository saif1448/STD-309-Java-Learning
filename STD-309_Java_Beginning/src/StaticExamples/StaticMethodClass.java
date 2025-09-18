package StaticExamples;

public class StaticMethodClass {


    // this is a string
    // THIS IS A STRING

    // This is a class method
    // When a method is satic, you don't need any object to call this method
    // You have to call this method using the class name
    public static String capitalizeString(String inputString){
        String captilaizeString = inputString.toUpperCase();
        return captilaizeString;
    }

    public static long getFactorial(long inputNumber){
        // 5! ----> 5*4*3*2*1
        long output = 1;
        while (inputNumber > 0){
            output *= inputNumber--;
        }

        return output;
    }

}
