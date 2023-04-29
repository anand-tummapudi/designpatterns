# Design Patterns

## Creational Patterns
Deals with the creation of objects.
* Factory, Abstract Factory, Singleton, Builder, Prototype
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
* javax.xml.parsers.DocumentBuilderFctory - newInstance()
* javax.xml.transform.TransformerFactory - newInstance()
* javax.xml.xpath.XpathFactory - newInstance()
  
## Structural Patterns
Deals with the relationship between objects. These patterns ease the design by identifying a simple way to realize relationship between objects. It also describes how classes and objects form larger structures.
* Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy
#### 1. Adaptor Pattern
Adaptor match interfaces of different classes meaning that it allows two incompatable interfaces to work together.
#### 2. Bridge Pattern
Bridge separates an object's interface from its implementation.It uses encapsulation, aggregation and can use inheritance to separate responsibilities. Bridge pattern is useful when we want to avoid permanent binding between abstraction and its implementation. 
#### 3. Composite Pattern 
Composite is a tree structure of simple and composite objects. It enables us to create hierarchical tree structures of varying complexity. Here group of objects are treated in the same way as a single instance of an object.
#### 4. Decorator Pattern 
Decorator adds responses to objects dynamically.
#### 5. Facade Pattern 
Facade is a single class that represents an entire subsystem. This pattern provides an unified interface from a group of subsystems. It reduces coupling between subsystems.
#### 6. Flyweight Pattern 
Flyweight is a fine grained instance used for efficient sharing. It focuses on sharing for efficiency. This pattern is useful when the application uses large number of objects and the storage cost is very high.
#### 7. Proxy Pattern  
Proxy is an object representing another object. It provides a placeholder or substitute object to control access to the original object.
Remote proxy and Virtual proxy are some of the implementations of proxydesign pattern.
 
## Behavioural Patterns
Deals with the interaction or communication between objects.
