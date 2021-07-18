package com.a_level;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, Fruit> fruitHashMap = new HashMap<>();
        Fruit fruit=new Fruit("Apple", 10);
        Fruit fruit1=new Fruit("Lemon", 20);
        Fruit fruit2=new Fruit("Kiwi", 25);

        LinkedList <Fruit> fruitLinkedList = new LinkedList();

        fruitLinkedList.add(fruit);
        fruitLinkedList.add(fruit1);
        fruitLinkedList.add(fruit2);


        fruitHashMap.put(1, fruit);
        fruitHashMap.put(2, fruit1);
        fruitHashMap.put(3, fruit2);
        for(Map.Entry<Integer, Fruit> x: fruitHashMap.entrySet()){
            Fruit value = x.getValue();
            System.out.println(value);
        }

        for ( Integer key : fruitHashMap.keySet() ) {
            System.out.println( key );
        }

        for ( Fruit value : fruitHashMap.values()) {
            System.out.println( value );
        }

        // System.out.println(fruit.equals(fruit1));
        //System.out.println(fruit.hashCode());
        // System.out.println(fruitHashMap.keySet());
        //System.out.println(fruitHashMap.values().toString());
        //System.out.println(fruitHashMap.entrySet());


        System.out.println(fruitHashMap.entrySet().stream().sorted());

    }
}