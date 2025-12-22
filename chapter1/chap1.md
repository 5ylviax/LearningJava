# Introduction to Comptuers, Programs, and Java 

## 1.1 Introduction 
`Programming` means to create (or develop) software, which is also called `program`. Software contains the instructionn that tell a computer what to do. 

Who created java? developed by a team leb by James Gosling at Sun Microsystem. Then purchased by Oracle in 2010. (Designed in 1991)

Java is: 
- simple
- object oriented
- distributed 
- interpreted 
- robust 
- secure
- architecture neutral
- portable
- high performance 
- multithreaded
- dynamic 

## 1.6 The Java Language Specificiation, API, JDK, and IDE
`syntax` is comptuer languages strict rule of usage.

`API` Application program Interface, also known as *library*, contains predefined 
classes and interfaces for developing Java programs.
## 1.7 A simple Java Program 
A Java program is executed from the **main*** method in the class

`Console Input` means to receive input from the keyboard

`Console Output` means to display output on the monitor

```java
/*1*/ public class Welcome { 
/*2*/     public static void main(String[] args){
/*3*/         System.out.println("Welcome to Java!");
/*4*/     }
}
```
1. Line 1 - Naming convention for defining a class is always start witha uppercase letter. 
2. Line 2 - program is executed fromt the main method. A class may contain several method. Main method is the entry point where the program begins 
3. `System.out.println` displays the string 
4. `;` every statement in Java ends with a semicolon, known as the *statement terminator* 

## 1.10 Programming Erorrs
Programming erros can be categorized into three types 
1. syntax errors 
2. runtime errors are errors that cause a program to terminate abnormally. 
    - dividing by zero
    - wating for data type inputs (correct one)
3. logic errors occurs when a program does not perrom the way it was inteded to. 

