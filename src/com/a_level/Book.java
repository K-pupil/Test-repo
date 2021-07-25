package com.a_level;

public class Book {

   String bookName;

    public void addBook(String bookName){
        this.bookName=bookName;
    }
    public void updateBook(){
        bookName = bookName + " updated";
        System.out.println(bookName);
    }
    public void deleteBook(){
        if (this.bookName!=null){
            this.bookName=null;
        }
        else{
            System.out.println("There is no book");
        }
    }
    public void getBook(){
        System.out.println("Our book is " + bookName);
    }
}
