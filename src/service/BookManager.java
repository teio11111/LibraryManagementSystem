package service;

import model.Book;
import java.util.ArrayList;

public class BookManager {

    private ArrayList<Book> books;

    public BookManager() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("添加成功：" + book.getName());
    }

    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("暂无图书");
            return;
        }

        for (Book b : books) {
            b.printInfo();
        }
    }

    public Book findBookById(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }
}