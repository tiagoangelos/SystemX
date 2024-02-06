create database dbsystemx
default character set utf8
default collate utf8_general_ci;

use dbsystemx;

create table tbusuarios(
iduser int not null auto_increment,
usuario varchar(50) not null,
fone varchar(16),
login varchar(15) not null unique,
senha varchar(15) not null,
primary key(iduser)
)default charset = utf8;

describe tbusuarios;
select * from dbsystemx.tbusuarios;

insert into tbusuarios values
(default, 'Ana Carol', '83776455931', 'anacarol2024', '66792024');

update dbinfox.tbusuarios set fone = "99999999999" where iduser = '3';

delete from dbsystemx.tbusuarios where iduser = '7';

create table tbclientes(
idcli int not null auto_increment,
nomecli varchar(50) not null,
endcli varchar(80),
fonecli varchar(16) not null,
emailcli varchar(50),
primary key(idcli)
)default charset = utf8;

describe dbsystemx.tbclientes;
select * from dbsystemx.tbclientes;

insert into dbsystemx.tbclientes values
(default, 'José Angelo', 'Rua Pedro Jorge', '87346577342', 'joseangelo7544@gmail.com');

create table tbos(
os int not null auto_increment,
data_os timestamp default current_timestamp,
equipamento varchar(150) not null,
defeito varchar(150) not null,
servico varchar(150),
tecnico varchar(30),
valor decimal(10,2),
idcli int not null,
foreign key(idcli) references dbsystemx.tbclientes(idcli),
primary key(os)
)default charset = utf8;

describe dbsystemx.tbos;
select * from dbsystemx.tbos;

insert into dbsystemx.tbos (equipamento, defeito, servico, tecnico, valor, idcli)
values ('Celular', 'Tela Trincada', 'Colocar Nova Tela', 'Carla', 150.00, 2);

select
O.os, equipamento, defeito, servico, valor,
C.nomecli, fonecli
from tbos as O
inner join tbclientes as C
on (O.idcli = C.idcli);

use dbsystemx;
describe dbsystemx.tbusuarios;
select * from dbsystemx.tbusuarios;
select * from dbsystemx.tbclientes;

alter table dbsystemx.tbusuarios add column perfil varchar(20) not null;
alter table dbsystemx.tbusuarios drop column perfil;

update dbsystemx.tbusuarios set perfil = 'user' where iduser = '3';

describe dbsystemx.tbclientes;
select * from dbsystemx.tbclientes;

select idcli as Id, nomecli as Nome, fonecli as Fone from dbsystemx.tbclientes where nomecli like 'j%';
alter table dbsystemx.tbos add tipo varchar(15) not null after data_os;
alter table dbsystemx.tbos add situacao varchar(20) not null after tipo;

describe dbsystemx.tbos;
select * from dbsystemx.tbos;

select os, date_format(data_os, '%d/%m/%Y - %H:%i'), tipo, situacao, equipamento, defeito, servico, tecnico, valor, idcli from dbsystemx.tbos where os = '7'; 

use dbsystemx;

show tables;

select * from dbsystemx.tbos;
select * from dbsystemx.tbclientes;

select * from dbsystemx.tbos;

select * from dbsystemx.tbclientes order by nomecli;
describe dbsystemx.tbclientes;

create user 'dba'@'%' identified by '99602015';
grant all privileges on * . * to 'dba'@'%';
flush privileges;

select * from dbsystemx.tbos;
select * from dbsystemx.tbclientes;

select
OSER.os, data_os, tipo, situacao, equipamento, valor,
CLI.nomecli, fonecli
from dbsystemx.tbos as OSER
inner join dbsystemx.tbclientes as CLI
on (CLI.idcli = OSER.idcli);

select * from dbsystemx.tbos where os = 7;

select max(os) from dbsystemx.tbos;