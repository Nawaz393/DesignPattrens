# Chain of Responsibility Pattern

This repository contains an implementation of the Chain of Responsibility design pattern, with a specific focus on a Logger example.

## Introduction

The Chain of Responsibility pattern is a behavioral design pattern that allows you to pass requests along a chain of handlers. Each handler decides either to process the request or to pass it to the next handler in the chain. This pattern promotes loose coupling between senders and receivers of requests.

## Logger Implementation

In this project, we have implemented a Logger using the Chain of Responsibility pattern. The logger allows you to log messages with different levels of severity, such as INFO, WARNING, and ERROR. Each severity level has its own handler in the chain, and the message is passed through the chain until it is appropriately handled based on its severity.

### Usage

To use the Logger, follow these steps:

1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/your-username/chain-of-responsibility.git
```
