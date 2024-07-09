package edu.ifpb.web2.suaprest.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Disciplina")
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "disciplina_seq")
    @SequenceGenerator(name= "disciplina_seq",sequenceName= "disciplina_seq", allocationSize = 1)
    private Long id;

    @Column
    private String nome;

    @ManyToOne
    @JoinColumn(name = "professor_matricula")
    private Professor professor;

    @Column
    private int cargaHoraria;

    @ManyToOne
    @JoinColumn(name = "cod_curso")
    private Curso curso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina that = (Disciplina) o;
        return cargaHoraria == that.cargaHoraria && Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(professor, that.professor) && Objects.equals(curso, that.curso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, professor, cargaHoraria, curso);
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", professor=" + professor +
                ", cargaHoraria=" + cargaHoraria +
                ", curso=" + curso +
                '}';
    }
}
