INSERT INTO users (id, user_name, password, role) VALUES
(1, 'admin', '$2a$10$sCybMedAy1hodYL.ySzIm.YVpmUqOJ.JAozcureozDZOhP5J/ixTO', 'ADMIN'),
(2, 'librarian1', '$2a$10$1BmQCqx1N.v53KxkMqcAregO3gLjMSlUKpT3aVamdDCPtPs/2ibPC', 'LIBRARIAN'),
(3, 'staff1', '$2a$10$nya8TCWg5MEPugv7lSbAqON4D4pDAqIfOUKY.k3ZU9.2S1yn4SUom', 'STAFF');



INSERT INTO member (id, name, email, member_ship_date) VALUES
(1, 'John Doe', 'john@example.com', '2024-01-01'),
(2, 'Jane Smith', 'jane@example.com', '2024-02-15');


INSERT INTO publisher (id, name) VALUES
(1, 'Reilly Media'),
(2, 'Pearson');


INSERT INTO author (id, name, bio) VALUES
(1, 'Joshua Bloch', 'Author of Effective Java'),
(2, 'Robert Martin', 'Author of Clean Code');

INSERT INTO category (id, name, parent_category_id) VALUES
(1, 'Programming', NULL),
(2, 'Java', 1);


INSERT INTO book (id, title, isbn, edition, summary, language, publication_year, cover_image, publisher_id) VALUES
(1, 'Effective Java', '9780134685991', '3rd', 'Best practices for Java programming', 'English', 2018, 'effective-java.jpg', 1),
(2, 'Clean Code', '9780132350884', '1st', 'Guide to writing clean code', 'English', 2008, 'clean-code.jpg', 2);

INSERT INTO borrow_transaction (id, book_id, member_id, borrow_date, due_date, return_date, status) VALUES
(1, 1, 1, '2024-03-01', '2024-03-15', NULL, 'BORROWED'),
(2, 2, 2, '2024-03-05', '2024-03-20', '2024-03-18', 'RETURNED');

INSERT INTO book_authors (book_id, authors_id) VALUES (1, 1), (2, 2);


INSERT INTO book_categories (book_id, categories_id) VALUES (1, 2), (2, 1);