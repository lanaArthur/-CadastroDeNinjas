package dev.java10x.CadastroDeNinjas.Missoes.Model;

import dev.java10x.CadastroDeNinjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;
    @OneToMany (mappedBy = "missoes")

    private List<NinjaModel> ninja;

}
