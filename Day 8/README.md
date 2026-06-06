# Day 8 - Loop
# What is a Loop?
- A loop is used to execute a block of code repeatedly until a specified condition becomes false.
- Instead of writing the same code multiple times, loops help automate repetitive tasks.
- Example:
    - Without Loop:
      ```
      System.out.println("Hello");
      System.out.println("Hello");
      System.out.println("Hello");
      System.out.println("Hello");
      System.out.println("Hello");
      ```
    - With loop:
      ```
      for(int i = 1; i <= 5; i++) {
      System.out.println("Hello");
      }
      ```
- Loops are used to:
    - Reduce code repetition
    - Improve readability
    - Save time and effort
    - Handle large amounts of data efficiently

# Types of Loops in Java
- 1.`for` Loop
- 2.`while` Loop
- 3.`do-while` Loop
- 4.Enhanced `for-each` Loop

# 1.for Loop
- It is used when the number of iterations is known.
- Syntax:
```
for(initialization; condition; update){
    // code
}
```
- Flow Diagram
```
Initialization
      ↓
  Condition
      ↓
   True?
   /   \
 Yes   No
  ↓     ↓
 Code   End
  ↓
 Update
  ↓
Condition
```

# 2.while Loop
- Used when the number of iterations is unknown.
- Syntax:
```
while(condition){
    // code
}
```
- Flow Diagram
```
Condition
    ↓
 True?
 /    \
Yes   No
 ↓      ↓
Code   End
 ↓
Update
 ↓
Condition
```
# 3.do-while Loop
- Executes at least once even if the condition is false.
- Syntax:
```
do{
    // code
}
while(condition);
```
- In this loop first the `do` block executes and then the condition is checked in the `while` loop.

# 4.Enhanced for-each Loop
- Used for arrays and collections.
- Syntax:
```
for(dataType variable : array){
    // code
}
```
# continue Statement
- Skips the current iteration and moves to the next.
# Nested Loops
- A loop inside another loop is called `Nested Loops`.
- Syntax:
```
for(initialization1; condition1; update1) {
    for(initialization2; condition2; update2) {
        // Code to execute
    }
}
```
# Loop Comparison Table
| Feature                | for      | while  | do-while      |
| ---------------------- | -------- | ------ | ------------- |
| Condition Check        | Before   | Before | After         |
| Executes At Least Once | No       | No     | Yes           |
| Known Iterations       | Best     | Good   | Not Preferred |
| Unknown Iterations     | Possible | Best   | Good          |

# Program Practiced
- MultiplicationTable.java
- ReverseNumber.java
- PasswordChecker.java
- RightTriangle.java
