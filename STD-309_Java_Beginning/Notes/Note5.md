- Loop
    - for
    - while
    - do while
    - extended for loop
- 2 statements with the loop
    - break
    - continue


Loop has 4 important properties
- initialization
- condition
- loop body
- increment / decrement

## For Loop
- Structure
```
	for (initialization; condition; increment/decrement){
		loop body
	}
```
- the increment / decrement will gonna take place in the last
- the initialization of a variable in the for loop will only exist for the context of the for loop locally
```
	for(int i = 1; i <= 5; i++){  
	    for(int j = 1; j<=i; j++){  
	        System.out.print("0");  
	    }  
	    System.out.println();  
	}
```

i = 1, j=1          0
i = 2, j=1,2       00
i = 3, j=1,2,3    000
i = 4, j=1,2,3,   0000
i = 5, j=1,2,3,4 00000

- This is an example of the nested loop

## While Loop
- Structure
```
	initialization
	while (condition){
		loop body

		increment/decrement
	}
```

## Types of the loop

1. Entry Controlled Loop
    1. For
    2. While
    3. Extended For Loop
2. Exit Controlled Loop
    1. do while


## Do While Loop

```
	initialization
	do{
		loop_body

		increment/decrement
	}while(condition);
```


## Extended For Loop / Enhanced For Loop

- Structure


```
	for(var : iterable){
		loop_body
	}
```

- Before java 17
    - you have to mention the type of the variable explicitly
- After or equal java 17
    - you van use the 'var' keyword to determine the type on the fly



## Break , Continue

```
	int limit = 100;  
//break example  
for (int i = 10; i <=limit; i+=10){  
    // if the value of i is gonna cross 60% of the limit, we are gonna hit the break  
    if(i > limit*0.6){  
        break;  
    }  
    System.out.println(i);  
}  
  
//continue example  
for (int i = 10; i <=limit; i+=10){  
    // if the value of i is a mutiplicant of 30, we are gonna skip it  
    if(i % 30 == 0){  
        continue;  
    }  
    System.out.println(i);  
}
```



## In the next class, we are gonna visit the topic Data Structure
- Array
    - Pros
    - Cons
- ArrayList
- HashMap
- Collection Framework