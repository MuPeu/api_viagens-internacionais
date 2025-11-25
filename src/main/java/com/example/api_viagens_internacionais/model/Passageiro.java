package com.example.api_viagens_internacionais.model;

import jakarta.persistence.*;
import java.time.Year;

@Entity
@Table(name = "tb_passageiro")
public class Passageiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_passageiro;


    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    private Integer passaporte;

    @Column(nullable = false)
    private Year val_passaporte;

    public Passageiro() {

    }

    public Passageiro(Integer id_passageiro, String nome, String cpf, Integer passaporte, Year val_passaporte) {
        this.id_passageiro = id_passageiro;
        this.nome = nome;
        this.cpf = cpf;
        this.passaporte = passaporte;
        this.val_passaporte = val_passaporte;
    }

    public Integer getIdPassageiro() { return id_passageiro; }
    public void setIdPassageiro(Integer id_passageiro) { this.id_passageiro = id_passageiro; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public Integer getPassaporte() { return passaporte; }
    public void setPassaporte(Integer passaporte) { this.passaporte = passaporte; }

    public Year getValPassaporte() { return val_passaporte; }
    public void setValPassaporte(Year val_passaporte) { this.val_passaporte = val_passaporte; }
}
