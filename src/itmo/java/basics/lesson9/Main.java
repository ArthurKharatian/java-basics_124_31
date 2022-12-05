package itmo.java.basics.lesson9;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List arrayList = new ArrayList();
//        List linkedList = new LinkedList();


        arrayList.add(123);
        arrayList.add("String");
        arrayList.add(false);

//        System.out.println(arrayList);

        List<String> strings = new ArrayList<>();
//
//        strings.add("false");
//        strings.add("String");
//        strings.add("123");
//
//        System.out.println(strings);
//
//        Collections.sort(strings);
//
//        System.out.println(strings);
//
//        Collections.reverse(strings);
//
//        System.out.println(strings);

        List<Integer> integers = new ArrayList<>();
        integers.add(123);
        integers.add(1323);
        integers.add(1323);
        integers.add(1323);
        integers.add(1323);
        integers.add(1323);
        integers.add(1323);
        integers.add(1323);
        integers.add(1323);
        integers.add(1234);
        integers.add(23);
        integers.add(153);
        integers.add(153);
        integers.add(153);
        integers.add(153);
        integers.add(153);
        integers.add(153);
        integers.add(153);
        integers.add(623);
        integers.add(623);
        integers.add(623);
        integers.add(623);
        integers.add(623);
        integers.add(623);
        integers.add(623);
        integers.add(623);
        integers.add(623);
        integers.add(623);
        integers.add(623);
        integers.add(523);
        integers.add(423);
        integers.add(223);
        integers.add(3);

//        List<Integer> integers2 = Arrays.asList(123, 312, 321);
//        integers2.add(32131);

//        System.out.println(integers);
//        integers.remove(new Integer(777));
//        System.out.println(integers);


//        for (Integer integer : integers) {
//            if (integer % 2 != 0) {
//                integers.remove(integer);
//            }
//        }
//
//        System.out.println(integers);
//
//        Iterator<Integer> iterator = integers.iterator();
//        while (iterator.hasNext()) {
//            Integer integer = iterator.next();
//            if (integer % 2 != 0) {
//                iterator.remove();
//            }
//        }
//
//        System.out.println(integers);
//
//        for (int i = 0; i < integers.size(); i++) {
//            System.out.println(integers.get(i));
//        }

//        Set<String> set = new TreeSet<>();
//        for (int i = 0; i < 1000; i++) {
//            set.add("Java");
//        }
//
//        set.add("String");
//        set.add("777");
//        set.add("world!");
//        set.add("Hello");


//        System.out.println(set);


//        Set<Integer> uniques = new HashSet<>(integers);
//
//        System.out.println(uniques);

        //    key    value
        Map<String, Integer> map = new HashMap<>();

        map.put("John", 2131245);
        map.put("Alice", 213124245);
        map.put("Katie", 213113245);
        map.put("Bob", 213111245);
        map.put("Mike", 777);
        map.put("Paul", 777);
//        map.put("Mike", 213111245);


//        System.out.println(map);

//        Set<String> keys = map.keySet();
//        Collection<Integer> values = map.values();
//
//        System.out.println(keys);
//        System.out.println(values);


//        Integer num = map.get("Bob");
//        System.out.println(num);

        System.out.println(getKeyByValue(map, 777));

    }

    public static List<String> getKeyByValue(Map<String, Integer> map, Integer value) {
        List<String> strings = new ArrayList<>();

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer val = pair.getValue();
            if (value.equals(val)) {
                strings.add(key);
            }
        }


        return strings;

    }
}
