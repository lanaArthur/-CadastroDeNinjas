package dev.java10x.CadastroDeNinjas;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(unique = true)
    private String email;
    private int idade;

    private List<MissoesModel> missoes;

    //UM NINJA TEM 1 UNICA MISSÃO
    @ManyToOne
    @JoinColumn(name = "missoes_id")//forenig key chave estranjeira

    private NinjaModel missoes;


    public NinjaModel() {}

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
}
