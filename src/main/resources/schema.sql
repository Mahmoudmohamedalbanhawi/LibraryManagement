CREATE TABLE users (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    user_name VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(20) NOT NULL
);



CREATE TABLE member (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    member_ship_date DATE
);


CREATE TABLE publisher (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    address VARCHAR(255)
);


CREATE TABLE author (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    bio TEXT
);

CREATE TABLE category (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    parent_category_id BIGINT,
    FOREIGN KEY (parent_category_id) REFERENCES category(id)
);


CREATE TABLE book (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    isbn VARCHAR(50),
    edition VARCHAR(20),
    summary TEXT,
    language VARCHAR(50),
    publication_year INT,
    cover_image VARCHAR(255),
    publisher_id BIGINT,
    FOREIGN KEY (publisher_id) REFERENCES publisher(id)
);



CREATE TABLE book_authors (
    book_id BIGINT NOT NULL,
    authors_id BIGINT NOT NULL,
    PRIMARY KEY (book_id, authors_id),
    FOREIGN KEY (book_id) REFERENCES book(id),
    FOREIGN KEY (authors_id) REFERENCES author(id)
);


CREATE TABLE book_categories (
    book_id BIGINT NOT NULL,
    categories_id BIGINT NOT NULL,
    PRIMARY KEY (book_id, categories_id),
    FOREIGN KEY (book_id) REFERENCES book(id),
    FOREIGN KEY (categories_id) REFERENCES category(id)
);



CREATE TABLE borrow_transaction (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    book_id BIGINT NOT NULL,
    member_id BIGINT NOT NULL,
    borrow_date DATE,
    due_date DATE,
    return_date DATE,
    status VARCHAR(20),
    FOREIGN KEY (book_id) REFERENCES book(id),
    FOREIGN KEY (member_id) REFERENCES member(id)
);