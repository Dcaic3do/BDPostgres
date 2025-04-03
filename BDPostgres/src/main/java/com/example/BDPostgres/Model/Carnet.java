package com.example.BDPostgres.Model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
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

}
