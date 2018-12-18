
INSERT INTO carbrand (id, logoUrl, name) VALUES (1,'/images/logo/carbrand/ford.gif',	'Ford');
INSERT INTO carbrand (id, logoUrl, name) VALUES (2,'/images/logo/carbrand/BMW.gif',	'BMW');
INSERT INTO carbrand (id, logoUrl, name) VALUES (3,'/images/logo/carbrand/audi.gif',	'Audi');

INSERT INTO carmodel (id, name, brand_id) VALUES (1,'Fusion',1);
INSERT INTO carmodel (id, name, brand_id) VALUES (2,'Focus',1);
INSERT INTO carmodel (id, name, brand_id) VALUES (3,'F-150',1);
INSERT INTO carmodel (id, name, brand_id) VALUES (4,'F-250',1);
INSERT INTO carmodel (id, name, brand_id) VALUES (5,'Mustang',1);

INSERT INTO carmodel (id, name, brand_id) VALUES (6,'328i',2);
INSERT INTO carmodel (id, name, brand_id) VALUES (7,'428i',2);
INSERT INTO carmodel (id, name, brand_id) VALUES (8,'M3',2);
INSERT INTO carmodel (id, name, brand_id) VALUES (9,'X5',2);
INSERT INTO carmodel (id, name, brand_id) VALUES (10,'535i',2);

INSERT INTO carmodel (id, name, brand_id) VALUES (11,'A4',3);
INSERT INTO carmodel (id, name, brand_id) VALUES (12,'A5',3);
INSERT INTO carmodel (id, name, brand_id) VALUES (13,'A6',3);
INSERT INTO carmodel (id, name, brand_id) VALUES (14,'A7',3);
INSERT INTO carmodel (id, name, brand_id) VALUES (15,'A8',3);

INSERT INTO user_tb (id, is_admin, password, username) VALUES (1, true, 'admin', 'admin');
INSERT INTO user_tb (id, is_admin, password, username) VALUES (2, false, '123', 'tam');
INSERT INTO user_tb (id, is_admin, password, username) VALUES (3, false, '123', 'thuy');
INSERT INTO user_tb (id, is_admin, password, username) VALUES (4, false, '123', 'thanh');

INSERT INTO bankaccount (id, cardNumber, expiredDate, securityCode) VALUES (1, '1111-1111-1111-1111', '20200101', '111');
INSERT INTO bankaccount (id, cardNumber, expiredDate, securityCode) VALUES (2, '2222-2222-2222-2222', '20200202', '222');
INSERT INTO bankaccount (id, cardNumber, expiredDate, securityCode) VALUES (3, '3333-3333-3333-3333', '20200303', '333');

INSERT INTO carownerprofile (id, address, dob, email, firstName, lastName, phone, status,  bankAccount_id, user_id) VALUES (1, 'FairField', '19810101', 'tam@3t.com', 'Chi Tam', 'Nguyen', '111-1111', 0, 1, 2);
INSERT INTO carownerprofile (id, address, dob, email, firstName, lastName, phone, status,  bankAccount_id, user_id) VALUES (2, 'MUM', '19820101', 'thuy@3t.com', 'Thi Minh Thuy', 'Doan', '222-2222', 1, 2, 3);
INSERT INTO carownerprofile (id, address, dob, email, firstName, lastName, phone, status,  bankAccount_id, user_id) VALUES (3, 'Utopia', '19920101', 'thanh@3t.com', 'Duy Thanh', 'Ngo', '333-3333', 1, 3, 4);

INSERT INTO carprofile (id, color, plate, status, year, carOwnerProfile_id, model_id) VALUES(1, 'BLACK', 'HLS-001', 0, '2011', 1, 5);
INSERT INTO carprofile (id, color, plate, status, year, carOwnerProfile_id, model_id) VALUES(2, 'WHITE', 'HLS-002', 1, '2012', 2, 6);
INSERT INTO carprofile (id, color, plate, status, year, carOwnerProfile_id, model_id) VALUES(3, 'SILVER', 'HLS-003', 2, '2013', 3, 11);


INSERT INTO offer (id, description, discount, endDate, price, publicationStatus, startDate, carProfile_id) VALUES (1, 'Discount 1', 10, '20190101', 100, false, '20181201', 1);
INSERT INTO offer (id, description, discount, endDate, price, publicationStatus, startDate, carProfile_id) VALUES (2, 'Discount 2', 20, '20190102', 200, true, '20181202', 2);
INSERT INTO offer (id, description, discount, endDate, price, publicationStatus, startDate, carProfile_id) VALUES (3, 'Discount 3', 30, '20190103', 300, true, '20181203', 3);
