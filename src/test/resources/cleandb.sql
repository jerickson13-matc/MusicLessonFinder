DELETE FROM saved_lessons;
DELETE FROM enrollments;
DELETE FROM lessons;
DELETE FROM teacher_instruments;
DELETE FROM student_instruments;
DELETE FROM instruments;

INSERT INTO instruments (id, name) VALUES(1, 'Guitar'),(2, 'Piano'),(3, 'Drums');