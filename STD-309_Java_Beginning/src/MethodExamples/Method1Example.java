package MethodExamples;

public class Method1Example {
    // it is a variable
    // public ---> it is open for everyone
    // it is gonna be accessible throughout the program
    // it is gonna be accessible via its class  --> Method1Example
//    public static String name = "asdad";

    // /      /    ?
    public static void main(String[] args) {

//        System.out.println(name);
//        method1();  // this method cannot be called into main. because main is static, method1() is non static.
        // a static method cannot call a non static method

        // I can call method2() because it is static
        // A static method can only call another static method
        // case 1 ---> no return type , no parameter
        method2();

        //case 2 ---> no treturn type, taking parameter
        method3("Saif");

        //case 3 ---> no parameter, return type present (String)
//        String output = method4();
//        System.out.println(output);
        System.out.println(method4());

        //case 4 ----> taking 2 parameters and return type is String
        String output = method5("Saif", "Dhaka, Bangladesh");
        System.out.println(output);
    }


    //we are gonna create some methods within this class
    // this is a non static method
    //this method doesn't have any return type and also doesnt have any parameter
    void method1(){
        System.out.println("Saying hello from method 1");

    }

    // no return type, no parameter
    // it is static
    public static void method2(){
        System.out.println("Saying hello from method 2");
    }

    //no return type, taking parameter
    public static void method3(String name){
        System.out.println("Saying Hello to "+ name);
    }


    //no parameter, return a String
    public static String method4(){
//        String greetingText = "Hi there!";
        return "Hi there!";
    }

    //taking Name and Address as parameter, also return value (String)
    public static String method5(String name, String address){
        String confirmationString = "Hi " + name + "! Your parcel has been delivered to " + address;
        return confirmationString;
    }


}
