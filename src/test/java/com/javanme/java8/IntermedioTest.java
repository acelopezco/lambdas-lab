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

    @Test
    public void ejercicio3() {
        Path archivo = Paths.get("CaliPachanguero.txt");
        if (Files.exists(archivo)) {
            String resultado = ejercicios.ejercicio3(archivo);
            String esperado = " 1 2 3 a y al de el en es la lo me mi mí ni no oh se si te ti tu un ví yo del día eso fue los luz más oro pa' par por que sin sus tan tus voy aquí bien cali coro dure días leno loma luna mime pena risa todo york ¡ay! aroma bella canta cante cielo demás estoy fondo ganar justo lejos miles mirar mires muero mujer mundo nueva nuevo paris puede sabes sentí siloé todos valle calles celoso ciudad cuando divisa espero frente lucero millas noches pueblo puerta quiero razona siento todito afrenta américa bonitas caminos capital clásico empatar inspira mujeres pascual permita señoras señores adornado ausencia carnaval conducen jilguero levantan montañas pregones rodillas sucursal supieras juanchito presencia romántica arrepienta callesitas cenicienta cualquiera pachanguero barranquilla";
            assertEquals(esperado.trim(), resultado.trim());
        }
    }
}
