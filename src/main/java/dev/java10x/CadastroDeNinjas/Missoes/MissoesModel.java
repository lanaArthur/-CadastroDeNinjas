package dev.java10x.CadastroDeNinjas.Missoes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Criação de getters e setter automático
@NoArgsConstructor //Criaçao do contrutor vazío
@AllArgsConstructor // Croaçao do contrutor cheio
@Entity//Criação de item para o DATABASE
@Table(name = "tb_missoes")//Criação da Tabela intitulada de tb_missoes
public class MissoesModel {
    @Id//geraçao automatica de ID's
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    /*VERIFICAR E CORRIGIR*/
    // @OneToMany (mappedBy = "missoes")

   // private List<NinjaModel> ninja;

}
