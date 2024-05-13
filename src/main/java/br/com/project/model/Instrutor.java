package br.com.project.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "instrutor")
public class Instrutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idInstrutor;

    @Column(name = "RG")
    private Integer RG;

    @Column(name = "nome", length = 45)
    private String nome;

    @Column(name = "nascimento")
    private LocalDate nascimento;

    @Column(name = "titulacao")
    private Integer titulacao;

    public Instrutor() {

    }

    public Integer getIdInstrutor() {
        return idInstrutor;
    }

    public void setIdInstrutor(Integer idInstrutor) {
        this.idInstrutor = idInstrutor;
    }

    public Integer getRG() {
        return RG;
    }

    public void setRG(Integer RG) {
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public Integer getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(Integer titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instrutor instrutor = (Instrutor) o;
        return Objects.equals(idInstrutor, instrutor.idInstrutor) && Objects.equals(RG, instrutor.RG) && Objects.equals(nome, instrutor.nome) && Objects.equals(nascimento, instrutor.nascimento) && Objects.equals(titulacao, instrutor.titulacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInstrutor, RG, nome, nascimento, titulacao);
    }

    @Override
    public String toString() {
        return "Instrutor{" +
                "idInstrutor=" + idInstrutor +
                ", RG=" + RG +
                ", nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                ", titulacao=" + titulacao +
                '}';
    }
}
