create database tienda;
use tienda;

/*tablas*/
create table tbl_producto (
Id_producto int auto_increment primary key,
Nombre_Producto varchar (200) null,
stock int null,
Valor_venta int null,
Valor_Compra int null,
estado enum ('Disponible','Agotado')
);

create table tbl_cliente (
Id_cliente int auto_increment primary key,
Nombre_cliente varchar (200) null,
correo_electronico varchar (200) null,
Identificacion int unique
);

create table tbl_venta (
Id_venta int auto_increment primary key,
Nombre_vendedor varchar (200) null
);

create table tbl_factura (
Id_factura int auto_increment primary key,
Id_venta int unique,
Id_cliente int unique,
Id_producto int unique,
Cantidad int null,
Precio_total int null
); 

/*consulta multi tabla*/

select f.Id_factura,p.Id_producto,p.Nombre_Producto,p.Cantidad ,p.Valor_Compra,f.Precio_total,  f.Precio_total - p.Valor_Compra as Ganancia from tbl_factura f inner join tbl_producto p on f.Id_producto = p.Id_producto where f.Id_producto = '1';


/*insertar datos*/
insert into tbl_cliente values ('','mari','mai@gmail',1004445);
insert into tbl_producto values ('','leche',70,3500,1200);
insert into tbl_venta values ('','huevos',70,3500,1200);



/*consultas*/
select * from tbl_cliente;
select * from tbl_producto;

/*Relaciones*/
alter table tbl_factura add foreign key (Id_venta) references tbl_venta (Id_venta);  
alter table tbl_factura add foreign key (Id_producto) references tbl_producto (Id_producto);
alter table tbl_factura add foreign key (Id_cliente) references tbl_cliente (Id_cliente);



      


