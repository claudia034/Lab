package com.vorozco;

import com.vorozco.functional.MyFunctionalInterface;

import java.util.List;

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
        //var filterJedis = jedis.stream()
                //.filter(s-> !equals ("Rey"))
                //.map (j.toString().toUpperCase())

                //System.out.println(filterJedis.get());
    }
}
