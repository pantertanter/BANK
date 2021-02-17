PRIMARYPRIMARYCREATE TABLE users(
uid int NOT NULL AUTO_INCREMENT,
username varchar(12) NOT NULL,
password int NOT NULL,
balance int NOT NULL,
PRIMARY KEY (uid),
UNIQUE (username)
);

CREATE TABLE transactions(
tid int NOT NULL AUTO_INCREMENT,
t_type varchar (10) NOT NULL,
amount int NOT NULL,
origin int,
destination int,
PRIMARY KEY (tid),
FOREIGN KEY (origin) REFERENCES users(uid),
FOREIGN KEY (destination) REFERENCES users(uid)
);