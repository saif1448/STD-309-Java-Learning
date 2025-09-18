package StaticExamples;

public class StaticVariableClass1 {

    // As this variable is static, it becomes a class variable
    // As it is a class variable, you won't require any object to call this variable
    // You can use this variable by using the class name
    public static int dummyVariable = 20;


    public void printDummyVariable(String objectName){
        System.out.println(objectName + " : Dummy Variable:--> " + dummyVariable);
    }


    public void changeDummyVariableValue(int newValue){
        dummyVariable = newValue;
    }

}
