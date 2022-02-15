# Java Chapter 2
Table of content 
1.1 Data Types
1.2 Flow Control
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
### 1.Primitive data types

* a. Byte 
* Short
* Int
* Long
* Float (8.9f)
* Double(8.9d)
* Booln
* Char
* Byte
### 2. Reference Data Types:
Reference var are created to 
### Creating Constant 
We can create a constant by declaring keyword final/
``` java
final int co=90;
        co=10*90;
        System.out.println(co);
```
commonly static keyword is used.
Static enables to have one copy of the contant
enables us to accesss without objects.
## Flow Control
#### Options 
* Sequential Statment 
* Branching (conditional) statment
* Looping

## Sequential Statment
All statments in the program will be executed <br>
Exec in the order given in the source code 

## Branching (Conditional) Statment

# Array 
Array is a datastructure that stores dixed-size sequential collection of elements of the same type 
- instead of creating n-number of scalar variables that store single value we can have an array with n-element.
Creating Array 
## Option 1:
### A. Decalaaring array variable 
* Variable that holds reference to an array.
#### Syntax:
``` elementType[] arrayRefvariable; ```
element type is data type , array ref var is IDentifier for array variable
or 
``` elementType[] arrayRefvariable[];```

### B. Creating Array
-use new operator.
Syntax:
``` arrayRefvar = new elementTYpe[size];```
Example : 
```java
int[] mylist;
mylist = new int[5]
```

## Option2: 
* Use one Statment to declare & declare array.
Syntax :
```java
elementType [] arrayRefvar = new elementType[size];
```

Example :
``` int[] x= new int[10]; ```
## Option 3:
Array intialization can be used to create an array
Syntax: 
elementType[] arrayRefvar = {v1,v2,v3,v4,v}
points :
* ArraySize mut be given
* Size cant be chnaged one created
* Can access size of the array umber of element using length method.
* Default value for array element: 
* numeric 
* cahracter 
* boolean 
* new operator not used with array intialization 
* Array intializer should be given in one statment
``` java 
int[] x;
x={1,2,4,5};
// THis is not allowed
```
### Foreach Loop for Arrays
we can use foreach loop to traverse array wihtout  index
```java
for(int i: list_A){
    System.out.println(i);
}
```
### PAsssing Array to Methods 
We can pass arrays to methods as follow 
```java 
public class playground {
    public static void main(String[] args) {
        int[] list={12,67,90};
        display(list);
    }
    public static void display(int[] list) {
        for (int a: list) {
            out.println(a);
        }

    }
}

```
## TYpes of Arrays
* One-dimensional array
* Multi-dimensional array
### 1.) One dimesnsioanl array 
Stores Linear collection
* one row multiple comumns
#### Accessing array elements
USe index number . Index number starts from 0 - n-1 .
``` test[0]=12.5; ```
TO prossses array we can use for loop or for each loop
```java
 int[] test= new int[5];

        for(int i=0;i<5;i++){
            Scanner in= new Scanner(System.in);
            test[i]=in.nextInt();
        }
```
##### For each loop
* Varent of for loop that works with array
Syntax: 
for (dataType var : arrayName){
    Statment;
}
foreach loop works as long as there is array statment not yet proccessed.
* var-> used to store value of an element
* arrayname -> array variablname 
### 2.) Mulidimension Array
- Java Support n-dimensiton in an array.
- Most Common Multi-dimensional array is two dimensional
2. Dimmesnional 
* Store a matrox or tabular data.
* Creating one-dimensional array within another array.
Syntax: 
``` elementType [][] = arrayRefvar = new elementType [size][size];```
example: 
``` double [][] testRes =new double[10][5];```
### Ragged Array
Allows diffrent length for the outer array.
Speacial type of 2 dimensional array that stores diffrent number of elemensts in the rows.
Syntax:
``` elementType[][] nameArray = new elementType[][];```
#### Processing array elements
Index number used to access or mainipulate each element.
nested looping statment should be used.

## Methods
Is a collection of statments grouped together to perform an operation .
### Creating Method
```java
public static int methodName(int a, int b) {
// body goes here
}
```
* Public static- modifier 
* int - return type
* methodName - name of method
* a,b -parameters
* int a , int b - list of parameters

> modifier - define access type 
> teturnType - return value 
> param- list of paramters

### Method OVerloading 
When a class has 2 or more methods by the same name with diffrent paramters it is known as ```Method Overloading``` . It is diffrent from overriding. 
example
``` java
public static int mult(int a,int b){
    int result= a*b;
    return result;
}
public static int mult(int a,int b, int c){
    int result= a*b*c;
    return result;
}
public static int mult(double x,double y){
    int result= a*b;
    return result;
}
```
### Varaible Arguments
We can pass variable name of arguments of the same type to a method. 
``` typeName... parameterName```

```java
    public static void main(String[] args) {
        int[] list={12,67,90,80,67};
        display(list);
    }

    public static void display(int... list) {
        for (int a: list) {
            out.println(a);
        }
    }
```
### Strings 
We can create string objects by using new keyword and a constructor. String class has 11 constructors that allow us to provide intial value of string using diffrent sources such as an arry of charcters.
```java
    char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
    String helloString = new String(helloArray);
    System.out.println( helloString );
```
```String class is immutable once its created a String object cannot be changed```
#### String Length
method used to obtain info about an object are known as ``` accessor methods```. One example is <b>length()</b> 
### Concatentating Strings
we can concatenate two strings with 
```java 
string1.concat(string2);
```
 