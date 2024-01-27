package com.vorozco;

import com.vorozco.functional.MyFunctionalInterface;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionalTest {

    @Test
    void squirtl(){
        MyFunctionalInterface squirtle = (String param) -> {
            return "Squirtle Squirtle "+ param;
        };

        assertEquals("Squirtle Squirtle Holi", squirtle.doSomething("Holi"));
    }
}
