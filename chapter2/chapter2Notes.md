`algorithm` describes how a problem is solved by listing the actions that ned to be taken and the order of their execution

`variable` represents a value stored in the computer's memory

`+` is called a *string concatenation opeartor* has two meanings:
1. one for addition
2. concatenating (combining) strings

**Caution** 
A string cannot cross lines in the source code. Thus, the following statement would 
result in a compile error

```java 
// Wrong
System.out.println("Introduction to Java Programming,
by Y. Daniel Liang");
```
```java
// Corret
System.out.println("Introduction to Java Programming, " +
"by Y. Daniel Liang");
```
## 2.3 Reading Input from the Console 
Scanner class for console input. 

`System.out` to refer to the standard output device

`System.in` to the standard input device

Console input is not directly supported in Java, but you can use the Scanner class to create an object to read input from System.in, as follows:
```java
Scanner input = new Scanner(System.in);
```
In order to create a Scanner object you have to import the package
```java
import java.util.Scanner;
```
There  are two types of **import** statements 
- *specific import* specifies a single class in the import statement
    ```java
    import java.util.Scanner;
    ```
- *wildcard import* imports al lthe classes in a package by using the asterisk as the wildcard
    ```java
    import java.util.*
    ```
To invoke a method on an object is to ask the object to perform a task. You can invoke the nextDouble() method to read a double value as follows
```java
double radius = input.nextDouble();
```
```java
// println method moves to the beginning of the next line after displaying the string
System.out.println("what");
```
```java
// print method does not advance to the next line when completed
System.out.print("hello")
```
## 2.4 Identifiers 
Identifiers are the names that identify the elements such as classes, methods, and variables in a program.
Rules for identifiers:
- An identifier is a sequence of characters that consists of letters, digits, underscores 
(_), and dollar signs (`$`)
-  An identifier must start with a letter, an underscore (_), or a dollar sign ($). It cannot 
start with a digit
- An identifier cannot be a reserved word
- An identifier cannot be `true`, `false`, or `null`
- An identifier can be of any length

Java is case sensitive where area, Area, and AREA are all different identifiers
## 2.5 Variables 
Variables are used to represent values that may be changed in the program.
Varaibles are for representing data of a certain type. 

To use a variable, you declare it by telling the compiler its name as well as what type of data it can store

The *variable declaration* tells the compiler to allocate appropriate memory space for the variable based on its data type
```bash
datatype variableName;
```
```java
int count;              // Declare count to be an integer variable
double radius;          // Declare radius to be a double variable
double interestRate;    // Declare interestRate to be a double variable
```
If variables are of the same type, they can be declared on the same line
```java 
int j, k, l; // Declare i, j, and k as int variables
```
***Scope of a variable*** is the part of the program where the 
variable can be referenced.
## 2.6 Assignment Statements and Assignment Expressions 
An assignment statement designates a value for a variable. An assignment statement 
can be used as an expression in Java.

After a variable is declared, you can assign a value to it by using an *assignment statement*. 

In Java, the equal sign (`=`) is used as the *assignment operator*. The syntax for assignment state
ments is as follows:
```bash
variable = expression
```
`expression` represents a computation involving values, variables, and operators that, 
taking them together, evaluates to a value
## 2.7 Named Constants 
A named constant is an identifier that represents a permanent value.
*named constant*, or simply *constant*, represents permanent data that never changes.

An example in are previous code is the value of 3.14 is a constant.

```java
final datatype CONSTANTNAME = value
```

Benefits of using constants: 
1.  you don’t have to repeatedly type the same value if it is used multiple times
2.  if you have to change the constant value (e.g., from 3.14 to 3.14159 for PI), you need to change it only in a single location in the source code
3. a descriptive name for a constant makes the program easy to read.

## 2.8 Naming Conventions
Choosing descriptive names with straightforward meanings for the variables, constants, classes and methods in the program. 

Conventiont to follow: 
- Use lowercase for variables and methods. If a name consists of several words, con
catenate them into one, making the first word lowercase and capitalizing the first 
letter of each subsequent word
- Capitalize the first letter of each word in a class name
- Capitalize every letter in a constant, and use underscores between words—for exam
ple, the constants

## 2.9 Numeric Data Types and Operations 
| Name   | Range                                                                 | Storage Size        |
|--------|-----------------------------------------------------------------------|---------------------|
| byte   | −2⁷ to 2⁷ − 1 (−128 to 127)                                            | 8-bit signed        |
| short  | −2¹⁵ to 2¹⁵ − 1 (−32768 to 32767)                                      | 16-bit signed       |
| int    | −2³¹ to 2³¹ − 1 (−2147483648 to 2147483647)                            | 32-bit signed       |
| long   | −2⁶³ to 2⁶³ − 1 (−9223372036854775808 to 9223372036854775807)          | 64-bit signed       |
| float  | Negative: −3.4028235E+38 to −1.4E−45<br>Positive: 1.4E−45 to 3.4028235E+38 | 32-bit IEEE 754     |
| double | Negative: −1.7976931348623157E+308 to −4.9E−324<br>Positive: 4.9E−324 to 1.7976931348623157E+308 | 64-bit IEEE 754     |

### Methods for Scanner Objects (Reading Numbers from the Keyboard)
| Method        | Description                                   |
|---------------|-----------------------------------------------|
| `nextByte()`  | Reads an integer of the `byte` type.          |
| `nextShort()` | Reads an integer of the `short` type.         |
| `nextInt()`   | Reads an integer of the `int` type.           |
| `nextLong()`  | Reads an integer of the `long` type.          |
| `nextFloat()` | Reads a number of the `float` type.           |
| `nextDouble()`| Reads a number of the `double` type.          |

### Numeric Operators 
|Name| Meaning  | Example| Result|
|----|----------|--------|-------|
|+| Addition | 34 + 1 | 35 |
|-| Subtraction | 34.0 - 0.1 | 33.9|
|*| Multiplication | 300* 30 | 900|
|/| Division | 1.0/ 2.0 | 0.5 |
|%| Modulo| 20 % 3 | 2|

### Exponent Operations
`Math.pow(a, b)` this method can be used to compute exponents. The pow method is defined in the `Math` class in the Java API. Invoke this method using the syntax `Math.pow(a, b)` = $a^b$

```java
System.out.println(Math.pow(2, 3)); // Display 8.0
```

## 2.10 Numeric Literals
A ***literal*** is a constant value that appears directly in a program
### Integer Literals 
An integer literal can be assigned to an integer variable as long as it can fit into the variable.

An example is the statement `byte` `b = 128`.
- this will cause a compile error because 128 cannot be stored in a variable of the byte type. 
### Floating-Point Literals 
Floating-point literals are written with a decimal point. By default, a floating-point literal is 
treated as a double type value. 

For example, `5.0` is considered a `double` value, not a `float` value.
The double type value is more accurate than the float type values

### Scientific Notation 
Floating-point literals can be written in scientific notation in the form of $a * 10^b$

For example the scientific notation for 123.456 is $1.23456 \times 10^2$.

A special syntax is used to write scientific notation number for the example above is written as `1.23456E2` or `1.23456E+2`

## 2.11 Evaluating Expressions and Operator Precedence 
Java expressions are evaluated in the same way as arithmetic expressions.

From left to right

1. parenthesis
2. multiplication
3. division / modulo
4. Addition
5. subtraction


## 2.13 Augmented Assignment Operator 

|Operator | Name | Example | Equivalent|
|---------|------|---------|-----------|
|`+=`| Addition assignment| i += 8| i = i + 9|
|`-=`| Subtraction assignment| i -= 8 | i = i - 8|
|`*=`| Multiplication assigment| i *= 8 | i = i * 8|
|`/=`| Division assignment | i /= 8 | i = i / 8|
|`%=`| Remainder assignment| i %= 8 | i = i % 8|

x /= 4 + 5.5 * 1.5; In this following example, the augemented assignment operator is performend last after all the operator in the expression are 

## 2.14 Increment and Decrement Operators 
The increment operator (++) and decrement operator (––) are for incrementing and 
decrementing a variable by 1

`++` for incrementing by 1 

`--` for decrementing by 1 
### Table 2.5 — Increment and Decrement Operators

| Operator | Name          | Description                                                                 | Example (assume `i = 1`) |
|----------|---------------|-----------------------------------------------------------------------------|--------------------------|
| `++var`  | preincrement  | Increment `var` by 1, and use the new `var` value in the statement          | ```c\nint j = ++i;\n// j is 2, i is 2\n``` |
| `var++`  | postincrement | Increment `var` by 1, but use the original `var` value in the statement     | ```c\nint j = i++;\n// j is 1, i is 2\n``` |
| `--var`  | predecrement  | Decrement `var` by 1, and use the new `var` value in the statement          | ```c\nint j = --i;\n// j is 0, i is 0\n``` |
| `var--`  | postdecrement | Decrement `var` by 1, but use the original `var` value in the statement     | ```c\nint j = i--;\n// j is 1, i is 0\n``` |

## 2.16 Numeric Type Conversions 
Floating-point numbers can be converted into integers using explicit casting.

***Casting*** is an operation that converts a value of one data type into a value of another data type.
- Casting a type with a small range to a type with a larger range is known as ***widening a type*** 
- Casting a type with a large range to a type with a smaller range is known as ***narrowing a type***

Java automatically widen a type whereas as you must narraow a type explicitly

The syntax for casting a type is to specify the target type in parentheses, followed by the 
variable’s name or the value to be cast. For example, the following statement

```java 
System.out.println((int)1.7); // displays 1 
```
```java
System.out.println((double) 1 / 2); // displays 0.5
```
## 2.17 Software Development Process
The software development life cycle is a multistage process that includes requirements 
specification, analysis, design, implementation, testing, deployment, and maintenance.
1. Requirements Specification
2. System Analysis
3. System Design
4. Implementation
5. Testing
6. Deployment
7. Maintenance 

- Requirements specification is a formal process that seeks to understand the problem the 
software will address, and to document in detail what the software system needs to do. This 
phase involves close interaction between users and developers
- System analysis seeks to analyze the data flow and to identify the system’s input and out
put. When you perform analysis, it helps to identify what the output is first, then figure out 
what input data you need in order to produce the output.
- System design is to design a process for obtaining the output from the input. This phase 
involves the use of many levels of abstraction to break down the problem into manageable 
components and design strategies for implementing each component. You can view each 
component as a subsystem that performs a specific function of the system. The essence of 
system analysis and design is input, process, and output (IPO).
- Implementation involves translating the system design into programs.
- Testing ensures the code meets the requirements specification and weeds out bugs
- Deployment makes the software available for use.
- Maintenance is concerned with updating and improving the product

## 2.18 Common Errors and Pitfalls 
Common elementary programming errors often involve undeclared variables, unini
tialized variables, integer overflow, unintended integer division, and round-off errors.
