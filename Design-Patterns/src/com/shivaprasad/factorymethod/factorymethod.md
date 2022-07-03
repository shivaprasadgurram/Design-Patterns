# Factory Method

## Introduction
1. Creational Patterns are concerned with object creation problems faced during
   software design. Object creation often results in design problems, creational
   patterns solve this problem by controlling the object creation.

2. A Factory Pattern or Factory Method Pattern says that just define an
   interface or abstract class for creating an object but let the
   subclasses decide which class to instantiate.
3. The contract/interface doesn't know the object it is going to create.

## Advantages
1. Factory Method Pattern allows the sub-classes to choose the type of
   objects to create.

2. It promotes the loose-coupling by eliminating the need to bind
   application-specific classes into the code. That means the code
   interacts solely with the resultant interface or abstract class, so that it
   will work with any classes that implement that interface or that extends
   that abstract class.

## When to use?
1. When you modifying a class to accommodate carying requirements (violating OCP principle)
2. When you want to adhere to Dependency Inversion design principle, where you need to depend on high-level abstractions and not on concrete classes.
3. Use the Factory Method when you want to provide users of your library or framework with a way to extend its internal components.
