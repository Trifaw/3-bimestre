package entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String senha;
    @OneToMany (cascade = CascadeType.ALL)
    @JoinColumn (name = "nota_id")
    private List <Nota> notas;
    @Column
    private String nome;
    @Column
    private String prontuário;
    @Column
    private Double media;

    public Aluno(String senha, String nome, String prontuário, Double media) {
        this.senha = senha;
        this.nome = nome;
        this.prontuário = prontuário;
        this.media = media;
    }
}
