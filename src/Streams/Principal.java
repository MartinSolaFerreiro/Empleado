package Streams;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Principal {
    public static void main(String[] args) {
        ArrayList <Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200 ));
        cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
        cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700 ));
        cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400 ));
        cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300 ));
        
        Predicate <Curso> mas400=x->x.getAlumnos()>400;
        Consumer <Curso> mostrar=System.out::println;
        
        cursos.stream().filter(mas400).forEach(mostrar);
    }
}
