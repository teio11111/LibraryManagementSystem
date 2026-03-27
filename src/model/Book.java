package model;

public class Book {
    private int id;
    private String name;
    private String author;
    private boolean isBorrowed;

    // 构造方法
    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.isBorrowed = false;
    }

    // getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    // 借书
    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("借书成功：" + name);
        } else {
            System.out.println("这本书已经被借走了！");
        }
    }

    // 还书
    public void returnBook() {
        isBorrowed = false;
        System.out.println("还书成功：" + name);
    }

    // 打印信息
    public void printInfo() {
        System.out.println(
                "ID: " + id +
                " | 书名: " + name +
                " | 作者: " + author +
                " | 状态: " + (isBorrowed ? "已借出" : "可借")
        );
    }
}