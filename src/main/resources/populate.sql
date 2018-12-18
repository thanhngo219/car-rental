
INSERT INTO car_brand (id, logo_url, name) VALUES (1,'/images/logo/car_brand/ford.gif',	'Ford');
INSERT INTO car_brand (id, logo_url, name) VALUES (2,'/images/logo/car_brand/BMW.gif',	'BMW');
INSERT INTO car_brand (id, logo_url, name) VALUES (3,'/images/logo/car_brand/audi.gif',	'Audi');

INSERT INTO car_model (id, name, brand_id) VALUES (1,'Fusion',1);
INSERT INTO car_model (id, name, brand_id) VALUES (2,'Focus',1);
INSERT INTO car_model (id, name, brand_id) VALUES (3,'F-150',1);
INSERT INTO car_model (id, name, brand_id) VALUES (4,'F-250',1);
INSERT INTO car_model (id, name, brand_id) VALUES (5,'Mustang',1);

INSERT INTO car_model (id, name, brand_id) VALUES (6,'328i',2);
INSERT INTO car_model (id, name, brand_id) VALUES (7,'428i',2);
INSERT INTO car_model (id, name, brand_id) VALUES (8,'M3',2);
INSERT INTO car_model (id, name, brand_id) VALUES (9,'X5',2);
INSERT INTO car_model (id, name, brand_id) VALUES (10,'535i',2);

INSERT INTO car_model (id, name, brand_id) VALUES (11,'A4',3);
INSERT INTO car_model (id, name, brand_id) VALUES (12,'A5',3);
INSERT INTO car_model (id, name, brand_id) VALUES (13,'A6',3);
INSERT INTO car_model (id, name, brand_id) VALUES (14,'A7',3);
INSERT INTO car_model (id, name, brand_id) VALUES (15,'A8',3);

INSERT INTO user_tb (id, is_admin, password, username) VALUES (1, true, 'admin', 'admin');
INSERT INTO user_tb (id, is_admin, password, username) VALUES (2, false, '123', 'tam');
INSERT INTO user_tb (id, is_admin, password, username) VALUES (3, false, '123', 'thuy');
INSERT INTO user_tb (id, is_admin, password, username) VALUES (4, false, '123', 'thanh');

INSERT INTO authority (id, username, authority) VALUES (1, 'admin', 'ROLE_ADMIN');
INSERT INTO authority (id, username, authority) VALUES (2, 'admin', 'ROLE_USER');
INSERT INTO authority (id, username, authority) VALUES (3, 'tam', 'ROLE_USER');
INSERT INTO authority (id, username, authority) VALUES (4, 'thuy', 'ROLE_USER');
INSERT INTO authority (id, username, authority) VALUES (5, 'thanh', 'ROLE_USER');

INSERT INTO user_authority (user_id, authority_id) VALUES (1, 1);
INSERT INTO user_authority (user_id, authority_id) VALUES (1, 2);
INSERT INTO user_authority (user_id, authority_id) VALUES (2, 3);
INSERT INTO user_authority (user_id, authority_id) VALUES (3, 4);
INSERT INTO user_authority (user_id, authority_id) VALUES (4, 5);

INSERT INTO bank_account (id, cardNumber, expiredDate, securityCode) VALUES (1, '1111-1111-1111-1111', '20200101', '111');
INSERT INTO bank_account (id, cardNumber, expiredDate, securityCode) VALUES (2, '2222-2222-2222-2222', '20200202', '222');
INSERT INTO bank_account (id, cardNumber, expiredDate, securityCode) VALUES (3, '3333-3333-3333-3333', '20200303', '333');

INSERT INTO car_owner_profile (id, address, dob, email, firstName, lastName, phone, profile_status, bank_account_id, user_id) VALUES (1, 'FairField', '19810101', 'tam@3t.com', 'Chi Tam', 'Nguyen', '111-1111', 0, 1, 2);
INSERT INTO car_owner_profile (id, address, dob, email, firstName, lastName, phone, profile_status, bank_account_id, user_id) VALUES (2, 'MUM', '19820101', 'thuy@3t.com', 'Thi Minh Thuy', 'Doan', '222-2222', 1, 2, 3);
INSERT INTO car_owner_profile (id, address, dob, email, firstName, lastName, phone, profile_status, bank_account_id, user_id) VALUES (3, 'Utopia', '19920101', 'thanh@3t.com', 'Duy Thanh', 'Ngo', '333-3333', 1, 3, 4);

INSERT INTO car_profile (id, color, plate, status, year, car_owner_profile_id, car_model_id) VALUES(1, 'BLACK', 'HLS-001', 0, '2011', 1, 5);
INSERT INTO car_profile (id, color, plate, status, year, car_owner_profile_id, car_model_id) VALUES(2, 'WHITE', 'HLS-002', 1, '2012', 2, 6);
INSERT INTO car_profile (id, color, plate, status, year, car_owner_profile_id, car_model_id) VALUES(3, 'SILVER', 'HLS-003', 2, '2013', 3, 11);


INSERT INTO offer (id, description, discount, endDate, price, publicationStatus, startDate, car_profile_id) VALUES (1, 'Discount 1', 10, '20190101', 100, false, '20181201', 1);
INSERT INTO offer (id, description, discount, endDate, price, publicationStatus, startDate, car_profile_id) VALUES (2, 'Discount 2', 20, '20190102', 200, true, '20181202', 2);
INSERT INTO offer (id, description, discount, endDate, price, publicationStatus, startDate, car_profile_id) VALUES (3, 'Discount 3', 30, '20190103', 300, true, '20181203', 3);
