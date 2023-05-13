package br.com.thonwelling.apilinguagens.controllers;

import br.com.thonwelling.apilinguagens.models.Linguagem;
import br.com.thonwelling.apilinguagens.repositories.LinguagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/linguagens")
public class LinguagensController {

  @Autowired
  LinguagemRepository repository;

  @GetMapping("/linguagem-preferida")
  public String processaLinguagemPreferida() {
    return "Olá JAVA";
  }

  @GetMapping
  public List<Linguagem> obterLinguagens () {
    return repository.findAll();
  }

  @PostMapping()
  public Linguagem cadastrarLinguagem (@RequestBody Linguagem linguagem) {
    return repository.save(linguagem);
  }
}
