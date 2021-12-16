CREATE DATABASE IF NOT EXISTS FORACADEMY;
SET foreign_key_checks = 0;

-- Role Table
DROP Table IF EXISTS Role;
CREATE TABLE Role (
    idRole int AUTO_INCREMENT,
    name varchar(50) NOT NULL,
    description varchar(255),
    active bool,

    CONSTRAINT PK_Role PRIMARY KEY (idRole)
);

-- Permission Table
DROP Table IF EXISTS Permission;
CREATE TABLE Permission (
    idPermission int AUTO_INCREMENT,
    name varchar(50) NOT NULL,
    description varchar(255),
    active bool,
    CONSTRAINT PK_Permission PRIMARY KEY (idPermission)
);

-- RolePermission Table
DROP Table IF EXISTS RolePermission;
CREATE TABLE RolePermission (
    idRolePermission int AUTO_INCREMENT,
    idRole int NOT NULL,
    idPermission int NOT NULL,
    assignedAt datetime NOT NULL,
    updatedAt datetime,

    CONSTRAINT PK_User PRIMARY KEY (idRolePermission, idRole, idPermission),
    CONSTRAINT FK_RolePermissionRole FOREIGN KEY (idRole) REFERENCES Role(idRole),
    CONSTRAINT FK_RolePermissionPermission FOREIGN KEY (idPermission) REFERENCES Permission(idPermission)
);

-- SSICA table
DROP Table IF EXISTS SSICA;
CREATE TABLE SSICA (
    idSsica int NOT NULL AUTO_INCREMENT,
    brand varchar(50),

    CONSTRAINT PK_Ssica PRIMARY KEY (idSsica)
);

-- Speciality Table
DROP TABLE IF EXISTS Speciality;
CREATE TABLE Speciality (
    idSpeciality int NOT NULL AUTO_INCREMENT,
    name varchar(50),
    description varchar(255),

    CONSTRAINT PK_Speciality PRIMARY KEY (idSpeciality)
);


-- Scan table (UserSsica)
DROP Table IF EXISTS Scan;
CREATE TABLE Scan (
    idScan int NOT NULL Auto_Increment,
    idSsica int,
    idUser int,
    arrivalDate timestamp,
    goDate timestamp,

    CONSTRAINT PK_Scan PRIMARY KEY (idScan),
    CONSTRAINT FK_ScanSsica FOREIGN KEY (idSsica) REFERENCES SSICA(idSsica),
    CONSTRAINT FK_ScanUser FOREIGN KEY (idUser) REFERENCES User(idUser)
);


-- Address table
DROP TABLE IF EXISTS Address;
CREATE TABLE Address (
    idAddress int NOT NULL AUTO_INCREMENT,
    line varchar(50),
    country varchar(50),
    region varchar(50),
    city varchar(50),
    postalCode varchar(50),

    CONSTRAINT PK_Address PRIMARY KEY (idAddress)
);

-- Factory Table
DROP TABLE IF EXISTS Factory;
CREATE TABLE Factory (
    idFactory int NOT NULL AUTO_INCREMENT,
    name varchar(50),
    idAddress int,

    CONSTRAINT PK_Factory PRIMARY KEY (idFactory),
    CONSTRAINT FK_FactoryAddress FOREIGN KEY (idAddress) REFERENCES Address(idAddress)
);

--  User table
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
    idAddress int,
    active bool,
    idRole int NOT NULL,

    CONSTRAINT PK_User PRIMARY KEY (idUser),
    CONSTRAINT FK_UserRole FOREIGN KEY (idRole) REFERENCES Role(idRole),
    CONSTRAINT FK_UserAddress FOREIGN KEY (idAddress) REFERENCES Address(idAddress)

);

--  Manager table
DROP TABLE IF EXISTS Manager;
CREATE TABLE  Manager (
	idManager int NOT NULL,
    dateOfEntryToFactory datetime,

    CONSTRAINT PK_Manager PRIMARY KEY (idManager),
    CONSTRAINT FK_ManagerUser FOREIGN KEY (idManager) REFERENCES User(idUser)
);

--  Trainer table
DROP TABLE IF EXISTS Trainer;
CREATE TABLE Trainer (
	idTrainer int NOT NULL,
	idSpeciality int,

    CONSTRAINT PK_Trainer PRIMARY KEY (idTrainer),
    CONSTRAINT FK_TrainerUser FOREIGN KEY (idTrainer) REFERENCES User(idUser),
    CONSTRAINT FK_TrainerSpeciality FOREIGN KEY (idSpeciality) REFERENCES Speciality(idSpeciality)
);

-- Class table
DROP TABLE IF EXISTS Class;
CREATE TABLE Class (
    idClass int NOT NULL AUTO_INCREMENT,
    name varchar(50),
    idTrainer int,
    idPromotion int,
    startDay time,
    endDay time,

    CONSTRAINT PK_Class PRIMARY KEY (idClass),
    CONSTRAINT FK_ClassTrainer FOREIGN KEY (idTrainer) REFERENCES Trainer(idTrainer),
    CONSTRAINT FK_ClassPromotion FOREIGN KEY (idPromotion) REFERENCES Promotion(idPromotion)
);

-- Promotion table
DROP TABLE IF EXISTS Promotion;
CREATE TABLE Promotion (
    idPromotion int NOT NULL AUTO_INCREMENT,
    name varchar(50),
    year year,
    startDate timestamp,
    endDate timestamp,

    CONSTRAINT PK_Class PRIMARY KEY (idPromotion)
);

--  Admin table
DROP TABLE IF EXISTS Admin;
CREATE TABLE Admin (
	idAdmin int NOT NULL,

    CONSTRAINT PK_Admin PRIMARY KEY (idAdmin),
    CONSTRAINT FK_AdminUser FOREIGN KEY (idAdmin) REFERENCES User(idUser)
);

--  Admin table
DROP TABLE IF EXISTS Secretary;
CREATE TABLE Secretary (
	idSecretary int NOT NULL,
	dateOfEntryToFactory datetime,

    CONSTRAINT PK_Secretary PRIMARY KEY (idSecretary),
    CONSTRAINT FK_SecretaryUser FOREIGN KEY (idSecretary) REFERENCES User(idUser)
);

--  Student table
DROP TABLE IF EXISTS Student;
CREATE TABLE Student (
	idStudent int NOT NULL,
	idSpeciality int,
	idClass int,

    CONSTRAINT PK_Student PRIMARY KEY (idStudent),
    CONSTRAINT FK_StudentUser FOREIGN KEY (idStudent) REFERENCES User(idUser),
    CONSTRAINT FK_StudentSpeciality FOREIGN KEY (idSpeciality) REFERENCES Speciality(idSpeciality),
    CONSTRAINT FK_StudentClass FOREIGN KEY (idClass) REFERENCES Class(idClass)
);

SET foreign_key_checks = 1;