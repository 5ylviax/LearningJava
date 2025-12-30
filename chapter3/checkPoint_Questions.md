## 3.34 Rewrite the following `if` statements using the conditional operator 

```java
int ticketPrice = (ages >= 16) ? 20: 10;
```
## 3.35
Rewrite the following conditional expressions using if-else statements.

    a. score = (x > 10) ? 3 * scale : 4 * scale;
    b. tax = (income > 10000) ? income * 0.2 : income * 0.17 + 1000;
    c. System.out.println((number % 3 == 0) ? i : j);

```java 
// A
if(x > 10)
    score = scale * 3;
else 
    score = scale * 4;
```
```java 
//B
if(income > 10000)
    tax = income * 0.2;
else 
    tax = income * 0.17 + 1000;
```
```java 
// C
if(number % 3 == 0)
    System.out.println(i);
else 
    System.out.println(j);
```
## 3.36 Write conditional expression that returns -1 or 1 randomly.

```java

```