package com.magic.repositorio;

import com.magic.cartas.Cartasbd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Cartasrepositorio extends JpaRepository<Cartasbd, Integer> {
}

