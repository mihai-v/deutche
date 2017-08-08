

create table products(id serial, name varchar(255), price DECIMAL(20, 2));
insert into products(name,price) values('hello',3.3);
insert into products(name,price) values('world',4.4);