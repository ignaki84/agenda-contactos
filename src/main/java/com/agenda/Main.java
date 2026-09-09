package com.agenda;

public class Main {
    public static void main(String[] args) {
        GestorAgenda agenda = new GestorAgenda();

        // 1. Registrar Persona
        Persona p1 = new Persona("1", "Carlos Gomez", "555-0192");
        agenda.agregar(p1);
        System.out.println("Contacto registrado: " + p1);

        // 2. Leer Persona
        agenda.buscarPorId("1").ifPresent(p -> 
            System.out.println("Contacto encontrado: " + p.getNombre())
        );

        // 3. Editar Persona
        agenda.editar("1", "Carlos Gomez Perez", "555-9999");
        System.out.println("Contacto actualizado: " + agenda.buscarPorId("1").orElse(null));
    }
}
