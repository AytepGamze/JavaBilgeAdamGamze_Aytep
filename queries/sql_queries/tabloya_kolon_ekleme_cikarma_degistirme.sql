-- Tabloya yeni kolon ekleme, mevcut kolonu silme veya degistirme;
--Ekleme
ALTER TABLE cars 
ADD color VARCHAR(255);

SELECT * FROM cars;

--SİLME
ALTER TABLE cars
DROP color;

--Adini Degistirme
ALTER TABLE cars
RENAME COLUMN color TO colorrr;

--Veri boyutunu/turunu degistirme
ALTER TABLE cars
ALTER COLUMN color TYPE VARCHAR(150); 

