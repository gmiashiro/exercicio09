package com.exercicios.exercicio.controllers;

import com.exercicios.exercicio.model.ProjetoModel;
import com.exercicios.exercicio.services.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/projeto")
public class ProjetoController {

    @Autowired
    ProjetoService projetoService;

    @PostMapping
    public ProjetoModel save(@RequestBody ProjetoModel projetoModel) {
        return projetoService.salvar(projetoModel);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        projetoService.deleteById(id);
    }

    @GetMapping
    public List<ProjetoModel> findAll() {
        return projetoService.findAll();
    }

    @GetMapping("/{id}")
    public ProjetoModel findById(@PathVariable Long id) {
        return projetoService.findById(id);
    }
}
