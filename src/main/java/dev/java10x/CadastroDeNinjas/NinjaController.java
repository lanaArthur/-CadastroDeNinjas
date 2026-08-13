package dev.java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {
    @GetMapping("/boasvindas")
    @PostMapping
    @PutMapping
    @PatchMapping
    @DeleteMapping

    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota.";
    }





}
