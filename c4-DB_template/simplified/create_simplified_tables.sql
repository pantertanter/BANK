CREATE TABLE accounts(
uid int NOT NULL AUTO_INCREMENT,
customer varchar(12) NOT NULL,
PRIMARY KEY (uid),
UNIQUE (customer)
);

CREATE TABLE customers(
cid int NOT NULL AUTO_INCREMENT,
name varchar(12) NOT NULL,
PRIMARY KEY (cid),
UNIQUE (name)
);

CREATE TABLE transactions(
tid int NOT NULL AUTO_INCREMENT,
amount int NOT NULL,
origin int,
destination int,
PRIMARY KEY (tid),
FOREIGN KEY (origin) REFERENCES accounts(uid),
FOREIGN KEY (destination) REFERENCES accounts(uid)
);