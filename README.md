# Design Patterns

## Creational Patterns
#### 1. Factory Pattern

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

## Structural Patterns

## Behavioural Patterns
