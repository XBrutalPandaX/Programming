# Classes and Objects 
## OOP Principles
Class consists of data members and member functions. A Calss defines new programmer defined data type. Once defined it can be used to create object of that type. Class is a template for an object, and an object is instance of a class. 

object -> instance

object 
* object- have state and behaviour. 
* Class - is a template or blueprint of an object 
* Method - is a behaviour. 
* Instance Variable - An object is created by the values assigned to these instance variable 
```java
class classname{
    //type instance-variable1;
    type methodname1(){
        //body of method
    }
}
```

## Instantiation 
Data defined in a class is instance variable.      
When we want to access data members or methods of a class we have ot write    
* Accessing data member**objecname.mebername(dot operator);**   
* Accessing Method **objectname.methodname();**  
``` classname objectname= new classname()```
  suppose   
  >> Box b1= new Box();
  >> box b2 = b1;  
B2 refers to the same object as b1 . Any changes made to the objects through b2 will affect the object to which b1 is reffering . 
We havent created a copy of the object rather we only made a copy of the reference . 
## Class Methods 
have 
* Return 
* Name 
* Parameters
* body 
## Constructors 
Are specicial meber methods that have the same name as the class itself . Do not have specific return type and are not void too . They retunr the instance of the class itself. 
```java
class box{
    box(int heightl, int width){

    }
}
```
Cosntructors have 2 types 
1. Non-Parameterized
2. Parameterized

## 1. Non-Parameterized
```java
class rectangle{
    int x;
    int y;
    // No paramteres
    rectangle(){
        x=10;
        y=20;
    }
}
```
## 2. Paramterized 
```java
class circle{
    int x;
    //paramterized
    circle(int a){
        x=a;
    }
}
```
### Keywords
**new, this, static, super, final**  
#### new:
the new keyword dynamically allocated memory for an object;
#### this:
is the name of the reference that referes to a calling object itself. Local variable hodes the instance variable so we use **this** keyword. We can use **this** to enable a constructor to invoke another cconstructor of the same class. 

#### static:
If we want to create a class member that can be be used independently without creating any object of that class we can use **Static**. It can be accessed befor any object is created.   
We cna decaler both methods and variables to be static. main() is declared as static because it must be called befor any object exist . Instance variable declared as static are global variables. 