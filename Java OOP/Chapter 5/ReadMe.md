# Polymorphism
Polymorphism allows programmers to send messages to objects from diffrent classes. A single variable to refer to object from diffrent classes. 

Polymorphism allows us to create one consistent code rather than create diffrent methods for each subclasses.   

Polymorpism enables us to program in general rather to program in specific. It enable us to write programs that process objects of class that are part of same class hierarchy as if they are all objects of their classes. 

## Relationship among objects in hierarchy

**Object of a subclass can be treated as object of its super class**. A program can create a superclass reference that refers to objects of may subclass.   
**A subclass object is an object of its subclass. But a superclass object is not an object of its subclasses.**
```java
class polygon{
    public void display(){
        System.out.println("I am a polygon");
    }
}

class square extends polygon{
    public void display(){
        System.out.println("I am a Square");
    }
}
class playground{
    public static void main(String[] args) {
        polygon poly = new polygon();
        poly.display();
        square sq=  new square();
        sq.display();
        
        //The child can be its parents subclass
        square sq3= new square();
        polygon pol3= sq3;
        pol3.display();
        
        //Its parent(superclass) cant be the childs(subclass) object
        polygon poly2= new polygon();
        square sq2= poly2;// <= ERROR !!
        sq2.display();

    }
}
```


   ``` The above code return an error  Assigning the reference of a superclass object to a subclass-type variable is a compiler-time error```

## UpCasting and DownCasting 
### DownCasting
Casting superclass reference to a subclass reference enables a program to invoker subclass functionality to perform subclass-specific operations on subclass object. 
```java
class playground{
    public static void main(String[] args) {
 //The child can be its parents subclass
        square sq3= new square(); // Crerating subcalss reference sq3
        polygon pol3= sq3; //refering superclass reference(pol3) to subclass reference(sq3) 
        pol3.display(); //Performs subclass operations on subclass object.
    }
}
```

#### Summary on assigment between superclass and subclass variable
Subclass can be treated as if they were superclass objects. This is because the subclass contians all the members of the superclass but subclass have additional subclass-only members.

## Multiple Inheritance and Interfaces
* Interface is like a class but cant be instantiated. It rather gives requirements for class to implement. 
* Intyerface is a description of capability,
* Interface consists of declaration of reated methods . An interface can also contain static and final fields. All interface members are public. A class implements an interface typically provides defination for the methods decalred in the interface.
* A class that implements an interface must provide an implementation for all methods signatures in the interface. An interface reference type are mebers who are constant and abstract methods.
* Compile time error occurs if an identifier naming an interface is used by any other class or interface. 
* All interface methods are abstract.

## Multiple inheritance 
A class can be derived from more than one class.   
**Multiple inheritance is only possible through the use of interfaces.** 


## Pholymorphisim Types

## A. CompileTime polymorphism

## B. Runtime polymorphisim
* It is also referred as dynamic polumorphisim or late binding.
* Decided on Run time 
Therefore JVM binds the method call with the  method body at runtime. This happenes because objects are created at runtime. <br>
* This is implemented using method OverRiding method concept.
* THis is a mechanism where a method of a base class or super class is overriden iin the drived class that is our child to provide specific implementation .
* Having the same method sign with diffrent implementation for method given in super class & child class.

* always works in inhertitance heranachiy 

### Constructor overloading 
* is another implementation complie time polymorphism

### Method hiding 
* Static method cant be overriden. Static method in a subclass hides the static method in the super class.
* Implementation of the complie time polymorphism
##### Syntax 
```Java 
    accessmodifier static returntype Name(){
        //Body
    }
```
* method hiding is always working with ```static```  methods
* 