package com.example.api_viagens_internacionais.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_voo")
public class Voo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_voo;

    @Column(nullable = false)
    private Integer numVoo;

    @Column(nullable = false)
    private String destino;

    @Column(nullable = false)
    private Date dataVoo;

    public Voo() {

    }

    public Voo(Integer id_voo, Integer numVoo, String destino, Date dataVoo) {
        this.id_voo = id_voo;
        this.numVoo = numVoo;
        this.destino = destino;
        this.dataVoo = dataVoo;
    }

    public Integer getIdVoo() { return id_voo; }
    public void setIdVoo(Integer id_voo) { this.id_voo = id_voo; }

    public Integer getNumVoo() { return numVoo; }
    public void setNumVoo(Integer numVoo) { this.numVoo = numVoo; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public Date getDataVoo() { return dataVoo; }
    public void setDataVoo(Date dataVoo) { this.dataVoo = dataVoo; }
}

