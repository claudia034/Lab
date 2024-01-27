package com.vorozco;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.stream.Collectors;

class StreamsDemoTest {

    @Test
    void createRandomList() {
        var list = StreamsDemoTest.createRandomList(10);
        assertEquals(10, list.size());
    }

    @Test
    void isPrimeNumber() {
        var isPrime = StreamsDemoTest.isPrimeNumber(7);
        Assertions.assertTrue(isPrime);
    }

    @Test
    void getFirstNumberAmong50000(){
        var listadoPrimos = StreamsDemoTest.createRandomList(50_000_000)
                .parallelStream()
                .filter(n -> StreamsDemoTest.isPrimeNumber(n))
                .sorted()
                .collect(Collectors.toList());

        assertEquals(2, listadoPrimos.get(0));
    }
}
