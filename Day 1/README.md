## Day 1 - Java Introduction

## About Java.
- Java is High Level Programming Language developed by James Gosling and his Team in 1990 at Sun Microsystems.
- Java is developed from C/C++ but has more features than C/C++.
- Java is widely known for its  
       - Robustness
       - Security
       - Platform Independency(Write Once, Run Anywhere)
       - Object-Oriented Programming (OOPs)
       - Portability
       - Multithreading
       - High Performance (through JVM optimizations)
       - Automatic Memory Management (Garbage Collection)

## JDK, JRE and JVM
- Java Developement Kit (JDK) is a package that contains the evrything required for develope,compile and run a Java Program.
- JDK contains JRE (Java Runtime Environment) and other tools required for developement.
- Inside JRE, Java Virtual Machine (JVM) and Java Libraries are present.
- JVM executes Java bytecode and converts it into machine code that the operating system can understand.
- JVM enables Java's platform independence.
- Other Developement tool like Compiler, Debugger,Java Luncher etc. are also present in JDK.
- The JDK Folder structure is looks like following:
### JDK Structure

```text
JDK
│
├── JRE (Java Runtime Environment)
│   │
│   ├── JVM (Java Virtual Machine)
│   └── Java Class Libraries
│
├── Compiler (javac)
├── Debugger (jdb)
├── Documentation Tool (javadoc)
├── Archiver (jar)
├── Java Launcher (java)
└── Other Development Tools
```

## Java Code Execution Process
- First Programmer writes Java code in Code Editor (VS Code, IntelliJ IDEA etc.).
- After that the compiler converts the Source code into byte code and forms a .class file which contains the byte code.
- Again that byte code converts into machine code by JVM which can the System understand.
### Execution Flow

```text
Java Source Code (.java)
        ↓
Compiler (javac)
        ↓
Bytecode (.class)
        ↓
JVM
        ↓
Machine Code (0/1)
        ↓
Output
```

## Programs Created
- HelloWorld.java
- PrintName.java
- PrintDetails.java
