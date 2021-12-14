CREATE DATABASE IF NOT EXISTS FORACADEMY;

SET foreign_key_checks = 0;
#  User table
DROP TABLE IF EXISTS User;
CREATE TABLE  User (
	idUser int NOT NULL AUTO_INCREMENT,
	lastName varchar(255) NOT NULL,
    firstName varchar(255),
    email varchar(100),
    password varchar(255),
    phone varchar(100),
    gander varchar(50),
    dateOfBirth date,
    active bool,

   CONSTRAINT PK_User PRIMARY KEY (idUser)
);

#  Manager table
DROP TABLE IF EXISTS Manager;
CREATE TABLE  Manager (
	idManager int NOT NULL,
    dateOfEntryToFactory datetime,

    CONSTRAINT PK_Manager PRIMARY KEY (idManager),
    CONSTRAINT FK_ManagerUser FOREIGN KEY (idManager) REFERENCES User(idUser)
);

#  Manager table
DROP TABLE IF EXISTS Trainer;
CREATE TABLE Trainer(
	idTrainer int NOT NULL,

    CONSTRAINT PK_Trainer PRIMARY KEY (idTrainer),
    CONSTRAINT FK_TrainerUser FOREIGN KEY (idTrainer) REFERENCES User(idUser)
);

#  Admin table
DROP TABLE IF EXISTS Admin;
CREATE TABLE Admin (
	idAdmin int NOT NULL,

    CONSTRAINT PK_Admin PRIMARY KEY (idAdmin),
    CONSTRAINT FK_AdminUser FOREIGN KEY (idAdmin) REFERENCES User(idUser)
);

#  Admin table
DROP TABLE IF EXISTS Secretary;
CREATE TABLE Secretary (
	idSecretary int NOT NULL,
	dateOfEntryToFactory datetime,

    CONSTRAINT PK_Secretary PRIMARY KEY (idSecretary),
    CONSTRAINT FK_SecretaryUser FOREIGN KEY (idSecretary) REFERENCES User(idUser)
);

#  Student table
DROP TABLE IF EXISTS Student;
CREATE TABLE Student (
	idStudent int NOT NULL,

    CONSTRAINT PK_Student PRIMARY KEY (idStudent),
    CONSTRAINT FK_StudentUser FOREIGN KEY (idStudent) REFERENCES User(idUser)
);

# Role Table
# Role_Permission
# Permission Table
# Scan
# SSICA
# Events
# Factory
# address
# Class
# Specialiter
# Promotion

SET foreign_key_checks = 1;