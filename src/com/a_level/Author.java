package com.a_level;

public class Author {
    String name;
    String lastName;

    public void addAuthor(String name, String lastName){
        this.name=name;
        this.lastName=lastName;
    }
    public void updateAuthor(){
        name = name + " updated";
        lastName = lastName + " updated";
        System.out.println(name + " and " + lastName);
           }
    public void deleteAuthor(){
        if (this.name!=null && this.lastName!=null){
            this.name=null;
            this.lastName=null;
        }
        else{
            System.out.println("There is no author");
        }
    }
    public void getAuthor(){
        System.out.println("Our author is " + name + " " + lastName);
    }
}
