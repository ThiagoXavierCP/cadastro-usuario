package com.thiagoxavier.cadastro_usuario.infrastructure.entitys;

import jakarta.persistence.*;
import lombok.*;

@Getter //Obter informações
@Setter //Setar informações
@AllArgsConstructor //Construtores para acesso de classe
@NoArgsConstructor //Construtores para acesso de classe
@Builder //Usado para update
@Table(name = "usuario") //Indicar a representação de uma tabela com nome de "usuario"
@Entity

public class Usuario {

    @Id //Identificador unico
    @GeneratedValue(strategy = GenerationType.AUTO) //Id vai ser gerado automaticamente
    private Integer id;

    @Column(name = "email", unique = true) //Nome da coluna / Informando que é email unico
    private String email;

    @Column(name = "nome")
    private String nome;
}
