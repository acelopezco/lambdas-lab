package com.javanme.java8;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.OptionalInt;

import static org.junit.Assert.assertEquals;

/**
 * Pruebas para los ejercicios de nivel intermedio
 * Created by aalopez on 18/08/15.
 */
public class IntermedioTest {
    private Intermedio ejercicios = new Intermedio();

    @Test
    public void ejercicio1() {
        Path archivo = Paths.get("CaliPachanguero.txt");
        if (Files.exists(archivo)) {
            long resultado = ejercicios.ejercicio1(archivo);
            assertEquals(40, resultado);
        }
    }

    @Test
    public void ejercicio2() {
        Path archivo = Paths.get("CaliPachanguero.txt");
        if (Files.exists(archivo)) {
            OptionalInt resultado = ejercicios.ejercicio2(archivo);
            assertEquals(49, resultado.getAsInt());
        }
    }
}
