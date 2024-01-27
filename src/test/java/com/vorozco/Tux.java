package com.vorozco;
import com.vorozco.functional.MyFunctionalInterface;
public class Tux implements MyFunctionalInterface {

    @Override
    public String doSomething(String param) {
        return "Hola soy tux y recibi el siguiente parametro" + param;
    }
}
