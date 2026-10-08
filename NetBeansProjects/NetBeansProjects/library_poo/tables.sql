create table reserva(
idreserva int unsigned NOT NULL auto_increment,
fechaIngreso varchar(45) default null,
fechaSalida varchar(45) default null,
numeroPiso varchar(45) default null,
numeroHabitacion varchar(45) default null,
costo varchar(45) default null,
estadoReserva varchar(9) default null,
cliente_id int unsigned NOT NULL,
primary key (idreserva)
);
create table usuario(
idUsuario int unsigned NOT NULL auto_increment,
user varchar(45) default null,
password varchar(45) default null,
tipoUser varchar(45) default null,
nombre varchar(45) default null,
apellido varchar(45) default null,
dni varchar(10) default null,
primary key(idUsuario)
);