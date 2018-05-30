package com.roger.agenda.services;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roger.agenda.model.Contato;
import com.roger.agenda.model.Operadora;

@RestController
@RequestMapping("/contatos")
public class ContatosResource {
  
  @PostMapping
  private Contato adicionar(@RequestBody Contato contato) {
    return new Contato();
  }
  
  @GetMapping(produces="application/json")
  public ArrayList<Contato> listar() {
    ArrayList<Contato> contatos = new ArrayList<Contato>();
    Contato contato;
    Operadora operadora;

    contato = new Contato();
    contato.setNome("João");
    contato.setData(new Date());
    contato.setTelefone("9999-8888");
    operadora = new Operadora();
    operadora.setNome("Tim");
    operadora.setCodigo(41);
    operadora.setCategoria("Celular");
    contato.setOperadora(operadora);
    contatos.add(contato);
    
    contato = new Contato();
    contato.setNome("Maria");
    contato.setData(new Date());
    contato.setTelefone("9999-7777");
    operadora = new Operadora();
    operadora.setNome("Oi");
    operadora.setCodigo(14);
    operadora.setCategoria("Celular");
    contato.setOperadora(operadora);
    contatos.add(contato);

    contato = new Contato();
    contato.setNome("Carlos");
    contato.setData(new Date());
    contato.setTelefone("9999-6666");
    operadora = new Operadora();
    operadora.setNome("Vivo");
    operadora.setCodigo(15);
    operadora.setCategoria("Celular");
    contato.setOperadora(operadora);
    contatos.add(contato);

    return contatos;
  }
  
}
