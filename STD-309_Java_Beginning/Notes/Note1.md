- Class Basic Structure

    - The java file name and the class name must be same
    - The class name must start with Capital letter
    - all the methods should start with lower case and it will maintain camelCasing

```
	public class class_name {
	}
```

- After creating a class (At the beginning), you have to create a new method, its name will be 'main'
```
	public class class_name{
		public static void main(String[] args){
			System.out.println("Hello");
		}
	}
```
- System.out.println(""); -----------> this is used to print something
- After each statement, that must be end with a semicolon ';'
- { } ---> It is used for indicating a code block
- Data types
    - Primitive Data Types
        - The type of data which cannot be broken into smaller format
            - Integer
                - The whole numbers, both positive, negative
                - 1, 2, 3, -100, -34
                - int  ---> 4 byte ---> 32 bit ----> 2^32 for only positive, -2^32/2 to 2^32/2-1, 0 will be included in the positive range
                - short ---> 2 byte --> 16 bit
                - long ---> 8 byte --> 64 bit
                - byte ---> 1 byte ---> 8 bit
            - Float
                - The real numbers with decimal point, fractional part will be there
                - 1.00, 2.34, 6.13, 6e4
                - float
                - double
            - Character
                - character must be defined with ' ', single
                    - 'a', 'b', 'C'
                    - char
                - A character will have its associated integer value
            - Boolean
                - true ---> 1
                - false ---> 0
                - bool
            - If you want to deal with a very big number, you have to use Big Decimal
    - Objective Data Types / User Defined Data Types  / Non primitive Type
        - Most of the time, we are gonna work with this
        - This is the data type which will be created using primitive data type
        - String
            - "I am Saif"
                - ['I', ' ', 'a', 'm', ' ', 'S', 'a', 'i', 'f']