package entity;

import jakarta.persistence.*;

@Entity
@Table
public class Professor {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String CPF;
    @Column
    private String senha;
    @Column
    private String nome;
    @Column
    private String prontuario;

    public Professor(String CPF, String senha, String nome, String prontuario) {
        this.CPF = CPF;
        this.senha = senha;
        this.nome = nome;
        this.prontuario = prontuario;
    }
}
