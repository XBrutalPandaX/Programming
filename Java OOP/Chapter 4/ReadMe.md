# Inheritance
In Inheritance a new class is defined by an olfer exisiting class. This leads to the new class having all functionality of the older, pre-existing class . We can add more functionality in the new class.   
This helps for re-usage of code.  
### Superclasses and Subclasses
Every subclass is an object of its superclass. and one super class can have many subclasses.  
Objects of all classes that extend a superclass can be treated as objects of that superclass.  
such relation is called **"is-a" ***realtion. Superclass objects cant be object of theri subclass. 
### Protected Members
Protected members can be accesed bu members of that superclass, and by members of that classes in the same package.
### Overriding a method
If a subclass decalares a method with the same signiture as the superclass it is siad method overriding.  
If a method overrides another method then a compile-time error occurs if they have diffrent return type.   
the access modifier for the overriding method must provide as much access as the overriden method. 
if private method is never accessible and cant be overriden 
### Using this() and super()
**super()** wiwll call the parents constructor which has the appropriate supplied parameters. super() has 2 forms   
the first is call of cuperclass constructor.  
The second is used to access memeber of the superclass that has been hidden by member of the subclass.   
``` java
super(int data);// this calls the cosntructor
super.i; // this calls the var in the superclass
```
Super can also be used to call methods that are hidden by subclasses.
### Use of final with inheritance
a class can be decalred final if its defintion is complete and no subclasses are desired or required. A compile time error happens if the name of the final class apperars in the extended class. 
**final class cant have any subclasses** 
Final has 3 uses
1. it can be used to create equivalent of constant.
2. final keyword prevents overriding. meaing it disallow method from being overeriden. 
3. final prevents inheritance . It will prevent a class from being ingerited. Declaring a class as final implicitly declares all of its methods as final .
### Constructors in subclasses
- When an object of a sub class is intiated it first calls the constructor of the super class. Then after that it goes to its own constructor at last.
