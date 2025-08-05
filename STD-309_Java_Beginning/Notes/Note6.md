## Today's Focused Topic

- Array
- ArrayList
- Methods (Functions)



# Array
- Will contain multiple elements with a single variable
- The elements will be of same type
- The elements will be placed in sequential linear manner
- Because of this thing, each element can be accessed via the 'Index' number
- Sometimes the index number is called as an 'Offset value'
- Index
    - It will start at 0
    - It will end at length-1
    - Example
        - If array length = 10
            - starting index => 0
            - ending index => 9
    - Negative index is not allowed in java, c, c++
- We are gonna use [] to indicate and array
- Array length will always be fixed
- Structure
```
	type[] variable_name = new type[length];
	int[] arr = new arr[10];
```



```
	//type[] variable_name = new type[length];  
  
	//Creating the array  
	int[] arr = new int[10];  
	  
	//Inserting into the array  
	arr[0] = 20;  
	arr[4] = 50;  
	  
	//Traversing the array  
	for(int a : arr){  
	    System.out.println(a);  
	}
```

- We cannot insert beyond the max index number
- To get the length of the array, use then length property

```
	arr.length

```

- for 2d array
    - int[][] arr2d = new int\[3]\[];  ----> the first square bracket value is mandatory
        - ROW value must be given
        - Column value is optional
## Next

- Array Deletion
- Array problem
- ArrayList
## Data Structure

- Every Data Structure they mainly 6 task
    - Insertion
    - Deletion
    - Traversing
    - Searching
    - Sorting
    - Merge