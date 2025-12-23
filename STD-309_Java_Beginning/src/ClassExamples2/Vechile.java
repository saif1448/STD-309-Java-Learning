package ClassExamples2;

// we create our own type of data which represent something
// this class is gonna contain its own behavior and properties
public class Vechile {
    // attribute
    // Instance variable
    // Vechile car = new Vechile() ---> color, model, type, speed
    private String color;
    private String model;
    private String type;
    private double speed;

    // constructor
    // it is special method
    // it initializes the object
    // the name of this method should be same as the class name
    // the constructor will not return anything, not even void
    // with the constructor  the object creates memory space inside the memory

    // c1 ---> color = red, speed=151, type=car1, model=abc
    // c2 ----> color = blue, speed = 677, type = motorcycle, model = xyz

    // 2 types of constructors
    // Default or null constructor
    // Parameterized constructor

    public Vechile(){
        // c2 ---> this ----> the current object it is working with
        this.color = "";
        this.speed = 0.0;
        this.type = "";
        this.model = "";
    }

    public Vechile(String color, String type, String model, double speed, boolean flag){
        this.color = color;
        this.type = type;

        if(speed >= 0){
            this.speed = speed;
        }else{
            throw new RuntimeException("The speed cannot be negative");
        }

        if(flag){
           this.model = model;
        }else{
            this.model = "XYZ";
        }
    }

    // accessors or getter methods
    public String getColor(){
        return color;
    }
    public String getType(){
        return type;
    }
    public String getModel(){
        return model;
    }
    public double getSpeed(){
        return speed;
    }
    // mutators or setter methods
    //c1.setColor("RED");
    public void setColor(String color){
        this.color = color;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }

    public String toString(){
        return  "Color: " + color
                    +"\nType: " + type
                    +"\nModel: "+ model
                    +"\nSpeed: "+ speed;
    }

    //instance method
    public String getSpeedCategory(){
        // 100 - 200 ---> slow
        // 201 - 400 ---> med speed
        // > 400 ----> hi speed
//        if(speed >= 100 && speed <=200){
//            return "Slow";
//        }else if(speed >= 201 && speed <=400){
//            return "Mid Speed";
//        }else{
//            return "Hi Speed";
//        }

        if(speed > 400){
            return "Hi Speed";
        }else if(speed > 200){
            return "Mid Speed";
        }else{
            return "Slow";
        }
    }

}
