package edu.ifpb.web2.suaprest.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;
@Entity
@Table(name = "Aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aluno_seq")
    @SequenceGenerator(name= "aluno_seq",sequenceName= "aluno_seq", allocationSize = 1)
    private Long matricula;

    @Column(nullable = false)
    private  String nome;

    @Embedded
    private Endereco endereco;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_resp", referencedColumnName = "id_resp")
    private Responsavel responsavel;

    @ManyToOne
    @JoinColumn(name = "cod_curso")
    private Curso curso;

    @ManyToMany
    @JoinTable(name = "aluno_professor",
            joinColumns = {@JoinColumn(name = "matricula_aluno")},
            inverseJoinColumns = {@JoinColumn(name = "matricula_professor")}
    )
    private List<Professor> professores;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(matricula, aluno.matricula) && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, nome);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                '}';
    }
}
