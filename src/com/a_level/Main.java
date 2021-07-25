package com.a_level;

public class Main {

    public static void main(String[] args) {
        Book book=new Book();
        Author author=new Author();

        book.addBook("Harry Potter");
        book.getBook();
        book.updateBook();
        book.getBook();
        book.deleteBook();
        book.getBook();

        author.addAuthor("Joanne", "Rowling");
        author.getAuthor();
        author.updateAuthor();
        author.getAuthor();
        author.deleteAuthor();
        author.deleteAuthor();
    }
}





