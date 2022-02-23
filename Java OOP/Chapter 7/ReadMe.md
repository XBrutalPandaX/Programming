# API Packages
Applucation Programming Interface are prewritten packages,classes, and interfaces with methods, fields and constructors. This minimizes the number of lines written within pieces of code.  
JDK is comprised of 3 components: 
1. Java Compiler 
2. Java Virtual Machine (JVM)
3. Java API
There are 3 API types
1. Java core API, downloaded with JDK
2. Optional Java API, downloaded if needed
3. Unofficial APIs 3rd party APIs that can be downloaded from source websites.

There are 2 diffrent types of packages in Java. 
1. User-defined Packages
are user defined. 
Creating package in Java
the keyword "package" is used to create user-defined packages in java. 
The package statment must be the first line in java source code. 
2. Predefined Packages in java(Built-in)
Are pakages developed by sun Microsystem. This API are prewritten classes and are free to use. The libray contains components for managing input, database programming etc..   
We can import single class or whole package that contains all the classes to specidied package. 
**import** keyword can be used to import classes or package.

```java
import package.name.class; // Single class
import package.name.*; //whole package
```
## Core packages
1. java.lang: consist of Java language. It is fundamental package to write and execute all Java program. Example , classes, objects, String, Thread, predefined datatype. Imported automatically into the java programs. 
2. Java.io: Input output. Read and writ data to file. 
3. JAva util: utility . implements data structures like LinkedList, Dictionary, HashTable, stack, vector, Calander
4. Java.net: Contains networking classes and interface for networking operation. 

### window Toolkit and applet:
5.  Java.awt: abstract window toolkit. It contains GUI(Graphical User Interface) such as buttons, lists menus and text areas. 
* Java.awt.image: contains classes and interfaces for creating image and colors. 
6. Java.applet: is used to create applets. Applets are programs executed from server into client machine on a network. 