DROP TABLE Teacher;
DROP TABLE IF EXISTS Teacher;
CREATE TABLE Teacher (
Id int AUTO_INCREMENT,
firstName varchar (100) NOT NULL,
lastName varchar (100) NOT NULL,
age int,
PRIMARY KEY (Id) 
);

SELECT * FROM Teacher;
insert into Teacher (firstName, lastName, age)
values('John', 'Doe', 36);
insert into Teacher (firstName, lastName, age)
values('Jane', 'Doe', 32);

insert into Teacher (id, firstName, lastName, age)
values(900, 'Mary', 'Boo', 67);
insert into Teacher (id, firstName, lastName, age)
values(901, 'Steve', 'Wallace', 54);

UPDATE Teacher
SET lastName = 'Parker'
WHERE id = 900;

UPDATE Teacher
SET firstName = 'Steven'
WHERE id = 901;

ALTER TABLE Teacher
DROP COLUMN age;

SELECT * FROM Teacher;