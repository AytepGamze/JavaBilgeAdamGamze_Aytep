CREATE TABLE students (
	
	name VARCHAR(255),
	surname VARCHAR (255),
	grade INT
);

SELECT * FROM students;
INSERT INTO students (name, surname, grade)
VALUES
('Gamze', 'Gokbulut', 100),
('Ruveyda', 'Yilmaz', 100),
('Tuba', 'Inan', 100),
('Tugce', 'Onal', 90),
('Elif', 'Aytep', 85);

UPDATE students
SET surname= 'yilmaz'
WHERE name= 'Ruveyda';

ALTER TABLE students 
ADD dogum_yili VARCHAR(255);

UPDATE students
SET dogum_yili= 1999;


UPDATE students
SET name= 'Gizem'
WHERE name IN ('Gamze');

UPDATE students
SET surname= 'Akcelik'
WHERE surname IN ('Aytep');



UPDATE students
SET grade= '50'
WHERE grade IN ('100');


DELETE FROM students
WHERE name= 'Elif';


















