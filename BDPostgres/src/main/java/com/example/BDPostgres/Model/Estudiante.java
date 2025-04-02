package com.example.BDPostgres.Model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    private String nombre;
    private String telefono;

    @ManyToMany
    @JoinTable(name = "estudiante_curso", joinColumns = @JoinColumn(name = "estudiante_id"), inverseJoinColumns = @JoinColumn(name = "curso_id"))
    private Set<Cursos> cursos = new HashSet<>();

    @OneToOne(mappedBy = "estudiante", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Carnet carnet;

    public Estudiante() {
    }

    public Estudiante(long codigo, String nombre, String telefono, Set<Cursos> cursos, Carnet carnet) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.cursos = cursos;
        this.carnet = carnet;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Set<Cursos> getCursos() {
        return cursos;
    }

    public void setCursos(Set<Cursos> cursos) {
        this.cursos = cursos;
    }

    public Carnet getCarnet() {
        return carnet;
    }

    public void setCarnet(Carnet carnet) {
        this.carnet = carnet;
    }
}
