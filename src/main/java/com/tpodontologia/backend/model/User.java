package com.tpodontologia.backend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@NoArgsConstructor
@Entity
@Data

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Preencha seu nome inteiro!")
    private String name;
    @Email
    @NotBlank(message = "Adicione seu e-mail!")
    private String email;
    @Size(min = 6, max = 20)
    @NotBlank(message = "Preencha sua senha!")
    private String password;
    @NotNull(message = "Preencha sua idade!")
    private int age;
    @NotBlank(message = "Preencha seu CPF.")
    @Pattern(regexp = "\\d{3}\\.?\\d{3}\\.?\\d{3}\\-?\\d{2}", message = "CPF inválido")
    private String cpf;

    @Pattern(regexp = "\\d{10,11}", message = "Número de telefone inválido")
    private String phone;

}
