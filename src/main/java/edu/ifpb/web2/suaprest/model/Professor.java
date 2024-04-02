package edu.ifpb.web2.suaprest.model;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matricula;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String area;

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(matricula, professor.matricula) && Objects.equals(nome, professor.nome) && Objects.equals(area, professor.area);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, nome, area);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
