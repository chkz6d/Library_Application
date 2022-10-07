show databases;
use library_application;
describe library;


insert into library values (001,"Gum Spring library");
insert into library values (002,"twin hickory library");
insert into library values (003,"Brambleton library");

SELECT * FROM library_application.library;

show databases;
use library_application;
describe library;
describe book;

insert into book values (1287,"Spring in Action",1);
insert into book values (3849,"Spring boot basics",2);
insert into book values (3894,"Hibernate Basics",3);
insert into book values (94845,"Java 2 Unleashed",3);

SELECT * FROM library_application.book;