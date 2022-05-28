package telran.book.model;
public class Book {
    public Book(String isbn, String title, String author, int yearOfPublishing) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public Book(String title, String author, int yearOfPublishing) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public Book( String title, String author) {
        this.title = title;
        this.author = author;
    }

    String isbn;
    String title;
    String author;
    int yearOfPublishing = 0;

    public String getIsbn() {
        return isbn;
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

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void display(){
        String res = "";
        if(title != null)
            res += "Книга: " + title;
        if(isbn != null)
            res +=" isbn: " + isbn;
        if(author != null)
            res +=" Автор: " + author;
        if(yearOfPublishing != 0)
            res +=" год публикации: " + yearOfPublishing;
        System.out.println(res);
    }
}
