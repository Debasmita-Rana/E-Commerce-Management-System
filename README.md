# E-Commerce-Management-System
Hibernate ORM Implementation

A simple **E-Commerce Management System** built using **Java, Hibernate ORM, and MySQL**.

This project demonstrates how Hibernate can be used to connect Java applications with a relational database and perform CRUD operations.

## 🛠️ Technologies Used

* Java
* Hibernate ORM
* MySQL
* Maven
* JPA Annotations

## 📌 Entities

The project contains five main entities:

* **Category** – Stores product categories
* **Product** – Stores product information
* **Users** – Stores customer/admin details
* **Orders** – Stores customer orders
* **OrderDetails** – Stores products and quantities in an order

## 🔗 Relationships

```text
Category  →  Product        (One-to-Many)
Users     →  Orders         (One-to-Many)
Orders    →  OrderDetails   (One-to-Many)
Product   →  OrderDetails   (Many-to-One)
```



## ✨ Features

* Create Categories, Products and Users
* Create Orders with multiple OrderDetails
* Read stored data from the database
* Hibernate Session and Transaction management
* Entity relationships using JPA annotations
* MySQL database integration

## 🔄 CRUD Operations

The project is being developed around CRUD operations:

* *Create* – Add new Categories, Products, Users, Orders, and OrderDetails
* *Read* – Fetch existing records from the database
* *Update* – Planned for future implementation
* *Delete* – Planned for future implementation

The assignment requires CRUD operations for the e-commerce entities and testing of database persistence.

## 📁 Project Structure

```text
HypernetProject1/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/code/HypernetProject1/
│       │       ├── crud/
│       │       ├── entity/
│       │       └── util/
│       │
│       └── resources/
│           └── hibernate.cfg.xml
│
├── pom.xml
└── README.md
```

## ⚙️ Setup

1. Create a MySQL database.
2. Configure the database details in `hibernate.cfg.xml`.
3. Install Maven dependencies.
4. Run the required CRUD classes from your IDE.




