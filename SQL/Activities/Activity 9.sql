REM   Script: Activity 9
REM   Activity9

DROP TABLE orders;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

SELECT *FROM orders;

SELECT DISTINCT salesman_id FROM Orders;

SELECT order_number FROM orders Order By order_date;

SELECT order_no FROM orders Order By order_date;

SELECT order_no, order_date FROM orders Order By order_date;

SELECT order_no,purchase_amount FROM orders Order by purchase_amount DESC;

SELECT * FROM orders WHERE purchase_amount <500;

SELECT * FROM orders WHERE purchase_amount between 1000 and 2000;

SELECT sum(purchase_amount) from orders;

SELECT avg(purchase_amount) from orders;

SELECT max(purchase_amount) from orders;

SELECT min(purchase_amount) from orders;

SELECT sum(purchase_amount) AS "Total sum" from orders;

SELECT avg(purchase_amount) AS "Total Avg" from orders;

SELECT max(purchase_amount) AS "MAXIMUM PURCHASE AMOUNT" from orders;

SELECT min(purchase_amount) AS "MINIMUM PURCHASE AMOUNT"from orders;

SELECT COUNT(SALESMAN_ID) AS "TOTAL COUNT" from orders;

SELECT customer_id, MAX(purchase_amount) as "MAX AMOUNT" FROM orders GROUP BY customer_id;

SELECT customer_id, MAX(Purchase_amount) as "MAX AMOUNT" FROM orders GROUP BY customer_id;

SELECT  MAX(Purchase_amount),customer_id as "MAX AMOUNT" FROM orders GROUP BY customer_id;

SELECT customer_id, MAX(Purchase_amount) as "MAX AMOUNT" FROM orders GROUP BY customer_id;

SELECT salesman_id, customer_id, MAX(Purchase_amount) WHERE order_date= '2012-08-17';

SELECT salesman_id, customer_id, MAX(Purchase_amount) WHERE order_date= '2012-08-17';

SELECT salesman_id, customer_id, MAX(Purchase_amount) WHERE order_date= '2012-08-17'FROM orders;

SELECT salesman_id, customer_id, MAX(Purchase_amount) FROM orders WHERE order_date= '2012-08-17';

SELECT salesman_id, customer_id, MAX(Purchase_amount) FROM orders 
WHERE order_date= TO_DATE('2012-08-17';'YYYY-MM-DD')GROUP BY Salesman_id;

SELECT salesman_id,order_Date , MAX(purchase_amount) FROM orders 
WHERE order_date= TO_DATE('2012-08-17';'YYYY-MM-DD')GROUP BY Salesman_id,order_date;

SELECT salesman_id,order_Date , MAX(purchase_amount) FROM orders 
WHERE order_date= TO_DATE('2012-08-17','YYYY-MM-DD')GROUP BY Salesman_id,order_date;

SELECT customer_id, MAX(purchase_amount) FROM orders 
WHERE MAX(purchase_amount)between [2030, 3450, 5760, 6000];

SELECT customer_id,order_date ,MAX(purchase_amount) FROM orders 
GROUP BY customer_id, order_date 
HAVING MAX(purchase_amount)IN [2030, 3450, 5760, 6000];

DROP TABLE orders;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

SELECT *FROM orders;

SELECT DISTINCT salesman_id FROM Orders;

SELECT order_no, order_date FROM orders Order By order_date;

SELECT order_no,purchase_amount FROM orders Order by purchase_amount DESC;

SELECT * FROM orders WHERE purchase_amount <500;

SELECT * FROM orders WHERE purchase_amount between 1000 and 2000;

SELECT sum(purchase_amount) AS "Total sum" from orders;

SELECT avg(purchase_amount) AS "Total Avg" from orders;

SELECT max(purchase_amount) AS "MAXIMUM PURCHASE AMOUNT" from orders;

SELECT min(purchase_amount) AS "MINIMUM PURCHASE AMOUNT"from orders;

SELECT COUNT(SALESMAN_ID) AS "TOTAL COUNT" from orders;

SELECT customer_id, MAX(Purchase_amount) as "MAX AMOUNT" FROM orders GROUP BY customer_id;

SELECT salesman_id,order_Date , MAX(purchase_amount) FROM orders 
WHERE order_date= TO_DATE('2012-08-17','YYYY-MM-DD')GROUP BY Salesman_id,order_date;

SELECT customer_id,order_date ,MAX(purchase_amount) FROM orders 
GROUP BY customer_id, order_date 
HAVING MAX(purchase_amount)IN (2030, 3450, 5760, 6000);

SELECT customer_id,order_date ,MAX(purchase_amount) FROM orders 
GROUP BY customer_id, order_date 
HAVING MAX(purchase_amount)IN (2030, 3450, 5760, 6000);

DROP TABLE orders;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

SELECT *FROM orders;

SELECT DISTINCT salesman_id FROM Orders;

SELECT order_no, order_date FROM orders Order By order_date;

SELECT order_no,purchase_amount FROM orders Order by purchase_amount DESC;

SELECT * FROM orders WHERE purchase_amount <500;

SELECT * FROM orders WHERE purchase_amount between 1000 and 2000;

SELECT sum(purchase_amount) AS "Total sum" from orders;

SELECT avg(purchase_amount) AS "Total Avg" from orders;

SELECT max(purchase_amount) AS "MAXIMUM PURCHASE AMOUNT" from orders;

SELECT min(purchase_amount) AS "MINIMUM PURCHASE AMOUNT"from orders;

SELECT COUNT(SALESMAN_ID) AS "TOTAL COUNT" from orders;

SELECT customer_id, MAX(Purchase_amount) as "MAX AMOUNT" FROM orders GROUP BY customer_id;

SELECT salesman_id,order_Date , MAX(purchase_amount) FROM orders 
WHERE order_date= TO_DATE('2012-08-17','YYYY-MM-DD')GROUP BY Salesman_id,order_date;

SELECT customer_id,order_date ,MAX(purchase_amount) FROM orders 
GROUP BY customer_id, order_date 
HAVING MAX(purchase_amount)IN (2030, 3450, 5760, 6000);

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

INSERT ALL 
    INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001) 
    INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001) 
    INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002) 
    INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002) 
    INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006) 
    INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003) 
    INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007) 
    INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005) 
SELECT 1 FROM DUAL;

SELECT * FROM customers;

SELECT * FROM salesman;

SELECT * FROM orders;

SELECT * FROM salesman;

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM customers;

SELECT * FROM orders;

SELECT * FROM salesman;

SELECT s.salesman_id,s.salesman_city,c.customer_id,c.customer_name 
INNER JOIN customers c, salesman s;

SELECT s.salesman_id,s.salesman_city,c.customer_id,c.customer_name 
FROM salesman s 
INNER JOIN customers c 
ON s.salesman_id=c.customer_id;

SELECT s.salesman_id,s.salesman_city,c.customer_id,c.customer_name 
FROM salesman s 
INNER JOIN customers c 
ON s.salesman_id=c.customer_id;

SELECT * FROM customers;

SELECT * FROM salesman;

SELECT s.salesman_id,s.salesman_city,c.customer_id,c.customer_name 
FROM salesman s 
INNER JOIN customers c 
ON s.salesman_id=c.salesman_id;

SELECT * FROM salesman;

SELECT * FROM salesman;

SELECT * FROM orders;

SELECT * FROM salesman;

SELECT * FROM orders;

SELECT * FROM customers;

SELECT * FROM salesman;

SELECT c.customer_id,c.grade,c.customer_name,c.city,s.salesman_id,s.salesman_city 
FROM customers c 
LEFT OUTER JOIN salesman s 
ON c.salesman_id=s.salesman_id WHERE c.grade< 300 
ORDER BY c.customer_id;

SELECT c.customer_id,c.grade,c.customer_name,c.city,s.salesman_id,s.salesman_city 
FROM customers c 
LEFT OUTER JOIN salesman s 
ON c.salesman_id=s.salesman_id WHERE c.grade< 300;

SELECT c.customer_id,c.grade,c.customer_name,c.city,s.salesman_id,s.salesman_city 
FROM customers c 
LEFT OUTER JOIN salesman s 
ON c.salesman_id=s.salesman_id WHERE c.grade< 300 
ORDER BY c.customer_id;

SELECT a.customer_name, a.city, a.grade, b.salesman_name AS "Salesman", b.city FROM customers a  
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

SELECT a.customer_name, a.city, a.grade, b.salesman_name AS "Salesman",b.salesman_city FROM customers a  
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

ELECT c.customer_id,c.grade,c.customer_name,c.city,s.salesman_id,s.salesman_city 


FROM customers c 


LEFT OUTER JOIN salesman s 


ON c.salesman_id=s.salesman_id WHERE c.grade< 300 


ORDER BY c.customer_id;


SELECT c.customer_id,c.grade,c.customer_name,c.city,s.salesman_id,s.salesman_city 
FROM customers c 
LEFT OUTER JOIN salesman s 
ON c.salesman_id=s.salesman_id WHERE c.grade< 300 
ORDER BY c.customer_id;

SELECT c.customer_id,c.grade,c.customer_name,c.city,s.salesman_id,s.salesman_name,s.salesman_city 
FROM customers c 
LEFT OUTER JOIN salesman s ON c.salesman_id=s.salesman_id WHERE c.grade< 300 
ORDER BY c.customer_id;

SELECT a.customer_name, a.city, a.grade, b.salesman_name AS "Salesman",b.salesman_city FROM customers a  
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

SELECT * FROM customers;

SELECT * FROM salesman;

SELECT c.customer_name,c.city,s.salesman_name,s.salesman_city,s.commission FROM salesman s 
RIGHT OUTER JOIN customer c 
ON c.salesman_id=s.salesman_id WHERE s.commission>12;

SELECT c.customer_name,c.city,s.salesman_name,s.salesman_city,s.commission FROM salesman s 
RIGHT OUTER JOIN customers c 
ON c.salesman_id=s.salesman_id WHERE s.commission>12;

SELECT * FROM customers;

SELECT * FROM salesman;

SELECT c.customer_name,c.city,s.salesman_name,s.salesman_city,s.commission FROM salesman s 
RIGHT OUTER JOIN customers c 
ON c.salesman_id=s.salesman_id WHERE s.commission>12;

SELECT a.customer_name AS "Customer Name", a.city, b.salesman_name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id  
WHERE b.commission>12;

SELECT c.customer_name,c.city,s.salesman_name,s.salesman_city,s.commission FROM salesman s 
RIGHT OUTER JOIN customers c 
ON c.salesman_id=s.salesman_id WHERE s.commission>12;

SELECT a.customer_name AS "Customer Name", a.city, b.salesman_name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id  
WHERE b.commission>12;

SELECT o.order_id,o.order_date,o.purchase_date,c.customer_name AS "Customer Name",c.grade, s.salesman_name AS "Salesman Name",s.commission  
FROM orders o 
INNER JOIN customers c ON c.customer_id=o.customer_id 
INNER JOIN salesman s ON s.salesman_id= c.salesman_id;

SELECT * FROM orders;

SELECT o.order_id,o.order_date,o.order_date,c.customer_name AS "Customer Name",c.grade, s.salesman_name AS "Salesman Name",s.commission  
FROM orders o 
INNER JOIN customers c ON c.customer_id=o.customer_id 
INNER JOIN salesman s ON s.salesman_id= c.salesman_id;

SELECT * FROM orders;

SELECT o.order_no,o.order_date,o.purchase_amount,c.customer_name AS "Customer Name",c.grade, s.salesman_name AS "Salesman Name",s.commission  
FROM orders o 
INNER JOIN customers c ON c.customer_id=o.customer_id 
INNER JOIN salesman s ON s.salesman_id= c.salesman_id;

-Activity 9 


create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

INSERT ALL 
    INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001) 
    INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001) 
    INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002) 
    INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002) 
    INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006) 
    INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003) 
    INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007) 
    INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005) 
SELECT 1 FROM DUAL;

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM orders;

SELECT * FROM customers;

SELECT * FROM salesman;

SELECT s.salesman_id,s.salesman_city,c.customer_id,c.customer_name 
FROM salesman s 
INNER JOIN customers c 
ON s.salesman_id=c.salesman_id;

SELECT c.customer_id,c.grade,c.customer_name,c.city,s.salesman_id,s.salesman_name,s.salesman_city 
FROM customers c 
LEFT OUTER JOIN salesman s ON c.salesman_id=s.salesman_id WHERE c.grade< 300 
ORDER BY c.customer_id;

SELECT c.customer_name,c.city,s.salesman_name,s.salesman_city,s.commission FROM salesman s 
RIGHT OUTER JOIN customers c 
ON c.salesman_id=s.salesman_id WHERE s.commission>12;

SELECT o.order_no,o.order_date,o.purchase_amount,c.customer_name AS "Customer Name",c.grade, s.salesman_name AS "Salesman Name",s.commission  
FROM orders o 
INNER JOIN customers c ON c.customer_id=o.customer_id 
INNER JOIN salesman s ON s.salesman_id= c.salesman_id;

