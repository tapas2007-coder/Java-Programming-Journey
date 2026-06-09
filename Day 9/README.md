# Day 9 - Arrays
# What is an Array?
- An array is a collection of similar data types stored in contiguous memory locations.
- Instead of creating multiple variables, we can store multiple values in a single array.
- In Array indexing starts from 0 to (length-1).
- Example:
    - Without Array
    - ```
      int marks1 = 90;
      int marks2 = 85;
      int marks3 = 95;
      int marks4 = 80;
      int marks5 = 88;
      ```
   - With Array
   - ```
     int[] marks = {90, 85, 95, 80, 88};
     ```

# Advantages of Arrays
- Store multiple values using one variable.
- Easy to access data using index.
- Reduces code redundancy.
- Useful for loops and data processing.

# Array Declaration
- Syntax:
```
dataType[] arrayName;
```
- Example:
```
int[] numbers;
String[] names;
double[] prices;
```
# Array Creation
- Syntax:
```
dataType[] arrayName = new dataType[size];
```
- Example:
```
int[] numbers = new int[5];
```
# Array Initialization
- Method 1: Direct Initialization
```
int[] numbers = {10, 20, 30, 40, 50};
```
- Method 2: Using new Keyword
```
int[] numbers = new int[5];

numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
numbers[3] = 40;
numbers[4] = 50;
```
# Finding Array Length
- Syntax:
```
arrayName.length
```
- Example:
```
int[] numbers = {10, 20, 30, 40};
System.out.println(numbers.length);
```
# Array Traversal
- Arrys can be traversed in 3 way:
    - 1.Using `for` loop
    - 2.Using `while` loop
    - 3.Using `Enhanced for` loop

#  1.Using for loop
```
int[] numbers = {10, 20, 30, 40, 50};

for(int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```
# 2.Using while loop
```
int i = 0;

while(i < arr.length) {
    System.out.println(arr[i]);
    i++;
}
```
# 3.Using Enhanced for loop
- Syntax:
```
for(dataType variable : arrayName)
```
- Example:
```
int[] numbers = {10, 20, 30, 40};

for(int num : numbers) {
    System.out.println(num);
}
```
# Default Values in Arrays
| Data Type | Default Value |
| --------- | ------------- |
| int       | 0             |
| double    | 0.0           |
| boolean   | false         |
| char      | '\u0000'      |
| String    | null          |

# Program Practiced
- ArrayInput.java
- SumArray.java
- LargestElement.java
- SmallestElement.java
