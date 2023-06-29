/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Author {
    private String fName;
    private String lName;
    private ArrayList<Book>books;

    public Author() {
    }

    public Author(String fName, String lName, ArrayList<Book> books) {
        this.fName = fName;
        this.lName = lName;
        this.books = books;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    public void save() throws IOException {
        FileWriter fileWriter = new FileWriter("book.txt", true);
        fileWriter.append(toString());
        fileWriter.append('\n');
        fileWriter.close();
    }
    
    public String toString() {
        return "Author{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", books=" + books +
                '}';
    }
}

    
