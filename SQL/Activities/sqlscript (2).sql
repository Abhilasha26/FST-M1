REM   Script: Activity1 to Activity5
REM   SQL -Activity1 to 5 

create table salesman(salesman_id int ,salesman_name varchar2(20), salesman_city varchar2(20), commission int ) 
--show table schema 
Describe salesman;

create table salesman(salesman_id int ,salesman_name varchar2(20), salesman_city varchar2(20), commission int );

Describe salesman


create table salesman(salesman_id int PRIMARY KEY ,salesman_name varchar2(20) NOT NULL, salesman_city varchar2(20), commission int );

Describe salesman


DROP Table Salesman;

create table salesman(salesman_id int PRIMARY KEY ,salesman_name varchar2(20) NOT NULL, salesman_city varchar2(20), commission int );

Describe salesman


DROP Table salesman;

create table salesman(salesman_id int PRIMARY KEY ,salesman_name varchar2(20) NOT NULL, salesman_city varchar2(20), commission int );

Describe salesman


DROP Table salesman;

CREATE Table salesman(salesman_id int PRIMARY KEY ,salesman_name varchar2(20) NOT NULL, salesman_city varchar2(20), commission int );

DESCRIBE salesman


INSERT ALL 
    INTO salesman Values(5001,'James Hoog','New York' ,15 ) 
    INTO salesman Values(5002,'Nail Knite','Paris' ,13) 
	INTO salesman Values(5003,'Pit Alex ','London' ,13) 
	INTO salesman Values(5005,'McLyon','Paris' ,13) 
	INTO salesman Values(5006,'Paul Adam ','Rome' ,13) 
	INTO salesman Values(5006,'Lauson Hen ','Rome' ,11) 
SELECT 1 FROM DUAL;

DROP Table salesman;

CREATE Table salesman(salesman_id int PRIMARY KEY ,salesman_name varchar2(20) NOT NULL, salesman_city varchar2(20), commission int );

DESCRIBE salesman


INSERT ALL 
    INTO salesman Values(5001,'James Hoog','New York' ,15 ) 
    INTO salesman Values(5002,'Nail Knite','Paris' ,13) 
	INTO salesman Values(5003,'Pit Alex ','London' ,13) 
	INTO salesman Values(5005,'McLyon','Paris' ,13) 
	INTO salesman Values(5006,'Paul Adam ','Rome' ,13) 
	INTO salesman Values(5007,'Lauson Hen ','Rome' ,11) 
SELECT 1 FROM DUAL;

DROP Table salesman;

CREATE Table salesman(salesman_id int PRIMARY KEY ,salesman_name varchar2(20) NOT NULL, salesman_city varchar2(20), commission int );

DESCRIBE salesman


INSERT ALL 
    INTO salesman Values(5001,'James Hoog','New York' ,15 ) 
    INTO salesman Values(5002,'Nail Knite','Paris' ,13) 
	INTO salesman Values(5003,'Pit Alex ','London' ,13) 
	INTO salesman Values(5005,'McLyon','Paris' ,13) 
	INTO salesman Values(5006,'Paul Adam ','Rome' ,13) 
	INTO salesman Values(5007,'Lauson Hen ','Rome' ,11) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

SELECT SALESMAN_ID,SALESMAN_CITY from salesman;

SELECT * FROM salesman WHERE SALESMAN_CITY='Paris';

SELECT SALESMAN_ID, COMMISSION FROM salesman where SALESMAN_NAME='Paul Adam';

-Activity1 -Create a Saleman table with below mentioned column names 


DROP Table salesman;

CREATE Table salesman(salesman_id int PRIMARY KEY ,salesman_name varchar2(20) NOT NULL, salesman_city varchar2(20), commission int );

DESCRIBE salesman


INSERT ALL 
    INTO salesman Values(5001,'James Hoog','New York' ,15 ) 
    INTO salesman Values(5002,'Nail Knite','Paris' ,13) 
	INTO salesman Values(5003,'Pit Alex ','London' ,13) 
	INTO salesman Values(5005,'McLyon','Paris' ,13) 
	INTO salesman Values(5006,'Paul Adam ','Rome' ,13) 
	INTO salesman Values(5007,'Lauson Hen ','Rome' ,11) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

SELECT SALESMAN_ID,SALESMAN_CITY from salesman;

SELECT * FROM salesman WHERE SALESMAN_CITY='Paris';

SELECT SALESMAN_ID, COMMISSION FROM salesman where SALESMAN_NAME='Paul Adam';

SELECT SALESMAN_ID, COMMISSION FROM salesman where SALESMAN_NAME='	McLyon';

DROP Table salesman;

CREATE Table salesman(salesman_id int PRIMARY KEY ,salesman_name varchar2(20) NOT NULL, salesman_city varchar2(20), commission int );

DESCRIBE salesman


INSERT ALL 
    INTO salesman Values(5001,'James Hoog','New York' ,15 ) 
    INTO salesman Values(5002,'Nail Knite','Paris' ,13) 
	INTO salesman Values(5003,'Pit Alex ','London' ,13) 
	INTO salesman Values(5005,'McLyon','Paris' ,13) 
	INTO salesman Values(5006,'Paul Adam ','Rome' ,13) 
	INTO salesman Values(5007,'Lauson Hen ','Rome' ,11) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

SELECT SALESMAN_ID,SALESMAN_CITY from salesman;

SELECT * FROM salesman WHERE SALESMAN_CITY='Paris';

SELECT SALESMAN_ID, COMMISSION FROM salesman where SALESMAN_NAME='McLyon';

ALTER TABLE salesman ADD grade int;

SELECT * FROM salesman;

UPDATE salesman SET grade=100;

UPDATE salesman SET grade=100;

SELECT * FROM salesman;

UPDATE salesman SET grade=200 WHERE SALESMAN_CITY='Rome';

SELECT * FROM salesman;

UPDATE salesman SET grade=300 WHERE SALESMAN_NAME='James Hoog';

SELECT * FROM salesman;

UPDATE salesman SET SALESMAN_NAME='Pierre' WHERE SALESMAN_NAME='McLyon';

SELECT * FROM salesman;

-Activity1 -Create a Saleman table with below mentioned column names 


	DROP Table salesman;

	CREATE Table salesman(salesman_id int PRIMARY KEY ,salesman_name varchar2(20) NOT NULL, salesman_city varchar2(20), commission int );

	DESCRIBE salesman


	INSERT ALL 
    	INTO salesman Values(5001,'James Hoog','New York' ,15 ) 
        INTO salesman Values(5002,'Nail Knite','Paris' ,13) 
    	INTO salesman Values(5003,'Pit Alex ','London' ,13) 
		INTO salesman Values(5005,'McLyon','Paris' ,13) 
		INTO salesman Values(5006,'Paul Adam ','Rome' ,13) 
		INTO salesman Values(5007,'Lauson Hen ','Rome' ,11) 
	SELECT 1 FROM DUAL;

	SELECT * FROM salesman;

	SELECT SALESMAN_ID,SALESMAN_CITY from salesman;

	SELECT * FROM salesman WHERE SALESMAN_CITY='Paris';

	SELECT SALESMAN_ID, COMMISSION FROM salesman where SALESMAN_NAME='McLyon';

	ALTER TABLE salesman ADD grade int;

	SELECT * FROM salesman;

	UPDATE salesman SET grade=100;

	SELECT * FROM salesman;

	UPDATE salesman SET grade=200 WHERE SALESMAN_CITY='Rome';

	SELECT * FROM salesman;

	UPDATE salesman SET grade=300 WHERE SALESMAN_NAME='James Hoog';

	SELECT * FROM salesman;

	UPDATE salesman SET SALESMAN_NAME='Pierre' WHERE SALESMAN_NAME='McLyon';

	SELECT * FROM salesman;

DROP Table salesman;

CREATE Table salesman(salesman_id int PRIMARY KEY ,salesman_name varchar2(20) NOT NULL, salesman_city varchar2(20), commission int );

DESCRIBE salesman


INSERT ALL 
    	INTO salesman Values(5001,'James Hoog','New York' ,15 ) 
        INTO salesman Values(5002,'Nail Knite','Paris' ,13) 
    	INTO salesman Values(5003,'Pit Alex ','London' ,13) 
		INTO salesman Values(5005,'McLyon','Paris' ,13) 
		INTO salesman Values(5006,'Paul Adam ','Rome' ,13) 
		INTO salesman Values(5007,'Lauson Hen ','Rome' ,11) 
	SELECT 1 FROM DUAL;

SELECT * FROM salesman;

SELECT SALESMAN_ID,SALESMAN_CITY from salesman;

	SELECT * FROM salesman WHERE SALESMAN_CITY='Paris';

	SELECT SALESMAN_ID, COMMISSION FROM salesman where SALESMAN_NAME='McLyon';

ALTER TABLE salesman ADD grade int;

	SELECT * FROM salesman;

	UPDATE salesman SET grade=100;

	SELECT * FROM salesman;

UPDATE salesman SET grade=200 WHERE SALESMAN_CITY='Rome';

	SELECT * FROM salesman;

	UPDATE salesman SET grade=300 WHERE SALESMAN_NAME='James Hoog';

	SELECT * FROM salesman;

	UPDATE salesman SET SALESMAN_NAME='Pierre' WHERE SALESMAN_NAME='McLyon';

	SELECT * FROM salesman;

