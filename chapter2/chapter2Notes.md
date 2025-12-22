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
