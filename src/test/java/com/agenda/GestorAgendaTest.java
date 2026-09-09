package com.agenda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GestorAgendaTest {
    private GestorAgenda agenda;

    @BeforeEach
    void setUp() {
        agenda = new GestorAgenda();
    }

    @Test
    void testRegistrarYBuscarPersona() {
        Persona persona = new Persona("101", "Ana Lopez", "555-1234");
        agenda.agregar(persona);

        assertTrue(agenda.buscarPorId("101").isPresent());
        assertEquals("Ana Lopez", agenda.buscarPorId("101").get().getNombre());
    }

    @Test
    void testEditarPersona() {
        Persona persona = new Persona("102", "Juan Ruiz", "555-0000");
        agenda.agregar(persona);

        boolean editado = agenda.editar("102", "Juan Ruiz Diaz", "555-1111");

        assertTrue(editado);
        assertEquals("Juan Ruiz Diaz", agenda.buscarPorId("102").get().getNombre());
        assertEquals("555-1111", agenda.buscarPorId("102").get().getTelefono());
    }
}