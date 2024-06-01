package com.example.hello_world.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/hello-world")
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/bsms")
    public List<String> getBSMs() {
        return Arrays.asList(
                "Comunicação",
                "Proatividade",
                "Persistência",
                "Mentalidade de Crescimento",
                "Responsabilidade Pessoal",
                "Orientação ao Futuro",
                "Trabalho em Equipe",
                "Orientação ao Detalhe"
        );
    }

    @GetMapping("/objectives")
    public List<String> listObjectives() {
        return Arrays.asList(
                "Compreender os princípios básicos do Spring Framework",
                "Implementar endpoints RESTful em um aplicativo Spring Boot",
                "Aprender a configurar e conectar um aplicativo Spring Boot a um banco de dados"
        );
    }
}
