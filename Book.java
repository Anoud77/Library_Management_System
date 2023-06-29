/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import java.io.FileWriter;
import java.io.IOException;


public class Book {
    

    private String name;
    private int id;
    private int year;
    private String story;

    public Book() {
    }

    public Book(String name, int id, int year,String story) {
        this.name = name;
        this.id = id;
        this.year = year;
        this.story=story;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getstory()
    {
        return story;
    }
    public void setstory(String story)  
    {
        this.story=story;
    }
    public String toString() {
        return "Book{" +
                "name :" + name + ':' +
                ", id=" + id +
                ", year=" + year +
                ", Story :"+story+
                "}";
    }

}


   
