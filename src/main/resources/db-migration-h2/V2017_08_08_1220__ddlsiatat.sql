/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  mihai
 * Created: Aug 8, 2017
 */

create table products(id bigint auto_increment, name varchar(255), price DECIMAL(20, 2));
insert into products(name,price) values('hello',3.3);
insert into products(name,price) values('world',4.4);