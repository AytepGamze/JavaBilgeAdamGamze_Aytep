-- coklu veri guncelleme -> birden fazla sutunu aynı anda guncelleme
UPDATE cars
SET color= 'white', year= 2000
WHERE brand= 'Nissan' OR brand= 'Ford';

SELECT * FROM cars;