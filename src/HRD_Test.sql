
/* Drop Tables */

DROP TABLE Money_tbl_02 CASCADE CONSTRAINTS;
DROP TABLE Member_tbl_02 CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE Member_tbl_02
(
	custNo number(6) NOT NULL,
	custName varchar2(20),
	phone varchar2(13),
	address varchar2(60),
	joinDate date,
	grade char(1),
	city char(2),
	PRIMARY KEY (custNo)
);


CREATE TABLE Money_tbl_02
(
	custNo number(6) NOT NULL,
	saleNol number(8) NOT NULL,
	pcost number(8),
	amount number(4),
	price number(8),
	pcode varchar2(4),
	sDate date
);



/* Create Foreign Keys */

ALTER TABLE Money_tbl_02
	ADD FOREIGN KEY (custNo)
	REFERENCES Member_tbl_02 (custNo)
;



