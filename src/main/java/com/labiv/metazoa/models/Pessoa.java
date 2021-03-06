package com.labiv.metazoa.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    @NotBlank
    @Column(unique = true)
    @Email
    private String email;
    @NotBlank
    private String nome;
    @NotBlank
    private String senha;
    @NotBlank
    @Column(unique = true)
    private String telefone;
    @NotBlank
    private String estado;
    @NotBlank
    private String cidade;

    private String bairro;
    private String rua;
    private Integer numeroEndereco;
    private String complemento;

    public Pessoa() {
        
    }

    public Pessoa(String nome, String telefone, String email, String senha, String estado, String cidade, String bairro,
            String rua, int numeroEndereco, String complemento) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numeroEndereco = numeroEndereco;
        this.complemento = complemento;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public String getSenha() {
        return this.senha;
    }

    public String getEstado() {
        return this.estado;
    }

    public String getCidade() {
        return this.cidade;
    }

    public String getBairro() {
        return this.bairro;
    }

    public String getRua() {
        return this.rua;
    }

    public int getNumeroEndereco() {
        return this.numeroEndereco;
    }

    public String getComplemento() {
        return this.complemento;
    }
}