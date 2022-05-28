package telran.book.controller;

import telran.book.model.Book;

public class BookAppl {
    public static void main(String[] args) {
        Book[] books = new Book[6];
        books[0] = new Book("21334","How to forget c++","Guido van Rossum",2002);
        books[1] = new Book("2002","Why python is weak","Straussrup",2004);
        books[2] = new Book("404","Алгоритмы для верстальщиков","Someauthor",2005);
        books[3] = new Book("Unpublished book","Pikkulo");
        books[4] = new Book("21334","Я не назвыаю книги",2302);
        books[5] = new Book("21334","Как стать zerocode программистом(специально для сеньеров)","Pikkulo",2001);
        for (int i = 0; i < books.length; i++) {
            books[i].display();
        }
    }
}
