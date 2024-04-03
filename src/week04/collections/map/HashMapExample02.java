package week04.collections.map;

import java.util.HashMap;

public class HashMapExample02 {
    public static void main(String[] args) {

        HashMap<Integer, String> languageHashMap = new HashMap<>();
        languageHashMap.put(1, "Java ");
        languageHashMap.put(2, "Python ");
        languageHashMap.put(3, "C ");
        languageHashMap.put(4, "Java ");

        System.out.println(" HashMap: " + languageHashMap);


        // Belirli bir key'e denk gelen value'yu döndürür.
        String value = languageHashMap.get(2);
        System.out.println(" Value at key 2 : " + value);

        // key'leri bir set olarak dönme -> keySet()
        System.out.println(" Keys: " + languageHashMap.keySet());

        //value'ları bir set olarak dönme -> keySet();
        System.out.println("Values: " + languageHashMap.values());

        //key/value pair(çift)' ini bir set olarak dönmek
        System.out.println("Key/Value mappings: " + languageHashMap.entrySet());


        // Key varsa value'sını dön, yoksa defaultta 'not found' dön
        String value1 = languageHashMap.getOrDefault(1, "Not found");
        System.out.println("Value for key 1: " + value1);


        // Key varsa value'sını dön, yoksa defaultta 'not found' dön-> bu key yok, bu yüzden default döner.
        String value2 = languageHashMap.getOrDefault(5, "Not found");
        System.out.println("Value for key 1: " + value2);

        //Bir key var mı diye kontrol etmek
        if (languageHashMap.containsKey(2)) {
            System.out.println("Map contains key value of: 2");
        } else {
            System.out.println("Key not found");
        }

        // bir value var mı diye kontrol etmek
        if (languageHashMap.containsValue("Java")) {
            System.out.println("Map contains value of Java");
        } else {
            System.out.println("No such value.");
        }

        //bir key ile ilişkili value'yu değiştirmek (replace())
        System.out.println("Original hashMap: " + languageHashMap);

        languageHashMap.replace(3, "Swift");
        System.out.println("HashMap after replace(): " + languageHashMap);

        // bütün value değerlerini upperCase' çevirmek (replaceAll)
        languageHashMap.replaceAll((K, V) -> V.toUpperCase());
        System.out.println("Updated HashMap : " + languageHashMap);

        // bir HashMap'ten ögeleri kaldırmak/silmek (remove())
        String value3= languageHashMap.remove(4);
        System.out.println("removed value: " + value3);
        System.out.println("updated HashMap: " + languageHashMap);

        // bir HashMap'ten bir key/value çiftini kaldırmak/silmek. (remove(K,V)
        Boolean isDeleted= languageHashMap.remove(3,"Swift");
        System.out.println("is delete: "+ isDeleted);
        System.out.println("Updated HashMap: " + languageHashMap);

    }
}