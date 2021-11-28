package com.example.snake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

class MyMethod {
    ArrayList<String>listOdd = new ArrayList<String>();
    ArrayList<String>listEven = new ArrayList<String>();
    public void distributor(ArrayDeque<String> exampleQueue) {
        while (exampleQueue.size()>0){
            String temporaryValue = exampleQueue.poll();
            System.out.println("Pobrana wartość: " + temporaryValue);
            int objectLength = temporaryValue.length();
            if (objectLength%2==0) {
                listEven.add(temporaryValue);
            }
            else {
                listOdd.add(temporaryValue);
            }
        }
        System.out.println("Zawartość starej kolejki: " + exampleQueue);
        System.out.println("Zawartość listy nieparzystej: " + listOdd);
        System.out.println("Zawartość listy parzystej: " + listEven);
    }
}

@SpringBootApplication
public class SnakeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnakeApplication.class, args);
    } {
        ArrayDeque<String> inscription1 = new ArrayDeque<String>();
        for(int n=0; n<50; n++) {
            Random theGenerator1 = new Random();
            int fate = theGenerator1.nextInt(51);
            System.out.println("Wylosowana liczba: " + fate);
            StringBuilder builder1 = new StringBuilder();
            for(int i=0; i<fate; i++) {
                builder1.append("a");
            }
            inscription1.offer(builder1.toString());
        }
        System.out.println(inscription1);
        System.out.println("Liczba obiektów w kolejce: " + inscription1.size());

        MyMethod separator = new MyMethod();
        separator.distributor(inscription1);
    }

}
