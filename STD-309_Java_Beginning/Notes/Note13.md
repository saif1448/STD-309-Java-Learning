
# Loop and Nested Loop Lecture(1)
---
### 1. Introduction

Loops allow a program to **repeat a block of statements** multiple times automatically.  
Instead of writing repetitive statements manually, we use a loop structure.

Example:

```java
System.out.println("I am so smart");
System.out.println("I am so smart");
System.out.println("I am so smart");
System.out.println("I am so smart");
```

can be replaced by:

```java
for (int i = 1; i <= 4; i++) {
    System.out.println("I am so smart");
}
```

---

### 2. The `for` Loop

#### Syntax

```java
for (initialization; condition; update) {
    // body (statements)
}
```

|Component|Description|Example|
|---|---|---|
|**Initialization**|Executed once before loop starts|`int i = 1`|
|**Condition**|Checked before each iteration; loop runs if true|`i <= 5`|
|**Update**|Runs after each iteration|`i++`|

Example:

```java
for (int i = 1; i <= 6; i++) {
    System.out.println(i + " squared = " + (i * i));
}
```

Output:

```
1 squared = 1
2 squared = 4
...
6 squared = 36
```

ASCII visualization:

```
┌──────────────┐
│ Initialization│
└──────┬───────┘
       │
  [Condition true?]
       │Yes
       ▼
  [Execute Body]
       │
  [Update Counter]
       │
  ↺ Repeat
```

---

### 3. Loop Walkthrough (Trace Example)

```java
for (int i = 1; i <= 4; i++) {
    System.out.println(i + " cube = " + (int)Math.pow(i, 3));
}
System.out.println("Whoo!");
```

|i|Printed Output|Explanation|
|---|---|---|
|1|Cube of 1 = 1|Start at 1|
|2|Cube of 2 = 8|Increment by 1|
|3|Cube of 3 = 27||
|4|Cube of 4 = 64|Stops after i > 4|

Output:

```
Cube of 1 = 1
Cube of 2 = 8
Cube of 3 = 27
Cube of 4 = 64
Whoo!
```

---

### 4. Using Expressions in Loops

A counter doesn’t have to increase by 1 always.  
Example (temperature series):

```java
for (double temp = 26.6; temp <= 35.6; temp += 1.8)
    System.out.println(temp);
```

Output:

```
26.6
28.4
30.2
32.0
33.8
35.6
```

---

### 5. Common Loop Example – Fibonacci-like Sequence

```java
int f = 0, g = 1;
for (int i = 0; i <= 10; i++) {
    System.out.println(f);
    f = f + g;
    g = f - g;
}
```

|Iteration (i)|f|g|
|---|---|---|
|0|0|1|
|1|1|0|
|2|1|1|
|3|2|1|
|4|3|2|
|5|5|3|
|6|8|5|
|7|13|8|
|8|21|13|
|9|34|21|
|10|55|34|

---

### 6. Typical Use Cases of `for` Loop

#### (a) Summation (1 + 2 + ... + N)

```java
int sum = 0;
for (int i = 1; i <= N; i++)
    sum += i;
System.out.println(sum);
```

#### (b) Factorial (N!)

```java
long product = 1;
for (int i = 1; i <= N; i++)
    product *= i;
System.out.println(product);
```

#### (c) Print Function Table

```java
for (int k = 0; k <= N; k++)
    System.out.println(k + " " + 2 * Math.PI * k / N);
```

---

### 7. ⚠️ Common Mistake – Loop Termination

Problem statement:

> Write a method `printNumbers(int max)` that prints `1, 2, 3, 4, 5`

Correct solution:

```java
public static void printNumbers(int max) {
    for (int i = 1; i <= max; i++) {
        if (i > 1) System.out.print(", ");
        System.out.print(i);
    }
}
```

**Common Mistake:**  
Forgetting to handle commas properly causes trailing commas or formatting issues.

---

### 8. Loop-Based Prime Number Example

```java
public static void printPrimes(int max) {
    if (max >= 2) {
        System.out.print("2");
        for (int i = 3; i <= max; i++) {
            if (countFactors(i) == 2)
                System.out.print(", " + i);
        }
        System.out.println();
    }
}

public static int countFactors(int number) {
    int count = 0;
    for (int i = 1; i <= number; i++)
        if (number % i == 0) count++;
    return count;
}
```

Output (for `max = 20`):

```
2, 3, 5, 7, 11, 13, 17, 19
```

---

### 9. User Input Example – Multiples Printer

```java
Scanner scan = new Scanner(System.in);
System.out.print("Enter a positive value: ");
int value = scan.nextInt();
System.out.print("Enter an upper limit: ");
int limit = scan.nextInt();

System.out.println("The multiples of " + value + " are:");
int count = 0;
for (int i = value; i <= limit; i += value) {
    System.out.print(i + "\t");
    if (++count % 5 == 0)
        System.out.println();
}
scan.close();
```

---

### 10. Categories of Loops

|Category|Description|Example|
|---|---|---|
|**Definite Loop**|Runs a known number of times|Print 1–10|
|**Indefinite Loop**|Number of repetitions unknown|Repeat until user types “q”|

---

### 11. The `while` Loop

#### Concept

Executes repeatedly **while a condition is true**.

Syntax:

```java
initialization;
while (condition) {
    // statements
    update;
}
```

Example:

```java
int num = 1;
while (num <= 200) {
    System.out.print(num + " ");
    num = num * 2;
}
```

Output: `1 2 4 8 16 32 64 128`

---

### 12. Sentinel-Controlled Loops

A **sentinel** is a special value that signals the end of user input.

Example: Sum until user enters `-1`.

```java
Scanner input = new Scanner(System.in);
int sum = 0;

System.out.print("Enter a number (-1 to quit): ");
int number = input.nextInt();

while (number != -1) {
    sum += number;
    System.out.print("Enter a number (-1 to quit): ");
    number = input.nextInt();
}
System.out.println("Total = " + sum);
```

⚠️ **Common Pitfall:**  
Placing `nextInt()` outside and inside incorrectly can cause _infinite loops_ or skip first input.

---

### 13. Nested Loops

Usually, the outer most loop indicate the row for 2d loop
and 
the inner most loop indicate the column for 2d loop

A **nested loop** means one loop inside another.

Example – pattern printing:

```java
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= 10; j++)
        System.out.print("*");
    System.out.println();
}
```

Output:

```
**********
**********
**********
**********
**********
```

#### Variations

|Code|Output|
|---|---|
|`for (int j = 1; j <= i; j++) System.out.print("*");`|right-angled triangle|
|`for (int j = 1; j <= i; j++) System.out.print(i);`|number pattern|

---

### 14. ⚠️ Infinite Loop Errors

Be careful with loop variable mismatches:

```java
for (int i = 1; i <= 5; i++) {
    for (int j = 1; i <= 10; j++)  // ❌ should be j <= 10
        System.out.print("*");
}
```

---

### 15. Advanced Nested Pattern Example

Output:

```
....1
...2
..3
.4
5
```

Logic:

- Outer loop: controls number of lines (1–5)

- Inner loop 1: prints leading dots

- Inner loop 2: prints numbers


---

### 16. Practice Problems

#### 1️⃣ Moderate-Challenge Coding

1. **Sum of Digits**

    ```java
    Input: 4936
    Output: 22
    ```

   Hint: use while loop.

2. **Reverse an Integer**

    ```java
    Input: 12345
    Output: 54321
    ```

3. **Prime Number Checker**  
   Write `boolean isPrime(int n)`.

4. **Star Diamond Pattern**

    ```
      *
     ***
    *****
     ***
      *
    ```

5. **Print All Odd Numbers from 5–127**


---

#### 2️⃣ Trace Table Practice

|i|j|Printed|Explanation|
|---|---|---|---|
|1|1|`*`|first row|
|2|1,2|`**`|second row|
|...|...|...|...|

---

#### 3️⃣ Conceptual

1. Explain the difference between **definite** and **indefinite** loops.

2. What happens if you forget to update the loop variable?

3. Convert a given `for` loop into its equivalent `while` loop.
    
