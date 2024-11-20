
package com.mycompany.actividadcodigo2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    // Método para agregar un libro a la biblioteca
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // Método para eliminar un libro de la biblioteca
    public boolean eliminarLibro(String titulo) {
        return libros.removeIf(libro -> libro.getTitulo().equalsIgnoreCase(titulo));
    }

    // Método para buscar un libro por título
    public Libro buscarLibro(String titulo) {
        return libros.stream()
            .filter(libro -> libro.getTitulo().equalsIgnoreCase(titulo))
            .findFirst()
            .orElse(null);
    }

    // Método para contar el total de páginas de todos los libros
    public int contarTotalPaginas() {
        return libros.stream()
            .mapToInt(Libro::getNumeroPaginas)
            .sum();
    }

    // Método para verificar si hay copias de un libro disponibles
    public boolean hayCopiasDisponibles(String titulo) {
        Libro libro = buscarLibro(titulo);
        return libro != null && libro.getCopiasDisponibles() > 0;
    }
}
