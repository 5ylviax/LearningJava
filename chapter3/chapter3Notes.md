# Chapter 3 Selections 

## 3.1 Introduction
`selection statements`: statement that let you choose actions with alternative courses. 
## 3.2 `boolean` Data type 
The **boolean** data type declares a variable with the value either `true` or `false`

Six relational operators (also known as **comparison operators**)
### Comparison Operators

| Java Operator | Mathematics Symbol | Name                     | Example (radius is 5) | Result |
|--------------|--------------------|--------------------------|-----------------------|--------|
| `<`          | `<`                | less than                | `radius < 0`          | false  |
| `<=`         | `≤`                | less than or equal to    | `radius <= 0`         | false  |
| `>`          | `>`                | greater than             | `radius > 0`          | true   |
| `>=`         | `≥`                | greater than or equal to | `radius >= 0`         | true   |
| `==`         | `=`                | equal to                 | `radius == 0`         | false  |
| `!=`         | `≠`                | not equal to             | `radius != 0`         | true   |

A variable that holds a Boolean value is known as a *Boolean variable*. The `boolean`
data type is used to declare Boolean variables. A `boolean` variable can hold one of the two values: true or false. 

```java
boolean lightsOn = true;
```
## 3.3 if statements 
An if statement is a construct that enables a program to specify alternative paths of execution

1. one-way `if` statements
2. two-way `if-else` statement
3. nested `if` statements 
4. multi-way `if-else` statements 
5. `switch` statements

A **flowchart** is a diagram that describes an algorithm or process, showing the steps as boxes 
of various kinds, and their order by connecting these with arrows.

## 3.4 Two-Way `if-else` statement
An if-else statement decides the execution path based on whether the condition is 
true or false.

An if-else statement executes statements for the true case if the boolean- 
expression evaluates to true; otherwise, statements for the false case are executed
```java 
if (number % 2 == 0)
  System.out.println(number + " is even.");
else
  System.out.println(number + " is odd.")
```

## 3.5 Nest `if` and Multi-Way `if-else` statements 
An if statement can be inside another if statement to form a nested if statement.

```java
if (i > k) {
    if (j > k) // Nested 
    System.out.println("i and j are greater than k");
}
else
  System.out.println("i is less than or equal to k")
```

## 3.6 Common Errors and Pitfalls 
Forgetting necessary braces, ending an if statement in the wrong place, mistaking 
== for =, and dangling else clauses are common errors in selection statements. 
Duplicated statements in if-else statements and testing equality of double values 
are common pitfalls.

## 3.7 Generating Random Numbers 
You can use Math.random() to obtain a random double value between 0.0 and 1.0, 
excluding 1.0

# Left off at page 112 on the new book 
