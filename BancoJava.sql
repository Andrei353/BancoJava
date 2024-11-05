create database if not exists banco;
use banco;
create table tabela(
id int not null primary key auto_increment,
nome varchar(100),
cidade varchar(100)
);
select * from tabela

