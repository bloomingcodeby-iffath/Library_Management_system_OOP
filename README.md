# 📚 Library Management System (Java OOP)

A simple **Java Object-Oriented Programming** project demonstrating **encapsulation**, **inheritance**, **interfaces**, **abstract classes**, **method overloading/overriding**, and **custom exceptions**.  
The system models a basic library with books and eBooks that can be borrowed or returned.

---

## ✨ Features
- **Abstract Class**: `LibraryItem` (common base for all library items)
- **Interface**: `Borrowable` (defines borrowing & returning behavior)
- **Encapsulation**: All class fields are private with getters/setters
- **Inheritance**: `EBook` extends `Book`
- **Method Overloading**: `bookPrice()` and `bookPrice(String currency)`
- **Method Overriding**: `EBook` overrides `bookInfo()`
- **Custom Exception**: `InvalidPriceException` thrown if price is negative
- **Borrow/Return System** with state tracking



