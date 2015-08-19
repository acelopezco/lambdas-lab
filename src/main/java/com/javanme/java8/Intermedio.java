package com.javanme.java8;

import java.nio.file.Path;
import java.util.OptionalInt;

/**
 * Clase con ejercicios nivel intermedio
 * Created by aalopez on 18/08/15.
 */
public class Intermedio {

    static final String REGEXP = "[- .:,]+"; // separa cadenas de texto en palabras

    /**
     * Contar el número de líneas no vacías que tiene el archivo pasado por parámetro
     * Usar nuevos métodos encontrados en la clase BufferedReader en Java 8
     *
     * @param archivo Ruta al archivo que se desea evaluar
     * @return Cantidad de líneas en el archivo
     * @see java.io.BufferedReader
     * @see java.util.stream.Stream
     */
    public long ejercicio1(Path archivo) {
        throw new UnsupportedOperationException();
    }

    /**
     * Encuentra el número de caracteres que tiene la línea más larga del archivo
     *
     * @param archivo Ruta al archivo que se desea evaluar
     * @return Cantidad de caracteres que tiene la línea más larga del archivo
     * @see java.io.BufferedReader
     * @see java.util.stream.Stream
     * @see java.util.stream.IntStream
     */
    public OptionalInt ejercicio2(Path archivo) {
        throw new UnsupportedOperationException();
    }

    /**
     * Crea una lista de palabras que se encuentran en el archivo pasado por parámetro, convertidas a minúsculas,
     * sin duplicados, ordenadas primero por tamaño y luego alfabeticamente.
     * Une todas las palabras en una cadena separando cada palabra por un espacio (" ")
     * <p/>
     * Usa la constante REGEXP proveida al inicio de esta clase para hacer la separación de cadenas de texto a palabras
     *
     * @param archivo Ruta al archivo que se desea evaluar
     * @return Cadena de texto que contiene las palabras en minúsculas, sin duplicados, ordenadas por tamaño, luego alfabeticamente
     * y cada palabra está separada por un espacio
     * @see java.io.BufferedReader
     * @see java.util.stream.Stream
     * @see java.lang.String
     */
    public String ejercicio3(Path archivo) {

        throw new UnsupportedOperationException();
    }
}

