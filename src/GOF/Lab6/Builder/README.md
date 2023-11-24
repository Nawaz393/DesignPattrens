# Builder Design Pattern

## Overview

The Builder Design Pattern is a creational design pattern that separates the construction of a complex object from its representation, allowing the same construction process to create various representations. It enables the construction of a product step by step, providing more control over the construction process and allowing the construction of different types of objects using the same process.

## Intent

The main intent of the Builder Design Pattern is to provide a way to construct a complex object step by step. It is especially useful when an object needs to be constructed with various configurations or when the construction process involves several optional components.

## Structure

The Builder Design Pattern typically involves the following components:

- **Director:** This is the class that orchestrates the construction process using a builder. It is not aware of the concrete builder's details.

- **Builder:** This is the interface or abstract class that declares the construction steps for building the product.

- **ConcreteBuilder:** This is the class that implements the `Builder` interface, providing specific implementations for constructing the product.

- **Product:** This is the complex object being constructed. It often has a more complex structure and may involve several subcomponents.

## Example