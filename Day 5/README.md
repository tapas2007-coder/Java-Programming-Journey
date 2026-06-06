# Day 5 - Conditional Statement
# What are Conditional Statements?
- Conditional statements allow a program to make decisions based on certain conditions.
- They execute different blocks of code depending on whether a condition is true or false.
- Example:
    - If it is raining → Take an umbrella.
    - If marks are greater than 90 → Grade A.
    - If age is 18 or above → Eligible to vote.

# Types of Conditional Statements in Java
- if
- if-else
- if-else-if ladder
- nested if
- switch //Detailed Explanation in Day 6

# 1.if Statement
- It is used when we want to execute code only if a condition is true.
- Syntax:
```
if(condition){ // if condition is true
    // code to execute
}
```
# 2.if-else Statement
- It is used when we have two possible outcomes.
- Syntax:
```
if(condition){
    // code if true
}
else{
    // code if false
}
```

# 3.if-else-if Ladder
- It is used when multiple conditions need to be checked.
- Syntax:
```
if(condition1){
    // code
}
else if(condition2){
    // code
}
else if(condition3){
    // code
}
else{
    // default code
}
```

# 4. Nested if Statement
- An `if` statement inside another `if` statement is called  Nested if Statement.
- It is used when we have multiple conditions to be checked.
- Syntax:
```
if(condition1){
    if(condition2){
        // code
    }
}
```
# Comparison Table
| Statement  | Purpose                    | Best Use Case       |
| ---------- | -------------------------- | ------------------- |
| if         | Check one condition        | Simple decisions    |
| if-else    | Two outcomes               | Even/Odd, Pass/Fail |
| if-else-if | Multiple conditions        | Grades, Rankings    |
| Nested if  | Condition inside condition | Login, Permissions  |
| switch     | Fixed choices              | Menu, Day, Month    |

# Program Practiced
- Voting.java
- EvenOdd.java
- GradeCheck.java
- DrivingPermit.java
