package br.com.dio.desafio.bootcamp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringUtils {

    public static String dateToString(LocalDate localDate){
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return localDate.format(formatador);
    }
}
