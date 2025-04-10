# Peeking Iterator with Field Injection
## Problem Overview:

You are tasked with creating a PeekingIterator class that builds upon the functionality of Java's standard Iterator by adding a peek() method. This method allows you to look at the next element in the collection without actually moving to it. Think of it as looking ahead without stepping ahead.

Additionally, you'll demonstrate how Spring's field-based dependency injection can be used to manage multiple components in a larger system. In this scenario, you will handle input from the user and demonstrate the behavior of the PeekingIterator within a Spring-managed environment.

## Requirements:
### PeekingIterator Class:

This class will extend a regular Java Iterator for integers and add the peek() functionality.

You will also implement the standard next() and hasNext() methods for iterator functionality.

The peek() method should return the next element without advancing the iterator.

### InputService Class:

This service will collect input from the user (a list of integers) and turn it into an Iterator that can be passed to the PeekingIterator.

You will implement a method that gathers input using the Scanner class from the console.

### Handler Class:

This class will act as the coordinator, handling the interaction between the user input (InputService) and the PeekingIterator.

Using field-based dependency injection, you will inject both the PeekingIterator and the InputService into this class.

### Spring Configuration:

You will use @ComponentScan to tell Spring where to find your components.

Spring will automatically manage the creation and injection of your dependencies.

### MainClass:

The MainClass will start the Spring application, retrieve the necessary beans, and demonstrate how the input is processed using PeekingIterator.