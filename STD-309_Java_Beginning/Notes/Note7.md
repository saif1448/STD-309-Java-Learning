- String
- Method
- Class
- Object
- Algorithm and Flowchart


# String
- We always use ""  double quote to create a string
    - '' ---> single quote is used to create character ---> type char
- The data type of the string is #String
```
	String name = "ABCD";
```

- The most common functions we use with the string
    - length() ---> to show the length of the string
    - equals(given_string) ---> it checks if the string is equally matched with a given string
        - in java we don't use == to equal match the string values
        - for equality check in string, always use this method
    - toLowerCase() ---> converts to lower case
    - toUpperCase() ---> converts to upper case
    - startsWith()
        - it checks if a string with starting with the given string
        - it is case sensitive
    - endsWith()
        - it checks if a string ends with the given string
        - also it is case sensitive
    - contains()
        - it checks if a substring is present in a string
        - it is case sensitive
    - concat()
        - it adds string value to another string value
        - it is better to use + operator to concat string
    - charAt()
        - it gives you the character at a particular index of the string
    - isEmpty()
        - it is gonna return true only if the string length is 0
    - isBlank()
        - Returns true if the string is empty or contains only white space codepoints, otherwise false
    - indexOf()
        - it is by default search from index 0 to see if a string or character is present.
            - if present it returns the index of its first occurrence
            - if not present it returns -1
        - if we give the from index value as parameter, instead of searching from index 0, it will start searching from the given index
            - then it will return the index of the character of its first occurrence
            - if not present , -1
    - replace()
    - split()
    - strip()
    - toCharArray()
    - trim()