CREATE DATABASE javaproject;

CREATE TABLE login(
    lg_id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    lg_username varchar(128) NOT NULL,
    lg_password varchar(128) NOT NULL
);

CREATE TABLE ticketbooking(
    tb_id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    tb_username varchar(128) NOT NULL,
    tb_name varchar(128) NOT NULL,
    tb_phone varchar(128) NOT NULL,
    tb_start varchar(128) NOT NULL,
    tb_destination varchar(128) NOT NULL,
    tb_time varchar(128) NOT NULL,
    tb_seats varchar(128) NOT NULL
);
