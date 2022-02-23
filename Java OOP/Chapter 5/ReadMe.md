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
