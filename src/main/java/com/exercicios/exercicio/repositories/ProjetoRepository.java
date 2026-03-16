package com.exercicios.exercicio.repositories;

import com.exercicios.exercicio.model.ProjetoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<ProjetoModel, Long> {
}
