package com.exercicios.exercicio.services;

import com.exercicios.exercicio.model.ProjetoModel;
import com.exercicios.exercicio.repositories.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {

    @Autowired
    ProjetoRepository projetoRepository;

    public ProjetoModel salvar(ProjetoModel projetoModel) {
        return projetoRepository.save(projetoModel);
    }

    public void deleteById(Long id) {
        projetoRepository.deleteById(id);
    }

    public List<ProjetoModel> findAll() {
        return projetoRepository.findAll();
    }

    public ProjetoModel findById(Long id) {
        return projetoRepository.findById(id).orElse(null);
    }
}
