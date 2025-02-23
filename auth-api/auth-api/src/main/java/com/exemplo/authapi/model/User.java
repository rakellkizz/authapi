package com.exemplo.authapi.model;

import jakarta.persistence.*;
import lombok.*;

@Entity //Define que esta classe será uma tabela no banco de dados.
@Table(name = "users") //Especifica o nome da tabela como "users"
@Getter //São anotações do Lombok que geram automaticamente getters, setters e construtores.
@Setter //São anotações do Lombok que geram automaticamente getters, setters e construtores.
@NoArgsConstructor //São anotações do Lombok que geram automaticamente getters, setters e construtores.
@AllArgsConstructor//São anotações do Lombok que geram automaticamente getters, setters e construtores.
class User {

    @Id // Define a id como chave primária e autoincrementável.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true) //Define a coluna username como única e obrigatória.
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role;
}
