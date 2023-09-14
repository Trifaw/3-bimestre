package entity;

import jakarta.persistence.*;

@Entity
@Table
public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "turma_id")
    private Turma turma;
    @Column
    private Double nota;

    public Nota(Turma turma, Double nota) {
        this.turma = turma;
        this.nota = nota;
    }
}
