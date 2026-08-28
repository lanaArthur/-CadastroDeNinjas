package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")

public class MissoesController {
    //Post - para criar
    @PostMapping ("/criar")
    public String criarNinja() {
        return "Missão criada com sucesso!.";
    }
    //Get - mandar uma requisição para mostrar as missoes
    @GetMapping ("/listar")
    public String listarNinja() {
        return "Missões listadas com sucesso!.";
    }

    @DeleteMapping ("/deletar")
    public String deletarNinja() {
        return "Deletado com sucesso!.";
    }

    @PutMapping ("/alterar")
    public String alterarNinja() {
        return "Alterado com sucesso!.";
    }

}
