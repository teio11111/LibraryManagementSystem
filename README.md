Library Management System（图书管理系统）

这是一个用 Java 写的控制台小项目，实现了最基础的图书管理功能。

项目不复杂，主要是用来练习面向对象编程（OOP）、项目结构划分，以及本地编译运行流程。

功能说明：
创建图书对象（书名、作者、ID）
查看图书信息
借书（状态变为已借出）
还书（状态恢复为可借）

代码做了简单分层，方便以后扩展
src/
├── app        // 程序入口
│   └── Main.java
├── model      // 数据模型
│   └── Book.java
├── service    // 业务逻辑
│   └── BookManager.java
├── util       // 工具类（预留）
