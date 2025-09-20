Overview 

This project is a Library Management System built with Java + Spring Boot + Spring Security + JPA + H2/MySQL.


it supports :
- Book management with metadata (authors, categories, publishers, etc.)
- Member management
- System users (Admin, Librarian, Staff) with role-based access control
- Borrowing & returning books
- Authentication & authorization
- User activity logging (extendable)

Tech Stack :
- Java 17+
- Spring Boot 3.x
- Spring Security (Basic Authentication)
- Spring Security (Basic Authentication)
- H2 (in-memory) / MySQL / PostgreSQL
- Lombok
- Maven


Default DB

-H2 Console → http://localhost:8080/h2-console
-JDBC URL: jdbc:h2:mem:librarydb 


Sample roles user 
Defined in Data.sql
-Username:admin
-Password: admin123 (hashed with BCrypt)
-Username: librarian1
-password:librarian123 (hashed with BCrypt)
-Username: staff1
-password: staff123 (hashed with BCrypt)

Database Schema (ERD)

Entities:

Book → Many-to-Many Author, Many-to-One Publisher, Many-to-Many Category

Member → library members

SystemUser → system users (Admin, Librarian, Staff)

BorrowTransaction → tracks borrow/return

Roles & Permissions :


Role	       Permissions
ADMIN	       Manage users, books, members
LIBRARIAN  	Manage books, borrow/return
STAFF     	Assist with borrow/return only


API Endpoints
- Authentication
- Basic Auth with username:password

