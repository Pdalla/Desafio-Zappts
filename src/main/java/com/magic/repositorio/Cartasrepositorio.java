package com.magic.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Cartasrepositorio extends JpaRepository<Carrosinf, Integer> {
}

