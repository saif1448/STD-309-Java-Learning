

## Function / Method Understanding
- A block of codes, which are created and can be called on demands anyitme any where
- This block of codes is callable using the name of it which we call the function name
- Main purpose don't re-write a block of code everytime that piece is needed
- Properties
  - It has a unique name ( in a particular file)
  - It may or may not have some parameters 
  - It may or may not return any value
  - It will have a function body

- Examples will be like
  - A method have no parameter and no return value
    - if there is nothing to return, the return type will be void
  - A method have some parameter and no return value
    - the parameter are typed bound
  - A method have no parameter but return value
    - It can only return a single value
    - The return type must be given
      - If nothing returned, then use void
      - Else, use particular data type
  - A method have some parameters and return value

- A method can only return atmost one value

## Static
- Static makes a particular thing's lifetime until the program is ended
- A static method cannot call a non static method
- A static method cannot use a non static variable
- A non static method can call a static method
- A non static method can use a static variable
- Static binds the method or variable to class level
- A non static method or variable is bounded with instance level
- Who is calling main? How a program is running without calling the main method?
