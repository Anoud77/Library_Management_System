/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Reader {
    private String name;
    private String bookName;
    private double PhoneNumber=10;

    public Reader() {
    }

    public Reader(String name, String bookName,double PhoneNumber) {
        this.name = name;
        this.PhoneNumber=PhoneNumber;
        this.bookName = bookName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getNumber() {
        return PhoneNumber;
    }
    public void setNumber( double PhoneNumber) {
        this.PhoneNumber=PhoneNumber;
    }
    

    public void readerInfo() throws FileNotFoundException {
        File file = new File("book.txt");
        Scanner scanner = new Scanner(file);
        System.out.println("name : "+name);
        System.out.println("The book you ask :"+bookName+"\n"+"it MUST returend within FIVE DAYS");
        System.out.println("information:\n");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] arr=line.split(":");
            if (arr[1].equalsIgnoreCase(bookName)) {
                    System.out.println(line);
                    
                    return;
            }
        }
        System.out.println("this book not found");
        scanner.close();
    }
    public void info() throws IOException {
        FileWriter fileWriter = new FileWriter("Rent.txt", true);
        fileWriter.append(toString());
        fileWriter.append('\n');
        fileWriter.close();
    }
    public String toString() {
        return  "RENT RECORD"+"\n"+
                "name: "+name+"..Book:" +bookName+"..PhoneNumber:"+PhoneNumber+
                 "\n";
    }

}


