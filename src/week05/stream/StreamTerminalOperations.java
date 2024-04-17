package week05.stream;

import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StreamTerminalOperations {
    public static void main(String[] args) {

        // count() -> sonlu bir Stream'deki öğelerin sayısını belirler.
        Stream<String> s2 = Stream.of("k1","k2","k3");
        long countElement = s2.count();
        System.out.println(countElement);

        // min() , max() String veya Array'in minimum veya maximum  değerlerini bulabiliriz.
        Stream<String> stream01 = Stream.of("eagle","lion","racoon");
        Stream<String> stream02 = Stream.of("eagle","lion","racoon");

        Comparator<String> comp = Comparator.comparingInt(String::length);

        Optional<String> min = stream01.min(comp);
        Optional<String> max = stream02.max(comp);
        
        System.out.println(min);
        System.out.println(max);
        
        String[] stringArr = "merhaba dünya ben alperen, nasılsın?".split(" ");

        System.out.println(Arrays.stream(stringArr).min(String::compareTo).get());
        System.out.println(Arrays.stream(stringArr).max(String::compareTo).get());

        Comparator<String> lengthCompare = Comparator.comparingInt(String::length);
        System.out.println(Arrays.stream(stringArr).min(lengthCompare).get());


        // findAny() & findFirst()
        // findAny() -> Stream'deki öğelerden birini döndürür;
        // Stream'de hiçbir öğe yoksa boş bir Optional<T> object dönürür.

        //findFirst() Stream'deki ilk öğeyi döndürür. Hiçbir öğe yoksa Optional<T> nesnesi döndürür.
        //findFirst() akışın ilk öğelerini döndürür ancak findAny() akıştaki herhangi bir
        // öğeyi seçmekte özgürdür. (Özellikle parallel Stream kullandığımızda)

        Stream<String> s = Stream.of("monkey","gorilla","dog");
        Stream<String> infinite = Stream.generate(() -> "chimp");

        s.findAny().ifPresent(System.out::println);
        infinite.findAny().ifPresent(System.out::println);

        OptionalDouble temperature = DoubleStream.of(-10.1,-5.0,30.0,-7.3,41.2,2.2)
                .filter(temp -> temp >0)
                .findFirst();

        OptionalDouble temperature2 = DoubleStream.of(-10.1,-5.0,30.0,-7.3,41.2,2.2)
                .filter(temp -> temp >0)
                .findAny();

        System.out.println(temperature);
        System.out.println(temperature2);

        //anyMatch(), allMatch(), noneMatch()
        List<String> list = Arrays.asList("monkey","2","chimp");

        Stream<String> infinite01 = Stream.generate(() -> "chimp");
        Stream<String> infinite02 = Stream.generate(() -> "chimp");

        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

        //anyMatch() Stream'de verilen Predicate ile eşleşen herhangi bir öğe varsa true değerini döndürür.
        //Stream boşsa veya eşleşen öğe yoksa false değerini döndürür.
        System.out.println(list.stream().anyMatch(pred)); //true

        //allMatch() yalnızca Stream'deki tüm öğelerin verilen Predicate ile eşleşmesi durumunda true değerini döndürür.
        //Stream boşsa true değerini döndürür.
        System.out.println(list.stream().allMatch(pred)); //false

        //noneMatch(), yalnızca Stream'deki öğelerin hiçbiri verilen Predicate ile eşleşmediğinde true değerini döndürür.
        //Stream boşsa true değerini döndürür.
        //Sonsuz Streamler için sonlandırıladabilir, sonlandırılamayadabilir (verilere bağlıdır).
        System.out.println(list.stream().noneMatch(pred)); //false

        // infinitive
        System.out.println(infinite01.anyMatch(pred)); //true
//        System.out.println(infinite01.allMatch(pred)); //true ->endless loop

        System.out.println(infinite02.noneMatch(pred)); //false

        //forEach() pipeline'daki terminal işlemidir.
        Stream<String> s01 = Stream.of("Monkey","Gorilla","Chimp");
//        s01.forEach(System.out::println);

        List<String> list01 = new ArrayList<>();
        s01.forEach((str)-> {
            String sUpper = str.toUpperCase();
            list01.add(sUpper);
        } );
        System.out.println(list01);


        //map() vs forEach()
        // forEach void döner, dolayısıyla içerisinde de void dönen bir işlem olmalı

        List<Integer> numbers= Arrays.asList(1,2,3,4,5);
        numbers.forEach(number -> System.out.println(number*2));
        System.out.println(numbers);

        //map()
        List<Integer> mappedNumbers= numbers.stream()
                .map(number -> number * 2)
                .map(number -> number * 2)
                .collect(Collectors.toList());
                mappedNumbers.forEach(System.out::println);
                mappedNumbers= mappedNumbers.stream().map(number -> number*2).collect(Collectors.toList());
               // .stream()
               // .map(number -> number * 2)
             //   .collect(Collectors.toList());

        System.out.println(mappedNumbers);

        Stream<Integer> stream= Stream.of(3,5,6);
        Stream<Integer> stream2= Stream.of(3,5,6);

        System.out.println(stream.reduce(10,(a,b) -> a*b));
        System.out.println(stream2.reduce((a,b) -> a*b));


        Stream<String> stream03= Stream.of("w1","o2","l3", "f4");

        String word= stream03.reduce("X", String::concat);
        System.out.println(word);



        Stream<String> stream04= Stream.of("w", "o", "l", "f");
        String word2= String.valueOf(stream04.reduce((c,d) -> c+ "--"+d));
        System.out.println(word2);



        // collect()
        String frenchCounting= "un:deux:trois:quatre";
        List<String> gmailList= Arrays.stream(Pattern.compile(":")
                .split(frenchCounting)).collect(Collectors.toList());
        System.out.println(gmailList);

        Set<String> gmailSet= Pattern.compile(":")
                .splitAsStream(frenchCounting).collect(Collectors.toSet());
        System.out.println(gmailSet);


        //collect(Collectors.toMap())
        Map<String, Integer> nameLength= Stream.of("Albus", "Percival", "Wulfric", "Brian", "Dumbledore")
                .collect(Collectors.toMap(name -> name, String::length));
        System.out.println(nameLength);

        Optional<String> name= Stream.of("Albus", "Percival", "Wulfric", "Brian", "Dumbledore")
                .reduce(String::concat);

       // StringBuilder
        Stream<String> stream05= Stream.of("w", "o", "l", "f");
        StringBuilder word3= stream05
                .collect(StringBuilder::new
                //(a,b)
                ,StringBuilder::append //a
                ,StringBuilder::append); //b
        System.out.println(word3);


        Stream<String> stream06= Stream.of("w", "o", "l", "f");
        TreeSet<String> set= stream06.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set);






    }
}
