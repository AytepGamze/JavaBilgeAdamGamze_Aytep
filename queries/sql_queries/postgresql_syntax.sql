-- SELECT STATEMENT
SELECT customer_name, country FROM customers;
-- customer_name ve country sütınlarını ve bilgilerini 'customers' tablosundan getirir.

SELECT * FROM customers;
-- *=ALL anlamına gelir. Bu durumda da customers tablosuna ait bütütn sütunları verileriyle birlikte getirir.

-------------------------------------------------------------------------------------------------------------
-- DISTINCT STATEMENT
SELECT DISTINCT country
FROM customers;
-- Yalnızca farklı (distinct) değerleri döndürmek için kullanılır Yinelenme olmadan özgün veri getirir.
-- customers tablosunda tekrar eden ülkeler vardı ancak yukarıdaki sorgu aracılığıyla ülkeleri özgün bir şekilde getirebildik.

SELECT COUNT (DISTINCT country)
FROM customers;
-- Kaç adet distinct ülke olduğunu döndürür.


-------------------------------------------------------------------------------------------------------------

-- WHERE CLAUSE (filtrelemek için)
SELECT * FROM customers WHERE city = 'London';
-- Yalnızca belirli bir koşulu karşılayan verileri getirir.
-- Yukarıdaki örnekte bu koşul, şehrin adının 'London' olması koşuludur.

-------------------------------------------------------------------------------------------------------------


--ORDER BY (Sıralamak için)
SELECT * FROM customers
ORDER BY city;
-- kayıtları belli bir sütuna göre sıralamak için kullanılır.
--hem artan, hem azalan sıralama yapılabilir. (ASC/DESC)

SELECT * FROM customers
ORDER BY city ASC;
-- --ASC-> (Doğal sıralama)artan sıralama. Kayıtları ilgili sütunun artacağı şekilde sıralar.

SELECT * FROM customers
ORDER BY city DESC;
-- --DESC-> (Descending) azalan sıralama(reverse order). Kayıtları ilgili sütunun azalacağı şekilde sıralar.

-------------------------------------------------------------------------------------------------------------

-- LIMIT CLAUSE
SELECT * FROM customers
LIMIT 20;
-- LIMIT döndürülecek max kayıt sırasını sınırlandırır.
--yukarıdaki örnekte customers tablosundan ilk 20 kaydı döndürür.

-------------------------------------------------------------------------------------------------------------

--OFFSET CLAUSE
SELECT * FROM customers
LIMIT 20 OFFSET 40;
-- OFFSET döndürülecek kayıtları seçmeye nerden başlayacağımızı belirtmek için kullanılır.
-- yukarıdaki örnekte 20 kayıt döndürmek istiyoruz. OFFSET 40 diyerek bu 20 kaydı 
--40. kayıttan sonra gelen ilk 20 kayıttan alıyoruz. (OFFSET 40 yazdığım için ilk kayıt 41. kayıttır.)

-------------------------------------------------------------------------------------------------------------

-- MIN() and MAX() Functions;
SELECT MIN(city)
FROM customers;
--MIN() fonksiyonu min değeri döndürür. Bu bir sayı ise en küçük sayıyı,
--bu bir kelime ise alfabetik olarak en önde gelen kelimeyi döndürür.

SELECT MAX(city)
FROM customers;
--MAX() fonksiyonu max değeri döndürür. Bu bir sayı ise en büyük sayıyı,
--bu bir kelime ise alfabetik olarak en sonda gelen kelimeyi döndürür.

-------------------------------------------------------------------------------------------------------------

--Sütunu yeniden adlandırma
SELECT MAX(city) AS alphabetically_last_city
FROM customers;
-- bulduğu değerleri farklı bir sütun isminde görüntülemek için AS anahtar kelimesi kullanılır.

--COUNT() function
SELECT COUNT(customer_id)
FROM customers;
--COUNT() fonksiyonu belirtilen ölçütle eşleşen satır sayısını döndürür.
--NOT: NULL değerler sayılmaz.

SELECT COUNT(customer_id)
FROM customers
WHERE city= 'London';
--şehri london olanların adedini getirdi.

-------------------------------------------------------------------------------------------------------------

--SUM() Function
SELECT SUM(customer_id)
FROM customers;
--Kayıtların belirtilen sütuna ait olan değerini toplar ve sonucu döner.


--AVG() Function
SELECT AVG(customer_id)
FROM customers;
--kayıtların belirtilen sütuna ait olan değerlerinin ortalamasını döner

-------------------------------------------------------------------------------------------------------------

--IN operatörü
SELECT * FROM customers
WHERE counry IN ('Germany', 'France', 'UK');
--IN operatörü WHERE clause'undaki olası değerlerin bir listesini belirtmemize olanak tanır.
--IN operatörü birden fazla OR koşulunun kısaltmasıdır.
-- yukarıdaki örnekteki durum; 'Germany', 'France', ya da 'UK'de olan tüm müşterileri getirir.

SELECT * FROM customers
WHERE counry NOT IN ('Germany', 'France', 'UK');
--IN operatörünün önüne NOT keyword'ü kullanarak,
-- listedeki değerlerden herhangi biri değil(not) olan tüm kayıtları döndürürüz.
-- yukarıdaki örekteki durum; 'Germany', 'France', ya da 'UK'de olmayan tüm müşterileri getirir.

-- IN (SELECT)

SELECT * FROM customers
WHERE customer_id IN(SELECT customer_id FROM orders);
-- daha önce sipariş vermiş olan kullanıcıları getirir.
-- önce orders tablosuna gider ve her bir sipariş için customer_id'leri toplar ve bir liste(tablo) haline getirir.
-- ondan sonra bu listedeki idleri customers tablosundaki idler ile eşleştirir.
-- eşleşen sonuçları birer customer olarak yazdırır.

SELECT * FROM customers
WHERE customer_id NOT IN(SELECT customer_id FROM orders);
--daha önce sipariş vermemiş olan kullanıcıları getirir.

-------------------------------------------------------------------------------------------------------------

--BETWEEN operatörü
SELECT * FROM customers
WHERE customer_id BETWEEN 10 AND 15;
--BETWEEN operatörü belirli bir aralıktali değerleri seçer. Değerler sayı, metin ya da tarih olabilir.
-- BETWEEN operatörü kapsayıcıdır. Başlangıç ve bitiş değerleri dahildir.
-- metin karşılaştırmalarında son değeri dahil etmez

SELECT * FROM customers
WHERE country BETWEEN 'Austria' AND 'UK';
--country'si Austria' ve 'UK' arasında olan bütün customerları döndürür.

-------------------------------------------------------------------------------------------------------------

-- ORDER BY CLAUSE
SELECT * FROM customers
WHERE country BETWEEN 'Austria' AND 'UK'
ORDER BY country;
--country'si Austria' ve 'UK' arasında olan bütün kullanıcıları, ülkeleri baz alınarak sıralamaya sokar ve döndürür.

-------------------------------------------------------------------------------------------------------------

--Aliases (takma isim)
SELECT customer_id AS id
FROM customers;
--SQL aliases bir tabloya veya tablodaki bir sütuna geçici bir ad vermek için kullanılır.
-- genellikle sütun adlarını daha okunaklı hale getirmek için kullanılır.
-- bir alias yalnızca söz konusu sorgu süresince geçerlidir.
--AS anahtar sözcüğü ile oluştururlur.



























