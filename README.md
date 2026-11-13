# Library Management System

## Project Overview
The Library Management System is a console-based Java application developed to manage basic library operations. It allows users to add, remove, search, display, issue, and return books through a menu-driven interface.

## Features

- **Add Books:** Add new books with title and author details.
- **Remove Books:** Remove books using their title.
- **Display All Books:** View all books available in the library, including their details and status.
- **Search Books:** Search for books by title.
- **Issue Books:** Issue books using either the book title or book ID.
- **Return Books:** Return books using either the book title or book ID.
- **Book Status Management:** Track whether a book is Available or Issued.
- **Automatic Book ID:** Generate unique book IDs automatically.

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- ArrayList
- Scanner
- IntelliJ IDEA

## Project Structure

```text
LibraryManagementSystem/
│
├── Book.java
├── Library.java
└── Main.java
```

## Class Description

### 1. Book.java
- Stores book details such as book ID, title, author, and issue status.
- Generates automatic book IDs.
- Manages book issue and return status.
- Overrides the `toString()` method to display book details.

### 2. Library.java
- Maintains the collection of books using ArrayList.
- Implements add, remove, display, and search operations.
- Handles book issuing and returning.
- Checks book availability before issuing or returning.

### 3. Main.java
- Provides a menu-driven console interface.
- Accepts user input using Scanner.
- Uses a while loop and switch-case to manage operations.
- Calls the appropriate Library methods based on user selection.

## How to Run

1. Clone or download this repository.
2. Open the project in IntelliJ IDEA or any Java IDE.
3. Make sure JDK 21 or a compatible JDK is installed.
4. Run `Main.java`.
5. Select an operation from the displayed menu.

## Sample Menu

```text
=================================
### Library Management System ###
=================================
1. Add Book
2. Remove Book
3. Display All Books
4. Search Books By Title
5. Issue Book
6. Return Book
7. Exit

Select Your Choice:
```

## Concepts Practiced

- Classes and Objects
- Constructors
- Encapsulation
- Getters
- Static Variables
- ArrayList
- For and Enhanced For Loops
- While Loop
- Switch-Case
- If-Else Conditions
- Boolean Methods
- Scanner Input Handling

## Project Type
Java Console-Based Application

## Author
Hentry Joseph