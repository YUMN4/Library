import library.Book;

import library.Library;

public class Main {

    public static void main(String[] args) {


        Library lib1 = new Library("Lib1", "Demo location");
        Library lib2 = new Library("Lib2", "Esenyurt");

        Book a = new Book("Kayi I", "Ahmet Simsirgil");
        Book b = new Book("Kayi X", "Ahmet Simsirgil");
        Book c = new Book("Shakespeare Comedies", "William Shakespeare");
        Book d = new Book("Namaz Kitabi", "Huseyin Hilmi isik");

        lib1.addBook(a);
        lib1.addBook(b);

        lib2.addBook(c);
        lib2.addBook(d);

        
        lib2.borrowBook("Kayi I");
        lib1.printAvailableBooks();
        lib1.returnBook("Kayi I");


        System.out.println("Number of libraries: " + Library.getNumberOfLibraries() + "\n");
        System.out.println(lib1.searchBookByTitle("Kayi I").toString() + "\n");
        lib1.printAvailableBooks();
        lib2.printAvailableBooks();
        lib1.borrowBook("Kayi X");
        lib2.borrowBook("Namaz Kitabi");
        lib1.returnBook("Kafsyi X");

        lib1.printAllBooks();
        lib2.printAllBooks();

    }
}
