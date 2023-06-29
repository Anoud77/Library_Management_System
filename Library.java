/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author nnxnx
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static void AddAuthor() throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first name : ");
        String fName = in.next();
        System.out.print("Enter last name : ");
        String lName = in.next();
        ArrayList<Book> books = new ArrayList<>();
        String name;
        int id;
        int year;
        String story;
        do {
            System.out.print("Enter book name : ");
            name = in.nextLine();
            name = in.nextLine();
            System.out.println("Enter story:");
            story = in.nextLine();
            do {
                System.out.print("Enter id : ");
                id = in.nextInt();
                if (id > 0)
                    break;
            } while (true);
            do {
                System.out.println("Enter year : ");
                year = in.nextInt();
                if (year > 0)
                    break;
            } while (true);
            books.add(new Book(name, id, year,story));
            System.out.print("add anther book (no) : ");
            String ch = in.next();
            if (ch.equalsIgnoreCase("no"))
                break;
        } while (true);
        Author author = new Author(fName, lName, books);
        author.save();
        author.toString();
    }

    public static void ViewReader() throws FileNotFoundException, IOException {
        double PhoneNumber=10;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = in.nextLine();
        System.out.print("Enter PhoneNumber : ");
        PhoneNumber= in.nextDouble();
        viewBook();
        System.out.println("Enter name of book ");
        String nameBook = in.next();
        Reader reader = new Reader(name, nameBook,PhoneNumber);
        reader.info();
        reader.readerInfo();
        


    }

    public static void viewBook() throws FileNotFoundException {
        File file = new File("book.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine())
            System.out.println(scanner.nextLine());
        scanner.close();
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\twelcome Library system ");
        System.out.println("\t\tFor add or rent books");
        System.out.println("==============================================");
        System.out.println("Are you?");
        do {
            System.out.println("1. author ");
            System.out.println("2. reader");
            System.out.println("3. exit");
            int chose = scanner.nextInt();
            if (chose == 1)
                AddAuthor();
            else if (chose == 2)
                ViewReader();
            else if (chose == 3)
                break;
            else
                System.out.println("try again");
        } while (true);
    }
}

