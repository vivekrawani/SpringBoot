CREATE TABLE IF NOT EXISTS product (
  id integer,
  name varchar(450),
  price integer,
  PRIMARY KEY (id)
);

insert into product(id, name , price) values(1,'HP mice',500);