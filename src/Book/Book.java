package Book;

import java.util.Scanner;

public class Book
{
    String book_id;
    String book_name;
    String book_author_name;
    String book_language;
    String book_ISBN;
    String book_category;
    String  book_price;
    String number_of_books;
    String book_description;


    public Book(String book_id, String book_name, String book_author_name, String book_language, String book_ISBN, String book_category, String book_price, String number_of_books, String book_description) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_author_name = book_author_name;
        this.book_language = book_language;
        this.book_ISBN = book_ISBN;
        this.book_category = book_category;
        this.book_price = book_price;
        this.number_of_books = number_of_books;
        this.book_description = book_description;
    }

    public Book(){
        Scanner inset_book = new Scanner(System.in);
        System.out.print("Enter book_id: ");
        book_id = inset_book.nextLine();
        this.book_id = book_id;
        System.out.println();
        System.out.print("Enter book_name: ");
        book_name = inset_book.nextLine();
        this.book_name = book_name;
        System.out.println();
        System.out.print("Enter book_author_name: ");
        book_author_name = inset_book.nextLine();
        this.book_author_name = book_author_name;
        System.out.println();
        System.out.print("Enter book_language: ");
        book_language = inset_book.nextLine();
        this.book_language =  book_language;
        System.out.println();
        System.out.print("Enter book_ISBN: ");
        book_ISBN = inset_book.nextLine();
        this.book_ISBN = book_ISBN;
        System.out.println();
        System.out.print("Enter book_category: ");
        book_category = inset_book.nextLine();
        this.book_category = book_category;
        System.out.println();
        System.out.print("Enter book_price: ");
        book_price = inset_book.nextLine();
        this.book_price = book_price;
        System.out.println();
        System.out.print("Enter number_of_books: ");
        number_of_books = inset_book.nextLine();
        this.number_of_books = number_of_books;
        System.out.println();
        System.out.print("Enter book_description: ");
        book_description = inset_book.nextLine();
        this.book_description = book_description;
        System.out.println();

    }
    public String getBookID(){
        return book_id;
    }
    public String getBookName(){
        return book_name;
    }
    public String getAuthor(){
        return book_author_name;
    }
    public String getBookLanguage(){
        return book_language;
    }
    public String getBookISBN(){
        return book_ISBN;
    }
    public String getBookCategory(){
        return book_category;
    }
    public String getBookPrice(){
        return book_price;
    }
    public String getBookNumberOfBooks(){
        return number_of_books;
    }
    public String getBookDescription(){
        return book_description;
    }

    public String setBookID(String book_id){
        return book_id;
    }
    public String setBookName(String book_name){
        return book_name;
    }
    public String setAuthor(String book_author_name){
        return book_author_name;
    }
    public String setBookLanguage(String book_language){
        return book_language;
    }
    public String setBookISBN(String book_id){
        return book_ISBN;
    }
    public String setBookCategory(String book_id){
        return book_category;
    }
    public String setBookPrice(String book_id){
        return book_price;
    }
    public String setBookNumberOfBooks(String book_id){
        return number_of_books;
    }
    public String setBookDescription(String book_id){
        return book_description;
    }
}
