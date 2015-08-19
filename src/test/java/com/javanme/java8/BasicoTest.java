package com.javanme.java8;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Pruebas para los ejercicios de nivel básico
 * Created by aalopez on 18/08/15.
 */
public class BasicoTest {
    private Basico ejercicios = new Basico();

    @Test
    private void ejercicio1() {
        List<String> listado = Arrays.asList(
                "Cali", "es", "cali", "lo", "demás", "es", "loma");
        List<String> resultado = ejercicios.ejercicio1(listado);
        assertEquals(Arrays.asList(
                "CALI", "ES", "CALI", "LO", "DEMÁS", "ES", "LOMA"), resultado);
    }
}
