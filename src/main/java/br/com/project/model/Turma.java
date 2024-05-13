package br.com.project.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

@Entity
@Table(name = "turma")
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTurma;

    @Column(name = "horario")
    private LocalTime horario;

    @Column(name = "duracao")
    private Integer duracao;

    @Column(name = "data_inicio")
    private LocalDate dataInicio;

    @Column(name = "data_fim")
    private LocalDate dataFim;

    public Turma() {
    }

    public Integer getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(Integer idTurma) {
        this.idTurma = idTurma;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Turma turma = (Turma) o;
        return Objects.equals(idTurma, turma.idTurma) && Objects.equals(horario, turma.horario) && Objects.equals(duracao, turma.duracao) && Objects.equals(dataInicio, turma.dataInicio) && Objects.equals(dataFim, turma.dataFim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTurma, horario, duracao, dataInicio, dataFim);
    }

    @Override
    public String toString() {
        return "Turma{" +
                "idTurma=" + idTurma +
                ", horario=" + horario +
                ", duracao=" + duracao +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                '}';
    }
}
