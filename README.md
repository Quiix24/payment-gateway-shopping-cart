# Payment Gateway Shopping Cart

A comprehensive Java-based e-commerce application that demonstrates object-oriented programming principles through the implementation of a shopping cart system with multiple payment processing methods.

## Project Overview

This project implements a functional shopping cart system with support for multiple payment gateways. The application provides a graphical user interface for adding items to a cart and processing payments through different payment methods including PayPal and Credit Card transactions.

## Core Features

- Item Management: Add, remove, and manage product items with customizable names, prices, and quantities
- Shopping Cart Operations: Maintain a collection of items with capacity management
- Multiple Payment Methods: Support for PayPal and Credit Card payment processing
- User Interface: Interactive GUI-based interface using Java Swing for enhanced user experience
- Payment Processing: Secure payment method selection and transaction handling

## Programming Concepts Demonstrated

### Object-Oriented Programming (OOP)

The project extensively utilizes OOP principles to create a maintainable and scalable architecture.

**Inheritance**: The payment system leverages inheritance through the `PaymentMethod` abstract class. Both `PayPal` and `CreditCard` classes extend this base class, inheriting common payment processing functionality while allowing for payment-method-specific implementations.

**Abstraction**: The `PaymentMethod` abstract class defines the contract that all payment implementations must follow, hiding the complexity of individual payment processing methods from the client code. This allows new payment methods to be added without modifying existing code.

**Encapsulation**: Each class encapsulates related data and behavior. For instance, the `Item` class encapsulates product information (name, price, quantity), and the `ShoppingCart` class encapsulates cart operations and item collection management.

**Polymorphism**: The payment system utilizes runtime polymorphism. The client code can work with any `PaymentMethod` implementation without knowing the specific type, enabling flexible payment processing.

### Data Structures

**Arrays**: The `ShoppingCart` class uses a fixed-size array to store `Item` objects. This demonstrates fundamental data structure concepts including index-based access and bounds checking.

**Encapsulation of State**: The `currentIndex` variable in `ShoppingCart` maintains the state of the collection, managing the insertion point for new items and preventing array overflow.

### Exception Handling

The application implements exception handling through the `throws ParseException` declaration, demonstrating awareness of checked exceptions and their proper declaration in method signatures.

### User Input and Validation

The application accepts user input through both console (`Scanner`) and graphical (`JOptionPane`) interfaces, demonstrating multiple input methods and basic validation through type conversion and string parsing.

## Project Structure


src/
├── Item.java # Product item representation
├── ShoppingCart.java # Shopping cart management and operations
├── PaymentMethod.java # Abstract payment method interface
├── PayPal.java # PayPal payment implementation
├── CreditCard.java # Credit Card payment implementation
└── Test.java # Main application entry point


build/ # Compiled bytecode and build artifacts
nbproject/ # NetBeans IDE project configuration

## Class Descriptions

### Item.java
Represents a product item in the shopping system. Contains properties for item name, price, and quantity with accessor methods for retrieving item information.

### ShoppingCart.java
Manages a collection of items using an array-based storage structure. Provides methods to add items to the cart, remove items, and handle cart capacity constraints. Initializes with a user-defined capacity during instantiation.

### PaymentMethod.java
Abstract base class defining the contract for payment processing. Declares abstract methods that all payment implementations must override, establishing a common interface for different payment types.

### PayPal.java
Concrete implementation of the `PaymentMethod` class for PayPal transactions. Handles PayPal-specific payment processing including email and password authentication.

### CreditCard.java
Concrete implementation of the `PaymentMethod` class for credit card transactions. Manages credit card payment processing with appropriate card-specific validation and processing logic.

### Test.java
The main application entry point. Orchestrates the shopping cart workflow including item selection, cart management, and payment method selection. Provides both console and GUI-based user interaction.

## How to Use

### Compilation
Compile the project using the NetBeans IDE or command-line Java compiler:


javac src/*.java -d build/classes

### Running the Application
Execute the main class:


java -cp build/classes Test

### Workflow
1. Upon execution, the application prompts for the desired number of items
2. For each item, provide the product name, price, and quantity through GUI dialogs
3. Choose to add additional items or proceed to payment
4. The cart displays all added items with their details
5. Select a payment method (PayPal or Credit Card)
6. Enter the required payment credentials
7. Process the transaction

## Technology Stack

- Language: Java
- IDE: NetBeans
- GUI Framework: Java Swing
- Build Tool: Apache Ant

## Learning Objectives

This project serves as an educational resource for understanding:

- Core object-oriented programming principles and design patterns
- Abstract classes and interface-based programming
- Array-based data structure management
- Exception handling in Java
- GUI development with Swing
- User input validation and processing
- Multi-method application workflows

## Future Enhancements

Potential improvements and extensions could include:

- Implementation of the Strategy design pattern for payment processing
- Addition of a database persistence layer for transaction history
- Integration with real payment APIs
- Input validation and error handling enhancements
- Extended payment method support
- Transaction receipt generation

## Technical Notes

The application uses a fixed-size array for cart storage, requiring upfront capacity specification. Consider implementing a dynamic collection structure like `ArrayList` for more flexible capacity management in production environments.

## License

This project is provided for educational purposes.

## Author

Ahmed - Project Developer

