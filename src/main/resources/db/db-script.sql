CREATE TABLE PARTS (
  id INTEGER NOT NULL PRIMARY KEY,
  partNumber varchar(255),
  partName varchar(255),
  vendor varchar(255),
  quantity NUMERIC(15,2),
  shipped date,
  received date
);

INSERT INTO PARTS (id, partNumber, partName, vendor, quantity, shipped, received) values(1, '10', 'Flame thrower' , 'factory', 10, 'Jan-08-1999', 'Jan-05-2000');
INSERT INTO PARTS (id, partNumber, partName, vendor, quantity, shipped, received) values(1, '50', 'Rocket launcher' , 'factory', 15, 'Jan-08-2008', 'Jan-05-2009');
INSERT INTO PARTS (id, partNumber, partName, vendor, quantity, shipped, received) values(1, '60', 'Gas splitter' , 'factory', 18, 'Jan-08-2015', 'Jan-05-2017');