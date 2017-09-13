package com.javanme.java8;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Pruebas para los ejercicios de nivel avanzado
 * Created by aalopez on 18/08/15.
 */
public class AvanzadoTest {
    private Avanzado ejercicios = new Avanzado();

    @Test
    public void ejercicio1() {

        List<Integer> numeros = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21);
        int suma = ejercicios.ejercicio1(numeros);

        assertTrue(54 == suma);
    }

    @Test
    public void ejercicio2() {

        List<Long> numeros = Arrays.asList(1L, 1L, 2L, 3L, 5L, 8L, 13L, 21L);
        long max = ejercicios.ejercicio2(numeros);

        assertTrue(21L == max);
    }
}
