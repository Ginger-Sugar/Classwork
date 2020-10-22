

Drop database if exists hotelreservation;

create database hotelreservation;

use hotelreservation;


create table Room (
	RoomID INT primary key,
	RoomTypeID INT,
	ADA_Access boolean
);

create table RoomType (
RoomTypeID int primary key,
TypeofRoom varchar (10),
StandardOccupancy int not null,
MaxOccupancy int not null,
Base decimal (5,2) not null,
ExtraPrice decimal (4,2) not null
);

create table Amenity (
amenityID int primary key auto_increment,
amenityType varchar (30),
amenityPrice decimal(4,2)
);

create table roomamenity (
RoomID int not null,
AmenityID int not null,
PRIMARY KEY pk_RoomAmenity (RoomID, AmenityId),
	FOREIGN KEY fk_RoomAmenity_Room (RoomID)
		REFERENCES Room (RoomID),
	FOREIGN KEY fk_RoomAmenity_Amenity (AmenityId)
		REFERENCES Amenity(AmenityId)
);


create table customer (
customerID int primary key auto_increment,
firstname varchar (20) not null,
lastname varchar (30) not null,
street varchar (30),
city varchar (30),
state char (2),
zip char (5),
phone char (15)
);

create table reservation (
reservationID int primary key auto_increment,
adults int not null,
children int not null,
checkin date,
checkout date,
total decimal (6,2) not null,
CustomerID int not null,
Foreign Key fk_Reservation_Customer(CustomerID)
	references Customer(CustomerID),
RoomID int not null,
Foreign Key fk_Reservation_Room(RoomID)
	references Room(RoomID)
);

