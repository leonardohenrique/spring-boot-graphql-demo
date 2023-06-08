INSERT INTO genre (name) VALUES
('Fantasy'),
('Classics'),
('Horror');

INSERT INTO author (name) VALUES 
('J.R.R. Tolkien'),
('Bram Stoker');

INSERT INTO book (title, page_count, author_id) VALUES 
('The Hobbit', 304, 1),
('The Lord of the Rings', 1178, 1),
('Dracula', 418, 2);

INSERT INTO book_genres (books_id, genres_id) VALUES 
(1 , 1), (1 , 2),
(2 , 1), (2 , 2),
(3 , 3), (3 , 2);