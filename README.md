# Design patterns

## Creational Patterns
#### 1. Factory Pattern
#### 2. Singleton Pattern
###### Bill Dugh Implementation :
Using which we create an inner class in side single ton class and return the instance from inner class. So that it is completely thread safe.

###### Using Reflection to destroy Singleton: 
Using reflection API, we can retrieve all the constructors of Singleton class. Set the visibility of constructor to true. Then get the new instance from the constructor and typecast the object to Singleton. In this case multiple objects of the singleton class wouldbe created. *If we create singleton using Enum, then it would be difficult to break it using reflection.*

## Structural Patterns

## Behavioural Patterns
