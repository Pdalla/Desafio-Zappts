package com.magic.usuarios;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity (name = "USUARIO") /* entidade mapeada para tabela no banco de dados */
public class Usuariobd {
    @Id
    ///@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false,unique = true)
    private long cpf;
    @Column(nullable = false, length = 11)
    private String nome;



    public long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



}


