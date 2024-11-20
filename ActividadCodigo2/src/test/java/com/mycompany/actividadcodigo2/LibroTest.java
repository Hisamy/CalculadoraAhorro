/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.actividadcodigo2;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author hisam
 */
public class LibroTest {
    
    public LibroTest() {
    }

    @Test
    public void testGetTitulo() {
        
        Libro libro = new Libro(
                "Principito",
                "Antoine de Saint-Exupéry",
                200,
                5   
        );
        assertEquals("Principito",libro.getTitulo());
                
    }

    @Test
    public void testGetAutor() {
        Libro libro = new Libro(
                "Principito",
                "Antoine de Saint-Exupéry",
                200,
                5   
        );
        assertEquals("Antoine de Saint-Exupéry",libro.getAutor());
    }

    @Test
    public void testGetNumeroPaginas() {
        Libro libro = new Libro(
                "Principito",
                "Antoine de Saint-Exupéry",
                200,
                5   
        );
        assertEquals(200,libro.getNumeroPaginas());
    }

    @Test
    public void testGetCopiasDisponibles() {
        Libro libro = new Libro(
                "Principito",
                "Antoine de Saint-Exupéry",
                200,
                5   
        );
        assertEquals(5,libro.getCopiasDisponibles());
    }

    @Test
    public void testPrestarCopia() {
        //Arrange
        Libro libro = new Libro(
                "Principito",
                "Antoine de Saint-Exupéry",
                200,
                5   
        );
        //Act
        libro.prestarCopia();
        //Assert
        assertEquals(4, libro.getCopiasDisponibles());
    }

    @Test
    public void testDevolverCopia() {
        //Arrange
        Libro libro = new Libro(
                "Principito",
                "Antoine de Saint-Exupéry",
                200,
                4   
        );
        //Act
        libro.devolverCopia();
        //Assert
        assertEquals(5, libro.getCopiasDisponibles());
    }
    
}
