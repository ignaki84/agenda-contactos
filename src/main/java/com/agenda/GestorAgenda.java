package com.agenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GestorAgenda {
    private final List<Persona> contactos = new ArrayList<>();

    // Registrar objeto Persona
    public void agregar(Persona persona) {
        contactos.add(persona);
    }

    // Leer/Buscar objeto Persona por ID
    public Optional<Persona> buscarPorId(String id) {
        return contactos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    // Editar objeto Persona
    public boolean editar(String id, String nuevoNombre, String nuevoTelefono) {
        Optional<Persona> encontrada = buscarPorId(id);
        if (encontrada.isPresent()) {
            Persona p = encontrada.get();
            p.setNombre(nuevoNombre);
            p.setTelefono(nuevoTelefono);
            return true;
        }
        return false;
    }

    public List<Persona> listarTodos() {
        return new ArrayList<>(contactos);
    }
}