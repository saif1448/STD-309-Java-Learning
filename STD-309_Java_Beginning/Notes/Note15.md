    
---
## Array
- It is a data structure
- It can be a collection of may items
- It is something which will contain multiple data
- The size of the array is predetermined and fixed
- Array will contain only a single type of data
- In the array , the data will be present in sequential manner
- It means, you can access the data with the index number

# Create

- We can create a blank array
```java
// An array of integer which will contain 10 data
// data_type[] var_name = new data_type[size];
// indexing 0 ----> 9
int[] arrName = new int[10];
```

- when creating a blank array with primitive type, all the valid index will be initiated with default value
- when creating a blank array with objective type, all the index value will be null initially


- We can create an array with some predefined values
```java
int[] arrName = {10,20,30,40,50}; // an array with 5 elements
```

## Insert/Update into the array

- Insert data at a particular index
- We have to mention the index number (valid index number)
- Mentioned in #ArrayNExample2

## Traversing

-  .length  ---> it gives the length of that array
- We will traverse an array using the loop by accessing the value in a particular index
```java
int[] numArr = {10,20,30,40,50,60,70,80,90};  
  
System.out.println(numArr.length);  
  
int size = numArr.length;  
  
for(int i = 0; i < size; i++){  
    System.out.println(i+"--->"+ numArr[i]);  
}
```


### Enhanced For Loop
- This is a for loop which only works with a collection or data structure
```java
for(data_type varible_name : array_name){
...
}
```

```java
int[] numArray = {10,20,30,40,50,60};  
  
for(int num : numArray){  
    System.out.println(num);  
}
```

- We can use enhanced for loop to easily access the array
- It is useful when you are not dealing with the index number