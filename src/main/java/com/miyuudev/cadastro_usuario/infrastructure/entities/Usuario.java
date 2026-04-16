package com.miyuudev.cadastro_usuario.infrastructure.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder //  fzr update
@Table(name="usuario")
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "email", unique =true)
    private String email;

    @Column(name = "nome")
    private String nome;
}


