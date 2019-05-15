package com.example.guilherme.project.modelo;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Disciplina implements Parcelable, Serializable{
    private String codigoDisciplina;
    private String nomeDisciplina;
    private String semestre;
    private int faltas;
    private int limiteFaltas;
    private int meta;
    private String andamento;

    public Disciplina(String codigoDisciplina, String nomeDisciplina, String semestre, int faltas, int limiteFaltas, int meta, String andamento) {
        this.codigoDisciplina = codigoDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.semestre = semestre;
        this.faltas = faltas;
        this.limiteFaltas = limiteFaltas;
        this.meta = meta;
        this.andamento = andamento;
    }

    protected Disciplina(Parcel in) {
        codigoDisciplina = in.readString();
        nomeDisciplina = in.readString();
        semestre = in.readString();
        faltas = in.readInt();
        limiteFaltas = in.readInt();
        meta = in.readInt();
        andamento = in.readString();
    }

    public static final Creator<Disciplina> CREATOR = new Creator<Disciplina>() {
        @Override
        public Disciplina createFromParcel(Parcel in) {
            return new Disciplina(in);
        }

        @Override
        public Disciplina[] newArray(int size) {
            return new Disciplina[size];
        }
    };

    public String getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(String codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getLimiteFaltas() {
        return limiteFaltas;
    }

    public void setLimiteFaltas(int limiteFaltas) {
        this.limiteFaltas = limiteFaltas;
    }

    public int getMeta() {
        return meta;
    }

    public void setMeta(int meta) {
        this.meta = meta;
    }

    public String getAndamento() {
        return andamento;
    }

    public void setAndamento(String andamento) {
        this.andamento = andamento;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(codigoDisciplina);
        parcel.writeString(nomeDisciplina);
        parcel.writeString(semestre);
        parcel.writeInt(faltas);
        parcel.writeInt(limiteFaltas);
        parcel.writeInt(meta);
        parcel.writeString(andamento);
    }
}
