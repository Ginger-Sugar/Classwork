use hotelreservation;

-- Write a query that returns a list of reservations that end in July 2023, 
-- including the name of the guest, the room number(s), and the reservation dates.


SELECT c.FirstName,c.LastName,
	   r.RoomID, r.Checkin, r.Checkout 
FROM Reservation r
INNER JOIN Customer c ON r.CustomerId = c.CustomerId
WHERE r.Checkout BETWEEN '2023/07/01' AND '2023/07/31';
-- Answer:

-- Shantoria	Taylor	205	2023-06-28	2023-07-02
-- Walter	Holaway	204	2023-07-13	2023-07-14
-- Wilfred	Vise	401	2023-07-18	2023-07-21
-- Bettyann	Seery	303	2023-07-28	2023-07-29

-- Question 2: Write a query that returns a list of all reservations for rooms 
-- with a jacuzzi, displaying the guest's name, the room number, and the dates of the reservation.

SELECT c.FirstName,c.LastName,
	   r.RoomID, r.Checkin, r.Checkout
FROM Reservation r	   
INNER JOIN Customer c ON r.CustomerId = c.CustomerId
INNER JOIN Room ro ON r.RoomID = ro.RoomID
INNER JOIN RoomAmenity ra ON r.RoomID = ra.RoomID
INNER JOIN Amenity a ON ra.AmenityID = a.AmenityID
WHERE a.amenityType= 'Jacuzzi';

-- Answers:

-- Karie	Yanng	201	2023-03-06	2023-03-07
-- Bettyann	Seery	203	2023-02-05	2023-02-10
-- Karie	Yanng	203	2023-09-13	2023-09-15
-- Shantoria	Taylor	205	2023-06-28	2023-07-02
-- Wilfred	Vise	207	2023-04-23	2023-04-24
-- Walter	Holaway	301	2023-04-09	2023-04-13
-- Mack	Simmer	301	2023-11-22	2023-11-25
-- Bettyann	Seery	303	2023-07-28	2023-07-29
-- Duane	Cullison	305	2023-02-22	2023-02-24
-- Bettyann	Seery	305	2023-08-30	2023-09-01
-- Shantoria	Taylor	307	2023-03-17	2023-03-20

-- question 3: Write a query that returns all the rooms reserved for a specific guest, including the guest's name, the room(s) reserved, the starting date of the reservation, 
-- and how many people were included in the reservation. (Choose a guest's name from the existing data.)

select c.firstname,c.lastname,ro.roomID,r.checkin,r.adults + r.children as everyone, r.total
from customer c
inner join reservation r on c.customerId = r.customerId
inner join room ro on r.roomID = ro.roomID
WHERE c.customerId = 1;

-- answer:
-- Shantoria	Taylor	307	2023-03-17	2
-- Shantoria	Taylor	205	2023-06-28	2

-- question 4: Write a query that returns a list of rooms, reservation ID, and per-room cost for each reservation. The results should include all rooms,
-- whether or not there is a reservation associated with the room.


SELECT ro.RoomID, 
	   r.ReservationId, 
	   r.Total
FROM Room ro
LEFT OUTER JOIN Reservation r ON ro.RoomID = r.RoomID;

-- answer:
-- 201	4	199.99
-- 202	7	349.98
-- 203	2	999.95
-- 203	21	399.98
-- 204	16	184.99
-- 205	15	699.96
-- 206	12	599.96
-- 206	23	449.97
-- 207	10	174.99
-- 208	13	599.96
-- 208	20	149.99
-- 301	9	799.96
-- 301	24	599.97
-- 302	6	224.99
-- 302	25	699.96
-- 303	18	199.99
-- 304	14	184.99
-- 305	3	349.98
-- 305	19	349.98
-- 306		
-- 307	5	524.97
-- 308	1	299.98
-- 401	11	1199.97
-- 401	17	459.99
-- 401	22	1199.97
-- 402		

-- question 5: Write a query that returns all the rooms accommodating at least 
-- three guests and that are reserved on any date in April 2023.

SELECT r.RoomID,
	   r.Adults + r.Children AS 'TotalPeople'
FROM Reservation r
WHERE r.Adults + r.Children > 2 
AND r.Checkin BETWEEN 2023/04/01 AND 2023/04/31;

-- answer: n/a

-- question 6: Write a query that returns a list of all guest names and the number of reservations per guest, sorted starting 
-- with the guest with the most reservations and then by the guest's last name.

SELECT CONCAT(c.FirstName, " ", c.LastName) AS 'Name',
	   COUNT(R.CustomerId) AS 'TotalReservations'
FROM  Reservation r
INNER JOIN Customer c ON c.CustomerId = r.CustomerId
GROUP BY r.CustomerId
ORDER BY COUNT(*) DESC , c.LastName ASC;

-- answers

-- Mack Simmer	4
-- Bettyann Seery	3
-- Duane Cullison	2
-- Walter Holaway	2
-- Aurore Lipton	2
-- Shantoria Taylor	2
-- Maritza Tilon	2
-- Joleen Tison	2
-- Wilfred Vise	2
-- Karie Yanng	2
-- Zachery Luechtefield	1


-- question 7: Write a query that displays the name, address, and phone
--  number of a guest based on their phone number. (Choose a phone number from the existing data.)


SELECT c.FirstName, c.LastName, c.Street, c.City, c.State, c.Zip, c.Phone
FROM customer c
WHERE c.Phone LIKE '%555%';

-- answer: 
-- Shantoria	Taylor	5th Ave	Riverside	NM	98765	555 555-7847
