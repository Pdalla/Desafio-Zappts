package com.magic.Inicio.repositorio;

import com.magic.Inicio.usuarios.Usuariobd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Usuariorepositorio extends JpaRepository <Usuariobd, Integer> {
}
