create database ser
go
use ser
go

create table tblCom
(
	_name varchar(30) primary key,
	_description varchar(50),
	_address varchar(50),
	_cost float
)
insert into tblCom values('VNPT','aaa','bbb',11111)
insert into tblCom values('ccc','aaa','bbb',22222)
insert into tblCom values('ddd','aaa','bbb',3333)