create table sample (id varchar(20) primary key,
pw varchar(300) not null,
vcnt BIGINT
);

select * from sample;
insert into sample values('keg','1234',7);

create table user1(id varchar(20) primary key,
pw varchar(300) not null,
name varchar(50),
email varchar(100) not null,
tel varchar(20) not null,
regdate date default CURRENT_DATE,

);

-- - 선생님

create table user1 (id varchar(20) primary key,
pw varchar(300) not null,
name varchar(50),
email varchar(100) not null,
tel varchar(20) not null,
addr1 varchar(200),
addr2 varchar(100),
postcode varchar(10),
regdate date default CURRENT_DATE,
birth date,
pt int default 100,
visited int default 0
);

select * FROM user1;


