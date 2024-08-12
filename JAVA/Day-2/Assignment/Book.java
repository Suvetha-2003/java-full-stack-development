package com.suvetha;

public class Book {
    private String title;
    private String author;
    private String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    public static void main(String[] args) {
        Book[] bookCollection = new Book[10];
        int bookCount = 0; 

        Book book1 = new Book("1984", "George Orwell", "9780451524935");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780060935467");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");

        bookCount = addBook(bookCollection, bookCount, book1);
        bookCount = addBook(bookCollection, bookCount, book2);
        bookCount = addBook(bookCollection, bookCount, book3);

        System.out.println("Books in the collection:");
        printBooks(bookCollection, bookCount);

        bookCount = removeBook(bookCollection, bookCount, book2);

        System.out.println("\nBooks in the collection after removal:");
        printBooks(bookCollection, bookCount);
    }

    public static int addBook(Book[] collection, int count, Book book) {
        if (count < collection.length) {
            collection[count] = book;
            return count + 1;
        } else {
            System.out.println("Collection is full. Cannot add more books.");
            return count;
        }
    }

    public static int removeBook(Book[] collection, int count, Book book) {
        for (int i = 0; i < count; i++) {
            if (collection[i].getIsbn().equals(book.getIsbn())) {
                
                for (int j = i; j < count - 1; j++) {
                    collection[j] = collection[j + 1];
                }
                collection[count - 1] = null; 
                return count - 1;
            }
        }
        System.out.println("Book not found in the collection.");
        return count;
    }

    public static void printBooks(Book[] collection, int count) {
        for (int i = 0; i < count; i++) {
            collection[i].printDetails();
            System.out.println();
        }
    }
}
