# Facade Design Pattern

## Overview

The Facade Design Pattern is a structural design pattern that provides a simplified interface to a set of interfaces in a subsystem, making it easier to use. It involves a single class, known as the facade, which represents the entire subsystem. The pattern hides the complexities of the subsystem and provides a simple interface to the client.

## Intent

The main intent of the Facade Design Pattern is to provide a unified and simplified interface to a set of interfaces in a subsystem, making it easier to use and reducing dependencies between the client code and the subsystem.

## Structure

The Facade Design Pattern typically involves the following components:

- **Facade:** This is the class that provides a simple interface to the client. It delegates client requests to the appropriate objects in the subsystem.

- **Subsystem Classes:** These are the classes that implement the functionality of the subsystem. The client interacts with the facade, which in turn interacts with the subsystem classes.

