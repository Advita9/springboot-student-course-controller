-- Students
INSERT INTO student(name,email) VALUES ('A','a@mail.com');
INSERT INTO student(name,email) VALUES ('B','b@mail.com');

-- Courses
INSERT INTO course(id,title,credits) VALUES (1,'Math',3);
INSERT INTO course(id,title,credits) VALUES (2,'Physics',4);

INSERT INTO student_course(student_id, course_id) VALUES (1,1);
INSERT INTO student_course(student_id, course_id) VALUES (1,2);
INSERT INTO student_course(student_id, course_id) VALUES (2,1);