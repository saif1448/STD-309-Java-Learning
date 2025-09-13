# Class Record - 13-Sep-2025
**Student:** STD-309  
**Date:** 13th September, 2025  
**Subject:** Java  
**Class Type:** REGULAR CLASS

---

- Class
    - Public Class ...
- Objects
    - ClassName variable_name = new ClassName()


- Property / Attributes of Class
    - Instance Variables

Public Class Student{
private String name;
private String section;
}


- Properties are mainly private
    - To have communication with them, we need special behaviours
    - These require some methods
        - These are called accessors / mutators
        - They are also called setters and getters
        - They are public method

Accessors ----> Getters
Mutators ----> Setters

- Other than accesors and mutators, we can have other methods
- these also defines the behavior of the class
- The object who is calling the method or actively doing a task, we refer it though "this" keyword

- We have a special method "toString()"
- It represent the string representation of an object of your created class


- Whenever we create a new object, we have to use the "new" keyword and we have to call the associated Constructor


## Constructor

- Constructor is a special method
- It will not have any return type
- It will have the same name as the class name

- By default, java provided null constructor for everyone, every class
- The purpose of the constructor is to initialize the object you are creating
- It means it is gonna take space in the memory


- There are 2 types of constructor
    - The one who doesn't take any parameter
        - We call it null constructor, which is is by default
    - The other is parameterized constructor
        - This is will take parameter as input


- When you provide parameterized constructor, the null constructor doesn't remain as default
- If you still want to use null constructor, you have to manually create null constructor alongside with parameterized constructor


- "this"




Summary
- Class
- Object
- new keyword
- Getters / Accessors
- Setters / Mutators
- Other method
- Special Method ---> toString
- Constructor
    - Null
    - Parameterized
- this keyword
