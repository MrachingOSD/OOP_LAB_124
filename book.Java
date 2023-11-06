package javaapplication5;
public class Book {
  private String title;
  private String author;
  private int isbn ;

  public Book(String title, String author,int isbn) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }
  public int getISBN(){
      return isbn;
  }
public void setTitel(int isbn){
    this.isbn = isbn;
  }
}
package javaapplication5;

//Library.java
import java.util.ArrayList;

public class Library {
  private ArrayList < Book > books;

  public Library() {
    books = new ArrayList < Book > ();
  }

  public void addBook(Book book) {
    books.add(book);
  
