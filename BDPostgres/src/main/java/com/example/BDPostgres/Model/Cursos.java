package com.example.BDPostgres.Model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Cursos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "docente_id", nullable = false)
    private Docente docente;

    @ManyToMany(mappedBy = "cursos")
    private Set<Estudiante> estudiantes = new HashSet<>();

    public Cursos() {
    }

    public Cursos(long codigo, String nombre, Docente docente, Set<Estudiante> estudiantes) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.docente = docente;
        this.estudiantes = estudiantes;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Set<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Set<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
