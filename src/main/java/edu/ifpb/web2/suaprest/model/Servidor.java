package edu.ifpb.web2.suaprest.model;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name = "Servidor")
public class Servidor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matricula;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String setor;

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

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Servidor servidor = (Servidor) o;
        return Objects.equals(matricula, servidor.matricula) && Objects.equals(nome, servidor.nome) && Objects.equals(setor, servidor.setor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, nome, setor);
    }

    @Override
    public String toString() {
        return "Servidor{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", setor='" + setor + '\'' +
                '}';
    }
}
