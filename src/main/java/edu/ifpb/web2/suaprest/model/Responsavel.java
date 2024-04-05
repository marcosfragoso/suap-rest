package edu.ifpb.web2.suaprest.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Responsavel")
public class Responsavel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "responsavel_seq")
    @SequenceGenerator(name="responsavel_seq", sequenceName = "responsavel_seq", allocationSize = 1)
    private Long id_resp;
    @Column
    private String nome;
    @Column
    private String telefone;

    public Long getId_resp() {
        return id_resp;
    }

    public void setId_resp(Long id_resp) {
        this.id_resp = id_resp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Responsavel{" +
                "id_resp=" + id_resp +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Responsavel that = (Responsavel) o;
        return Objects.equals(id_resp, that.id_resp) && Objects.equals(nome, that.nome) && Objects.equals(telefone, that.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_resp, nome, telefone);
    }
}
