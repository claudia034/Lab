package com.vorozco;

import com.vorozco.functional.MyFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {

    public static void doSomethingTraditional(){
        var tux = new Tux();
        System.out.println(tux.doSomething("Holi"));
    }

    public static void doSomethingClassy(){
        var duke = new MyFunctionalInterface() {
            @Override
            public String doSomething(String param) {
                return "Hola soy duke y recibi " + param;
            }
        };
            System.out.println(duke.doSomething("clase anonima"));

    }

    public static void doSomethingFunctional(){
        MyFunctionalInterface clippy = (String param) -> {
            return "Hola soy Clippy y recibi "+param;
        };

        MyFunctionalInterface wilbert = (p) -> "Hola soy Wilbert y recibi " + p;
        /*doSomethingHighOrder(clippy);
        doSomethingHighOrder(wilbert);
        doSomethingHighOrder( x -> "Hola soy anonymus y recibi " + x);*/

        var pickachu = new Pickachu();
        doSomethingHighOrder(pickachu::pika);
        doSomethingHighOrder(pickachu::impactrueno);
    }

    public static void doSomethingHighOrder(MyFunctionalInterface comportamiento){
        //Ejecuto el comportamiento que recibo
        var respuesta = comportamiento.doSomething(" Java 11 es genial");
        System.out.println(respuesta);
    }

    public static void main( String[] args ){

        List jedis = List.of("Anakin", "Leia","Luke","Rey");
        var theJedis = jedis.stream()
                .peek(System.out::println)
                .filter(s -> !s.equals("Rey"))// Map
                .peek(System.out::println)
                .map(j -> j.toString().toUpperCase()) //Map
                .peek(System.out::println)
                .collect(Collectors.toList());
        System.out.println("Resultado --- " + theJedis);
    }
}
