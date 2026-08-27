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

    public String boasvindas() {
        return "Essa é minha primeira mensagem nessa rota.";
    }

    //ADICIONAR NINJA(CREATE)
    @GetMapping("/criar")
    public String criarNinja() {
        return "Ninja Criado.";
    }

    //PROUCURAR NINJA (CREATE)


    //ALTERAR DADOS DO NINJA (UPDATE)
    @PutMapping("/alterarID")
    public String alterarID() {
        return "Alter ninja por ID.";
    }


    //MOSTRAR TODOS OS NINJAS (READ)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas() {
        return "Ninja mostra todos os ninjas.";
    }

    //MOSTRAR TODOS OS NINJAS (READ)
    @GetMapping("/litarID")
    public String mostrarTodosOsNinjasPorID() {
        return "Mostrar Ninja por ID.";
    }


    //DELETAR NINJA (DELETE)
    @DeleteMapping("deletarID")
    public String deletarNinja() {
        return "Deleta ninja por ID.";
    }


}
