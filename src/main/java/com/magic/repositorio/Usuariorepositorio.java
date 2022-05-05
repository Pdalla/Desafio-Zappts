package com.magic.repositorio;

import com.yourcar.rodizio.usuario.Usuarioval;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Usuariorepositorio extends JpaRepository <Usuarioval, Integer> {
}
