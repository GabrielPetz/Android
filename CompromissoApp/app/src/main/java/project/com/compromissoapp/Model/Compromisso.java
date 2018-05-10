package project.com.compromissoapp.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.ColorLong;

import java.time.LocalDate;

/**
 * Created by User on 09/05/2018.
 */
@Entity
public class Compromisso {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "idCompromisso")
    private Integer idCompromisso;

    @ColumnInfo(name = "nomeCompromisso")
    private String nomeCompromisso;

    @ColumnInfo(name = "data")
    private LocalDate data;

    @ColumnInfo(name = "prioridade")
    private Integer prioridade; // 1 - ALTA / 2 - MEDIA / 3 - BAIXA

    @ColumnInfo(name = "status")
    private Integer status; // 1 - ABERTO / 0 -  FECHADO

    public Compromisso() {
        this.idCompromisso = null;
        this.nomeCompromisso = null;
        this.data = null;
        this.prioridade = null;
        this.status = 1;
    }

    public Compromisso(String nomeCompromisso, LocalDate data, Integer prioridade) {
        this.nomeCompromisso = nomeCompromisso;
        this.data = data;
        this.prioridade = prioridade;
    }

    public Integer getIdCompromisso() {
        return idCompromisso;
    }

    public String getNomeCompromisso() {
        return nomeCompromisso;
    }

    public void setNomeCompromisso(String nomeCompromisso) {
        this.nomeCompromisso = nomeCompromisso;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.status = data.getDayOfYear() >= LocalDate.now().getDayOfYear() ? 0 : 1;
        this.data = data;
    }

    public Integer getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Integer prioridade) {
        this.prioridade = prioridade;
    }
}
