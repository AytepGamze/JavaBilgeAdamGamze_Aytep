INSERT INTO cars (brand, model, year) 
VALUES 
('Ferrari', 'Enzo', 2002),
('Nissan', 'R34', 1989),
('Nissan', 'Silvia', 2002),
('Cobra', 'Shelby', 1962), 
('Aston Martin', 'DB 11', 2013),
('Ford', 'Ranger', 2000);

SELECT* FROM cars;

SELECT* FROM cars
WHERE brand = 'Nissan'; --markası nissan olanları getir.

SELECT* FROM cars
WHERE year < 1999; --yılı 1975'ten küçük olanları getir.

SELECT* FROM cars
WHERE year > 1999; --yılı 1975'ten büyük olanları getir.

SELECT* FROM cars
WHERE year <= 1999; --yılı 1999'ten küçük olanları getir.

SELECT* FROM cars
WHERE year >= 1999; --yılı 1999'ten büyük olanları getir.

SELECT* FROM cars
WHERE brand <> 'Cobra'; --markası cobra olmayanları getir.

SELECT* FROM cars
WHERE brand != 'Cobra'; --markası cobra olmayanları getir.(yukarıdakiyle aynı işi yapar)

SELECT* FROM cars
WHERE model LIKE 'R%'; --% işareti, 0,1, veya 1'den fazla karakteri temsil eden bir wildcard'tır.

SELECT* FROM cars
WHERE model LIKE '%r'; --modeli r ile bitenleri getirir.

SELECT* FROM cars
WHERE brand LIKE '%a%'; --markasının içinde a harfi geçenleri getirir.

SELECT* FROM cars
WHERE brand LIKE '%ra%';--markasının içinde ra  geçenleri getirir.

-- _ wildcard karakteri tek bir karakteri temsil eder.Herhangi bir karakter veya sayı olabilir.
SELECT* FROM cars
WHERE brand LIKE 'F__ra_i';-- markası F ile başlayan, ardından iki wildcard karakter alan(__),
-- ardından ra ve ardından yine bir wildcard karakter alan markayı döndürür.

-- birden fazla koşulu kontrol etmek istediğimizde AND operatörü kullanılır.
SELECT* FROM cars
WHERE brand = 'Nissan'
AND model = 'Silvia'; -- markası nissan ve modeli silvia olan tüm kayıtları döndürür.

-- birden fazla koşuldan herhangi birisinin doğruluğunu kontrol etmek içim OR opr. kullanılır.
SELECT* FROM cars
WHERE brand = 'Nissan'
OR model = 'Enzo'; -- markası nissan olan veya modeli enzo olan tüm kayıtları döndürür.

-- IN operatörü, bir sütunun değeri listedeki değerlerden herhangi biriyle/birileriyle
--eşleştiğinde kullanılır. Bir liste verileceği zaman çok kullanışlıdır.
SELECT* FROM cars
WHERE brand IN ('Nissan', ('Aston Martin'), 'Ford');









