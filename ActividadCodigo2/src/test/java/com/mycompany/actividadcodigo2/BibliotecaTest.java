/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.actividadcodigo2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author hisam
 */
public class BibliotecaTest {

    public BibliotecaTest() {
    }

    @Test
    public void testAgregarLibro() {
        //Arrange
        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro(
                "Principito",
                "Antoine de Saint-Exupéry",
                200,
                5);
        //Act
        biblioteca.agregarLibro(libro);
        //Assert
        assertEquals(libro, biblioteca.buscarLibro("Principito"));
    }

    @Test
    public void testEliminarLibro() {
        //Arrange
        Biblioteca biblioteca = new Biblioteca();
        //Act
        Libro libro = new Libro(
                "Principito",
                "Antoine de Saint-Exupéry",
                200,
                5);
        biblioteca.agregarLibro(libro);
        biblioteca.eliminarLibro("Principito"); 
        //Assert
        assertEquals(null, biblioteca.buscarLibro("Principito"));
    }

    @Test
    public void testBuscarLibro() {
        //Arrange
        Biblioteca biblioteca = new Biblioteca();
        //Act
        Libro libro = new Libro(
                "Principito",
                "Antoine de Saint-Exupéry",
                200,
                5);
        biblioteca.agregarLibro(libro);
        //Assert
        assertEquals(libro, biblioteca.buscarLibro("Principito"));
        
    }

    @Test
    public void testContarTotalPaginas() {
        //Arrange
        Biblioteca biblioteca = new Biblioteca();
        //Act
        Libro libro = new Libro(
                "Principito",
                "Antoine de Saint-Exupéry",
                200,
                5);
        biblioteca.agregarLibro(libro);
        //Assert
        assertEquals(200, biblioteca.contarTotalPaginas());
    }

    @Test
    public void testHayCopiasDisponibles() {
        //Arrange
         Biblioteca biblioteca = new Biblioteca();
        //Act
        Libro libro = new Libro(
                "Principito",
                "Antoine de Saint-Exupéry",
                200,
                5);
        biblioteca.agregarLibro(libro);
        //Assert
        assertTrue(biblioteca.hayCopiasDisponibles("Principito"));
    }

}
