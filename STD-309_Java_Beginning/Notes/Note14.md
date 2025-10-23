
---
# Loop and Nested Loop (Lecture -2)

## 1. Overview
This lecture extends loop concepts to include:

- **`do-while`** loop (ensures at least one execution)
- **`break`** and **`continue`** statements
- **nested loops** (complex patterns)
- **loop control best practices**

---

## 2. Recap: Loop Categories

| Loop Type | Execution Condition | Example |
|------------|--------------------|----------|
| **Definite Loop** | Executes a *known* number of times | `for` loop |
| **Indefinite Loop** | Executes *until* a condition becomes false or sentinel reached | `while` or `do-while` |

---

## 3. `while` vs `for` Recap

Both achieve repetition, but usage differs.

| Feature | `for` Loop | `while` Loop |
|----------|-------------|--------------|
| Used for | Known iteration count | Unknown repetition |
| Declaration | `for (init; cond; update)` | Initialization before, update inside |
| Example | Counting loop | Sentinel or user input |

Example equivalence:

```java
// for loop
for (int i = 0; i <= n; i++)
    System.out.println(2 * i);

// equivalent while loop
int i = 0;
while (i <= n) {
    System.out.println(2 * i);
    i++;
}
## 4. The `do-while` Loop

### Concept

- Similar to `while`, but **condition checked after** the body.
    
- Ensures **at least one execution**.
    

### Syntax

```java
do {
    // loop body
} while (condition);
```

### Example

```java
int i = 1;
do {
    System.out.println("Number: " + i);
    i++;
} while (i <= 3);
```

**Output**

```
Number: 1
Number: 2
Number: 3
```

🧠 **Key Difference:**  
Even if `i` starts greater than 3, this loop executes once before checking the condition.

---

## 5. `break` Statement

### Concept

Used to **exit a loop immediately**, regardless of the loop condition.

### Example

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) break;
    System.out.println("i = " + i);
}
```

**Output**

```
i = 1
i = 2
```

⚠️ **Caution:**  
`break` exits _only the nearest_ loop — not nested outer loops unless specifically controlled.

---

## 6. `continue` Statement

### Concept

Skips the current iteration and continues to the next.

### Example

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue;
    System.out.println("i = " + i);
}
```

**Output**

```
i = 1
i = 2
i = 4
i = 5
```

🧠 Use `continue` to **skip specific conditions** without breaking the loop entirely.

---

## 7. Combined Example

```java
int i = 0;
do {
    i++;
    if (i == 2) continue;  // skip when i=2
    if (i == 4) break;     // exit when i=4
    System.out.println("i = " + i);
} while (i < 5);
```

**Output**

```
i = 1
i = 3
```

ASCII Flow:

```
 ┌──────────────┐
 │  Start (i=0) │
 └──────┬───────┘
        ▼
 [Execute Body]
   ├── if (continue) → skip next
   ├── if (break) → exit
   └── else → repeat (i++)
```

---

## 8. Nested Loops

Nested loops allow for complex patterns and multi-dimensional iteration.

### Example 1 – Star Pattern

```java
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= 10; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

**Output**

```
**********
**********
**********
**********
**********
```

### Example 2 – Right Triangle

```java
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++)
        System.out.print("*");
    System.out.println();
}
```

Output:

```
*
**
***
****
*****
```

### Example 3 – Number Pyramid

```java
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++)
        System.out.print(i);
    System.out.println();
}
```

Output:

```
1
22
333
4444
55555
```

---

## 9. ⚠️ Common Errors (Infinite Loops)

|Mistake|Problem|
|---|---|
|`for (int j = 1; i <= 10; j++)`|Using wrong variable in condition (should be `j <= 10`)|
|`for (int j = 1; j <= 10; i++)`|Incrementing wrong variable (`i++` instead of `j++`)|

**Tip:** Always verify variable names and conditions in nested loops.

---

## 10. Complex Nested Output

**Desired Output:**

```
....1
...2
..3
.4
5
```

**Explanation**

- Outer loop → number of lines

- Inner loop 1 → dots (decreasing count)

- Inner loop 2 → numbers


**Code**

```java
int n = 5;
for (int i = 1; i <= n; i++) {
    for (int j = n - i; j > 0; j--)
        System.out.print(".");
    System.out.println(i);
}
```

---

## 11. Practice Section

### 🧩 Conceptual Exercises

1. Describe the difference between:

    - `while` and `do-while`

    - `break` and `continue`

2. When is a `do-while` loop preferable over a `while` loop?


---

### 💻 Coding Challenges

#### 1️⃣ Even and Odd Sum

Write a program that sums even and odd numbers separately from 1–100.

**Expected Output:**

```
Sum of even numbers = 2550
Sum of odd numbers = 2500
```

---

#### 2️⃣ Sentinel Input Average

Take integer inputs until the user enters `-1`.  
Print the total and average.

```
Enter number (-1 to quit): 10
Enter number (-1 to quit): 20
Enter number (-1 to quit): -1
Sum = 30
Average = 15.0
```

---

#### 3️⃣ Nested Pattern with Break/Continue

Print numbers 1–5 in rows but **skip printing 3**.

```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 5; j++) {
        if (j == 3) continue;
        System.out.print(j + " ");
    }
    System.out.println();
}
```

Output:

```
1 2 4 5
1 2 4 5
1 2 4 5
```

---

#### 4️⃣ Pyramid of Numbers (Challenge)

```
   1
  121
 12321
1234321
```

_Hint:_ Use nested loops and condition `j <= i ? j : 2*i - j`.

---

#### 5️⃣ Debug the Infinite Loop

Find and fix:

```java
for (int i = 1; i <= 10; ) {
    System.out.println(i);
}
```

---

### 🧠 Analytical Questions

|Question|Hint|
|---|---|
|How do you convert a `for` loop into a `while` loop?|Move init before, update inside|
|Why might you prefer a sentinel over a counter?|Unknown input size|
|Can `break` be used outside a loop?|❌ No – compiler error|

