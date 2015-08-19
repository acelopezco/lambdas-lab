package com.javanme.java8;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

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
            String esperado = "1 2 3 a y al de el en es la lo me mi mí ni no oh se si te ti tu un ví yo del día eso fue los luz más oro pa' par por que sin sus tan tus voy aquí bien cali coro dure días leno loma luna mime pena risa todo york ¡ay! aroma bella canta cante cielo demás estoy fondo ganar justo lejos miles mirar mires muero mujer mundo nueva nuevo paris puede sabes sentí siloé todos valle calles celoso ciudad cuando divisa espero frente lucero millas noches pueblo puerta quiero razona siento todito afrenta américa bonitas caminos capital clásico empatar inspira mujeres pascual permita señoras señores adornado ausencia carnaval conducen jilguero levantan montañas pregones rodillas sucursal supieras juanchito presencia romántica arrepienta callesitas cenicienta cualquiera pachanguero barranquilla";
            assertEquals(esperado, resultado);
        }
    }

    @Test
    public void ejercicio4() {
        Path archivo = Paths.get("CaliPachanguero.txt");
        if (Files.exists(archivo)) {
            Map<Integer, List<String>> resultado = ejercicios.ejercicio4(archivo);
            assertEquals(7, resultado.get(3)
                                     .size());
            assertEquals(Arrays.asList("inspira"), resultado.get(7));
            assertEquals(Arrays.asList("romántica", "juanchito"), resultado.get(9));
            assertFalse(resultado.containsKey(10));
        }
    }

    @Test
    public void ejercicio5() {
        Path archivo = Paths.get("CaliPachanguero.txt");
        if (Files.exists(archivo)) {
            Map<String, Long> resultado = ejercicios.ejercicio5(archivo);
            assertEquals(1L, (long) resultado.get("sabes"));
            assertEquals(2L, (long) resultado.get("luz"));
            assertEquals(6L, (long) resultado.get("Cali"));
            assertEquals(4L, (long) resultado.get("la"));
            assertEquals(1L, (long) resultado.get("Siloé"));
            assertFalse(resultado.containsKey("lambda"));
        }
    }

    @Test
    public void ejercicio6() {
        Path archivo = Paths.get("CaliPachanguero.txt");
        if (Files.exists(archivo)) {
            Map<String, Map<Integer, List<String>>> resultado = ejercicios.ejercicio6(archivo);
            assertEquals("[a]", resultado.get("A")
                                         .get(1)
                                         .toString());
            assertEquals("[ausencia, adornado]", resultado.get("A")
                                                          .get(8)
                                                          .toString());
            assertEquals("[sabes, sentí, siloé]", resultado.get("S")
                                                           .get(5)
                                                           .toString());
            assertEquals(8, resultado.get("P")
                                     .keySet()
                                     .size());
        }
    }
}
