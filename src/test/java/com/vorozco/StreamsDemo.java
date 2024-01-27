package com.vorozco;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class StreamsDemo {
    //Datos
    public static List<Integer> createRandomList(int qty){
        var random = new Random();
        List<Integer> numbers = new LinkedList<>();

        for(int i = 0; i<qty; i++){
            numbers.add(random.nextInt(100));
        }
        return numbers;
    }

    public static List<Integer> sortLambdaList(List<Integer> unsortedList){
        Collections.sort(unsortedList, (o1,o2) -> o2.compareTo(o1));
        return unsortedList;
    }

    public static boolean isPrimeNumber(int n){
        if(n <= 1)
            return false;

        var contador = 0;
        for (int i = n-1; i > 1 ; i--){
            if (n % i == 0)
                contador++;
        }
        return contador <= 0;
    }
    public static void main(String args[]){
       System.out.println("Calculando aleatorios");
        var listadoPrimos = createRandomList(Integer.valueOf(args[0])).stream()
                .filter(n -> isPrimeNumber(n))
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Calculo finalizado");
        System.out.println("Primer primo " + listadoPrimos.get(0));
        //System.out.println(listadoPrimos);


        /*var primos = IntStream.range(0, 100).boxed()
                .filter(n -> isPrimeNumer(n))
                .collect(Collectors.toList());
                System.out.println(primos);
        var randomNumer = createRandomList(10);
        System.out.println(randomNumer);
        sortLambdaList(randomNumer);
        System.out.println(randomNumer);*/
    }
}
