package entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "piloto_id")
    private Professor professor;
    @Column
    private Integer horario;
    @ManyToMany (cascade = CascadeType.ALL)
    @JoinTable (name = "turma_aluno", joinColumns = @JoinColumn (name = "turma_id"), inverseJoinColumns = @JoinColumn (name = "aluno_id"))
    private List<Aluno> alunos;
    @Column
    private String codigo;

    public Turma(Professor professor, Integer horario, List<Aluno> alunos, String codigo) {
        this.professor = professor;
        this.horario = horario;
        this.alunos = alunos;
        this.codigo = codigo;
    }
}
