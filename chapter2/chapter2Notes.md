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
