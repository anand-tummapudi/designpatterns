# Design Patterns

## Creational Patterns

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
There are three major issues with Factory pattern and Abstract factory pattern when the object contains a lot of attributes. We need to pass many arguments, need to maintain the order of orguments to pass and manage arguments from client. We will have all setter methods and have a build method to build the object.
  
## Structural Patterns

## Behavioural Patterns
