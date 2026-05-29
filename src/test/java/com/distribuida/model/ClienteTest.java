package com.distribuida.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.RequestEntity;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    private Cliente cliente;

    @BeforeEach
    public void setUp() {
        cliente = new Cliente(
                1
                , "1748524562"
                , "Bob"
                , "Esponja"
                , "En el mar"
                , "0985426515"
                , "besponja@correo.com"
        );
    }

    @Test
    public void testClienteConstructorAndGetters() {
        assertAll("Pruebas unitarias - Constructor y Getters - Cliente",
                () -> assertEquals(1, cliente.getIdCliente()),
                () -> assertEquals("1748524562", cliente.getCedula()),
                () -> assertEquals("Bob", cliente.getNombre()),
                () -> assertEquals("Esponja", cliente.getApellido()),
                () -> assertEquals("En el mar", cliente.getDireccion()),
                () -> assertEquals("0985426515", cliente.getTelefono()),
                () -> assertEquals("besponja@correo.com", cliente.getCorreo())
        );
        System.out.println(cliente.toString());
    }

    @Test
    public void  testClienteSetters() {
        cliente.setIdCliente(2);
        cliente.setCedula("1785236954");
        cliente.setNombre("Bob22");
        cliente.setApellido("Esponja222");
        cliente.setDireccion("En el mar22");
        cliente.setTelefono("0978445365");
        cliente.setCorreo("besponja22@correo.com");

        assertAll("Pruebas unitarias - Constructor y Getters - Cliente",
                () -> assertEquals(2, cliente.getIdCliente()),
                () -> assertEquals("1785236954", cliente.getCedula()),
                () -> assertEquals("Bob22", cliente.getNombre()),
                () -> assertEquals("Esponja222", cliente.getApellido()),
                () -> assertEquals("En el mar22", cliente.getDireccion()),
                () -> assertEquals("0978445365", cliente.getTelefono()),
                () -> assertEquals("besponja22@correo.com", cliente.getCorreo())
        );
        System.out.println(cliente.toString());

    }
    @Test
    public void testClienteToString(){
        String str = cliente.toString();
        assertAll("Pruebas Unitarias - To String - Clientes",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("1748524562")),
                () -> assertTrue(str.contains("Bob")),
                () -> assertTrue(str.contains("Esponja")),
                () -> assertTrue(str.contains("En el mar")),
                () -> assertTrue(str.contains("0985426515")),
                () -> assertTrue(str.contains("besponja@correo.com"))
        );

    }
}