# Day 2 - Variables & Data Types

# Variables
- Variables are the name of a memory location where the actual data is stored and can be changed during program execution.
- Syntax:
    - datatype variable name = value ;
- Example:
    - int age = 19;
- Rules for Naming Variables
    - Must start with a letter, _, or $
    - Cannot start with a number
    - No spaces allowed
    - Cannot use keywords (like int, class)
    - Case-sensitive (age ≠ Age)

# Types of Variables 
- Variable is divided into 3 types, i.e
    - Local Variable
    - Instance Variable
    - Static Variable

# 1.Local Variable
- Declared inside method/block
- Exists only inside that method
```
void show() {
    int x = 10; // local variable
  }
```

# 2.Instance Variable
- Declared inside class but outside method
- Belongs to object
```
class Student {
    int age; // instance variable
  }
```

# 3.Static Variable
- Shared among all objects
- Declared using `static` keyword
```
 class Student {
    static String college = "GITA"; //static variable
}
```
##  Difference Between Local, Instance and Static Variables (Java)

| Feature | Local Variable | Instance Variable | Static Variable |
|--------|----------------|------------------|----------------|
|  Where declared | Inside method, constructor or block | Inside class but outside method | Inside class with `static` keyword |
|  Belongs to | Method / Block | Object (instance) | Class |
|  Memory location | Stack memory | Heap memory | Static / Method area |
|  Lifetime | Till method execution ends | Till object exists | Till program ends |
|  Sharing | Not shared | Separate for each object | Shared among all objects |
|  Default value | No default value (must initialize) | Has default values | Has default values |
|  Access | Only inside method/block | Through object reference | Through class name or object |
|  Example | `int x = 10;` | `int age;` | `static int count;` |

# Data Type
- Data types defines what type of data is stored inside a variable.
# Types of Data types
- Data type is mainly 2 type:
    - Primitive Data type
    - Non-Primitive Data type

# 1.Primitive Data type
| Type    | Size    | Example    | Description            |
| ------- | ------- | ---------- | ---------------------- |
| byte    | 1 byte  | 10         | Small integer          |
| short   | 2 bytes | 1000       | Medium integer         |
| int     | 4 bytes | 100000     | Default integer        |
| long    | 8 bytes | 100000L    | Large integer          |
| float   | 4 bytes | 3.14f      | Decimal (less precise) |
| double  | 8 bytes | 3.14159    | Decimal (more precise) |
| char    | 2 bytes | 'A'        | Single character       |
| boolean | 1 bit   | true/false | Logical value          |

# 2.Non-Primitive Data type
| Feature | Primitive     | Non-Primitive |
| ------- | ------------- | ------------- |
| Storage | Value         | Reference     |
| Size    | Fixed         | Varies        |
| Methods | Not available | Available     |
| Example | int, char     | String, Array |

# Type Conversion
- Widening Type Conversion (Automatic)
    - Converts smaller data type into larger data type.
    - ```
      int a = 10;
      double b = a; // automatic
      ```
- Narrowing Type Conversion (Manual Casting)
    -  Converts larger data type into smaller data type.
    -  ```
       double a = 10.5;
       int b = (int) a; // Manual
       ```
# Program Practice
- SwapNumbers.java
- StudentDetails.java
- TypeConversion.java
