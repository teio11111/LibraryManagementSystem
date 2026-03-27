package app;

import model.Book;
import service.BookManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookManager manager = new BookManager();

        // 初始化两本书
        manager.addBook(new Book(1, "Java入门", "张三"));
        manager.addBook(new Book(2, "数据结构", "李四"));

        while (true) {
            System.out.println("\n===== 图书管理系统 =====");
            System.out.println("1. 查看所有图书");
            System.out.println("2. 添加图书");
            System.out.println("3. 借书");
            System.out.println("4. 还书");
            System.out.println("5. 退出");
            System.out.print("请选择：");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    manager.showAllBooks();
                    break;

                case 2:
                    System.out.print("请输入ID：");
                    int id = sc.nextInt();
                    sc.nextLine(); // 吃掉换行

                    System.out.print("请输入书名：");
                    String name = sc.nextLine();

                    System.out.print("请输入作者：");
                    String author = sc.nextLine();

                    manager.addBook(new Book(id, name, author));
                    break;

                case 3:
                    System.out.print("请输入要借的书ID：");
                    int borrowId = sc.nextInt();

                    Book b1 = manager.findBookById(borrowId);
                    if (b1 != null) {
                        b1.borrowBook();
                    } else {
                        System.out.println("没找到这本书！");
                    }
                    break;

                case 4:
                    System.out.print("请输入要还的书ID：");
                    int returnId = sc.nextInt();

                    Book b2 = manager.findBookById(returnId);
                    if (b2 != null) {
                        b2.returnBook();
                    } else {
                        System.out.println("没找到这本书！");
                    }
                    break;

                case 5:
                    System.out.println("退出系统");
                    sc.close();
                    return;

                default:
                    System.out.println("输入错误！");
            }
        }
    }
}