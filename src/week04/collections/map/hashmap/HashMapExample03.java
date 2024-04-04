package week04.collections.map.hashmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExample03 {
    public static void main(String[] args) {
        Map<String, List<String>> hashMap= new HashMap<>();
        hashMap.put("Ankara", List.of("Polatlı", "Yenimahalle", "Çankaya", "Kazan"));
        hashMap.put("İstanbul", List.of("Kadıköy", "Beyoğlu", "üsküdar", "Beylikdüzü"));
        Map<String, Map<String, List<String>>> nestedHashMap = new HashMap<>();
        nestedHashMap.put("Türkiye", hashMap);
        System.out.println(nestedHashMap);

//TODO KODLARIN SON KISMINI YAZARAK TAMAMLA
    }
}
