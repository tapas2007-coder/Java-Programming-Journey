# Day 4 - User Input (Scanner class)

# What is User Input?
- User input means taking data from the user during program execution using the `Scanner` class.

# Steps for taking user input 
- Step 1: Import Scanner class
```
import java.util.Scanner;
```
- Step 2: Create Scanner Object
```
  Scanner sc = new Scanner(System.in);
 ```
- Step 3 : Use the object for taking input
```
int n = sc.nextInt();
```

# Common Input Methods
| Method        | Description       | Example                       |
| ------------- | ----------------- | ----------------------------- |
| nextInt()     | Reads integer     | int a = sc.nextInt();         |
| nextFloat()   | Reads float       | float f = sc.nextFloat();     |
| nextDouble()  | Reads double      | double d = sc.nextDouble();   |
| next()        | Reads single word | String s = sc.next();         |
| nextLine()    | Reads full line   | String s = sc.nextLine();     |
| nextBoolean() | Reads true/false  | boolean b = sc.nextBoolean(); |

# Program Practiced
- AddNumbers.java
- AreaOfCircle.java
