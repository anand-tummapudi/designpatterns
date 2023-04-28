# Design Patterns

## Creational Patterns
Deals with the creation of objects.

#### 1. Factory Pattern
Factory design pattern is used when we have a super class with multiple sub classes and based on input, we ned to return one of the sub-class object.
Using factory pattern we can code for interface ratherthan implementation.
Extension of more different implementations in future is very easy.
###### Examples of Factory pattern implementations in JDK:
* java.util.Calendar - getInstance() 
* java.util.ResourceBundle - getBundle()
* java.util.EnumSet - of()
* java.sql.DriverManager - getConnection()
* java.net.URL - openConnection()
* java.lang.Class - newInstance()
* java.lang.class - forName()


#### 2. Singleton Pattern
###### Bill Dugh Implementation :
Using which we create an inner class in side single ton class and return the instance from inner class. So that it is completely thread safe.

###### Using Reflection to destroy Singleton: 
Using reflection API, we can retrieve all the constructors of Singleton class. Set the visibility of constructor to true. Then get the new instance from the constructor and typecast the object to Singleton. In this case multiple objects of the singleton class wouldbe created. *If we create singleton using Enum, then it would be difficult to break it using reflection.*

 public enum SingletonEnum{
	GETINSTANCE;
 }
 
 ###### Serialization breaks singleton:
  If we serialize the singleton object and deserialize the same then also it breaks.
  So we need to override readResolve() method in our singleton class. Return the object from the read resolve method.
 
 ###### Cloning breaks Singleton:
  If we implement Clonable interface with Singleton and override the clone() method, then while cloning the existing object it breaks singleton property. So inside the clone method, if we throw the exception instead of returning the object, it prevents from cloning the singleton object.

###### Examples of Singleton built in classes in JDK:
* java.lang.Runtime class
* java.awt.Desktop
* java.lang.System
* Logging - Loggers are always singleton.
* Caching - Caching also implemented with singleton.
* Threadpool - Threadpool is also implemented using singleton.

#### 3. Builder Pattern
There are issues with Factory pattern and Abstract factory patterns, when the object contains a lot of attributes. We need to pass many arguments, need to maintain the order of arguments to pass and manage arguments from client. Builder pattern, maintains a private constructor and a builder static inner class with common arguments and optional arguments setters. It returns the builder factor object and contains a build method which returns the actual object with builder argument. In the private constructor of actual class we have the builder argument, which forms the required object with the required parameters.
* java.lang.StringBuilder append() method.
* java.lang.StringBuffer append() method
* java.util.stream.Stream.Builder
* in io package FileWriter,BufferedWriter, FloatBuffer etc.

#### 4. Prototype Pattern
This pattern provides a mechanism to copy an existing object and modify it accordingly. This will be used when the object creation is costly and require more resources. This pattern uses java cloning.

#### 5. Abstract Factory Pattern
This is similar to Factory Pattern and it gives Factory of factories. It allows you to produce families of related objects without specifying their  concrete classes.
  
## Structural Patterns
Deals with the relationship between objects

## Behavioural Patterns
Deals with the interaction or communication between objects.
