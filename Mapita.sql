create table usuario(idusuario serial not null, nombre text not null, correo text not null, contrasenia text not null, fechanacimiento date, primary key(idusuario));
create table marcador(idmarcador serial not null, descripcion text not null, latitud double precision not null, longitud double precision not null, primary key(idmarcador));
insert into usuario(nombre,correo,contrasenia,fechanacimiento) values ('Mauricio','correo@correo.com','contrasenia','1996-03-07');
