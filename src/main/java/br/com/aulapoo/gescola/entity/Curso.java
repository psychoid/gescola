/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aulapoo.gescola.entity;

import java.util.List;


/**
 *
 * @author psychoid
 */
public class Curso {
    
    private String nome;
    private int duracaoSemestre;
    private int cargaHoraria;
    private Professor professor;
    
    private List<Disciplina> disciplina;

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracaoSemestre() {
        return duracaoSemestre;
    }

    public void setDuracaoSemestre(int duracaoSemestre) {
        this.duracaoSemestre = duracaoSemestre;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(List<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }
}


