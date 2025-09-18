- Static
    - Instance Method and Variable
    - Static is for Class Method and Class Variable
- Final Keyword
    - Variable
- Constant


Class
- You might set some properties
    - Attributes ----> Instance Variables
        - They are bounded to their corresponding objects
        - When you create a new object, you create a new set of instance variable in the memory for each object
    - Behaviors ----> Instance Method
        - Because, you cannot call these method without creating an object


- Static
    - Method
        - - Structure
        - public/private static returntype methodName(....){  .... }
        - When a method becomes static, you don't need any object to call this method
        - you have to call this method using the class name
        - that is why we call them the Class Method
    - Variable
        - When you make a variable static, it becomes a class variable
        - It means you can use this variable using the class name
        - No object / instance is required to use this variable
        - class variable belongs to the class, not to the object
            - it means the class variable belongs to every object
            - it means it is being shared with every object

- Final
    - When we declare something as final, it becomes a constant
    - Constant means you cannot change or update the value of it
    - When a variable becomes final, it must be initialized with some value
        - It can be initialized inline
        - or it can be initialized inside the constructor