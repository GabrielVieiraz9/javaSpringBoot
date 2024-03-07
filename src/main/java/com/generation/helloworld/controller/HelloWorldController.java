package com.generation.helloworld.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/site")
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	@GetMapping("/bsm")
    public List<String> bsm() {
    	List<String> bsmGeneration = new ArrayList<>();
    	bsmGeneration.add("TRABALHO EM EQUIPE");
    	bsmGeneration.add("ORIENTAÇÃO AOS DETALHES");
    	bsmGeneration.add("PROATIVIDADE");
    	bsmGeneration.add("COMUNICAÇÃO");
    	bsmGeneration.add("PERSISTÊNCIA");
    	bsmGeneration.add("RESPONSABILIDADE PESSOAL");
    	bsmGeneration.add("ORIENTAÇÃO AO FUTURO");
    	bsmGeneration.add("MENTALIDADE DE CRESCIMENTO");
    	
        return bsmGeneration;
    }
	
	@GetMapping("/objetivos")
    public List<String> objetivosSemana() {
    	List<String> objetivosSemanais = new ArrayList<>();
    	objetivosSemanais.add("Treinar o Mysql e o SQL");
    	objetivosSemanais.add("Treinar relacionamentos DER de 1:n");
    	objetivosSemanais.add("Avançar no projeto integrador");
    	objetivosSemanais.add("Melhorar o pitch");
    	objetivosSemanais.add("Treinar o endpoint do SpringBoot");
    	
        return objetivosSemanais;
    }
	
}