/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author j040v
 */
public class Pacientes {

    private String name;
    private String history;
    private Integer age;
    private Date moment;

    public Pacientes() {
    }

    public Pacientes(String nome, String historico, Integer age, Date moment) {
        this.name = nome;
        this.history = historico;
        this.age = age;
        this.moment = moment;

    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public String getHistorico() {
        return history;
    }

    public void setHistorico(String historico) {
        this.history = historico;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder sb = new StringBuilder();

        sb.append("Nome do paciente: ");
        sb.append(name + "\n");
        sb.append("Idade do paciente: ");
        sb.append(age + "\n");
        sb.append("Registro Médico: ");
        sb.append(history + "\n");
        sb.append("Ultima consulta: ");
        sb.append(sdf.format(moment) + "\n");

        return sb.toString();

    }

}
