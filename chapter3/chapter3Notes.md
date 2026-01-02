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

## 3.8 
```java
System.eixt(status)
```
Invoking this method terminates the program. The status 0 indicates that the program is terminated normally. A nonzero status code indicates abnormal termination.

## 3.10 Logical Operators 
The logical operators !, &&, ||, and ^ can be used to create a compound Boolean 
expression.
### Table 3.3 — Boolean Operators

| Operator | Name         | Description         |
|----------|--------------|---------------------|
| `!`      | not          | logical negation    |
| `&&`     | and          | logical conjunction |
| `\|\|`   | or           | logical disjunction |
| `^`      | exclusive or | logical exclusion   |

`!` negates true to false, and false to true.

`&&` is true if and only if both operands are true.

`\|\|` is ture if at least one of the operands is true.

`^`is true if and only if if the two operands have different Boolean values. 

## 3.13 swtich Statements 
A switch statement executes statements based on the value of a variable or an 
expression.

## 3.14 Conditional Expressions 
A conditional expression evaluates an expression based on a condition.

```java
if(x > 0)
  y = 1; 
else 
  y = -1;
```
Alternative
```java
y = (x > 0) ? 1 : -1;
```
Conditional expressions are in a completely different style, with no explicit `if` in the state
ment. The syntax is
```bash 
boolean-expression ? expression1 : expression2;
```
The symbols `?` and `:` appear together in a conditional expression. They form a 
conditional operator and also called a ***ternary operator*** because it uses three operands. 
It is the only ternary operator in Java.

## 3.15 Operator Precedence and Associativity
Operator precedence and associativity determine the order in which operators are 
evaluated.

operators are applied according to the precedence rule and the 
associativity rule.
| Precedence (High → Low) | Operators | Description |
|------------------------|-----------|-------------|
| 1 | `var++`, `var--` | Postfix increment / decrement |
| 2 | `+`, `-`, `++var`, `--var` | Unary plus/minus, Prefix increment/decrement |
| 3 | `(type)` | Casting |
| 4 | `!` | Logical NOT |
| 5 | `*`, `/`, `%` | Multiplication, Division, Remainder |
| 6 | `+`, `-` | Binary addition and subtraction |
| 7 | `<`, `<=`, `>`, `>=` | Relational |
| 8 | `==`, `!=` | Equality |
| 9 | `^` | Exclusive OR |
|10 | `&&` | Logical AND |
|11 | `\|\|` | Logical OR |
|12 | `=`, `+=`, `-=`, `*=`, `/=`, `%=` | Assignment operators |

All binary operators except assignment operators are left associative.

## 3.16 Debugging 
Debugging is the process of finding and fixing errors in a program.

Logic errors are called bugs.

The process of finding and correcting errors is called 
debugging. 

How to debug:
- Executing a single statement at a time
- Tracing into or stepping over a method
- Setting breakpoints
- Displaying variables
- Displaying call stacks
- Modifying variables
