# Day 6 - Switch Statement
# What is a Switch Statement?
- The switch statement is a decision-making statement used to execute one block of code from multiple options.
- It is an alternative to writing long `if-else-if` ladders when we need to compare a variable against fixed values.
# Why Use Switch?
- Without switch:
```
if(day == 1){
    System.out.println("Monday");
}
else if(day == 2){
    System.out.println("Tuesday");
}
else if(day == 3){
    System.out.println("Wednesday");
}
```
- Using switch:
```
switch(day){
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
}
```

# Syntax of Switch Statement
```
switch(expression){

    case value1:
        // code
        break;

    case value2:
        // code
        break;

    case value3:
        // code
        break;

    default:
        // code
}
```

# How Switch Works
- Step 1: The expression is evaluated.
- Step 2: Java compares the expression value with each case.
- Step 3: If a match is found, that case executes.
- Step 4: `break` exits the switch block.
- Step 5: If no case matches, `default` executes.

# Flow diagram
```
switch(expression)
        |
        v
   Match Case?
     /     \
   Yes      No
    |        |
 Execute   Default
    |
  Break
    |
   End
```
# The Importance of break & default
- `break` stops the execution after a case is matched.
- Without `break`, execution continues into the next cases. This is called `Fall Through`.
- The `default` block runs when no case matches.

# Modern Switch Expression (Java 14+)
```
switch(value){

    case 1 -> System.out.println("One");

    case 2 -> System.out.println("Two");

    default -> System.out.println("Invalid");
}
```
- In Modern Switch Expression
    - Advantages:
        - No break needed
        - Cleaner syntax
        - Less chance of errors
# Data Types Supported by Switch
| Supported | Not Supported |
| --------- | ------------- |
| byte      | long          |
| short     | float         |
| int       | double        |
| char      | boolean       |
| String    |               |
| enum      |               |

# Program Practiced
- Calculator.java
- DayFinder.java
- TrafficLightSimulator.java
