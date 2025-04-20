# Library Management System

## About

This Java project is a console application designed to manage a small library's book inventory and rental operations. It allows users to perform key actions such as:

* **Adding new books** to the library's collection, including details like title, author, ISBN, and publication year.
* **Renting out books** to library members, keeping track of due dates.
* **Returning rented books**, updating the book's availability status.
* **Searching for books** based on title and author.
* **Displaying the current inventory** of available and rented books.

Book data is stored in simple text files. This project provides a basic but functional system for managing book loans and the library's collection, offering a command-line interface for library staff to interact with the system. This was developed as a personal project to practice Java development and file I/O.

## Features

* **Book Management:**
    * Add new books to the library.
    * Store book details (title, author, ISBN, publication year).
    * View the list of all books.
* **Rental Management:**
    * Rent available books to library members.
    * Record rental details (member ID, book ID, due date).
    * Return rented books.
    * Track book availability status.
* **Search Functionality:**
    * Search for books by title.
    * Search for books by author.
* **User Interface:**
    * Command-line interface (CLI).
    * Text-based input and output for interacting with the system.
* **Data Storage:**
    * Book and rental data is stored in text files. (Note: This is a basic implementation. A database would be more robust for a real-world application.)

## Technologies Used

* Java
* File I/O

## Setup and Installation

1.  **Prerequisites:**
    * Java Development Kit (JDK) 8 or later. Ensure that the `java` and `javac` commands are available in your system's PATH.

2.  **Downloading the Project:**
    * Clone the repository from GitHub:

        ```bash
        git clone <repository_url>
        cd <project_directory>
        ```

        (Replace `<repository_url>` with the actual URL of your GitHub repository and `<project_directory>` with the name of the directory where the project is cloned.)

3.  **Compiling the Code:**
    * Compile the Java source files using `javac`. If your project has multiple source files and packages, you might need to compile from the root directory of the project, or use an IDE. Here's a general example:

        ```bash
        javac src/*.java # If your source files are in a 'src' directory
        ```

        If you have multiple packages, you might need to use:

        ```bash
        javac -d bin src/com/yourpackage/*.java
        ```

        (Adjust the directory structure and package names as needed. The `-d bin` part tells `javac` to put the compiled class files in a "bin" directory.)

4.  **Running the Application:**
    * Run the compiled Java application. You'll need to specify the main class of your application. For example:

        ```bash
        java Main # If your main class is named 'Main' and in the default package
        ```

        If your class files are in a "bin" directory and within a package, you'll need to include the package name:

        ```bash
        java -cp bin com.yourpackage.Main
        ```

        (Replace `com.yourpackage.Main` with the actual fully qualified name of your main class.)

## Usage

1.  **Launch the application:** Follow the steps in the "Setup and Installation" section to compile and run the Java application.
2.  **Main Menu:** The application will start and display a text-based main menu with options to manage books and rentals.
3.  **Adding a Book:**
    * Enter the number or character corresponding to the "Add Book" option in the main menu.
    * The application will prompt you to enter the book's details: title, author, ISBN, and publication year.
    * Enter the required information as prompted.
4.  **Renting a Book:**
    * Enter the number or character corresponding to the "Rent Book" option in the main menu.
    * The application will prompt you to enter the member ID and select the book to rent (usually by ID).
    * Enter the required information as prompted, including the due date.
5.  **Returning a Book:**
    * Enter the number or character corresponding to the "Return Book" option in the main menu.
    * The application will prompt you to select the book to return (usually by ID).
    * Enter the required information.
6.  **Searching for Books:**
    * Use the search functionality (if available) by selecting the appropriate option from the main menu.
    * The application will prompt you to enter the search criteria (title or author).
    * Enter the search term.
7.  **Viewing Inventory:**
    * Select the option to view the book inventory from the main menu.
    * The application will display a list of the books and their rental status in the console.

## Data Storage

The application uses text files to store data:

* `books.txt`: Stores book information.
* `rent.txt`: Stores rental information.

(Note: This is a basic storage mechanism. For a production-ready application, a database system like MySQL, PostgreSQL, or SQLite would be more appropriate.) The format of the data in the text files is simple, with each book/rental on a new line, and details separated by commas.

## Author

Anoud Alfaydi

