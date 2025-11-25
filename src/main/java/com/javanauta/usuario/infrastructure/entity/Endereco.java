package com.javanauta.usuario.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "endereco")
@Builder
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "rua", length = 50)
    private String rua;
    @Column(name = "numero", length = 5)
    private String numero;
    @Column(name  ="bairro", length = 50)
    private String bairro;
    @Column(name = "cidade", length = 50)
    private String cidade;
    @Column(name = "estado", length = 2)
    private String estado;
    @Column(name = "cep", length = 9)
    private String cep;
}
