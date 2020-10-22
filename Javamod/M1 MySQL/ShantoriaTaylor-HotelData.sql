use hotelreservation;


INSERT INTO amenity (amenityType) VALUES 
    ('Microwave'),
    ('Refrigerator'),
    ('Oven'),
    ('Jacuzzi');
    
INSERT INTO RoomType (RoomTypeID, TypeofRoom, StandardOccupancy, MaxOccupancy, Base, ExtraPrice) VALUES
	(1, 'Single', 2, 2, 174.99, 0),
	(2, 'Double', 2, 4, 199.99, 10),
	(3, 'Suite', 3, 8, 399.99, 20);
    
 INSERT INTO Customer (FirstName, LastName, Street, City, State, Zip, Phone) VALUES
    ('Shantoria','Taylor','5th Ave', 'Riverside',  'NM', '98765','555 555-7847'),
    ('Mack','Simmer','379 Old Shore Street','Council Bluffs','IA',51501,'(291) 553-0508'),
    ('Bettyann','Seery','750 Wintergreen Dr.','Wasilla','AK',99654,'(478) 277-9632'),
    ('Duane','Cullison','9662 Foxrun Lane','Harlingen','TX',78552,'(308) 494-0198'),
    ('Karie','Yanng','9378 W. Augusta Ave.','West Deptford','NJ',8096,'(214) 730-0298'),
    ('Aurore','Lipton','762 Wild Rose Street','Saginaw','MI',48601,'(377) 507-0974'),
    ('Zachery','Luechtefield','7 Poplar Dr.','Arvada','CO',80003,'(814) 458-2615'),
    ('Jeremiah','Pendergrass','70 Oakwood St.','Zion','IL',60099,'(279) 491-0960'),
    ('Walter','Holaway','7556 Arrowhead St.','Cumberland','RI',2864,'(446) 396-6785'),
    ('Wilfred','Vise','77 West Surrey Street','Oswego','NY',13126,'(834) 727-1001'),
    ('Maritza','Tilon','939 Linda Rd.','Burke','VA',22015,'(446) 351-6860'),
    ('Joleen','Tison','87 Queen St.','Drexel Hill','PA',19026,'(231) 893-2755');
    
    INSERT INTO Room (RoomID, RoomTypeID, ADA_Access) VALUES
    (201, 1, FALSE),
	(202, 1, TRUE),
    (203, 1, FALSE),
    (204, 1, TRUE),
    (205, 2, FALSE),
    (206, 2, TRUE),
    (207, 2, FALSE),
    (208, 1, TRUE),
    (301, 1, FALSE),
	(302, 1, TRUE),
    (303, 1, FALSE),
    (304, 1, TRUE),
    (305, 2, FALSE),
    (306, 2, TRUE),
    (307, 2, FALSE),
    (308, 2, TRUE),
    (401, 3, TRUE),
    (402, 3, TRUE);
    
INSERT INTO Reservation (Adults, Children, CheckIn, CheckOut, Total, CustomerID, RoomID) VALUES
    (1,0,'2023-02-02','2023-02-04 0',299.98, 2, 308),
    (2,1,'2023-02-05','2023-02-10 ',999.95, 3, 203),
    (2,0,'2023-02-22','2023-02-24 ',349.98, 4, 305),
    (2,2,'2023-03-06','2023-03-07 ',199.99, 5, 201),
    (1,1,'2023-03-17','2023-03-20 ',524.97, 1, 307),
    (3,0,'2023-03-18','2023-03-23 ',924.95, 6, 302),
    (2,2,'2023-03-29','2023-03-31 ',349.98, 7, 202),
    (2,0,'2023-03-31','2023-04-05 ',874.95, 8, 304),
    (1,0,'2023-04-09','2023-04-13 ',799.96, 9, 301),
    (1,1,'2023-04-23','2023-04-24 ',174.99, 10, 207),
    (2,4,'2023-05-30','2023-06-02 ',1199.97, 11, 401),
    (2,0,'2023-06-10','2023-06-14 ',599.96, 12, 206),
    (1,0,'2023-06-10','2023-06-14 ',599.96, 12, 208),
    (3,0,'2023-06-17 ','2023-06-18 ',184.99, 6, 304),
    (2,0,'2023-06-28 ','2023-07-02 ',699.96, 1, 205),
    (3,1,'2023-07-13 ','2023-07-14 ',184.99, 9, 204),
    (4,2,'2023-07-18 ','2023-07-21 ',1259.97, 10, 401),
    (2,1,'2023-07-28 ','2023-07-29 ',199.99, 3, 303),
    (1,0,'2023-08-30 ','2023-09-01 ',349.98, 3, 305),
    (2,0,'2023-09-16 ','2023-09-17 ',149.99, 2,208),
    (2,2,'2023-09-13 ','2023-09-15 ',399.98, 5, 203),
    (2,2,'2023-11-22 ','2023-11-25 ',1199.97, 4, 401),
    (2,0,'2023-11-22 ','2023-11-25 ',449.97, 2, 206),
    (2,2,'2023-11-22 ','2023-11-25 ',599.97, 2, 301),
    (2,0,'2023-12-24 ','2023-12-28 ',699.96, 11, 302);
        

    
    INSERT INTO RoomAmenity (RoomID, AmenityId) VALUES
    (201,1),
	(201, 4),
    (202,2),
    (203,1),
    (203, 4),
    (204,2),
    (205,1),
    (205,2),
    (205, 4),
    (206,1),
    (206,2),
    (207,1),
    (207,2),
    (207, 4),
    (208,1),
    (208,2),
    (301,1),
    (301, 4),
    (302,2),
    (303,1),
    (303, 4),
    (304,2),
    (305,1),
    (305,2),
    (305, 4),
    (306,1),
    (306,2),
    (307,1),
    (307,2),
    (307, 4),
    (308,1),
    (308,2),
    (401,1),
    (401,2),
    (401,3),
    (402,1),
    (402,2),
    (402,3);
    
    
    INSERT INTO Customer (FirstName, LastName, Street, City, State, Zip, Phone) VALUES
    ('Shantoria','Taylor','5th Ave', 'Riverside',  'NM', '98765','555 555-7847'),
    ('Mack','Simmer','379 Old Shore Street','Council Bluffs','IA',51501,'(291) 553-0508'),
    ('Bettyann','Seery','750 Wintergreen Dr.','Wasilla','AK',99654,'(478) 277-9632'),
    ('Duane','Cullison','9662 Foxrun Lane','Harlingen','TX',78552,'(308) 494-0198'),
    ('Karie','Yanng','9378 W. Augusta Ave.','West Deptford','NJ',8096,'(214) 730-0298'),
    ('Aurore','Lipton','762 Wild Rose Street','Saginaw','MI',48601,'(377) 507-0974'),
    ('Zachery','Luechtefield','7 Poplar Dr.','Arvada','CO',80003,'(814) 458-2615'),
    ('Jeremiah','Pendergrass','70 Oakwood St.','Zion','IL',60099,'(279) 491-0960'),
    ('Walter','Holaway','7556 Arrowhead St.','Cumberland','RI',2864,'(446) 396-6785'),
    ('Wilfred','Vise','77 West Surrey Street','Oswego','NY',13126,'(834) 727-1001'),
    ('Maritza','Tilon','939 Linda Rd.','Burke','VA',22015,'(446) 351-6860'),
    ('Joleen','Tison','87 Queen St.','Drexel Hill','PA',19026,'(231) 893-2755');
    
    
    -- Delete Pendergrass
    
    
DELETE FROM Reservation 
WHERE ReservationId = 8;

 
    