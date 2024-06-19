REM   Script: Activity 6 to Activity 8
REM   Activity 6 to Activity 8

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

