package edu.ifpb.web2.suaprest.model;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
public class Diario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @ManyToOne
    @JoinColumn(name = "professor_matricula")
    private Professor professorResponsavel;
    @Column
    private String nomeDisciplina;
    @Column
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

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
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
        return Objects.equals(codigo, diario.codigo) && Objects.equals(professorResponsavel, diario.professorResponsavel) && Objects.equals(nomeDisciplina, diario.nomeDisciplina) && Objects.equals(periodo, diario.periodo) && Objects.equals(alunos, diario.alunos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, professorResponsavel, nomeDisciplina, periodo, alunos);
    }

    @Override
    public String toString() {
        return "Diario{" +
                "codigo=" + codigo +
                ", professorResponsavel=" + professorResponsavel +
                ", nomeDisciplina='" + nomeDisciplina + '\'' +
                ", periodo='" + periodo + '\'' +
                ", alunos=" + alunos +
                '}';
    }
}
