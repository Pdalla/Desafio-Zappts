package com.magic.cartas;

import javax.persistence.*;

@Entity (name = "CARTAS")
public class Cartasbd {
    //Nome X
//Edicao X
//idioma X
//Foil X
//Valor X
//Qtde X
    //        @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Basic(optional = false)
    //@Column(name = "qtde",unique = true,nullable = false)
    private String nomecarta;
    @Column(nullable = false, length = 20)
    private String edicao;
    @Column(nullable = false, length = 20)
    private Integer idioma;
    @Column(nullable = false, length = 3)
    private String valor;
    @Column(nullable = false)
    private Boolean foil;
    @Column (nullable = false)
    private Integer qtdecartas;


    public Integer getQtdecartas() {
        return qtdecartas;
    }

    public void setQtdecartas(Integer qtdecartas) {
        this.qtdecartas = qtdecartas;
    }

    public String getNomecarta() {
        return nomecarta;
    }

    public void setNomecarta(String nomecarta) {
        this.nomecarta = nomecarta;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Integer getIdioma() {
        return idioma;
    }

    public void setIdioma(Integer idioma) {
        this.idioma = idioma;
    }

    public Boolean getFoil() {
        return foil;
    }

    public void setFoil(Boolean foil) {
        this.foil = foil;
    }

}

