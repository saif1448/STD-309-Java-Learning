# Class Record - 14-FEB-2026
**Student:** STD-309  
**Date:** 14th February, 2026  
**Subject:** Java  Array List
**Class Type:** REGULAR CLASS


## Array Properties

- It is a sequential data structure
- It can be indexed
- The data in the array is homogenous
- The size is fixed
- Problems
    - Insertion
        - Right Shifting Manually
        - Overflow error due to fixed size
    - Deletion
        - Left Shifting Manually
        - Underflow error


## All these are being overcome with ArrayList

- Wrapper Class
    - ArrayList does not work with primitive type
    - Rather it works with the objective type
    - Each primitive  data type has their own objective type class

| **Primitive Type** | **Wrapper Class** | **Example Creation**  |
| ------------------ | ----------------- | --------------------- |
| `boolean`          | **Boolean**       | `Boolean b = true;`   |
| `byte`             | **Byte**          | `Byte b = 10;`        |
| `short`            | **Short**         | `Short s = 100;`      |
| `int`              | **Integer**       | `Integer i = 1000;`   |
| `long`             | **Long**          | `Long l = 10000L;`    |
| `float`            | **Float**         | `Float f = 3.14f;`    |
| `double`           | **Double**        | `Double d = 3.14159;` |
| `char`             | **Character**     | `Character c = 'A';`  |


## Autoboxing and Unboxing

- Autoboxing
    - Primitive data is being automatically converted to its objective type
        - `Integer i = 1000;`
    - primitive ---> objective
- Unboxing
    - Objective type being automatically conveted to primitive type
        - `int a = a1;`
    - objective ---> primitive

## Wrapper Class Functions

- parsing
    - Integer ---> Integer.parseInt() ---> string --> int
    - Double ---> Double.parseDouble() ---> string ---> double
- conversion
    - Integer ---> Integer.toBinaryString()
- compare
- valueOf
- toString()
- Constants
    - int maxInt = Integer.MAX_VALUE;
    - int minInt = Integer.MIN_VALUE;
    - double maxDouble = Double.MAX_VALUE;
    - double minDouble = Double.MIN_VALUE;
``` java
// Character constants
boolean isDigit = Character.isDigit('5');     // true
boolean isLetter = Character.isLetter('A');    // true
boolean isWhitespace = Character.isWhitespace(' '); // true
```

- Character
```java
// Character checks - very common in text processing
char ch = 'A';
boolean isDigit = Character.isDigit(ch);      // false
boolean isLetter = Character.isLetter(ch);     // true
boolean isUpperCase = Character.isUpperCase(ch); // true
boolean isLowerCase = Character.isLowerCase(ch); // false
boolean isWhitespace = Character.isWhitespace(ch); // false
boolean isLetterOrDigit = Character.isLetterOrDigit(ch); // true

// Character conversion
char upper = Character.toUpperCase('a');       // 'A'
char lower = Character.toLowerCase('A');       // 'a'
```

- Mathematical ---> Valid for numeric values only
    - Integer.max(int a, int b)
    - Integer.min(int a, int b)
    - Integer.sum(int a, int b)

## **Quick Reference: Top 10 Most Used Functions**

|**Function**|**Example**|**Use Case**|
|---|---|---|
|`parseInt()`|`Integer.parseInt("123")`|Convert string to int|
|`valueOf()`|`Integer.valueOf(10)`|Get wrapper object|
|`toString()`|`Integer.toString(42)`|Convert to string|
|`equals()`|`num1.equals(num2)`|Compare values|
|`MAX_VALUE`|`Integer.MAX_VALUE`|Check range limits|
|`parseDouble()`|`Double.parseDouble("3.14")`|Convert string to double|
|`isDigit()`|`Character.isDigit('5')`|Check if char is digit|
|`toHexString()`|`Integer.toHexString(255)`|Format as hex|
|`compareTo()`|`num1.compareTo(num2)`|Sort/compare objects|
|`booleanValue()`|`boolObj.booleanValue()`|Get primitive value|


## ArrayList Creating

```
ArrayList<ClassName> variable_name = new ArrayList<>();

```


## ArrayList Insertion

- add(30) ---> it is adding 30 to the integer arraylist
## Array List Size

- ArrayList<Integer> numList = new ArrayList()
-  size() ---> to show the size of the arrayList