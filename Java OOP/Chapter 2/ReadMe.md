# Java Chapter 1
Table of content 
1.1 Data Types
## Java variable 
### Types of variables
* Local variable
* Instance variable
* Static variable
#### a. Local variable
Decared inside a body of a method other methods are not aware of this type of variable.
``` java
public class variables {
    public static void main(String[] arg){
        int x=10;
        System.out.println(x);
    }
}
```
#### b. Instance variable
Are declared inside a class but outside any method
One instance-specific is not sharead amoung instance of a class(object).
Creating an object is a requirement to access and use instance of variable.
We dont have to use ```Static``` keyword
#### c. Static Variable
Decalerd inside a class but outisde of a metjod. We can use Static keyword in Variable declaration. Single copy of static variable is created and it can be shared amoung instances of the class.
### Primitive data types

* a. Byte 
* Short
* Int
* Long
* Float (8.9f)
* Double(8.9d)
* Booln
* Char
* Byte

### Creating Constant 
We can create a constant by declaring keyword final/
``` java
final int co=90;
        co=10*90;
        System.out.println(co);
```
commonly static keyword is used.
<u>Static<u> enables to have one copy of the contant
enables us to accesss without objects.
