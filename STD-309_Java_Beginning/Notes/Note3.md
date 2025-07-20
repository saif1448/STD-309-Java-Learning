- Input Taking
    - We need to create an object of the Scanner type

```
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Name: ");
	String name = sc.nextLine(); // it is taking input from the keyboard. that input line is gonna be stored at name variable (or name object)
	System.out.println(name);
```

```
	import java.util.Scanner;  
  
public class InputOutputExample {  
    public static void main(String[] args) {  
  
        Scanner sc = new Scanner(System.in);  
  
        System.out.println("Enter your name: ");  
        String name = sc.nextLine();  
        System.out.println("Enter your address: ");  
        String address = sc.nextLine();  
        System.out.println("Enter your mobile number: ");  
        String mobile_number = sc.nextLine();  
  
        System.out.println("Name: " + name + "\nAddress: " + address + "\nMobile Number: " + mobile_number);  
  
  
  
    }  
}
```

- Practice
    - Take Student input from the keyboard and Print the student data
        - Name
        - Age
        - Session
        - Mark
        - Grade
        - Address

- When we are gonna deal with primitive type input like nextInt() or nextDouble(), we have to give a nextLine(). other wise , the \n character (means pressing Enter from keyboard) will be consumed wrongly

- We have another solution. We can convert the String value to the necessary primitive type

- For each primitive type, we have associated wrapper type for those
    - int --> Integer()
    - float --> Float()
    - double --> Double()
- We can the associated parse method to convert String to that particular primitive type



## Practice Task


Take these inputs
1. Book Name
2. Author Name
3. Version --> Double
4. Price
5. Page
6. Subject