package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {
    @org.springframework.beans.factory.annotation.Value("${spring.h2.console.enabled:FALSO}")
    private String statusH2;

    @org.springframework.web.bind.annotation.GetMapping("/testeh2")
    public String testarH2() {
        return "O Spring esta lendo o properties? Status do H2: " + statusH2;
    }


    @GetMapping("/boasvindas")
/*
    @PostMapping
    @PutMapping
    @PatchMapping
    @DeleteMapping
*/

    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota.";
    }





}
