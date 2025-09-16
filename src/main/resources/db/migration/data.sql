INSERT INTO breed(id, description, country_origin) VALUES(1, 'Fox terrier' , 'England');
INSERT INTO breed(id, description, country_origin) VALUES(2, 'Bull terrier' , 'England');
INSERT INTO breed(id, description, country_origin) VALUES(3, 'Puggy' , 'England');

INSERT INTO supplier(id, name, address, characteristics) VALUES (1, 'Oxfordshire supplier', 'the address', 'Blue team');

INSERT INTO dog(id, name, breed_fk, supplier_fk, badge_id, gender, birth_date, currentStatus, leaving_date, leavingReason)
VALUES(1, 'dogo', 1, 1, null, 'MALE', null, 'Training', null, null);

