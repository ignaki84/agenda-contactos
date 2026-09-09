package com.agenda;

public class AgendaUtils {
    public static boolean esTelefonoValido(String telefono) {
        return telefono != null && telefono.matches("\\d{3}-\\d{4}");
    }
}