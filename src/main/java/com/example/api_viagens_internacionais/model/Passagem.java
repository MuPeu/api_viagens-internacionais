package com.example.api_viagens_internacionais.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_passagem")
public class Passagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_passagem;

    @ManyToOne
    @JoinColumn(name = "id_passageiro", nullable = false)
    private Passageiro passageiro;

    @ManyToOne
    @JoinColumn(name = "id_voo", nullable = false)
    private Voo voo;

    @Column(nullable = false)
    private LocalDate dataCompra;

    public Passagem() {

    }

    public Passagem(Integer id_passagem, Passageiro passageiro, Voo voo) {
        this.id_passagem = id_passagem;
        this.passageiro = passageiro;
        this.voo = voo;
        this.dataCompra=LocalDate.now();
    }

    public Integer getIdPassagem() { return id_passagem; }
    public void setIdPassagem(Integer id_passagem) { this.id_passagem = id_passagem; }



    public LocalDate getDataCompra() { return dataCompra; }
    public void setDataCompra(LocalDate dataCompra) { this.dataCompra = dataCompra; }
}