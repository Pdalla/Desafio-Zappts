package com.magic.cartas;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Cartasbd {

    //        @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Basic(optional = false)
    //@Column(name = "qtde",unique = true,nullable = false)
    private Integer qtdecarro;
    @Column(nullable = false)
    private Integer marca;
    @Column(nullable = false)
    private Integer modelo;
    @Column(nullable = false, length = 11)
    private String versao;
    @Column(nullable = false, length = 50)
    private String valor;

    public Integer getQtdecarro() {
        return qtdecarro;
    }

    public void setQtdecarro(Integer qtdecarro) {
        this.qtdecarro = qtdecarro;
    }

    public Integer getMarca() {
        return marca;
    }

    public void setMarca(Integer marca) {
        this.marca = marca;
    }


    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
