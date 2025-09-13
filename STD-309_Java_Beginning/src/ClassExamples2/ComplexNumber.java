package ClassExamples2;

public class ComplexNumber {

    // a + ib
    // 3 + 2i ---> this  ---> c1.addComplexNumber(c2) ----> this --> c1, other ---> c2 , -------- c3
    // 2 + 5i ---> other ----> c2
    // 5 + 7i ---> return ---> adding
    // 1 - 3i ----> return ---> subtracting

    private int a;
    private int b;

    // the constructor
    // As this constructor is not taking any parameter, we call this null constructor
    // If you don't create any null constructor, java will provide one by default
    // The purpose of the constructor is to initialize an object
    public ComplexNumber(){
        a = 0;
        b = 0;
    }

    //As this constructor is taking parameter, we call it parameterized constructor
    public ComplexNumber(int a, int b){
        this.a = a;
        this.b = b;
    }

    //usually, setter doesn't have anything to return, that is why return type is void
    // but setters receive value in the parameter

    // we need some setter methods to set the value of a and b, setters / mutators
    public void setA(int a){
        this.a = a;
    }

    public void setB(int b){
        this.b = b;
    }


    // usually, the getters doesn't receive any value, so parameter is blank
    // but it returns the property value, so it will have return type

    // to see or to get the value of either a or b, we need so getter methods / acessors

    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }

    public ComplexNumber addComplexNumber(ComplexNumber other){
        ComplexNumber result = new ComplexNumber();

        int aPart = this.a + other.a;
        int bPart = this.b + other.b;

//        result.setA(aPart);
//        result.setB(bPart);

        result.a = aPart;
        result.b = bPart;

        return result;
    }

    public ComplexNumber addThreeComplexNumbers(ComplexNumber c2, ComplexNumber c3){
        ComplexNumber result = new ComplexNumber();

        int aPart = this.a + c2.a + c3.a;
        int bPart = this.b + c2.b + c3.b;

        result.a = aPart;
        result.b = bPart;

        return result;
    }


    public ComplexNumber subtractComplexNumber(ComplexNumber c2){
        ComplexNumber result = new ComplexNumber();

//        int aPart = this.a - c2.a;
//        int bPart = this.b - c2.b;
//        result.a = aPart;
        // result.b = bPart;

        result.a = this.a - c2.a;
        result.b = this.b - c2.b;

        return result;
    }


//    public void printComplexNumber(){
//        System.out.println(this.a + " + ");
//    }

    // toString() method
    // it returns the string representation of an object of your class
    public String toString(){
//        String res = a+ " " + b + "i";
        String sign = "";
        if (b < 0){
            sign = "-";
        }else{
            sign = "+";
        }
        return a + " " + sign+ " "+ b + "i";
    }




}
