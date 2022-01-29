# Pholymorphisim

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