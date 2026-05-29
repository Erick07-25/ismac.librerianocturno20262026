package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    private Autor autor;

    @BeforeEach
    public void setUp() {
        autor = new Autor(
                1,
                "Erick",
                "Guevara Paredes",
                "Ecuador",
                "Tumbaco",
                "0998740077",
                "jaelparedes6@gmail.com"
        );
    }

    @Test
    public void testAutorConstructorAndGetters() {

        assertAll("Pruebas unitarias - Constructor y Getters - Autor",
                () -> assertEquals(1, autor.getIdAutor()),
                () -> assertEquals("Erick", autor.getNombre()),
                () -> assertEquals("Guevara Paredes", autor.getApellido()),
                () -> assertEquals("Ecuador", autor.getPais()),
                () -> assertEquals("Tumbaco", autor.getDireccion()),
                () -> assertEquals("0998740077", autor.getTelefono()),
                () -> assertEquals("jaelparedes6@gmail.com", autor.getCorreo())
        );

        System.out.println(autor.toString());
    }

    @Test
    public void testAutorSetters() {

        autor.setIdAutor(2);
        autor.setNombre("Daniel");
        autor.setApellido("Perez Boada");
        autor.setPais("Ecuador");
        autor.setDireccion("Tumbaco");
        autor.setTelefono("0987656423");
        autor.setCorreo("danielp@gmail.com");

        assertAll("Pruebas unitarias - Setters - Autor",
                () -> assertEquals(2, autor.getIdAutor()),
                () -> assertEquals("Daniel", autor.getNombre()),
                () -> assertEquals("Perez Boada", autor.getApellido()),
                () -> assertEquals("Ecuador", autor.getPais()),
                () -> assertEquals("Tumbaco", autor.getDireccion()),
                () -> assertEquals("0987656423", autor.getTelefono()),
                () -> assertEquals("danielp@gmail.com", autor.getCorreo())
        );

        System.out.println(autor.toString());
    }

    @Test
    public void testAutorToString() {

        String str = autor.toString();

        assertAll("Pruebas Unitarias - ToString - Autor",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Erick")),
                () -> assertTrue(str.contains("Guevara Paredes")),
                () -> assertTrue(str.contains("Ecuador")),
                () -> assertTrue(str.contains("Tumbaco")),
                () -> assertTrue(str.contains("0998740077")),
                () -> assertTrue(str.contains("jaelparedes6@gmail.com"))
        );
    }
}