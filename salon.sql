create database salon;
use salon;

#tipo

create table usuarios(
tipo int,
nombre varchar(25),
password varchar(20),
img varchar(20),
primary key(nombre)
);

#drop table usuarios;

insert into usuarios values(1,'Admin','root','Rosa M.png');


create table clientes(
id int auto_increment,
nombre varchar(25),
apellidos varchar(30),
telefono varchar(10),
correo varchar(30),
cumpleaños date,
deuda float,
primary key(id)
);



create table citas(
nombre varchar(25),
apellidos varchar(25),
asunto varchar(25),
fecha date,
hora varchar(10)
);



create table inventario(
id int auto_increment,
producto varchar(25),
existencia int,
precio_compra float,
precio_venta float,
primary key(id)
);

create table servicios(
id int auto_increment,
servicio varchar(25),
precio float,
primary key(id)
);



create table ventas(
id int auto_increment,
id_cliente int,
tipo varchar(15),
monto float,
fecha date,
primary key(id)
);

