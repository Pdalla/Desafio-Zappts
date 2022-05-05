package com.magic.repositorio;

import com.magic.usuarios.Usuariobd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Usuariorepositorio extends JpaRepository <Usuariobd, Integer> {
}
