package com.magic.Inicio.repositorio;

import com.magic.Inicio.cartas.Cartasbd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Cartasrepositorio extends JpaRepository<Cartasbd, Integer> {
}

