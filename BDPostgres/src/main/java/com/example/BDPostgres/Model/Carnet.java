package com.example.BDPostgres.Model;

import jakarta.persistence.*;

@Entity
public class Carnet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    private String numero_carnet;
    private String fecha_emision;

    @OneToOne
    @JoinColumn(name = "estudiante_id", unique = true, nullable = false)
    private Estudiante estudiante;

    public Carnet() {
    }

    public Carnet(long codigo, String numero_carnet, String fecha_emision, Estudiante estudiante) {
        this.codigo = codigo;
        this.numero_carnet = numero_carnet;
        this.fecha_emision = fecha_emision;
        this.estudiante = estudiante;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNumero_carnet() {
        return numero_carnet;
    }

    public void setNumero_carnet(String numero_carnet) {
        this.numero_carnet = numero_carnet;
    }

    public String getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(String fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
