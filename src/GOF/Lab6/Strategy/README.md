# Strategy and Chain of Responsibility Patterns - Calculator Example

This repository showcases the use of the Strategy and Chain of Responsibility design patterns in a calculator application. These patterns help in making the calculator flexible, extensible, and capable of handling various mathematical operations in a clean and maintainable way.

## Overview

In this example, we have implemented a calculator with two key design patterns:

1. **Strategy Pattern**: The Strategy Pattern is used to encapsulate different mathematical operations (e.g., addition, subtraction, multiplication, and division) as separate strategies. This allows us to easily switch between different strategies without altering the calculator's core logic.

2. **Chain of Responsibility Pattern**: The Chain of Responsibility Pattern is used to create a chain of handlers that can process mathematical expressions and distribute the responsibility among them. Each handler can handle a specific operation and pass the request to the next handler if necessary.



