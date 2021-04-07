package library;

import java.util.ArrayList;

public class Library {

    private String name;
    private String address;
    private ArrayList<Book> books;
    static private int numberOfLibraries;



    // TODO: create the constructor
    public Library(String name, String address){
        this.books = new ArrayList<>();
    }

    public void addBook(Book b) {
        books.add(b);
    }



    // TODO: implement the setter method for static variable numberOfLibraries
    // TODO: implement the getter method for static variable numberOfLibraries

    public static int getNumberOfLibraries(){
        return numberOfLibraries;
    }
    public int setNumberOfLibraries(){
        return this.numberOfLibraries = numberOfLibraries;
    }

    public void printAllBooks() {
        for(Book b: books) {
            System.out.println(b);
        }
    }

    public void printAvailableBooks() {

        // TODO: loop through the book list and print books that are available

        for(Book b : this.books){
            if(b.isAvailable()){
                System.out.println(b + "\n");
            }
        }
    }


    public Book searchBookByTitle(String title) {

        // TODO: loop through the book list and return the book if title matches

        // TODO: return null if book is not found

        for(Book b : this.books){
            if(title == b.getTitle()) {
                return b;
            }
        }

        return null;
    }

    public void borrowBook(String title) {

        // TODO: find the book

        // TODO: inform user if book does not exist in library

        // TODO: check if books is available, inform the user if it is not

        // TODO: if it is available, borrow the book
        Book found = searchBookByTitle(title);

        for(Book b : this.books){
            if(title == b.getTitle() && b.isAvailable()){
                System.out.println("The book: " + b.getTitle() + " has been borrowed successfully.");
                b.setAvailable(false);
                return;
            }
            else if(title == b.getTitle() && !b.isAvailable()) {
                System.out.println("The book: " + b.getTitle() + ", is already borrowed.");
                return;
            }
        }

        System.out.println("The book is not available in the library");
    }

    public void returnBook(String title) {

        // TODO: find the book

        // TODO: inform user if book is not found

        // TODO: check if book is already returned and inform the user if it the case

        // TODO: otherwise, set book as available again
        Book found = searchBookByTitle(title);
        found.toString();

        for(Book b : this.books){
            if(title == b.getTitle()){
                System.out.println("This book is available");
            }
            else{
                System.out.println("This book is not available");
            }
            returnBook(title);
            b.setAvailable(true);
        }


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public String toString(){
        return "Name: " + this.name + "\nAddress: " + this.address;
    }



}


