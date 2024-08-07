package edu.ifpb.web2.suaprest.model;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "Diario")
public class Diario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @ManyToOne
    @JoinColumn(name = "professor_matricula")
    private Professor professorResponsavel;

    @ManyToOne
    @JoinColumn(name = "disciplina_id")
    private Disciplina disciplina;

    @Column(nullable = false)
    private String periodo;

    @ManyToMany
    @JoinTable(name="diario_alunos",
            joinColumns={@JoinColumn(name="diario_codigo")},
            inverseJoinColumns={@JoinColumn(name="aluno_matricula")})
    private Set<Aluno> alunos;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Set<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Set<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Diario diario = (Diario) o;
        return Objects.equals(codigo, diario.codigo) && Objects.equals(professorResponsavel, diario.professorResponsavel) && Objects.equals(disciplina, diario.disciplina) && Objects.equals(periodo, diario.periodo) && Objects.equals(alunos, diario.alunos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, professorResponsavel, disciplina, periodo, alunos);
    }

    @Override
    public String toString() {
        return "Diario{" +
                "codigo=" + codigo +
                ", professorResponsavel=" + professorResponsavel +
                ", disciplina=" + disciplina +
                ", periodo='" + periodo + '\'' +
                ", alunos=" + alunos +
                '}';
    }
}
